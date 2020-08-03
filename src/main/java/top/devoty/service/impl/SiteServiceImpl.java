package top.devoty.service.impl;

import org.springframework.stereotype.Service;
import top.devoty.dto.CategoryInfo;
import top.devoty.dto.FocusInfo;
import top.devoty.dto.SiteInfo;
import top.devoty.dto.SocialInfo;
import top.devoty.service.SiteService;

import java.util.ArrayList;
import java.util.List;

@Service
public class SiteServiceImpl implements SiteService {
    @Override
    public SiteInfo getSiteInfo() {
        SiteInfo siteInfo = SiteInfo.builder()
                .avatar("https://s2.ax1x.com/2020/01/17/1SCadg.png")
                .desc("修身养性！！！").domain("https://www.devoty.top")
                .name("Devoty-blog").notice("注意开车了！！！")
                .slogan("倒车请注意")
                .build();
        return siteInfo;
    }

    @Override
    public List<SocialInfo> getSocial() {
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
        return socialInfoList;
    }

    @Override
    public List<CategoryInfo> getCategory() {
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
        return categoryInfoList;
    }

    @Override
    public List<FocusInfo> getFocus() {

        List<FocusInfo> focusInfoList = new ArrayList<>();
        FocusInfo focusInfo = FocusInfo.builder()
                .id(1)
                .title("Akina")
                .img("https://s1.ax1x.com/2020/05/14/YDfRnU.jpg")
                .build();
        FocusInfo focusInfo2 = FocusInfo.builder()
                .id(2)
                .title("使用说明")
                .img("https://s1.ax1x.com/2020/05/14/YDf4AJ.jpg")
                .build();
        FocusInfo focusInfo3 = FocusInfo.builder()
                .id(3)
                .title("文章归档")
                .img("https://s1.ax1x.com/2020/05/14/YDfT91.jpg")
                .build();

        focusInfoList.add(focusInfo);
        focusInfoList.add(focusInfo2);
        focusInfoList.add(focusInfo3);
        return focusInfoList;
    }


}
