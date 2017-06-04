package me.philcali.slack.data.file;

import java.util.List;

import me.philcali.slack.data.SlackPagingData;

public class FilesList extends SlackPagingData {
    private List<File> files;

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
