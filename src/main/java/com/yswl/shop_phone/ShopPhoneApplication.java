package com.yswl.shop_phone;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Import;
import org.springframework.jmx.support.RegistrationPolicy;

@SpringBootApplication(scanBasePackages = "com.yswl.shop_phone")
@MapperScan("com.yswlkj.yswl.dao")
@Import(FdfsClientConfig.class)
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
public class ShopPhoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopPhoneApplication.class, args);
    }

}
