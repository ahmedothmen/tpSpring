package tn.esprit.di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("tn.esprit")
@EnableAspectJAutoProxy
public class AnnotationConfig {

}
