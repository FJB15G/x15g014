package jp.ac.chibafjb.x15g014.kd101;

public class Gorira161 {

	public static void main(String[] args) 
	{
		int test[] = new int[2];
		test[0] = 10;
		test[1] = 20;
		
		int i;
		int work;
		work = test[1];
		test[1] = test[0];
		test[0] = work;
		for(i=0;i<test.length;i++)
		{
			System.out.println("test[" + i + "]" + "=" + test[i]);
		}

	}

}
