package tw.keang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot的啟動器
 * @author lenovo
 *
 */

@SpringBootApplication
@MapperScan("tw.keang.dao")//用於掃描Mybatis街口
public class Application {
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
}
