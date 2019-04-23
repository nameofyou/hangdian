package hangdian;

import java.util.Scanner;

import java.util.Stack;

public class Main1022ing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			char arr[] = new char[a];
			char arr1[] = new char[a];
			String arr2[] = new String[a * 2];
			Stack<String> s = new Stack<String>();
			arr = sc.next().toCharArray();
			arr1 = sc.next().toCharArray();
			int j = 0;
			int k = 0;
			for (int i = 0; i < arr.length; i++) {

				s.add(Character.toString(arr[i]));
				arr2[j] = "in";
				j++;

				while (!s.isEmpty() && s.peek().equals(Character.toString(arr1[k]))) {
					s.pop();
					k++;
					arr2[j] = "out";
					j++;

				}
			}

			if (s.isEmpty()) {
				System.out.println("Yse.");
				for (int i = 0; i < arr2.length; i++) {
					System.out.println(arr2[i]);
				}
			} else {
				System.out.println("No.");
			}
			System.out.println("FINISH");
			s.clear();
		}
	}
}