import java.util.Scanner;

public class calculater{
	public static void main(String[] args){
		
		int x,y;
		char operator;
		Scanner obj1=new Scanner(System.in);
		
	
		System.out.println("Enter the first number:");
		x=obj1.nextInt();
		
		
		System.out.println("Enter the second number:");
		y=obj1.nextInt();
		
		System.out.println("what operator?");
		operator=obj1.next().charAt(0);
	
		
			if(operator=='+'){
				int a=x+y;
				System.out.println(x+"+"+y+"="+a);
			}
			if(operator=='-'){
				int b=x-y;
				System.out.println(x+"-"+y+"="+b);
			}
			if(operator=='*'){
				int c=x*y;
				System.out.println(x+"*"+y+"="+c);
			}
			
			try{
				if(operator=='/'){
					int d=x/y;
					System.out.println(x+"/"+y+"="+d);
				}
			}catch(ArithmeticException e){
				System.out.println("This is a ArithmeticException");
			}
			
		
		
			
	}
	
	
			
			
		
		
}