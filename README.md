# Microservices-FeignClients-Demo

## 使用到的 Annotation

## 請求方 

@EnableEurekaClient  
@EnableFeignClients 
@SpringBootApplication  
public class FeignclientApplication {   
    public static void main(String[] args) {   
        SpringApplication.run(FeignclientApplication.class, args);   
    }  
}   

接口   
@FeignClient(name="hello-service") //spring service name   
public interface FeignVehicle {}   


### 演示內容:FeignClientDemo/feignclient/src/main/java/com/tony/feignclient/FeignclientApplication.java   


## 接收方  
@EnableEurekaClient   
@SpringBootApplication    
public class FeignClientDemoApplication {   
    public static void main(String[] args) {   
        SpringApplication.run(FeignClientDemoApplication.class, args);   
    }   
}   


### 演示內容:FeignClientDemo/src/main/java/com/tony/feignclientdemo/FeignClientDemoApplication.java   
