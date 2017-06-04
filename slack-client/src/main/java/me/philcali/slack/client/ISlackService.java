package me.philcali.slack.client;

import java.util.Map;

import me.philcali.slack.data.bot.BotsInfo;
import me.philcali.slack.data.channel.ChannelsInfo;
import me.philcali.slack.data.channel.ChannelsList;
import me.philcali.slack.data.message.MessageData;
import me.philcali.slack.data.oauth.OAuthAccess;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ISlackService {
    @FormUrlEncoded
    @POST("api/bots.info")
    Call<BotsInfo> botsInfo();

    @FormUrlEncoded
    @POST("api/bots.info")
    Call<BotsInfo> botsInfo(@Field("bot") String botId);

    @FormUrlEncoded
    @POST("api/channels.info")
    Call<ChannelsInfo> channelsInfo(@Field("channel") String channelId);

    @FormUrlEncoded
    @POST("api/channels.list")
    Call<ChannelsList> channelsList();

    @FormUrlEncoded
    @POST("api/channels.list")
    Call<ChannelsList> channelsList(
            @Field("exclude_archived") boolean excludeArchived,
            @Field("exclude_members") boolean excludeMembers);

    @FormUrlEncoded
    @POST("api/chat.delete")
    Call<MessageData> chatDelete(
            @Field("ts") String ts,
            @Field("channel") String channel,
            @Field("as_user") boolean asUser);

    @FormUrlEncoded
    @POST("api/chat.meMessage")
    Call<MessageData> chatMeMessage(
            @Field("channel") String channelId,
            @Field("text") String text);

    @FormUrlEncoded
    @POST("api/chat.postMessage")
    Call<MessageData> chatPostMessage(
            @Field("channel") String channelId,
            @Field("text") String text,
            @FieldMap Map<String, String> options);

    @FormUrlEncoded
    @POST("api/chat.update")
    Call<MessageData> chatUpdate(
            @Field("ts") String ts,
            @Field("channel") String channel,
            @Field("text") String text,
            @FieldMap Map<String, String> options);

    @FormUrlEncoded
    @POST("api/oauth.access")
    Call<OAuthAccess> oauthAccess(
            @Field("client_id") String clientId,
            @Field("client_secret") String clientSecret,
            @Field("code") String code);

    @FormUrlEncoded
    @POST("api/oauth.access")
    Call<OAuthAccess> oauthAccess(
            @Field("client_id") String clientId,
            @Field("client_secret") String clientSecret,
            @Field("code") String code,
            @Field(encoded = true, value = "redirect_uri") String redirectUrl);
}
