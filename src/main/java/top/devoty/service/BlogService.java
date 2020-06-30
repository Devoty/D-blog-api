package top.devoty.service;

import top.devoty.common.R;
import top.devoty.domain.Blog;
import top.devoty.dto.BlogInfo;

import java.util.List;

public interface BlogService {

    R countBlog();

    R creatBlog(BlogInfo blogInfo);

    R article(String article);

    List<BlogInfo> listBlog(BlogInfo blogInfo);


}
