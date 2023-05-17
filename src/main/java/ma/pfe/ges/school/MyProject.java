package ma.pfe.ges.school;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

public class MyProject {

    private final static Logger LOGGER= LoggerFactory.getLogger(MyProject.class);
    public static void main(String[] args) {
        SpringApplication.run(MyProject.class);
        LOGGER.trace("star appli log 1");
        LOGGER.debug("star appli log 2");
        LOGGER.info("star appli log 3");
        LOGGER.warn("star appli log 4");
        LOGGER.error("star appli log 5");
    }
}
