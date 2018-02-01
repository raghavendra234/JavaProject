
/*
 * 
 * 
 * Reverse of a String and storage of reverse value
 */

package com.Synechron.PractiseAgain;

public class ReverseString {

	public static void main(String[] args) {
String Word="Raghavendra",storage="";

char[]string=Word.toCharArray();

for(int i=string.length-1;i>=0;i--)
{
storage=storage+string[i];
}
}

}
