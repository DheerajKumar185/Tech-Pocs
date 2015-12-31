package com.lambda;

 interface Demo
 {
	 void run();
 }


 class Runner 
 {
 public void run(Demo d)
 {
  System.out.println(" calling method...........");
  d.run();
 }
 }


public class lambdaDemo 
{
public static void main(String args [])
{
	//old way
	Runner d1=new Runner();
	d1.run(new Demo()
	{
	public void run()
	{
	System.out.println("========by old ways===============");
	}
	});
			
	// By Lambda 
	d1.run(()->System.out.println(" by the lambda expression"+"Hello word"));
	
	
	
}

}
