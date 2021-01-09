/*
Input
({[]})
Output
True


Input
({]}[)
Output
False

 */
package myexamples;
import java.util.Scanner;

public class Question_5 {
    
    int MAX=50;
    char stack[]=new char[MAX];
    int top=-1;
    
  
    int push(char data)
    {
        if(top>MAX-1)
        {
            System.out.println("Stack Full");
            return 0;
        }
        stack[++top]=data;
        return 1;
    }
    
    char pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Empty");
            return '\0';
        }
        
        return stack[top--];
    }
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Question_5 q5=new Question_5();
        String input;        
        int i,flag=0;        
        System.out.print("Input : ");
        input=scan.next();
        for(i=0;i<input.length();i++)
        {
            
            if(input.charAt(i)=='(' || input.charAt(i)=='{' || input.charAt(i)=='[')
            {
                if(q5.push(input.charAt(i))==0)
                    break;
            }
            else
            {
                char tmp=q5.pop();
                if(tmp=='\0')
                    break;
                if(!((input.charAt(i)==')' && tmp=='(') || (input.charAt(i)=='}' && tmp=='{') || (input.charAt(i)==']' && tmp=='[')))
                {
                    flag=1;
                    break;
                }
            }
        } 
        if(flag==1 || q5.top>=0)
        {
            System.out.println("FALSE");
        }
        else
        {
            System.out.println("TRUE");
        }
    }
}
