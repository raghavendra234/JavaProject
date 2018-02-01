package com.Synechron.JavaProject;

public class CharacterCount {

	public static void main(String[] args) {
		String someString = "my name is raghavendra";
		char someChar = 'z';
		int count = 0;
				for (int i = 0; i < someString.length(); i++) {
			
		
		if (someString 	.charAt(i) == someChar) {
			count++;
		
		}
		}
				System.out.println(count);
	}

	
}


