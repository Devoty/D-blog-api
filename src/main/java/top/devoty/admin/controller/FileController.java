package top.devoty.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.devoty.service.FileService;
import top.devoty.common.R;

@RestController
public class FileController {

    private static final String FILE_UPLOAD = "/fileUpload";

    private final FileService fileService;

    @Autowired
    public FileController(FileService fileService){
        this.fileService = fileService;
    }

    @PostMapping(FILE_UPLOAD)
    public R fileUpLoad(MultipartFile file){
        return R.ok(fileService.upLoadFile(file));
    }

}
