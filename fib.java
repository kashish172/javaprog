class fib
{public static void main(String args[])
 {
   int n= Integer.parseInt(args[0]);
   int t1=0;
   int t2=1;
   int next;
   for(int i=1;i<=n;i++)
   {    System.out.println(t1);
        next = t1 + t2;
        t1 = t2;
        t2 = next;
    }
  }
}