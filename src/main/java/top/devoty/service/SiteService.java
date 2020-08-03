package top.devoty.service;

import top.devoty.dto.CategoryInfo;
import top.devoty.dto.FocusInfo;
import top.devoty.dto.SiteInfo;
import top.devoty.dto.SocialInfo;

import java.util.List;

public interface SiteService {

    SiteInfo getSiteInfo();

    List<SocialInfo> getSocial();

    List<CategoryInfo> getCategory();

    List<FocusInfo> getFocus();
}
