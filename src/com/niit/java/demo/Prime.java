package com.niit.java.demo;

public class Prime {
	static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if (x % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(7));
	}
}