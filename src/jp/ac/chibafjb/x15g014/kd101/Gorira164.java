package jp.ac.chibafjb.x15g014.kd101;

public class Gorira164 {

	public static void main(String[] args) {
		int a[] = {5,10,15};
		int b[] = {0,0,0};
		int y = 0;
		for (int x : a){
			b[y] = x;
			System.out.println("b[" + y + "]　＝　" + x);
			y += 1;
		}

	}

}
