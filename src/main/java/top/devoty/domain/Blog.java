package top.devoty.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2020/06/29
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private Long id;

    private String title;

    private String contentId;

    private String subUrl;

    private String summary;

    private String coverImage;

    private Integer categoryId;

    private String banner;

    private Integer hot;

    private Integer top;

    private Integer views;

    private Integer comment;

    private Integer commentsCount;

    private Integer statusCd;

    private Date statusTime;

    private String createStaff;

    private Date createTime;

    private String updateStaff;

    private Date updateTime;
}