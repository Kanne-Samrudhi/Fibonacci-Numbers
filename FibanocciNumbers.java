package com;

import java.util.Scanner;

public class FibanocciNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		printFibanocciNum(n);
	}
	static void printFibanocciNum(int n) {
		int f1=0,f2=1,f3;
		while(f1<=n) {
		//while(n>0) {
			System.out.println(f1+" ");
			f3=f1+f2;
			f1=f2;
			f2=f3;
			//n--;
		}
	}
}
