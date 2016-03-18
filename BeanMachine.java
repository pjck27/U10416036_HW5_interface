//U10416036

import java.util.Scanner;
import javax.*;
public class BeanMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of balls to drop: ");
		int ball = input.nextInt();
		System.out.println("Enter the number of slots in the bean machine: ");
		int number = input.nextInt();
		int slot[] = new int[number];
		int leftRight;
		for(int i = 0; i< number;i++){
			slot[i] = 0;
		}
		
		for(int j = 0; j < ball; j++){
			int sum = 0;
			for(int i = 1; i < number; i++){
				leftRight = (int)(Math.random() * 2);
				//System.out.print(leftRight);
				if(leftRight==0){
					System.out.print("L");
				}
				else{
					System.out.print("R");
					sum++;
				}
				
			}
			System.out.print(" "+sum);
			slot[sum]++;
			//System.out.print(" " + slot[sum]);
			System.out.println();
		}
		for(int i = 0; i < number ; i++){
			//System.out.print(slot[i]);
			for(int j = 0; j < slot[i]; j++){
				
			}
		}
		
		
	}

}
