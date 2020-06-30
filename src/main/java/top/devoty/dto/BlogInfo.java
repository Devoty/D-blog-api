package top.devoty.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlogInfo {
    /**
     * ID
     */
    private String id;

    /**
     * 标题
     */
    @NotEmpty(message = "请填写标题")
    private String title;

    /**
     * 文章ID
     */
    @NotEmpty(message = "请填写博客内容")
    private String contentId;

    /**
     * 自定义路径
     */
    private String subUrl;

    /**
     * 简介
     */
    @NotEmpty(message = "请填写简介")
    private String summary;

    /**
     * 封面
     */
    private String coverImage;

    /**
     * 标签ID
     */
    private Integer categoryId;

    /**
     * 图标
     */
    private String banner;

    /**
     * 是否置顶
     */
    private String top;

    /**
     * 是否热搜
     */
    private String hot;

    /**
     * 阅读量
     */
    private Integer views;

    /**
     * 是否允许评论
     */
    private Integer comment;

    /**
     * 评论量
     */
    private int commentsCount;

    /**
     * 发布时间
     */
    private String createTime;

}
