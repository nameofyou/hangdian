package hangdian;

import java.util.Arrays;
import java.util.Scanner;

public class Main1789 {
	static int arr1[];
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int a=sc.nextInt();
		while(a-->0) {
			int x=sc.nextInt();
			int arr[][]=new int[x][2];
			int x1=-1;
			for (int i = 0; i < arr.length; i++) {
				arr[i][0]=sc.nextInt();
				if(arr[i][0]>x1)
					x1=arr[i][0];
			}
			for (int i = 0; i < arr.length; i++) {
				arr[i][1]=sc.nextInt();
			}
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = 0; j < arr.length-1-i; j++) {
					if(arr[j][1]<arr[j+1][1]) {
						int tem=arr[j][0];int tem1=arr[j][1];
						arr[j][0]=arr[j+1][0];arr[j+1][0]=tem;
						arr[j][1]=arr[j+1][1];arr[j+1][1]=tem1;
					}
				}
			}
			int sum=0;
			int arr1[]=new int[x1+1];
			for (int i = 0; i < arr.length; i++) {
				if(arr1[arr[i][0]]!=1) {
					arr1[arr[i][0]]=1;
				}else {
					int flag=0;
					for (int j =arr[i][0]; j>0; j--) {
						if(arr1[j]!=1){
							arr1[j]=1;
							flag=1;
							break;
						}
					}
					if(flag==0) {
						sum+=arr[i][1];
					}
				}
			}
			System.out.println(sum);
		}
	}
}
}
