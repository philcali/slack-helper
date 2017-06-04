package me.philcali.slack.client;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import me.philcali.slack.data.EventData;

public interface ISlackServiceProvider {
    <T> EventData<T> convert(InputStream input, Class<T> inputClass) throws IOException;

    default <T> EventData<T> convert(String payload, Class<T> inputClass) throws IOException {
        return convert(new ByteArrayInputStream(payload.getBytes(StandardCharsets.UTF_8)), inputClass);
    }

    default ISlackService getService() {
        return getService(Optional.empty());
    }

    ISlackService getService(Optional<String> accessToken);

    default ISlackService getService(String accessToken) {
        return getService(Optional.of(accessToken));
    }
}
