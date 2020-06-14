package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {
 
    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
 
    public static void main(String[] args) {
        /**
         * SpringApplication会自动加载application.properties文件，具体的加载路径包含以下:
         * <p>
         *     1. A <b>/config</b> subdirectory of the current directory;
         *     <p/>
         * <p>
         *     2. The Current Directory
         * </p>
         * <p>
         *     3. A classpath /config package
         * </p>
         * <p>
         *     4. The classpath root.
         * </p>
         */
        SpringApplication.run(Example.class, args);
    }
}