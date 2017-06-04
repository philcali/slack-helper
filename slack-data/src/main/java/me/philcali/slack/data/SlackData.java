package me.philcali.slack.data;

public class SlackData {
    private boolean ok;
    private String error;
    private String warning;

    public String getError() {
        return error;
    }

    public String getWarning() {
        return warning;
    }

    public boolean isOk() {
        return ok;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }
}
