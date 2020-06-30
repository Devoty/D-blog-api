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
public class Link {
    private Integer linkId;

    private Integer linkType;

    private String linkName;

    private String linkUrl;

    private String linkDescription;

    private Integer linkRank;

    private Integer isDeleted;

    private Date createTime;
}