# Microservices-FeignClients-Demo
## 注意事項:  
### 未解錯誤: 在rum時 主模塊的 application.properties 創 target 時會創到 子模塊的 target目錄下,導致主模塊 application.name 和 server.pont 會沒變更到,子模塊也會被物改,需要手動添加主模塊的application.properties 和刪除子模塊的 application.properties   

### pom.xml : spring-cloud 版本問題很多,需要注意對應版本

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
