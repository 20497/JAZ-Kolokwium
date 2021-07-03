package pjatk.edu.pl.jaz20497nbp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Config {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
