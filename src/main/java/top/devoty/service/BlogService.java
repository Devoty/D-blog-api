package top.devoty.service;

import top.devoty.common.R;
import top.devoty.domain.Blog;

import java.util.List;

public interface BlogService {

    R countBlog();

    R creatBlog();

    List<Blog> selectBlog();

}
