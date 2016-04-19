import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Demo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testNum = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < testNum; i++){
			//turn the line you're working with into a character array
			char[] sentence = sc.nextLine().toCharArray();
			//create a boolean array representing the number characters in the alphabet
			boolean[] letterRep = new boolean[26];
			for(int j = 0; j < sentence.length; j++){
				//get character in sentence
				char insert = sentence[j];
				//check to see if the character is between a and z
				if(insert >= 'a' && insert <= 'z'){
					//find the index correlation to letterRep
					//subtract the ascii value of a from the character in the sentence
					int index = (int) (sentence[j] - 'a');
					//set the index that the index in letterRep is being used
					letterRep[index] = true;
				}
			}
			//assume the sentence is a panGram
			boolean panGram = true;
			//Iterate through the list 
			for(int j = 0; j < letterRep.length; j++){
				if(letterRep[j] == false){
					//not a pangram
					panGram = false;
					//represent index as a character
					char c = (char) (j + 'a');
					//print the character
					System.out.print(c);
				}
			}
			//print 1 since the sentence is a pangram
			if(panGram){
				System.out.println(1);
			} else {
				//create a line
				System.out.println();
			}
			}
		
	}
	
}