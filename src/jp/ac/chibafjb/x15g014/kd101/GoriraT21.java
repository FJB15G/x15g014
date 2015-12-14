package jp.ac.chibafjb.x15g014.kd101;

import java.util.Scanner;

public class GoriraT21 {
	public static void main(String[] args)
	{
		Scanner sin = new Scanner(System.in);
		
		System.out.print("ハンバーガーの個数　　　-->");
		int h = sin.nextInt();
		System.out.print("フライドポテトの個数　　-->");
		int p = sin.nextInt();
		int H,P,k;//パンバーガーの小計　ポテトの小計　ポテトの小計
		
		H = h * 100;
		P = p * 180;
		k = H + P;//小計
		System.out.println("\nハンバーガーの代金　　　＝　" + H + "円");
		System.out.println("フライドポテトの代金　　＝　" + P + "円");
		System.out.println("小計　　　　　　　　　　＝　" + k + "円");
		
		double s = k * 0.08;//消費税
		System.out.println("\n消費税　　　　　　　　　＝　" + (int)s + "円");
		System.out.println("合計金額　　　　　　　　＝　" + (int)(H + P + s )+ "円");
		System.out.print("\n受取金額　　　　　　　　-->");
		int u = sin.nextInt();//受け取り金額
		sin.close();
		double t;//つり銭
		t = u-(H + P + s);
		System.out.println("つり銭　　　　　　　　　＝　" + (int)Math.ceil(t*1)/1 + "円");
		

	}

}



