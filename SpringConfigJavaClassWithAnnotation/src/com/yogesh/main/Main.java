package com.yogesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yogesh.bean.AssetInfo;
import com.yogesh.resources.SpringConfig;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		AssetInfo assetInfo = applicationContext.getBean(AssetInfo.class);
		assetInfo.setAssetId(1);
		assetInfo.setAssetName("RAM");
		
		System.out.println(assetInfo.toString());
		
		AssetInfo assetInfo2 = applicationContext.getBean(AssetInfo.class);
		System.out.println(assetInfo2.toString());

		
	}
	
}
