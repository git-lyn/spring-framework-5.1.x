package com.lyn;

import com.lyn.app.Appconfig;
import com.lyn.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-10 10:38
 **/
public class SpringDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		//context.refresh();
		IndexService bean = context.getBean(IndexService.class);
		bean.query();

	}
}
