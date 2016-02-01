package jp.ac.chibafjb.x15g014.kd101;

public class Gorira165 {
	
	public static void main(String[] args) {
		int a[] = {5,10,15};
		int b[] = {0,0,0};
		int y = 2;
		int i;
		for (int x : a)
		{
			b[y] = x;
			y -= 1;
		}
		for(i=0;i<3;i++)
		{
		System.out.println("b[" + i + "]　＝　" + b[i]);
		}

	}

}
