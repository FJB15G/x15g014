package jp.ac.chibafjb.x15g014.kd101;

import java.util.Scanner;

public class Gorira151 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("aの入力 -->");
		double s1 = sin.nextDouble();
		System.out.print("bの入力 -->");
		double s2 = sin.nextDouble();
		System.out.println(s1 + "+" + s2 +"=" + (s1 + s2));
		System.out.println(s1 + "-" + s2 +"=" + (s1 - s2));
		System.out.println(s1 + "*" + s2 +"=" + (s1 * s2));
		System.out.println(s1 + "/" + s2 +"=" + (s1 / s2));

	}

}
