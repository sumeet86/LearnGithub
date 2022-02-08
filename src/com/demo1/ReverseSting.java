package com.demo1;

public class ReverseSting {

	public static void reverse(String str) {

		String[] splitString = str.split(" ");
		int len = splitString.length;
		String reverseString = "";
		for (int i = len - 1; i >= 0; i--) {
			reverseString += splitString[i] + " ";
		}
		System.out.println(reverseString);

	}

	public static void main(String[] args) {
		String str ="You Love me";
		reverse(str);
		String s[] = "i like this program very much".split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}
		System.out.println("Reversed String:");
		System.out.println(ans.substring(0, ans.length() - 1));
	}
}
