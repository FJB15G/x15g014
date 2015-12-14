package jp.ac.chibafjb.x15g014.kd101;

import java.util.Scanner;

public class Gorira144 {

	public static void main(String[] args) {
		System.out.println("住所の入力 -->");
		System.out.println("氏名の入力 -->");
		System.out.println("電話番号の入力 -->");
		
		Scanner sin = new Scanner(System.in);
		String s1 = sin.next();
		String s2 = sin.next();
		String s3 = sin.next();
		sin.close();
		
		System.out.println("＜確認＞住　　所："+s1);
		System.out.println("　　　　氏　　名："+s2);
		System.out.println("　　　　電話番号："+s3);


	}

}
