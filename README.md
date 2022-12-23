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


## 接收方  
@EnableEurekaClient   
@SpringBootApplication    
public class FeignClientDemoApplication {   
    public static void main(String[] args) {   
        SpringApplication.run(FeignClientDemoApplication.class, args);   
    }   
}   

