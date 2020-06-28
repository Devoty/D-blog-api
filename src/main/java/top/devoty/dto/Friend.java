package top.devoty.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Friend {
   private String id;
   private String siteName;
   private String path;
   private String desc;
}
