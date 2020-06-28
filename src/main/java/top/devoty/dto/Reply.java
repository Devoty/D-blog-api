package top.devoty.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Reply {
    private String id;
    private String postId;
    private String parentId;
    private String fromUserId;
    private String fromUserName;
    private String content;
    private String createTime;
    private String toUserId;
    private String toUserName;
}
