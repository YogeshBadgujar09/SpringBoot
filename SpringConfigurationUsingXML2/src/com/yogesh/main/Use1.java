package com.yogesh.main;

import org.springframework.context.ApplicationContext;

import com.yogesh.beans.PrototypeBean;
import com.yogesh.beans.SingletonBean;

public class Use1 {
	
	public Use1(ApplicationContext applicationContext) {
		
		PrototypeBean prototypeBean = applicationContext.getBean(PrototypeBean.class);
		
		prototypeBean.setA(1);
		prototypeBean.setB(10);
		
		System.out.println(prototypeBean.toString());
		
		SingletonBean singletonBean = applicationContext.getBean(SingletonBean.class);
		
		System.out.println(singletonBean.add(prototypeBean.getA(), prototypeBean.getB()));
		
		System.out.println("prototypeBean Print :" + prototypeBean.hashCode());
		System.out.println("Singleton Print :" + singletonBean );
		
	}
	
}
