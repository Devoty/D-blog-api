package top.devoty.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FocusInfo {
    private int id;
    private String img;
    private String title;
}
