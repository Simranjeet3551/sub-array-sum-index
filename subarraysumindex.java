package practice;
import java.util.*;
public class subarraysumindex 
{
		static void fun(int arr[] , int sum) {
			
			int l= arr.length;
			
			for(int i=0;i<l;i++)
			{
				
				int p=0;
				
				for(int j=i;j<l;j++) {
					
					
					p+=arr[j];
					
					if(p==sum)
					{
						System.out.println("Starting index is : " + i);
						System.out.println("Ending index is : " + j);
						break;
					}
				}
				
			}
		}
		
		public static void main(String args[]) {
		
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the number of elements ! ");
			
			int n= s.nextInt();
			
			
			int arr[] = new int[n];
			
			System.out.println("Enter the elements ");
			
			for(int i=0;i<n;i++)
			{
				
				arr[i] = s.nextInt();
			}
			
			System.out.println("Enter the sum ! ");

			int sum = s.nextInt();
			
			fun(arr,sum);
			
		}}

