package top.devoty.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryInfo {
    private String id;               //                  1,
    private String title;               //                  'JAVA',
    private String href;               //                  '/category/java'
}
