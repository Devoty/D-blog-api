package top.devoty.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.devoty.service.FileService;
import top.devoty.common.R;

/**
 * 文件长传
 */
@RestController
public class FileController {

    private final FileService fileService;

    @Autowired
    public FileController(FileService fileService){
        this.fileService = fileService;
    }

    /**
     * 上传文件，返回文件UUID
     * @param file 文件
     * @return
     */
    @PostMapping("fileUpload")
    public R<String> fileUpLoad(MultipartFile file){
        return R.ok(fileService.upLoadFile(file));
    }

}
