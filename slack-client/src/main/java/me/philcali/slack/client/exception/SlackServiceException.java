package me.philcali.slack.client.exception;

public class SlackServiceException extends RuntimeException {
    private static final long serialVersionUID = -4211258968532961376L;

    public SlackServiceException(Throwable t) {
        super(t);
    }
}
