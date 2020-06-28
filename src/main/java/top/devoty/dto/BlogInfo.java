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
    @NotEmpty
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
    private String title;

    /**
     * 简介
     */

    private String summary;

    /**
     * 文章ID
     */
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
