package com.test.git;

public class TestClass {

	public int add(int a, int b){
		int result = a + b;
		return result;
	}
	public int multiply(int a, int b){
		int result = a*b;
		return result;
	}
	public static void main(String[] args) {
		TestClass ref = new TestClass();
		int sum = ref.add(5,6);
		int mult = ref.multiply(5,6);
		System.out.println(sum);
		System.out.println(mult);
		System.out.println("just a addition in the project");
		

	}

}
