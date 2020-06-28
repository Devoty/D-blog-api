package top.devoty.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2020/06/28
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlogContent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog_content.id
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog_content.status_cd
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    private Integer statusCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog_content.status_time
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    private Date statusTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog_content.create_staff
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    private String createStaff;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog_content.create_time
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog_content.update_staff
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    private String updateStaff;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog_content.update_time
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_blog_content.blog_content
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    private String blogContent;
}