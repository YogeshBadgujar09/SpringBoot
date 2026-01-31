package com.yogesh.main;

import org.springframework.context.ApplicationContext;

import com.yogesh.beans.PrototypeBean;
import com.yogesh.beans.SingletonBean;

public class Use2 {
		
	public Use2(ApplicationContext applicationContext) {
		
		PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
		
		prototypeBean2.setA(18);
		prototypeBean2.setB(25);
		
		System.out.println(prototypeBean2.toString());
		
		SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
		
		System.out.println(singletonBean2.add(prototypeBean2.getA(), prototypeBean2.getB()));
		
		System.out.println("prototypeBean Print :" + prototypeBean2.hashCode());
		System.out.println("Singleton Print :" + singletonBean2 );
		
	}
}
