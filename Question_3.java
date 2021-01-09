/*
Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search
for substring like “too” in the two dimensional string both from left to right and from top to bottom.
w e L C O
M E T O Z
O H O C O
R P O R A
T I O n
And print the start and ending index as
Start index : <1,2>
End index: <3, 2>
 */
package myexamples;
import java.util.Scanner;

public class Question_3 {
    
    void checkSubString(int row,int col,char arr[][],int rowLength,int colLength,String subString,int selectRowColumn)
    {
        int i,j,flag,k;
        i=row;
        j=col;
        if(selectRowColumn==0)
        {
            if(rowLength-row<subString.length())
                return;
        }
        if(selectRowColumn==1)
        {
            if(colLength-col<subString.length())
                return;
        }
        flag=0;
        for(k=0;k<subString.length();k++)
        {
            if(subString.charAt(k)!=arr[i][j])
            {
                flag=-1;
                break;
            }
            if(selectRowColumn==0)
                i++;
            if(selectRowColumn==1)
                j++;            
        }
        if(flag==0)
        {
            if(selectRowColumn==0)
                i--;
            if(selectRowColumn==1)
                j--;   
            System.out.println("Start index : <"+row+","+col+">");
            System.out.println("end   index : <"+i+","+j+">");
        }
        
    }
    
    public static void main(String args[])
    {
        Question_3 q3=new Question_3();
        Scanner scan=new Scanner(System.in);
        String input,subString;
        int row,col=5,i,j,flag,k,l,m;
        System.out.print("Enter the String : ");
        input=scan.next();        
        row=(input.length()%5==0)?(input.length()/5):((input.length()/5)+1);
        char arr[][]=new char[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(input.length()>i*5+j)
                {
                    arr[i][j]=input.charAt(i*5+j);    
                }else
                {
                     arr[i][j]='\0';
                }              
                
            }
        }
        
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+"\t");                
            }
            System.out.println();
        }
        
        System.out.print("Enter the Sub String : ");
        subString=scan.next();
        
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(arr[i][j]==subString.charAt(0))
                {
                    q3.checkSubString(i,j,arr,row,col,subString,0);
                    q3.checkSubString(i,j,arr,row,col,subString,1);                    
                }
            }
        }
                
        
    }
}
