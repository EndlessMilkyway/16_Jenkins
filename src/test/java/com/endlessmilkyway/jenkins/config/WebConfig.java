package com.endlessmilkyway.jenkins.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                /* 컨테이너에 올리 않은 상태의 CORS */
                // .allowedOrigins("http://localhost:5173")
                /* 8011 컨테이너에 올린 상태의 CORS */
                // .allowedOrigins("http://localhost:8011")
                /* k8s 워커노드의 30000번 리액트서버에서 오는 요청 CORS */
                // .allowedOrigins("http://localhost:30000")
                /* Ingress 적용 후 CORS 설정은 필요 없어지게 된다. 클러스터 IP로 통신 */
                .allowedOrigins()
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
