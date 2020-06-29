package top.devoty.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import top.devoty.domain.BlogContent;
import top.devoty.domain.BlogContentExample;

/**
* Created by Mybatis Generator on 2020/06/29
*/
@Component
public interface BlogContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    long countByExample(BlogContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    int deleteByExample(BlogContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    int insert(BlogContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    int insertSelective(BlogContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    List<BlogContent> selectByExampleWithBLOBs(BlogContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    List<BlogContent> selectByExample(BlogContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    BlogContent selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    int updateByExampleSelective(@Param("record") BlogContent record, @Param("example") BlogContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") BlogContent record, @Param("example") BlogContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    int updateByExample(@Param("record") BlogContent record, @Param("example") BlogContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    int updateByPrimaryKeySelective(BlogContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(BlogContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_blog_content
     *
     * @mbg.generated Mon Jun 29 11:23:50 CST 2020
     */
    int updateByPrimaryKey(BlogContent record);
}