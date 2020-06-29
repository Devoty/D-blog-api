package top.devoty.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;


@Data
@Builder
public class BlogInfo {
    /**
     * ID
     */
    private String id;

    /**
     * 是否置顶
     */
    private String isTop;

    /**
     * 图标
     */
    private String banner;

    /**
     * 是否热搜
     */
    private String isHot;

    /**
     * 发布时间
     */
    private String pubTime;

    /**
     * 标题
     */
    @NotEmpty(message = "请填写标题")
    private String title;

    /**
     * 简介
     */
    @NotEmpty(message = "请填写简介")
    private String summary;

    /**
     * 文章ID
     */
    @NotEmpty(message = "请填写博客内容")
    private String contentId;

    /**
     * 阅读量
     */
    private String viewsCount;

    /**
     * 评论量
     */
    private int commentsCount;

}
