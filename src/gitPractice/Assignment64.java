/*Assignment - 64 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet] */

package gitPractice;

import java.util.Arrays;

public class Assignment64 {
	
	String revWord(String word)
	{
		String outputWord="";
		for(int i=word.length()-1;i>=0;i--)
		{
			char ch=word.charAt(i);
			outputWord+=ch;
		}
		return outputWord;
	}
	String firstLetterCapital(String word)
	{
		return word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase();
	}
	String[] revArray(String[] arr)
	{
		String[] outputArray=new String[arr.length];
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
		{
			String word=revWord(arr[i]);
			outputArray[j]=firstLetterCapital(word);
		}
		return outputArray;
	}

	public static void main(String[] args) {
		
		String[] arr={"Tech", "Aashvi", "Credits", "Ansh"};
		String[] output=new Assignment64().revArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(output));
		

	}

}
