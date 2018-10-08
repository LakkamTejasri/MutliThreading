package runnable;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		MyThread t=new MyThread();
		Thread t1=new Thread(t);
		t1.start();
		for(int i=100;i>=1;i--)
		{
			System.out.println(i);
		}

	}

}
