package acm;

import java.util.HashSet;
import java.util.Scanner;

public class Main1232 {
	static int arr[];
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
	int a=sc.nextInt();
	if(a==0) {
		break;
	
	}
	int b=sc.nextInt();
	arr=new int[a+1];
	for (int i = 1; i < arr.length; i++) {
		arr[i]=i;
	}
	for (int i = 0; i < b; i++) {
		with(sc.nextInt(),sc.nextInt());
	}
	int sum=-1;
	for (int i =1; i < arr.length; i++) {
		if(i==arr[i]) {
			sum++;
		}
	}
	System.out.println(sum);
}
}
static int find(int p) {
	while(arr[p]!=p) {
		p=arr[p];
	}
	return p;
}
static void with(int p,int q) {
	int q1=find(q);
	int p1=find(p);
	if(q1!=p1) {
		arr[q1]=p1;
	}
}
}
