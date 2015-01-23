package firstjava;

public class Simple {
	int a=30;
	int b=40;
	
public void display()
{
int c= a+b;
System.out.println("addition is " +c);
System.out.println("simple addition");
System.out.println("sharvari");
System.out.println("this is the second change");
}	
	
public static void main(String[] args)
	{
	Simple s=new Simple(); 
	//s=null;
	s.display();
	System.out.println(" Hi I am in simples");
	}

}
