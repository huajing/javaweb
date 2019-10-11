package c.c.k.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 来一个OOM，stop the world
 */
public class STWTest {
    /**
     * ===============JVM参数==================
     * -Xms100M -Xmx100M -Xss128k -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintHeapAtGC -Xloggc:./gclogs
     *  初始堆的内存10M,最大也10M，很容易导致OOM
     *
     * ==============执行过程如下==============
     * D:\Program Files\Java\jdk1.8.0_181\bin\java.exe" -Xms100M -Xmx100M -Xss128k -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintHeapAtGC -Xloggc:./gclogs "-javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2018.3.2\lib\idea_rt.jar=59548:D:\Program Files\JetBrains\IntelliJ IDEA 2018.3.2\bin" -Dfile.encoding=UTF-8 -classpath "D:\Program Files\Java\jdk1.8.0_181\jre\lib\charsets.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\deploy.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\access-bridge-64.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\cldrdata.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\dnsns.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\jaccess.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\jfxrt.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\localedata.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\nashorn.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunec.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunjce_provider.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunmscapi.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunpkcs11.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\zipfs.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\javaws.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\jce.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\jfr.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\jfxswt.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\jsse.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\management-agent.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\plugin.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\resources.jar;D:\Program Files\Java\jdk1.8.0_181\jre\lib\rt.jar;D:\spring-project\javaweb\raw-java\target\classes;C:\Users\chenck\.m2\repository\org\springframework\boot\spring-boot-starter-test\2.0.1.RELEASE\spring-boot-starter-test-2.0.1.RELEASE.jar;C:\Users\chenck\.m2\repository\org\springframework\boot\spring-boot-starter\2.0.1.RELEASE\spring-boot-starter-2.0.1.RELEASE.jar;C:\Users\chenck\.m2\repository\org\springframework\boot\spring-boot\2.0.1.RELEASE\spring-boot-2.0.1.RELEASE.jar;C:\Users\chenck\.m2\repository\org\springframework\spring-context\5.0.5.RELEASE\spring-context-5.0.5.RELEASE.jar;C:\Users\chenck\.m2\repository\org\springframework\spring-aop\5.0.5.RELEASE\spring-aop-5.0.5.RELEASE.jar;C:\Users\chenck\.m2\repository\org\springframework\spring-beans\5.0.5.RELEASE\spring-beans-5.0.5.RELEASE.jar;C:\Users\chenck\.m2\repository\org\springframework\spring-expression\5.0.5.RELEASE\spring-expression-5.0.5.RELEASE.jar;C:\Users\chenck\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.0.1.RELEASE\spring-boot-autoconfigure-2.0.1.RELEASE.jar;C:\Users\chenck\.m2\repository\org\springframework\boot\spring-boot-starter-logging\2.0.1.RELEASE\spring-boot-starter-logging-2.0.1.RELEASE.jar;C:\Users\chenck\.m2\repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;C:\Users\chenck\.m2\repository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;C:\Users\chenck\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.10.0\log4j-to-slf4j-2.10.0.jar;C:\Users\chenck\.m2\repository\org\apache\logging\log4j\log4j-api\2.10.0\log4j-api-2.10.0.jar;C:\Users\chenck\.m2\repository\org\slf4j\jul-to-slf4j\1.7.25\jul-to-slf4j-1.7.25.jar;C:\Users\chenck\.m2\repository\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;C:\Users\chenck\.m2\repository\org\yaml\snakeyaml\1.19\snakeyaml-1.19.jar;C:\Users\chenck\.m2\repository\org\springframework\boot\spring-boot-test\2.0.1.RELEASE\spring-boot-test-2.0.1.RELEASE.jar;C:\Users\chenck\.m2\repository\org\springframework\boot\spring-boot-test-autoconfigure\2.0.1.RELEASE\spring-boot-test-autoconfigure-2.0.1.RELEASE.jar;C:\Users\chenck\.m2\repository\com\jayway\jsonpath\json-path\2.4.0\json-path-2.4.0.jar;C:\Users\chenck\.m2\repository\net\minidev\json-smart\2.3\json-smart-2.3.jar;C:\Users\chenck\.m2\repository\net\minidev\accessors-smart\1.2\accessors-smart-1.2.jar;C:\Users\chenck\.m2\repository\org\ow2\asm\asm\5.0.4\asm-5.0.4.jar;C:\Users\chenck\.m2\repository\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar;C:\Users\chenck\.m2\repository\junit\junit\4.12\junit-4.12.jar;C:\Users\chenck\.m2\repository\org\assertj\assertj-core\3.9.1\assertj-core-3.9.1.jar;C:\Users\chenck\.m2\repository\org\mockito\mockito-core\2.15.0\mockito-core-2.15.0.jar;C:\Users\chenck\.m2\repository\net\bytebuddy\byte-buddy\1.7.11\byte-buddy-1.7.11.jar;C:\Users\chenck\.m2\repository\net\bytebuddy\byte-buddy-agent\1.7.11\byte-buddy-agent-1.7.11.jar;C:\Users\chenck\.m2\repository\org\objenesis\objenesis\2.6\objenesis-2.6.jar;C:\Users\chenck\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;C:\Users\chenck\.m2\repository\org\hamcrest\hamcrest-library\1.3\hamcrest-library-1.3.jar;C:\Users\chenck\.m2\repository\org\skyscreamer\jsonassert\1.5.0\jsonassert-1.5.0.jar;C:\Users\chenck\.m2\repository\com\vaadin\external\google\android-json\0.0.20131108.vaadin1\android-json-0.0.20131108.vaadin1.jar;C:\Users\chenck\.m2\repository\org\springframework\spring-core\5.0.5.RELEASE\spring-core-5.0.5.RELEASE.jar;C:\Users\chenck\.m2\repository\org\springframework\spring-jcl\5.0.5.RELEASE\spring-jcl-5.0.5.RELEASE.jar;C:\Users\chenck\.m2\repository\org\springframework\spring-test\5.0.5.RELEASE\spring-test-5.0.5.RELEASE.jar;C:\Users\chenck\.m2\repository\org\xmlunit\xmlunit-core\2.5.1\xmlunit-core-2.5.1.jar;C:\Users\chenck\.m2\repository\io\reactivex\rxjava\1.3.8\rxjava-1.3.8.jar" c.c.k.jvm.STWTest
     * idx=540218 time:2
     * idx=810326 time:19
     * idx=1688983 time:25
     * idx=2643605 time:645
     * idx=2734846 time:3
     * idx=3223607 time:478
     * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
     * 	at java.util.Arrays.copyOf(Arrays.java:3210)
     * 	at java.util.Arrays.copyOf(Arrays.java:3181)
     * 	at java.util.ArrayList.grow(ArrayList.java:265)
     * 	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:239)
     * 	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:231)
     * 	at java.util.ArrayList.add(ArrayList.java:462)
     * 	at c.c.k.jvm.STWTest.main(STWTest.java:13)
     *
     * Process finished with exit code 1
     * @param args
     */
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        int idx = 0;//执行次数
        while (true){
            idx++;
            long start = System.currentTimeMillis();
            list.add(new Object());
            long duration = System.currentTimeMillis() - start; //STW的时间
            if(duration>1){
                System.out.println("idx=" + idx + " duration:" + duration);
            }
        }
    }
}
