package jp.ac.chibafjb.x15g014.kd101;

import java.util.Scanner;

public class Gorira152 {

	public static void main(String[] args) {
		System.out.print("半径r -->");
		
		Scanner sin = new Scanner(System.in);
		float r = sin.nextFloat();
		System.out.println("円周 = " + (2 * 3.14 * r));
		System.out.println("面積 = " + (3.14 * r * r));


	}

}
