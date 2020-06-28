package top.devoty.service;

import org.springframework.web.multipart.MultipartFile;
import top.devoty.common.R;


public interface FileService {

    R upLoadFile(MultipartFile file);

}
