import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] mylist = new int[100];
        for(int i=0; i<n;i++)
            {
            mylist[i]=in.nextInt();
        }
        
         int count= 0;

        for(int i=0;i<n;i++)
        {int sum=0;
           
            for(int j=i;j<n;j++)
            {
                    sum+=mylist[j];
                    if(sum<0)
                    {
                    count++;
                    }
            }
        }
          
             System.out.println(count);
        
           
           
        }
          
        
            
                 
        
     
        
    }
