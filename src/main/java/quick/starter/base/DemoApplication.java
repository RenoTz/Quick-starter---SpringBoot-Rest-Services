package quick.starter.base;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "quick.starter.base")
public class DemoApplication
{

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(final String[] args) throws UnknownHostException
    {

        final SpringApplication app = new SpringApplication(DemoApplication.class);

        final Environment env = app.run(args).getEnvironment();

        log.info(
            "\n----------------------------------------------------------\n\t"
                + "Application '{}' is running! Access URLs:\n\t" + "Local: \t\t{}://localhost:{}\n\t"
                + "External: \t{}://{}:{}\n" + "----------------------------------------------------------",
            env.getProperty("spring.application.name"), "http", env.getProperty("server.port"), "http",
            InetAddress.getLocalHost().getHostAddress(), env.getProperty("server.port"));
    }

}
