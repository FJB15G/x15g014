package jp.ac.chibafjb.x15g014.kd101;

import java.util.Scanner;

public class Gorira153 {
	public static void main(String[] args) {
		System.out.print("半径r -->");
		
		Scanner sin = new Scanner(System.in);
		float r = sin.nextFloat();
		
		System.out.println("円周 = " + (Math.round(2 * 3.14 * r*10)/10.0));
		System.out.println("面積 = " + (Math.round(3.14 * r * r*10)/10.0));

	}

}
