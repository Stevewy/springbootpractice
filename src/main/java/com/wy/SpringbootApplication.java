package com.wy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/** @SpringBootApplication SpringBoot应用
 *      @SpringBootConfiguration springboot配置
 *          @Configuration spring 配置
 *              @Component spring 组件
 *      @EnableAutoConfiguration 自动配置（有start就配置）
 *          @AutoConfigurationPackage 自动配置包
 *              @Import({Registrar.class}) 自动配置包注册
 *          @Import({AutoConfigurationImportSelector.class}) 自动导入旋转
 *  自动装配，不用自己写配置文件，全在注解里面。  分为3块 1.springboot spring配置 2.自动导入包（在pom里面导入就配置） 3.扫描同级
 */
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        // 启动应用 参数是找到启动类（main）
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
