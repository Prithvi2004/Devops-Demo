package mypkg;

public class MyCalc {
	
	public int sum(int a,int b) {
		return a+b;
	}
	
	public int diff(int a,int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
	
	public void greet() {
		System.out.println("Done my !st Mini_Project");
	}
	
	

	public static void main(String[] args) {
		MyCalc obj=new MyCalc();
		System.out.println("Sum is: "+obj.sum(20, 10));
		System.out.println("Diff is: "+obj.diff(20, 10));
		System.out.println("Mul is: "+obj.mul(20, 10));
		System.out.println("Div is: "+obj.div(20, 10));
		obj.greet();
		

	}

}
