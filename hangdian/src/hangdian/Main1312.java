package hangdian;

import java.util.Scanner;

public class Main1312 {
	static char arr[][];
	static int i1,j1;
	static int way[][]={{0,1},{0,-1},{1,0},{-1,0}};
	static int sum=0;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		i1=sc.nextInt();
		j1=sc.nextInt();
		if(i1==0&j1==0)break;
		arr=new char[j1][]; 
		for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.next().toCharArray();
		}

		o:for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]=='@') {
					arr[i][j]='#';
					shensou(i,j);
					break o;
				}
			}
		}
		System.out.println(sum+1);
		sum=0;
	}
}
 static void shensou(int a,int b) {
		for (int i = 0; i <=3; i++) {
			int a1=a+way[i][0];
			int b1=b+way[i][1];
			if(a1 <0 || a1>=j1||b1<0||b1>=i1||arr[a1][b1]=='#')/*判断的五个依据顺序很重要*/{
				continue;
			}else {
			arr[a1][b1]='#';
			sum++;
			shensou(a1,b1);
			}
		}
	}
}
