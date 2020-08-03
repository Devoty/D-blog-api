package top.devoty.service.impl;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    private BlogMapper blogMapper;

    private BlogContentMapper blogContentMapper;


    @Autowired
    public BlogServiceImpl(BlogMapper blogMapper,
                           BlogContentMapper blogContentMapper){
        this.blogMapper = blogMapper;
        this.blogContentMapper = blogContentMapper;
    }

    @Override
    public Long countBlog() {

        BlogExample example = new BlogExample();
        Long count = blogMapper.countByExample(example);

        return count;

    }

    @Override
    public Integer creatBlog(BlogInfo blogInfo) {
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
        return sum;
    }

    @Override
    public String creatArticle(String articleId, String article) {

        String uuid = UUIDUtils.getUUID();
        BlogContent blogContent = new BlogContent();
        blogContent.setId(uuid);
        blogContent.setCreateTime(new Date());
        blogContent.setStatusCd(0);
        blogContent.setStatusTime(new Date());
        blogContent.setBlogContent(article);

        int sum = blogContentMapper.insert(blogContent);

        return String.valueOf(sum);
    }

    @Override
    public String getsArticle(String articleId) {

        BlogContent blogContent = blogContentMapper.selectByPrimaryKey(articleId);


        return "123";
    }

    @Override
    public List<BlogInfo> listBlog(BlogInfo blogInfo) {

        BlogExample blogExample  = new BlogExample();
        List<Blog> blogList = blogMapper.selectByExample(blogExample);
        List<BlogInfo> blogInfoList = new ArrayList<>();
        for (Blog blog : blogList){
            BlogInfo blogInfo1 = new BlogInfo();
            BeanUtils.copyProperties(blog,blogInfo1);

            String str = DateFormatUtils.format(blog.getCreateTime(),"yyyy-MM-dd HH:mm:ss");
            blogInfo1.setCreateTime(str);
            blogInfoList.add(blogInfo1);

        }

        return blogInfoList;

    }
}
