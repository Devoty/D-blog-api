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
    long countByExample(BlogContentExample example);

    int deleteByExample(BlogContentExample example);

    int deleteByPrimaryKey(String id);

    int insert(BlogContent record);

    int insertSelective(BlogContent record);

    List<BlogContent> selectByExampleWithBLOBs(BlogContentExample example);

    List<BlogContent> selectByExample(BlogContentExample example);

    BlogContent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BlogContent record, @Param("example") BlogContentExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogContent record, @Param("example") BlogContentExample example);

    int updateByExample(@Param("record") BlogContent record, @Param("example") BlogContentExample example);

    int updateByPrimaryKeySelective(BlogContent record);

    int updateByPrimaryKeyWithBLOBs(BlogContent record);

    int updateByPrimaryKey(BlogContent record);
}