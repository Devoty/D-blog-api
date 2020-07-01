package top.devoty.service.impl;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.devoty.exception.ExceptionEnum;
import top.devoty.exception.ServiceException;
import top.devoty.service.BlogService;
import top.devoty.service.FileService;
import top.devoty.common.UUIDUtils;
import top.devoty.util.FileUtil;

import java.io.File;

@Service
public class FileServiceImpl implements FileService {

    @Value("${dir}")
    private String dir;

    @Autowired
    private BlogService blogService;

    @SneakyThrows
    @Override
    public String upLoadFile(MultipartFile multipartFile) {

        File fileDir = new File(dir);
        fileDir.mkdirs();

        String originalFilename = multipartFile.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        String uuid = UUIDUtils.getUUID();
        String filePath = dir + uuid + suffix;
        File dest = new File(filePath);

        if(!FileUtil.saveFile(multipartFile, dest)){
            throw new ServiceException(ExceptionEnum.FILE_ERROR);
        }

        String content = FileUtil.readFile(dest);
        blogService.article(content);

        return uuid;

    }

}
