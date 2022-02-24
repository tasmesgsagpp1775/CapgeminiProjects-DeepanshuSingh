import java.util.*;
public class Assignment1Q8 {
	public static void main(String[] args)
	{
		int a,i,j,temp=0;
		int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		a=arr.length;
		for(i=0;i<a;i++) {
			for(j=0;j<(a-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<a;i++)
		{
			System.out.println(arr[i]);
		}
	}
}