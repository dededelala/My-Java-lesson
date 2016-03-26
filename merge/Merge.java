package merge;

import java.util.Scanner;

public class Merge {
	public static int[] merge(int[]list1,int[]list2)
	{
		int list3[]=new int[list1.length+list2.length];
		int i,j1,j2;
		
			for(i=j1=j2=0;j1<list1.length&&j2<list2.length;i++)
			{
				if(list1[j1]<list2[j2])
				{
					list3[i]=list1[j1];
					j1++;
				}
				else
				{
					list3[i]=list2[j2];
					j2++;
				}
			}
			
			if(j1==list1.length)
			{
				for(;j2<list2.length;j2++,i++)
				{
					list3[i]=list2[j2];
				}
			}
			else
			{
				for(;j1<list1.length;j1++,i++)
					list3[i]=list1[j1];
			}			
		return list3;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		int l1=input.nextInt();
		int i;
		int list1[]=new int[l1];
		for(i=0;i<l1;i++)
		{
			list1[i]=input.nextInt();
		}
		int l2=input.nextInt();
		int list2[]=new int[l2];
		for(i=0;i<l2;i++)
		{
			list2[i]=input.nextInt();
		}
		int list3[]=new int[l1+l2];
		list3=merge(list1,list2);
		for(i=0;i<l1+l2;i++)
			System.out.print(list3[i]+" ");		
		
	}

}
