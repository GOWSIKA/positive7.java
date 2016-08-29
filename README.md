
import java.io.*;
import java.util.Scanner;

public class reverse1
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=s1.replaceAll("[aeiouAEIOU]","");
	StringBuffer s3=new StringBuffer(s2).reverse();
	System.out.println(s3);
}
}
