package com.lambda;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example1 
{
public static void main(String args[])
{
	String[] atp = {"kamal Khattar", "Madhav kumar", "Rajesh kumar", "Rahul tiple", "Vishal Mobile", "Jyoti Mobile", "Dheeraj webservice", "Ram mobile"};
	List<String> players =  Arrays.asList(atp);
	
	
	// Old looping
	/*for(String player : players)
	{
	  System.out.println( " old ways getting value==="  +player + "; ");
	}*/
	
	// Using lambda expression and functional operations Type1
	//players.forEach((player) -> System.out.println("Using lambda expression Geeting value==="+player + "; "));
	
	//Lambda Type2
	players.forEach(System.out::println);
	
	
	
	
}
	
}
