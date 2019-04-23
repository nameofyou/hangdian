package hangdian;

import java.util.Scanner;

public class Main1711 {
	static int next[];
	static int arr[];
	static int arr1[];
	static int y;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int a=sc.nextInt();
		while(a-->0) {
			int x=sc.nextInt();
			y=sc.nextInt();
			arr=new int[x];
			arr1=new int[y];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			for (int i = 0; i < arr1.length; i++) {
				arr1[i]=sc.nextInt();
			}
			System.out.println(kmp());
		}
	}
}
static void next() {
	int i=0,j=-1;
	next=new int [y+1];
	next[0]=-1;
	while(i<arr1.length) {
		if(j==-1||arr1[i]==arr1[j]) {
			i++;
			j++;
			next[j]=i;
		}else {
			j=next[j];
		}
	}
}
static int kmp() {
	int i=0;
	int j=0;
	int sum=0;
	next();
	while(i<arr.length) {
		if(j==-1||arr[i]==arr1[j]) {
			i++;
			j++;
			sum++;
		}else {
			j=next[j];
			sum-=next[j];
		}
	}
	return sum;
}
}
