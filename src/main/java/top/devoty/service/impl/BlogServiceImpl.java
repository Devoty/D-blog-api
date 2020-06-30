package top.devoty.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.devoty.common.R;
import top.devoty.common.UUIDUtils;
import top.devoty.domain.Blog;
import top.devoty.domain.BlogContent;
import top.devoty.domain.BlogExample;
import top.devoty.dto.BlogInfo;
import top.devoty.mapper.BlogContentMapper;
import top.devoty.mapper.BlogMapper;
import top.devoty.service.BlogService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private BlogContentMapper blogContentMapper;

    @Override
    public R countBlog() {

        BlogExample example = new BlogExample();
        Long count = blogMapper.countByExample(example);

        return R.ok(count);

    }

    @Override
    public R creatBlog(BlogInfo blogInfo) {
        Blog blog = Blog.builder()
                .banner("url")
                .categoryId(9)
                .comment(0)
                .commentsCount(0)
                .contentId("sdofiruhgvue")
                .coverImage("img")
                .createStaff("me")
                .createTime(new Date())
                .hot(0)
                .statusCd(0)
                .subUrl("/first")
                .summary("我是简介")
                .title("我是标题")
                .statusTime(new Date())
                .top(0)
                .views(90)
                .build();
        int sum = blogMapper.insert(blog);
        return R.ok(sum);
    }

    @Override
    public R article(String article) {

        String uuid = UUIDUtils.getUUID();
        BlogContent blogContent = new BlogContent();
        blogContent.setId(uuid);
        blogContent.setCreateTime(new Date());
        blogContent.setStatusCd(0);
        blogContent.setStatusTime(new Date());
        blogContent.setBlogContent(article);

        int sum = blogContentMapper.insert(blogContent);

        return R.ok(sum);
    }

    @Override
    public List<BlogInfo> listBlog(BlogInfo blogInfo) {

        BlogExample blogExample  = new BlogExample();
//        BlogExample.Criteria criteria = blogExample.createCriteria();

        List<Blog> blogList = blogMapper.selectByExample(blogExample);

        for (Blog blog : blogList){

        }

        List<BlogInfo> blogInfoList = new ArrayList<>();


        return blogInfoList;

    }
}
