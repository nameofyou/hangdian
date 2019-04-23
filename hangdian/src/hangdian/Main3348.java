package hangdian;

import java.util.Scanner;

public class Main3348 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
	int a=sc.nextInt();
	while(a-->0) {
		int x=sc.nextInt();
		int x1=0;
		int x2=0;
		int arr[][]=new int[5][2];
		arr[0][0]=1;
		arr[1][0]=5;
		arr[2][0]=10;
		arr[3][0]=50;
		arr[4][0]=100;
		for (int i = 0; i < arr.length; i++) {
			arr[i][1]=sc.nextInt();
			x1+=arr[i][0]*arr[i][1];
			x2+=arr[i][1];
		}
		int num2;
		int num1=haha(arr,x);
		if(haha(arr,x1-x)!=-1)
		num2=x2-haha(arr,x1-x);
		else
			num2=-1;
		System.out.println(num1+" "+num2);
	}
	}
}
static int haha(int arr[][],int num) {
	int c=0;
	for (int i =4; i>=0; i--){
		if(arr[i][0]>num)continue;
		if(arr[i][0]*arr[i][1]>num){
			int t=num;
			num%=arr[i][0];
			c+=t/arr[i][0];
		}else {
			num-=arr[i][0]*arr[i][1];
			c+=arr[i][1];
		}
	}
	if(num!=0) return-1;
	return c;
}
}
