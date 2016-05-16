package com.cn.pow;

public class Pow {
	public double myPow(double x, int n) {
		if(n == 0) {
			return 1;
		}
		if(n < 0) {
			n = -n;
			x = 1/x;
		}
		return n%2 == 0 ? myPow(x*x, n/2) : x*(myPow(x*x, n/2)); 
	}
	public static void main(String[] args) {
		Pow p = new Pow();
		double tem = p.myPow(3.0, -2);
		System.out.print(tem);
	}

}
