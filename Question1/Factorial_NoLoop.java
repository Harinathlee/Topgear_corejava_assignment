package Question1;
/*1.	Write a program to print factorial of N ( without using any loop) */

public class Factorial_NoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;
		int result = 1;
		Factorial_NoLoop fn = new Factorial_NoLoop();
		System.out.println(fn.factorial(num, result));

	}
    
	public int factorial(int num,int result) {
		if(num>0) {
		result = result * num * factorial(num-1, result);
		}
		return result;
		
	}
}
