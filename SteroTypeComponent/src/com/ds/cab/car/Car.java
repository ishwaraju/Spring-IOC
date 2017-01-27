package com.ds.cab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ds.cab.engine.Engine;
@Component
public class Car {
	@Autowired
	private Engine engine;
	
	public void display(){
		System.out.println("Engine Name : "+engine.getEngineName());
	}
}
