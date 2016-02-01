package jp.ac.chibafjb.x15g014.kd101;

public class Gorira171 {

	public static void main(String[] args) {
		int data[] = {100,200,300};
		System.out.println("data[" + 0 + "] = " + data[0]);
		int i = 1;
		for(int k : data){
			System.out.println("data[" + i + "] = " + k);
			i += 1;
		}

	}

}
