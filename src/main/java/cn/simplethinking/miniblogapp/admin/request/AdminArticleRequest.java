package cn.simplethinking.miniblogapp.admin.request;

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
}
