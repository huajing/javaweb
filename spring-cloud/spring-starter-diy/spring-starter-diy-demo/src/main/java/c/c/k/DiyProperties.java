package c.c.k;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "diy")
public class DiyProperties {
    //application.perperties 中 diy.name=xxx覆盖当前配置
    private String name = "diy-name-default";
    private String testPackage;
    //其它属性继续定义...

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTestPackage(String testPackage) {
        this.testPackage = testPackage;
    }

    public String getTestPackage() {
        return testPackage;
    }
}
