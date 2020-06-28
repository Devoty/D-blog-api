package top.devoty.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SiteInfo {
    private String avatar;                  //                  'https://s2.ax1x.com/2020/01/17/1SCadg.png',
    private String slogan;                  //                  'The way up is not crowded, and most chose ease.',
    private String name;               //                  'FZY′blog',
    private String domain;               //                  'https://www.fengziy.cn',
    private String notice;               //                  '本博客的Demo数据由Mockjs生成',
    private String desc;               //                  '一个It技术的探索者'
}
