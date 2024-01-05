package com.project.learnspring.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService2 implements DataServices {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
