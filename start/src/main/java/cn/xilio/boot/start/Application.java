package cn.xilio.boot.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.xilio.boot.system.infra.mapper")
@SpringBootApplication(scanBasePackages = "cn.xilio.boot")
public class Application {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(Application.class, args);
        long end = System.currentTimeMillis();
        System.out.println("启动耗时："+(end-start)+" 毫秒");
    }
}
