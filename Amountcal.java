package nandu;

import java.util.Scanner;
public class Amountcal {
public static void main(String[] args) {
	int amt1, amt2, res;
	Scanner vs=new Scanner(System.in);
	System.out.println("Enter amount1:");
	amt1 = vs.nextInt();
	System.out.println("Enter amount2:");
	amt2= vs.nextInt();
	res =    amt1 + amt2;
System.out.println(res);
if(res<50)
{
	System.out.println("Result is less than:");
}
else
{
	System.out.println("Result is greater than:");
}
}
}
