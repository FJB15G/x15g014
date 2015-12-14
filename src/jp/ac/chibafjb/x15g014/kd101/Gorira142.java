package jp.ac.chibafjb.x15g014.kd101;

import java.util.Scanner;

public class Gorira142 {

	public static void main(String[] args) {
		System.out.println("整数ａの入力  -->");
		System.out.println("整数ｂの入力  -->");
		
		Scanner sin = new Scanner(System.in);
		int s1 = sin.nextInt();
		int s2 = sin.nextInt();
		System.out.println(s1 + "+" + s2 +"=" + (s1 + s2));
		System.out.println(s1 + "-" + s2 +"=" + (s1 - s2));
		System.out.println(s1 + "*" + s2 +"=" + (s1 * s2));
		System.out.println(s1 + "/" + s2 +"=" + (s1 / s2));
		

	}

}
