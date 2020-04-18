package lambdaExpressions;

import java.awt.EventQueue;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Running!!!");
			}
		};
		
		EventQueue.invokeLater(r);
		EventQueue.invokeLater(()->System.out.println("Running"));

	}

}
