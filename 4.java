import java.util.Scanner;
class eg{
public static void main(String rgs[]){
Scanner sc=new Scanner(System.in);
System.out.println("1.add 2.sub 3.mul 4.div 5.mod enter choice");
int ch=sc.nextInt();
System.out.println("enter numbers");
float a=sc.nextFloat();
float b=sc.nextFloat();
float s;
switch(ch){
case(1):
s=a+b;
System.out.println("Sum = "+s);
break;
case(2):
s=a-b;
System.out.println("Diff = "+s);
break;
case(3):
s=a*b;
System.out.println("Mul = "+s);
break;
case(4):
s=a/b;
System.out.println("Div = "+s);
break;
case(5):
s=a%b;
System.out.println("Mod = "+s);
break;
}
}}