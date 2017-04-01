package com.zinmorrow;

import java.util.Scanner;

/*
 
Original problem posted on HackerRank: https://www.hackerrank.com/challenges/caesar-cipher-1
 
Caesar Cipher
by vatsalchanana

Julius Caesar protected his confidential information by encrypting it in a cipher. 
Caesar's cipher rotated every letter in a string by a fixed number, K, 
making it unreadable by his enemies. Given a string, S, and a number, K, 
encrypt S and print the resulting string.

Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

Input Format:

The first line contains an integer, N, which is the length of the unencrypted string.
The second line contains the unencrypted string, S.
The third line contains the integer encryption key, K, which is the number of letters to rotate.

Constraints:

1 <= K <= 100
1 <= N <= 100

S is a valid ASCII string and doesn't contain any spaces. 

 */

public class CaeserCipher {
	
	// ASCII caps range: 65 - 90
	// ASCII lowercase range: 97 - 122
	
	public String useStringBuilder(String S) {
		
		StringBuilder sb = new StringBuilder(S);
		return sb.toString();
		
	}
	
public String getAsciiNums(String S, int N) {
	
	StringBuilder sb = new StringBuilder();
	int asciiNum = 0;
	
	for(int i = 0; i < N; i++) {
		asciiNum = (int) S.charAt(i);
		sb.append(String.valueOf(asciiNum) + ";");
	}
	
	return sb.toString();
		
	}

public String getAsciiNumsAddition(int N, String S, int K) {
	StringBuilder sb = new StringBuilder();
	int asciiNum = 0;
	
	for(int i = 0; i < N; i++) {
		asciiNum = (int) S.charAt(i);
		asciiNum += K;
		sb.append(String.valueOf(asciiNum) + ";");
	}
	return sb.toString();
	}

public String getAsciiNumsLowerCase(int N, String S) {
	StringBuilder sb = new StringBuilder();
	int asciiNum = 0;
	for(int i = 0; i < N; i++) {
		asciiNum = (int) S.charAt(i);
		if(asciiNum >= 97 && asciiNum <= 122) {
			sb.append(String.valueOf(asciiNum) + ";");
		}
	}
	return sb.toString();
	}

public String getAsciiNumsUpperCase(int N, String S) {
	StringBuilder sb = new StringBuilder();
	int asciiNum = 0;
	for(int i = 0; i < N; i++) {
		asciiNum = (int) S.charAt(i);
		if(asciiNum >= 65 && asciiNum <= 90) {
			sb.append(String.valueOf(asciiNum) + ";");
		}
	}
	return sb.toString();
	}


public String getAsciiNumsLowerCaseRotation(int N, String S, int K) {
	StringBuilder sb = new StringBuilder();
	int asciiNum = 0;
	for(int i = 0; i < N; i++) {
		asciiNum = (int) S.charAt(i);
		if(asciiNum >= 97 && asciiNum <= 122) {
			asciiNum -= 97;
			asciiNum = (asciiNum + K) % 26;
			asciiNum += 97;
			sb.append(String.valueOf(asciiNum) + ";");
		}
	}
	return sb.toString();
	}

public String getAsciiNumsUpperCaseRotation(int N, String S, int K) {
	StringBuilder sb = new StringBuilder();
	int asciiNum = 0;
	for(int i = 0; i < N; i++) {
		asciiNum = (int) S.charAt(i);
		if(asciiNum >= 65 && asciiNum <= 90) {
			asciiNum -= 65;
			asciiNum = (asciiNum + K) % 26;
			asciiNum += 65;
			sb.append(String.valueOf(asciiNum) + ";");
		}
	}
	return sb.toString();
	}

public String caeserCipher(int N, String S, int K) {
	
	StringBuilder sb = new StringBuilder();
	int asciiNum = 0;
	
	for(int i = 0; i < N; i++) {
		
		asciiNum = (int) S.charAt(i);
		
		if(asciiNum >= 97 && asciiNum <= 122) {
			asciiNum -= 97;
			asciiNum = (asciiNum + K) % 26;
			asciiNum += 97;
			sb.append((char) asciiNum);
		}
		else if(asciiNum >= 65 && asciiNum <= 90) {
			asciiNum -= 65;
			asciiNum = (asciiNum + K) % 26;
			asciiNum += 65;
			sb.append((char) asciiNum);
		}
		else {
			sb.append(S.charAt(i));
		}
	}
	
	return sb.toString();
}



	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CaeserCipher myCipher = new CaeserCipher();
		System.out.println("Enter the length of the String: ");
		int N = sc.nextInt();
		System.out.println("Enter the String: ");
		String S = sc.next();
		System.out.println("Enter the number of letters to rotate: ");
		int K = sc.nextInt();
		
		System.out.println(myCipher.caeserCipher(N, S, K));
		
		
	}
	
	
	
}
