package top.devoty.blog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.devoty.dto.*;
import top.devoty.common.R;
import top.devoty.service.BlogService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("blog")
public class BlogController {

    private BlogService blogService;

    @Autowired
    public BlogController (BlogService blogService){
        this.blogService = blogService;
    }

    /**
     * 查询博客总数
     * @return
     */
    @GetMapping("count")
    public R<Long> count(){
        return R.ok(blogService.countBlog());
    }


    /**
     * 创建blog,返回创建blog数量
     * @return
     */
    @PostMapping("creat")
    public R<Integer> creatBlog(@Validated @RequestBody BlogInfo blogInfo){
        return R.ok(blogService.creatBlog(blogInfo));
    }

    /**
     * 查询blog列表
     * @param blogInfo
     * @return
     */
    @GetMapping("list")
    public R<List<BlogInfo>> listBlog(BlogInfo blogInfo){
        List<BlogInfo> blogInfos = blogService.listBlog(blogInfo);
        return R.ok(blogInfos);
    }

    /**
     * 根据文章ID，获取文章详细内容
     * @param articleId
     * @return
     */
    @GetMapping("article/{articleId}")
    public R<String> article(@PathVariable("articleId") String articleId){
        String content = blogService.getsArticle(articleId);
        return R.ok(content);
    }

    /**
     * 新增一篇文章
     * @param article 文章内容
     * @param articleId 文章ID
     * @return
     */
    @PostMapping("article")
    public R article(String articleId, String article){
        blogService.creatArticle(articleId, article);
        return R.ok();
    }


    @GetMapping("comment")
    public R<List<Comments>> comment(){

        Comment comment = Comment.builder()
                .content("第sa条")
                .createTime(new Date().toString())
                .fromUserId("01")
                .fromUserName("xiexie")
                .id("9")
                .postId("sdjhfo")
                .build();

        Reply reply = Reply.builder()
                .content("第二条")
                .createTime(new Date().toString())
                .fromUserId("df")
                .fromUserName("xiexie")
                .id("5")
                .postId("sdjhfo")
                .toUserId("dd").toUserName("dd0")
                .build();

        Comments comments = Comments.builder()
                .comment(comment).reply(reply).build();

        Comments comments2 = Comments.builder().comment(comment).reply(reply).build();

        List<Comments> commentsList = new ArrayList<>();
        commentsList.add(comments);
        commentsList.add(comments2);
        return R.ok(commentsList);
    }


    @GetMapping("friend")
    public R<List<Friend>> friend(){
        Friend friend = Friend.builder()
                .id("0")
                .siteName("FZY′blog")
                .path("https://www.fengziy.cn")
                .desc("一个It技术的探索者")
                .build();
        List<Friend> friendList = new ArrayList<>();
        friendList.add(friend);
        return R.ok(friendList);
    }
}
