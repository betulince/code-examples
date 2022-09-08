package hackerRankJavaDataTypes;
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(sc.hasNext())
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-(int)Math.pow(2,15) && x<=(int)Math.pow(2,15)-1)System.out.println("* short");
                if(x>=-(int)Math.pow(2,31) && x<=(int)Math.pow(2,31)-1)System.out.println("* int");
                if(x>=Long.MIN_VALUE  && x<=Long.MAX_VALUE)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
