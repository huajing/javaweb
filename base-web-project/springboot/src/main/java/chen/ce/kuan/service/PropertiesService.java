package chen.ce.kuan.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by chenck on 2018/7/14.
 */
@ConfigurationProperties(prefix = "spring.datasource")
@Component
public class PropertiesService {
    private String url;
    private String username;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
