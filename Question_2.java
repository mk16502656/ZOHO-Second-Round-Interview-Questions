/*
Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the
following conditions
1. 5 if a perfect square
2. 4 if multiple of 4 and divisible by 6
3. 3 if even number
And sort the numbers based on the weight and print it as follows
<10,its_weight>,<36,its weight><89,its weight>
Should display the numbers based on increasing order.
*/
package myexamples;
import java.util.Scanner;

public class Question_2 {    
    
    int isSquare(int num)
    {
        for(int i=1;i*i<=num;i++)
        {
            if(i*i==num)
                return 1;
        }
        return 0;
    }
    
    void mySort(int arr[],int arr1[])
    {
        int i,j,tmp;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                    
                    tmp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=tmp;                    
                }
            }
        }        
        for(i=0;i<arr.length;i++)
        {
            System.out.println("<"+arr1[i] +","+arr[i]+">");
        }
    }
    
    public static void main(String args[])
    {
        Question_2 q2=new Question_2();
        Scanner scan=new Scanner(System.in);
        int n,i,total;   
        System.out.print("Enter the no of Element : ");
        n=scan.nextInt();
        int arrIn[]=new int[n];
        int arrOut[]=new int[n];
        System.out.println("Enter the Elements");
        for(i=0;i<n;i++)
            arrIn[i]=scan.nextInt();
        for(i=0;i<n;i++)
        {
            total=0;
            if(q2.isSquare(arrIn[i])==1)
            {
                total+=5;
            }
            if(arrIn[i]%4==0 && arrIn[i]%6==0)
            {
                total+=4;
            }
            if(arrIn[i]%2==0)
            {
                total+=3;
            }
            arrOut[i]=total;
        }
        q2.mySort(arrOut,arrIn);
    }
}
