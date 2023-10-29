package com.bowy.design.pattern.singleton;

import com.bowy.design.pattern.singleton.entity.President;

/**
 * 单例模式应用
 *
 * @author xiongbw
 */
public class SingletonPatternApplication {

	public static void main(String[] args) {
		// 每次获取类的对象，内存地址都相同。
		System.out.println(President.getInstance());
		System.out.println(President.getInstance());
		System.out.println(President.getInstance());
	}

}
