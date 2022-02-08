package com.demo1;

public class Divisible {
public static void main(String[] args) {
	String num= "78274";
	int number = Integer.parseInt(num);
	int div= 7;
	System.out.println(number);
	if(number % 7 ==0) {
		System.out.println("1");
	}
	else
		System.out.println("0");
}
}
