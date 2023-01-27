package ua.com.foxminded.anagramsapp;

import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Anagram implements UnaryOperator <String> {


	    @Override
	    public String apply(String s) {
	        StringJoiner words = new StringJoiner(" ");
	        for (String part : s.split(" ")) {
	            words.add(reverse(part.toCharArray()));
	        }
	        return words.toString();
	    }

	    public static String reverse(char[] letters) {

	        int leftIndex = 0;
	        int rightIndex = letters.length - 1;

	        while (leftIndex < rightIndex) {
	            if (!Character.isLetter(letters[leftIndex])) {
	                leftIndex++;
	            } else if (!Character.isLetter(letters[rightIndex])) {
	                rightIndex--;
	            } else {
	                char temp = letters[leftIndex];
	                letters[leftIndex] = letters[rightIndex];
	                letters[rightIndex] = temp;
	                leftIndex++;
	                rightIndex--;
	            }
	        }
	        return String.valueOf(letters);
	    }
	}
