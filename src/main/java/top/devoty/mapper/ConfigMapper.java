package top.devoty.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.devoty.domain.Config;
import top.devoty.domain.ConfigExample;

/**
* Created by Mybatis Generator on 2020/06/28
*/
public interface ConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_config
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    long countByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_config
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    int deleteByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_config
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_config
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    int insert(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_config
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    int insertSelective(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_config
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    List<Config> selectByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_config
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    Config selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_config
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Config record, @Param("example") ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_config
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    int updateByExample(@Param("record") Config record, @Param("example") ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_config
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    int updateByPrimaryKeySelective(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_config
     *
     * @mbg.generated Sun Jun 28 12:42:11 CST 2020
     */
    int updateByPrimaryKey(Config record);
}