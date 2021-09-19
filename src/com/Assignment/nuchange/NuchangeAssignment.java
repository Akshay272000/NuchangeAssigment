package com.Assignment.nuchange;

import java.util.*;
import java.util.Scanner;

import org.json.JSONObject;

public class NuchangeAssignment {
static Scanner sc = new Scanner(System.in);
static int count1;
static HashMap<String,Integer> urllist = new HashMap<String,Integer>();
static List<Integer> keylist  = new ArrayList<>();
static List<Integer> count  = new ArrayList<>();

	
	static void run()
	{
		System.out.println("To start the program run your command :");
		String s = sc.nextLine();
		switch(s)
		{
		case "Run java url database":
		{
			System.out.println("Commands :");
			commands();
			break;
		}
		case "exit":
		{
			System.exit(0);
		}
		
		
		}
	
	}
	static void commands()
	{
		System.out.println("a" + " " + "storeurl");
		System.out.println("b"+ " "  + "get");
		System.out.println("c" + " " +  "count");
		System.out.println("d" +  " " + "list");
		System.out.println("e" + " " + "exit");
		System.out.println("Select Your command here :");
		String s =sc.nextLine();
		switch(s)
		{
		case "a" :
		{System.out.println("Enter you url here  :");
			String store = sc.nextLine();
			storeurl(store);
	        commands();
	        break;
		}
		
		case "b" :
		{System.out.println("Enter you url here  :");
		String get = sc.nextLine();
		get(get);
		commands();
		break;
		
			
		}
		case "c":
		{
			System.out.println("Enter you url here  :");
			String count = sc.nextLine();
			count(count);
			commands();
			break;
			
		}
		
		case "d":
		{
			list();
			commands();
			
			break;
		}
		
		case "exit":
			System.out.println("Exit Completed");
			System.exit(0);
			
		}
	
		
		
		
	}
	static void list()
	{
		JSONObject obj1 = new JSONObject(urllist);
		System.out.println(obj1);
	}
	
	static void count(String fgh)
	{
		if(urllist.containsKey(fgh))
		{
			System.out.println(count1);
			
		}
		else if(fgh.equals("exit"))
		{
			System.out.println("Exit Successfull");
			System.exit(0);
		}
	}
	
	static void storeurl(String abc)
	{
		if(abc.equals("exit"))
		{
			System.out.println("Exited Successfully");
			System.exit(0);
			
		}
		else {
//			System.out.println("Hii storeurl");
			int uniquekey = abc.hashCode();
			keylist.add(uniquekey);
			count1 = 0;
			urllist.put(abc, count1);
//			System.out.println(urllist);
		}
	}
	static void get(String xyz)
	{
		if(urllist.containsKey(xyz))
		{
			count1++;
			urllist.replace(xyz, count1);
			System.out.println(xyz.hashCode());
			System.out.println(count1);
			
		}
		else if(xyz.equals("exit"))
		{
			System.out.println("Exit Successfull");
			System.exit(0);
		}
		else {
			System.out.println("Please store the url in database:");
			commands();
		}
	}
	
	
	public static void main(String[] args)
	{
	run();
	
	}
}
