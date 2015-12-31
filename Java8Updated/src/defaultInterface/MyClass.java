package com.defaultInterface;

public class MyClass implements Interface1, Interface2
{
	@Override
    public void method2()
	{
	System.out.println(">>>>>>>>>>>>>>>>>>> implement method of the interface2");
    }
	
 
    @Override
    public void method1(String str)
    {
    System.out.println(">>>>>>>>>>>>>>>>>>> implement method of the interface1 "+str);
    }

    
    //####################### MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str)
	{
		System.out.println("MyClass logging::"+str);
		
		//Interface static method
        Interface1.print("hello");
	
	}
	
	
	
	public static void main(String args [])
	{
		MyClass myclass=new MyClass();
		String name="javaDemo";
		myclass.method1(name);
		myclass.log(name);
		
		// ################ Interface method call by lambda expression 
		Interface1 i1 = (s) -> System.out.println(" lambda experssion==="+s);
		i1.method1("interface method call by lambda expersion");
	}
}
