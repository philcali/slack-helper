package me.philcali.slack.data.file;

import java.util.List;

import me.philcali.slack.data.Reaction;

public class File {
    private String id;
    private long created;
    private long timestamp;
    private String name;
    private String title;
    private String mimeType;
    private String fileType;
    private String prettyType;
    private String user;
    private String mode;
    private boolean editable;
    private boolean external;
    private String externalType;
    private String username;
    private long size;
    private String urlPrivate;
    private String urlPrivateDownload;
    private String permalink;
    private String permalinkPublic;
    private String editLink;
    private String preview;
    private String previewHighlight;
    private long lines;
    private long linesMore;
    private List<String> channels;
    private List<String> groups;
    private List<String> ims;
    private List<Reaction> reactions;
    private int commentCount;

    public List<String> getChannels() {
        return channels;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public long getCreated() {
        return created;
    }

    public String getEditLink() {
        return editLink;
    }

    public String getExternalType() {
        return externalType;
    }

    public String getFileType() {
        return fileType;
    }

    public List<String> getGroups() {
        return groups;
    }

    public String getId() {
        return id;
    }

    public List<String> getIms() {
        return ims;
    }

    public long getLines() {
        return lines;
    }

    public long getLinesMore() {
        return linesMore;
    }

    public String getMimeType() {
        return mimeType;
    }

    public String getMode() {
        return mode;
    }

    public String getName() {
        return name;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getPermalinkPublic() {
        return permalinkPublic;
    }

    public String getPrettyType() {
        return prettyType;
    }

    public String getPreview() {
        return preview;
    }

    public String getPreviewHighlight() {
        return previewHighlight;
    }

    public List<Reaction> getReactions() {
        return reactions;
    }

    public long getSize() {
        return size;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getTitle() {
        return title;
    }

    public String getUrlPrivate() {
        return urlPrivate;
    }

    public String getUrlPrivateDownload() {
        return urlPrivateDownload;
    }

    public String getUser() {
        return user;
    }

    public String getUsername() {
        return username;
    }

    public boolean isEditable() {
        return editable;
    }

    public boolean isExternal() {
        return external;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public void setEditLink(String editLink) {
        this.editLink = editLink;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public void setExternalType(String externalType) {
        this.externalType = externalType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIms(List<String> ims) {
        this.ims = ims;
    }

    public void setLines(long lines) {
        this.lines = lines;
    }

    public void setLinesMore(long linesMore) {
        this.linesMore = linesMore;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public void setPermalinkPublic(String permalinkPublic) {
        this.permalinkPublic = permalinkPublic;
    }

    public void setPrettyType(String prettyType) {
        this.prettyType = prettyType;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public void setPreviewHighlight(String previewHighlight) {
        this.previewHighlight = previewHighlight;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrlPrivate(String urlPrivate) {
        this.urlPrivate = urlPrivate;
    }

    public void setUrlPrivateDownload(String urlPrivateDownload) {
        this.urlPrivateDownload = urlPrivateDownload;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
