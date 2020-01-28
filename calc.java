class calc 
{public static void main(String args[])
 {
   int a= Integer.parseInt(args[0]);
   int b= Integer.parseInt(args[1]);
   int c=a+b;
   int d=a-b;
   int e=a*b;
   float f=a/b;
   System.out.println("Sum: "+c);
   System.out.println("Difference: "+d);
   System.out.println("Multiplication: "+e);
   System.out.println("Division: "+f);
  }
}