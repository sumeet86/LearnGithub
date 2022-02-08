package com.demo1;

public class CommonPrefix {
	
	public static String prefixFinder(String str1, String str2) {
		int len1 =str1.length();
		int len2= str2.length();
		System.out.println("Str1: "+str1);
		System.out.println("Str2: "+str2);
		String prefix="";
		for(int i=0, j=0;  i<=len1-1 && j<= len2-1; i++, j++ ) {
			if(str1.charAt(i)!=str2.charAt(j)) {
				break;
			}
			prefix += str1.charAt(j);
			System.out.println("****************Result: "+prefix);
			
			
		}
		System.out.println("Result: "+prefix);
		return prefix;
		
	}
	
	public static String commonPrefix(String[] str) {
		int len = str.length;
		String result = str[0];
		for(int i =1; i<= len-1; i++) {
			result= prefixFinder(result, str[i]);
			
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		String[]  str= {"Sonatand", "Son", "Sona" , "Sonaa"};
		System.out.println(commonPrefix(str));
	}

}
