package jp.ac.chibafjb.x15g014.kd101;

import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("1:足し算\n2:引き算\n3:かけ算\n4:割り算");
		int value = sin.nextInt();    //整数値の入力
		sin.close();

		int a = 100;
		int b = 20;
		switch(value)
		{
		case 1:
		    System.out.println(a+"+"+b+"="+(a+b));
		    break;
		case 2:
		    System.out.println(a+"-"+b+"="+(a-b));
		    break;
		case 3:
		    System.out.println(a+"*"+b+"="+(a*b));
		    break;
		case 5:
		    System.out.println(a+"/"+b+"="+(a/b));
		    break;
		}

	}

}
