package com.richard.bookstore.framework.common.config;

import com.aliyun.oss.common.auth.BasicCredentials;
import com.aliyun.oss.common.auth.Credentials;
import com.aliyun.oss.common.auth.CredentialsProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Proxy;

/**
 * @ClassName CredentialsProvideImpl
 * @Description TODO
 * @Author 81556
 * @DATE 2024/5/11 22:01
 * @Version 1.0.0-demo
 */
@Component
@Configuration
public class CredentialsProvideImpl implements CredentialsProvider {

    @Resource
    private AliOSSProperties aliOSSProperties;

    @Override
    public void setCredentials(Credentials credentials) {

    }

    @Bean
    @Override
    public Credentials getCredentials() {
        return new BasicCredentials(aliOSSProperties.getAccessKeyId(), aliOSSProperties.getAccessKeySecret(), null);
    }
}
