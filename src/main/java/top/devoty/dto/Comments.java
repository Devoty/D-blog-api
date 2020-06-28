package top.devoty.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Comments {
    private Comment comment;
    private Reply reply;

}
