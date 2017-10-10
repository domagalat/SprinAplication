package masterSpringMvc;

import masterSpringMvc.config.PicturesUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableConfigurationProperties(PicturesUploadProperties.class)
public class MasterSpringMvcApplication extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(MasterSpringMvcApplication.class, args);
	}

}
