package com;

public class Palindrome 
{
	public String pallindrome(int x) {
		int sum=0;
		int no=x;
		while(no>0) {
			sum = sum*10+ (no%10);
			no= no/10;
		}
		if(sum==x) {
			return "Pallindrome";
		}
		else {
			return "Number is Not Pallinfrome";
		}
			
	}
}
