package com.project.learnspring.examples.e0;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class)) {
			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			// context.getBean(PrototypeClass.class);
			// console log -
			/*
			 * com.project.learnspring.examples.e0.NormalClass@51bf5add
			 * com.project.learnspring.examples.e0.NormalClass@51bf5add
			 * com.project.learnspring.examples.e0.PrototypeClass@7905a0b8
			 * com.project.learnspring.examples.e0.PrototypeClass@35a3d49f
			 * com.project.learnspring.examples.e0.PrototypeClass@389b0789
			 * com.project.learnspring.examples.e0.PrototypeClass@13d9cbf5
			 */
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));

		}


	}
	

}
