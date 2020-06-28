package top.devoty.blog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import top.devoty.dto.*;
import top.devoty.common.R;
import top.devoty.service.BlogService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    /**
     * 查询博客总数
     * @return
     */
    @GetMapping("count")
    public R count(){
        return blogService.countBlog();
    }

    @PostMapping()
    public R creatBlog(){


        return R.ok();
    }


    @GetMapping("/blog/list")
    public R<List<BlogInfo>> listBlog(){



        BlogInfo blogInfo = BlogInfo.builder()
                .banner("https://s1.ax1x.com/2020/05/14/YDhagx.jpg")//文章图标
                .commentsCount(99)
                .id("0")
                .isHot("true")
                .isTop("true")
                .pubTime(new Date().toString())
                .summary("我是标题---简介")
                .title("我才是标题")
                .viewsCount("8888")
                .build();

        List<BlogInfo> blogInfoList = new ArrayList<>();
        blogInfoList.add(blogInfo);
        return R.ok(blogInfoList);
    }

    @GetMapping("article")
    public String blog(){
        System.out.println("article");
        return "# 001";
    }

    //SELECT config_name, config_value FROM tb_config where config_name in ('avatar', 'desc','name', 'notice', 'slogan')
    @GetMapping("site")
    public R<SiteInfo> site(){
        SiteInfo siteInfo = SiteInfo.builder()
                .avatar("https://s2.ax1x.com/2020/01/17/1SCadg.png")
                .desc("修身养性！！！").domain("https://www.devoty.top")
                .name("Devoty-blog").notice("注意开车了！！！")
                .slogan("倒车请注意")
                .build();
        return R.ok(siteInfo);
    }


    @GetMapping("social")
    public R<List<SocialInfo>> social(){
        SocialInfo socialInfo = SocialInfo.builder()
                .id("1")
                .title("QQ")
                .icon("iconqq")
                .color("#1AB6FF")
                .href("http://wpa.qq.com/msgrd?v=3&uin=634923628&site=qq&menu=yes")
                .build();
        SocialInfo socialInfo1 = SocialInfo.builder()
                .id("2")
                .title("Gitee")
                .icon("icongitee")
                .color("#d81e06")
                .href("https://gitee.com/devoty")
                .build();
        SocialInfo socialInfo2 = SocialInfo.builder()
                .id("3")
                .title("GitHub")
                .icon("icongithub")
                .color("#1AB6FF")
                .href("https://github.com/Devoty")
                .build();
//        SocialInfoDTO socialInfoDTO3 = SocialInfoDTO.builder()
//                .id("4")
//                .title("CSDN")
//                .icon("iconcsdn")
//                .color("red")
//                .href("https://blog.csdn.net/feng_zi_ye")
//                .build();
        List<SocialInfo> socialInfoList = new ArrayList<>();
        socialInfoList.add(socialInfo);
        socialInfoList.add(socialInfo1);
        socialInfoList.add(socialInfo2);
//        socialInfoDTOList.add(socialInfoDTO3);
        return R.ok(socialInfoList);
    }

    @GetMapping("category")
    public R<List<CategoryInfo>> category(){
        System.out.println("category");
        CategoryInfo categoryInfo = CategoryInfo.builder()
                .id("1").href("/category/java").title("JAVA")
                .build();
        CategoryInfo categoryInfo1 = CategoryInfo.builder()
                .id("2").href("/category/SpringBoot").title("SpringBoot")
                .build();
        CategoryInfo categoryInfo2 = CategoryInfo.builder()
                .id("3").href("/category/MySql").title("MySql")
                .build();
        CategoryInfo categoryInfo3 = CategoryInfo.builder()
                .id("4").href("/category/live").title("随笔")
                .build();
        List<CategoryInfo> categoryInfoList = new ArrayList<>();
        categoryInfoList.add(categoryInfo);
        categoryInfoList.add(categoryInfo1);
        categoryInfoList.add(categoryInfo2);
        categoryInfoList.add(categoryInfo3);
        return R.ok(categoryInfoList);
    }

    @GetMapping("comment")
    public R<List<Comments>> comment(){

        Comment comment = Comment.builder()
                .content("第sa条")
                .createTime(new Date().toString())
                .fromUserId("01")
                .fromUserName("xiexie")
                .id("009")
                .parentId("008").postId("sdjhfo")
                .build();

        Reply reply = Reply.builder()
                .content("第二条")
                .createTime(new Date().toString())
                .fromUserId("df")
                .fromUserName("xiexie")
                .id("009")
                .parentId("008").postId("sdjhfo")
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
