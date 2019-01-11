import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Administrator on 2018/12/29 0029.
 */

@SpringBootApplication(scanBasePackages = "com.boot")
@EnableZuulProxy
@EnableEurekaClient
public class ZUULApp {
    public static void main(String[] args) {
        SpringApplication.run(ZUULApp.class);
    }
}
