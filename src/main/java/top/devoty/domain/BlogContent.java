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
public class BlogContent {
    private String id;

    private Integer statusCd;

    private Date statusTime;

    private String createStaff;

    private Date createTime;

    private String updateStaff;

    private Date updateTime;

    private String blogContent;
}