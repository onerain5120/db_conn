package test;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int tot = 0;
		double count = 0;
		double avg;
		
		
		int[][] array = {{95, 86},{83, 92, 96},{78, 83, 93, 87, 88}};
		
		for (int i = 0 ; i < array.length ; i ++) {
			for (int j = 0 ; j < array[i].length ; j++) {
				tot = tot + array[i][j];
			}
			count += array[i].length;
		}
		
		avg = tot / count;
		
		System.out.println(tot);
		System.out.println(avg);
	}
}


