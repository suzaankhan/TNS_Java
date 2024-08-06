package com.problem;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int samples_per_round;
		
		int leaves_collected = 0;
		int rounds = 1;
		
		while(leaves_collected < 30) {
			System.out.println("Enter no of leaf sample to collect in round " + rounds);
			samples_per_round = sc.nextInt();
			rounds++;
			leaves_collected += samples_per_round;
		}
		
		System.out.println("Rounds taken: " + --rounds);
		System.out.println("Leaves collected: " + leaves_collected);
		
	}
}
