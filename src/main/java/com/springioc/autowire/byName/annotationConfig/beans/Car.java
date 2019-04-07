package com.springioc.autowire.byName.annotationConfig.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Car {
	
	@Value("Renault Duster")
	private String name;
	
	@Value("545543534")
	private int cost;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
