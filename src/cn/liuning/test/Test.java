package cn.liuning.test;

import java.util.Scanner;

import cn.liuning.service.CalculatePoint;


public class Test
{
	public static void main(String[] args) {
		
		CalculatePoint aaa = new CalculatePoint();
		Scanner aaaa=new Scanner(System.in);
		String str = aaaa.nextLine();
		aaa.getMessage(str);
	}
}