package tn.esprit.di.asp;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Tracking {
private Logger logger = LoggerFactory.getLogger(getClass());
@Before("execution(* tn.esprit.di.service.ClientInfoSOAPServiceImpl.*(..))")
 public void trackSOAPCalls() {
logger.info("one SOAP service is called ");	 
	 
 }



}
