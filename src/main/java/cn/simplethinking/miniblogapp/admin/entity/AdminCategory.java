package cn.simplethinking.miniblogapp.admin.entity;

import java.sql.Date;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
public class AdminCategory {
    /**
     * 分类id
     */
    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类缩略图
     */
    private String thumb;

    /**
     * 分类父分类
     */
    private Integer parentId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
