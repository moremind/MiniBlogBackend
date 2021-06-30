package cn.simplethinking.miniblogapp.miniapp.request;

import java.util.Date;
import java.util.List;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
public class AdminArticleRequest {
    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章作者
     */
    private String author;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章标签
     */
    private List<String> tags;

    /**
     * 文章分类
     */
    private List<String> categories;

    /**
     * 文章缩略图地址
     */
    private String thumb;

    /**
     * 阅读数
     */
    private Integer views;

    /**
     * 关注数
     */
    private Integer focus;

    /**
     * 是否置顶
     */
    private boolean isTop;

    /**
     * 发布时间
     */
    private Date publishDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getFocus() {
        return focus;
    }

    public void setFocus(Integer focus) {
        this.focus = focus;
    }

    public boolean isTop() {
        return isTop;
    }

    public void setTop(boolean top) {
        isTop = top;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "AdminArticleRequest{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", tags=" + tags +
                ", categories=" + categories +
                ", thumb='" + thumb + '\'' +
                ", views=" + views +
                ", focus=" + focus +
                ", isTop=" + isTop +
                ", publishDate=" + publishDate +
                '}';
    }
}
