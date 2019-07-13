package com.itheima;

import java.util.Scanner;

/*
 * 需求：键盘录入两个数据，获取这两个数据的较大值
 * 
 * 分析：
 * 		A:看到了键盘录入，我们就应该想到键盘录入的三个步骤
 * 			导包，创建键盘录入对象，获取数据
 * 		B:获取两个数据的较大值，用if语句的格式2就可以实现判断
 * 		C:把较大的结果输出即可
 * 
 * 导包：
 * 		A:手动导包
 * 		B:点击鼠标自动生成
 * 		C:快捷键
 * 			ctrl+shift+o
 * 
 * 键盘录入三个数据，使用if语句获取三个数中  的最大值。
 */
public class IfTest {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//给出提示
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();

		int max;		
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		
		//我可以做
		//max += 10;
		
		System.out.println("较大的值是："+max);
	}
}
