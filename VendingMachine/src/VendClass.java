import java.util.Scanner;
public class VendClass {
	void vendMethod() {
		int total=0,i=0,m;
	System.out.println("enter quantity");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(i<n)
{System.out.println("1.Cold coffee----->Rs35\n2.hot coffee----->Rs50\n3.Tea----->Rs20\n4.Coke----->Rs25\n5.Pepsi----->Rs25");
m=s.nextInt();
	switch(m)
	{
	case 1:System.out.println("Take cold coffee");total=35+total; break;
	case 2:System.out.println("Take hot coffee");total=50+total; break;
	case 3:System.out.println("Take tea");total=20+total; break;
	case 4:System.out.println("Take Coke");total=25+total; break;
	case 5:System.out.println("Take Pepsi");total=25+total; break;
	default:System.out.println("Enter Valid input");
	}
i++;}
System.out.println("The Bill is"+total);
System.out.println("pay the bill");
int k=s.nextInt();
while(k<total)
{System.out.println("Pay the valid amount");
k=s.nextInt();
}
System.out.println("Accept Balance"+(k-total));
}
public static void main(String args[]){
{VendClass v=new VendClass();
v.vendMethod();
}
}
}				
