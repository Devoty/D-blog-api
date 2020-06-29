package top.devoty.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2020/06/29
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.id
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.title
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.content_id
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private String contentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.sub_url
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private String subUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.summary
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private String summary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.cover_image
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private String coverImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.category_id
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.banner
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private String banner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.hot
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private Integer hot;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.top
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private Integer top;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.views
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private Integer views;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.comment
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private Integer comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.comments_count
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private Integer commentsCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.status_cd
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private Integer statusCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.status_time
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private Date statusTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.create_staff
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private String createStaff;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.create_time
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.update_staff
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private String updateStaff;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog.update_time
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    private Date updateTime;
}