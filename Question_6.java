/*
Alternate sorting: Given an array of integers, rearrange the array in such a way that the first
element is first maximum and second element is first minimum.
 Eg.) Input : {1, 2, 3, 4, 5, 6, 7}
      Output : {7, 1, 6, 2, 5, 3, 4}
 */

package myexamples;
import java.util.Scanner;

public class Question_6 {
    public static void main(String args[])
    {
        int arr[]=new int[25],i,j,tmp,n,k;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the No of Elements : ");
        n=scan.nextInt();
        System.out.println("Enter the Elements");
        for(i=0;i<n;i++)
            arr[i]=scan.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((i+1)%2==0)
                {
                    if(arr[i]>arr[j])
                    {
                        tmp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=tmp;
                    }
                }
                else
                {
                    if(arr[i]<arr[j])
                    {
                        tmp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=tmp;
                    }
                }
            }
        }
        
         for(i=0;i<n;i++)
         {
            System.out.print(arr[i]+"\t");
         }
         System.out.println("");
    }    
}
