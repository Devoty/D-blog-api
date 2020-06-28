package top.devoty.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.devoty.common.R;
import top.devoty.domain.Blog;
import top.devoty.domain.BlogExample;
import top.devoty.mapper.BlogMapper;
import top.devoty.service.BlogService;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public R countBlog() {

        BlogExample example = new BlogExample();
        Long count = blogMapper.countByExample(example);

        return R.ok(count);

    }

    @Override
    public R creatBlog() {



        return null;
    }

    @Override
    public List<Blog> selectBlog() {
        return null;
    }
}
