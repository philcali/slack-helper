package me.philcali.slack.data;

public class Paging {
    private long count;
    private long total;
    private int page;
    private int pages;

    public long getCount() {
        return count;
    }

    public int getPage() {
        return page;
    }

    public int getPages() {
        return pages;
    }

    public long getTotal() {
        return total;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
