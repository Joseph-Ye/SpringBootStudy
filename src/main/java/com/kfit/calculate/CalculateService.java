package com.kfit.calculate;

import java.math.BigDecimal;

//计算器服务
public class CalculateService {

	private int scale; //设置在properties当中
	
	public CalculateService(int scale) {
		this.scale = scale;
	}
	public double add(double a, double b) {
		return a+b;
	}
	
	public double sub(double a, double b) {
		return a-b;
	}
	
	public double mul(double a, double b) {
		return a*b;
	}
	
	public double div(double a, double b) {
		return a/b;
	}
	
	//设置精度
	public double setScale(double a) {
		//ROUND_HALF_UP:四舍五入
		return new BigDecimal(a).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
