package me.philcali.slack.data;

public class SlackPagingData extends SlackData {
    private Paging paging;

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }
}
