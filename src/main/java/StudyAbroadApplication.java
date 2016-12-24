import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Sandwich on 2016/12/24 0024.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StudyAbroadApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudyAbroadApplication.class, args);
    }
}
