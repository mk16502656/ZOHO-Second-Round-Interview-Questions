/*
Given a 9×9 sudoku we have to evaluate it for its correctness. We have to check both the sub
matrix correctness and the whole sudoku correctness.
{ 5, 1, 3, 6, 8, 7, 2, 4, 9 },
{ 8, 4, 9, 5, 2, 1, 6, 3, 7 },
{ 2, 6, 7, 3, 4, 9, 5, 8, 1 },
{ 1, 5, 8, 4, 6, 3, 9, 7, 2 },
{ 9, 7, 4, 2, 1, 8, 3, 6, 5 },
{ 3, 2, 6, 7, 9, 5, 4, 1, 8 },
{ 7, 8, 2, 9, 3, 4, 1, 5, 6 },
{ 6, 3, 5, 1, 7, 2, 8, 9, 4 },-
{ 4, 9, 1, 8, 5, 6, 7, 2, 3 }
 */
package myexamples;
public class Question_4 {
    
    int checkSubMatrix(int arr[][],int rowStart,int rowEnd,int colStart,int colEnd,int num)
    {
        int i,j,count=0;
        for(i=rowStart;i<rowEnd;i++)
        {
            for(j=colStart;j<colEnd;j++)
            {
                if(arr[i][j]==num)
                {
                    count++;
                }
            }
        }        
        return count;
    }
    
    int checkWholeSudoku(int arr[][],int row,int col,int data)
    {
        int i,j,count=0;
        for(i=row;i<9;i++)
        {
           if(arr[i][col]==data)
           {
               count++;
           }
        }
        
        if(count!=1)
        {
            return 0;
        }
        count=0;
        for(i=col;i<9;i++)
        {
            if(arr[row][i]==data)
            {
                count++;
            }
        }
        if(count!=1)
        {
            return 0;
        }
        return 1;
    }
    
    public static void main(String args[])
    {
        Question_4 q4=new Question_4();
        int i,j,k,rowStart=0,rowEnd=3,colStart=0,colEnd=3,flag=0;
        int sudoku[][]={
        { 5, 1, 3, 6, 8, 7, 2, 4, 9 },
        { 8, 4, 9, 5, 2, 1, 6, 3, 7 },
        { 2, 6, 7, 3, 4, 9, 5, 8, 1 },
        { 1, 5, 8, 4, 6, 3, 9, 7, 2 },
        { 9, 7, 4, 2, 1, 8, 3, 6, 5 },
        { 3, 2, 6, 7, 9, 5, 4, 1, 8 },
        { 7, 8, 2, 9, 3, 4, 1, 5, 6 },
        { 6, 3, 5, 1, 7, 2, 8, 9, 4 },
        { 4, 9, 1, 8, 5, 6, 7, 2, 3 }
        };
        
        for(i=0;i<9;i++)
        {            
           for(j=rowStart;j<rowEnd;j++)
           {
               for(k=colStart;k<colEnd;k++)
               {
                   if(q4.checkSubMatrix(sudoku,rowStart,rowEnd,colStart,colEnd,sudoku[j][k])!=1)
                   {
                       System.out.println("Invalid Sub Matrix Index<"+j+","+k+">");
                       flag=1;
                   }
               }     
           }
           
           colStart=colEnd;           
           colEnd=colEnd+3;
           if((i+1)%3==0)
           {
               rowStart=rowEnd;
               rowEnd=rowEnd+3;
               colStart=0;           
               colEnd=3;
           }
           
        }
        
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                if(q4.checkWholeSudoku(sudoku, i, j, sudoku[i][j])!=1)
                {
                    System.out.println("Invalid Whole Matrix<"+i+","+j+">");
                    flag=1;
                }
            }
        }
        
        if(flag==0)
        {
            System.out.println("Perfect sudoku");
        }
        
        
    }
}
