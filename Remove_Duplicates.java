import java.util.*;
public class Remove_Duplicates {
	   int[] ch=new int[in.length];
	  
	   int ind=0; 
	   int co=0;
	  


	   for(int i=0;i<in.length;i++)
	   ch[i]=1; 
	   for(int i=0;i<in.length;i++)
	   {
	   if(ch[i]!=0)
	   {
	   for(int j=i+1;j<in.length;j++)
	   {

	   if(in[i]==in[j])
	   ch[j]=0; 
	   }
	   }
	   }
	   for(int i=0;i<in.length;i++)
	   {

	   if(ch[i]==1)
	   co++;
	   }
	   // 
	   char[] result=new char[co];
	   for(int i=0;i<in.length;i++)
	   {
	   if(ch[i]==1)
	   {

	   result[ind]=in[i]; 
	   ind++;
	   }
	   }

	   return result;
	}

	
	public static void main(String[] args)
	{
	      
	char str[] = {'b', 'd', 'a', 'b', 'f', 'a', 'g', 'a', 'a', 'f'};
	int n = str.length;
	System.out.print("Input: ");
	for(int i=0;i<n;i++)
	System.out.print(str[i]+",");

	System.out.println();
	       System.out.print("Output: ");
	      
	char str2[]=removeDuplicates(str);
	n = str2.length;
	for(int i=0;i<n;i++)
	System.out.print(str2[i]+",");

	}
	}
	}
	
	