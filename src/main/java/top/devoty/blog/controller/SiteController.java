package top.devoty.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.devoty.common.R;
import top.devoty.dto.CategoryInfo;
import top.devoty.dto.FocusInfo;
import top.devoty.dto.SiteInfo;
import top.devoty.dto.SocialInfo;
import top.devoty.service.SiteService;

import java.util.ArrayList;
import java.util.List;

/**
 * 网站相关信息
 */
@RestController
public class SiteController {


    private SiteService siteService;

    @Autowired
    public SiteController(SiteService siteService){
        this.siteService = siteService;
    }

    //SELECT config_name, config_value FROM tb_config where config_name in ('avatar', 'desc','name', 'notice', 'slogan')
    @GetMapping("site")
    public R<SiteInfo> site(){
        SiteInfo siteInfo = siteService.getSiteInfo();
        return R.ok(siteInfo);
    }


    @GetMapping("social")
    public R<List<SocialInfo>> social(){
        List<SocialInfo> socialInfoList = siteService.getSocial();
        return R.ok(socialInfoList);
    }

    @GetMapping("category")
    public R<List<CategoryInfo>> category(){
        List<CategoryInfo> categoryInfoList = siteService.getCategory();
        return R.ok(categoryInfoList);
    }

    @GetMapping("focus")
    public R<List<FocusInfo>> focus(){
        List<FocusInfo> focusInfoList = siteService.getFocus();
        return R.ok(focusInfoList);
    }



}
