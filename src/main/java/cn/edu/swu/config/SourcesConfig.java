package cn.edu.swu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class SourcesConfig implements WebMvcConfigurer {
    @Value("${download.path}")
    private String downloadPath;//访问时的虚拟路径
    @Value("${local.path}")
    private String localPath;//服务器的绝对路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/txt/**").addResourceLocations("file:"+"E:/springtmp/txt/");
    }
}
