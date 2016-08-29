import java.io.*;
import java.util.Scanner;

public class vt 
{
	

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s3=s1.replaceAll("[aeiouAEIOU]","");
		
		StringBuffer s2=new StringBuffer(s1).reverse();
		System.out.println(s2);
		System.out.println(s3);
		
	
		
	}
	
}
