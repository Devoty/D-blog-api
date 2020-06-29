package top.devoty.service.impl;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.devoty.service.BlogService;
import top.devoty.service.FileService;
import top.devoty.common.R;
import top.devoty.common.UUIDUtils;
import top.devoty.util.FileUtil;

import java.io.File;
import java.io.IOException;

@Service
public class FileServiceImpl implements FileService {

    @Value("${dir}")
    private String dir;

    @Autowired
    private BlogService blogService;

    @Override
    public R upLoadFile(MultipartFile multipartFile) {

        File fileDir = new File(dir);
        fileDir.mkdirs();

        String originalFilename = multipartFile.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        String uuid = UUIDUtils.getUUID();
        String filePath = dir + uuid + suffix;
        File dest = new File(filePath);

        if(!FileUtil.saveFile(multipartFile, dest)){
            return R.error();
        }

        String content = FileUtil.readFile(dest);
        blogService.article(content);

        return R.ok(uuid);

    }

}
