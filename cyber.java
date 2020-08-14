//ROW TRANSPOSITION

import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s,ns,res="";
      s=sc.nextLine();
      int key=3,i;
      key=sc.nextInt();
      int arr[]=new int[1000];
      for(i=0;i<key;i++)
      {
          arr[i]=sc.nextInt();
      }
      int j,k,l,max=0,le,row,col,z=0;
      String sarr[][]=new String[100][100];
      le=s.length();
      row=le/key;
      if(le%key!=0)
      {
          row++;
      }
      col=key;
      for(i=0;i<row;i++)
      {
          for(j=0;j<col;j++)
          {
  
              if(z>=le)
              {
                  sarr[i][j]="*";
              }
              else
              {
                  ns="";
                  ns+=s.charAt(z);
              sarr[i][j]=ns;
              z+=1;
              }
          }
      }
      for(k=0;k<key;k++)
      {
      for(i=0;i<row;i++)
      {
          res+=sarr[i][arr[k]];
      }
      }
      System.out.print("Resultant Cipher text  :  "+res);
    }
}


// RAIL FENCE


import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      String s="",res="";
      int i,j,k,l;
      Scanner sc=new Scanner(System.in); 
      s=sc.nextLine();
      int key=sc.nextInt();
      l=s.length();
       for(k=0;k<key;k++)
    {
        for(j=k;j<l;j+=key)
        {
            res+=s.charAt(j);
        }
    }
    System.out.print(res);
    }
}
// saahrn
