

/*
Print the word with odd letters as
P     M
 R   A 
  O R
   G
  O R
 R   A
P     M
*/
package myexamples;
import java.util.Scanner;

public class Question_1 {
    public static void main(String args[])
    {
        String input;
        int end,i,j;
        Scanner scan=new Scanner(System.in);
        System.out.print("Input : ");
        input=scan.next();
        System.out.println(input);
        end=input.length()-1;
        for(i=0;i<=end;i++)
        {
            for(j=0;j<=end;j++)
            {
                if(i==j || i+j==end)
                {
                    System.out.print(input.charAt(j));
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
