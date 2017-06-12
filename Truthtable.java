package assignment3;

//Write a program in java to compare the truth table of Bitwise AND and Logical AND 
import java.util.Scanner;

public class Truthtable {

	public static void main(String[] args) {
//Take two-byte variables and take the input from the user(as 0 0, 0 1, 1 0, 1 1) 
Byte Num1, Num2;
System.out.println("Enter two number either 0 or 1 ");
Scanner sc=new Scanner(System.in);
Num1=sc.nextByte();
Num2=sc.nextByte();
byte Bitwise=(byte)(Num1 & Num2);
//Conditional statement.
boolean Logical= (Num1==0 || Num2==0) ? false :true; 

System.out.println("The Value of Bitwise AND of two numbers "+Num1+" and "+Num2+" is "+Bitwise);
System.out.println("The Value of Logical AND of two numbers "+Num1+" and "+Num2+" is "+Logical);
sc.close();
	}

}


	


