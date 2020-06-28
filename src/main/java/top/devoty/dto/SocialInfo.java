package top.devoty.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SocialInfo {
   private String id;
   private String title;
   private String icon;
   private String color;
   private String href;
}
