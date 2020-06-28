package top.devoty.service.impl;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.devoty.domain.BlogContent;
import top.devoty.mapper.BlogContentMapper;
import top.devoty.service.FileService;
import top.devoty.common.R;
import top.devoty.common.UUIDUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@Service
public class FileServiceImpl implements FileService {

    @Value("${dir}")
    private String dir;

    @Autowired
    private BlogContentMapper blogContentMapper;

    @Override
    public R upLoadFile(MultipartFile multipartFile) {

        File fileDir = new File(dir);
        fileDir.mkdirs();

        String originalFilename = multipartFile.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        String uuid = UUIDUtils.getUUID();
        String filePath = dir + uuid + suffix;
        File dest = new File(filePath);

        if(!saveFile(multipartFile, dest)){
            return R.error();
        }


        String content = readFile(dest);
        BlogContent blogContent = new BlogContent();
        blogContent.setId(uuid);
        blogContent.setCreateTime(new Date());
        blogContent.setStatusCd(0);
        blogContent.setStatusTime(new Date());
        blogContent.setBlogContent(content);
        blogContentMapper.insert(blogContent);

        return R.ok(uuid);

    }


    public String readFile(File file){
        try {
            String content = FileUtils.readFileToString(file, "utf-8");
            return content;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public boolean saveFile(MultipartFile multipartFile, File dest){
        try {
            multipartFile.transferTo(dest);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
