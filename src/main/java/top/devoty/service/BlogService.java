package top.devoty.service;

import top.devoty.dto.BlogInfo;

import java.util.List;

public interface BlogService {

    Long countBlog();

    Integer creatBlog(BlogInfo blogInfo);

    String creatArticle(String articleId, String content);

    String getsArticle(String articleId);

    List<BlogInfo> listBlog(BlogInfo blogInfo);


}
