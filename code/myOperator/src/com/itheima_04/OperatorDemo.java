package com.itheima_04;
/*
 * ��ϵ�������
 * 		==,!=,>,>=,<,<=
 * 		��ϵ�����������ϵĽ����boolean���͡�
 * 
 * ע�����
 * 		ǧ��Ҫ��==д����=
 */
public class OperatorDemo {
	public static void main(String[] args) {
		//������������
		int a = 10;
		int b = 20;
		int c = 10;
	
		//==
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("------------");
		
		//!=
		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println("------------");
		
		//>
		System.out.println(a > b);
		System.out.println(a > c);
		System.out.println("------------");
		
		//>=
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("------------");
		
		System.out.println(a == b);
		System.out.println(a = b);//20,��b��ֵ��ֵ����a������a��Ϊ��������
	}
}
