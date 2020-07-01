package top.devoty.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    String upLoadFile(MultipartFile file);

}
