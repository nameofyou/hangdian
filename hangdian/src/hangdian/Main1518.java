package hangdian;

import java.util.Arrays;
import java.util.Scanner;

public class Main1518 {
	static int arr[];
	static int visit[];
	static int m=0;
	static boolean p=false;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	while(a-->0) {
		m=sc.nextInt();
		arr=new int[m];
		visit=new int[m];
		double all=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			all+=arr[i];
		}
	Arrays.sort(arr);
		if((all/4)%2!=0) {
			System.out.println("no");
		}else if(arr[0]>(all/4)) {
			System.out.println("no");
		}else {
			int z=0;
			int len=(int)all/4;
			int c=0;
			int lenth=0;
			shensou(z,len,c,lenth);
			if(p) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}
private static void shensou(int z, int len ,int c,int lenth) {
	// TODO Auto-generated method stub
	if(c==4) {
		p=true;
	}else if(lenth>len){
		p=false;
	}else {
		o:for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <z; j++) {
				if(arr[i]==visit[j])continue o;
				visit[z]=arr[i];
				lenth+=arr[i];
				if(lenth==len) {
					c++;
					lenth=0;
				}
			}
			shensou(z+1,len,c,lenth);
		}
	}
}
}

