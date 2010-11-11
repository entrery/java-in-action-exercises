package jia.exercises.lecture2.Aleksander.Zlatkovski;


import java.util.*;
import java.io.*;
public class Exercise1 {
	
	public static void main ( String [] args ) throws IOException {
	
	
	   Scanner sc = new Scanner(System.in);
	   String name="",lastName="",post="",age="",salary="";
	   PrintWriter pw = new PrintWriter((new FileWriter(new File("Sample.txt"), true)),true);
       
	    
	   System.out.println("name:");
	   name=sc.nextLine();
	   System.out.println("last name:");
	   lastName=sc.nextLine();
	   System.out.println("age:");
	   age=sc.nextLine();
	   System.out.println("post:");
	   post=sc.nextLine();
	   System.out.println("salary:");
	   salary=sc.nextLine();
	   
	   pw.println(String.format ("%10s",name)+String.format ("%12s",lastName)+"   "+String.format ("%3s",age)+String.format ("%12s",post)+" "+String.format ("%8s",salary));
	   pw.close();
		
	   }
	}
