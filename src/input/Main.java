package input;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*509
		int a = -100;
		System.out.println(a);
		*/
		/*510
		int a=-1;
		int b=100;
		System.out.println(a+"\n"+b);
		*/
		/*511
		int a;
		int b;
		a=55;b=10;
		System.out.println(a+" - "+b+" = "+(a-b));
		a=2008;b=1999;
		System.out.println(a+" - "+b+" = "+(a-b));
		*/
		/*512
		int a=49;
		double b=0.2683;
		System.out.printf("%d * %.6f = %.6f",a,b,a*b);
		*/
		/*513
		double yd = 91.44;
		double in = 2.54;
		
		System.out.printf("%4.1fyd = %5.1fcm",2.1,yd*2.1);
		System.out.printf("\n%4.1fin = %5.1fcm",10.5,in*10.5);
		*/
		/*514
		Scanner sc = new Scanner(System.in);
		int height;
		System.out.print("height = ");
		height=sc.nextInt();
		System.out.printf("Your height is %dcm.",height);
		*/
		/*515
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.printf("%d * %d = %d",a,b,a*b);
		System.out.printf("\n%d / %d = %d",a,b,a/b);
		*/
		/*516
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		String c;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.next();
		
		System.out.printf("%.2f",a);
		System.out.printf("\n%.2f",b);
		System.out.printf("\n%s",c);
		*/
		/*517
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.printf("%.3f\n%.3f\n%.3f",a,b,c);
		*/
		/*106
		int a= 10;
		int b= 20;
		int c = 30;
		System.out.printf("%d + %d = %d",a,b,c);
		*/
		/*107
		double a = 80.5;
		double b = 22.34;
		System.out.printf("%10.2f%10.2f%10.2f",a,b,a+b);
		*/
		/*108
		int a = 50;
		double b = 100.12;
		System.out.printf("%.2f * %d = %d",b,a,(int)(a*b));
		*/
		/*109
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a+b+c;
		int avg = sum/3;
		System.out.printf("sum = %d\navg = %d",sum,avg);
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double yd = sc.nextDouble();
		System.out.printf("%.1fyard = %.1fcm",yd,yd*91.44);
		

	}

}
