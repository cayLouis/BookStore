package com.richard.bookstore.framework.common.util.io;

import cn.hutool.core.util.IdUtil;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.auth.CredentialsProvider;
import com.aliyun.oss.model.PutObjectRequest;
import com.richard.bookstore.framework.common.config.AliOSSProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.io.File;

/**
 * @ClassName AliOSSUtils
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/11 21:34
 * @Version 1.0.0-demo
 */

@Configuration
public class AliOSSUtils {

    @Resource
    private AliOSSProperties aliOSSProperties;

    @Resource
    private CredentialsProvider credentialsProvider;


    public String uploadFile(File file){
        // 生成uuid
        String fileId = IdUtil.simpleUUID();
        String idName = fileId + "-" + file.getName();
        getOssClient().putObject(new PutObjectRequest(aliOSSProperties.getBucketName(), fileId, file));
        return idName;
    }

    public String downloadFile(String idName){
        String[] splitName = idName.split("-");
        return null;
    }

    @Bean
    public OSSClient getOssClient(){
        return new OSSClient(aliOSSProperties.getEndpoint(), credentialsProvider, null);
    }
}
