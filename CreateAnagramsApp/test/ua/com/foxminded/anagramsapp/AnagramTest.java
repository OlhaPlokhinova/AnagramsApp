package ua.com.foxminded.anagramsapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class AnagramTest {
	

	
	@Test
	void MethodReverse_houldReverseWords_whenChangedWords() {
		String str = "Girls12 and 8Boys and everyone";
		char [] letters = str.toCharArray();
		assertEquals("enoyr12 eve 8dnas yoB dnaslriG", Anagram.reverse(letters));
	}
	
	
	
	@Test
	void MethodReverse_shouldBeEmpty_whenAddEmpryString() {
		String str1 = "";
		char [] letters1 = str1.toCharArray();
		assertEquals("", Anagram.reverse(letters1));
	}
	
			
		@Test
		void MethodReverse_shouldBeEmpty_whenAddSpaceInString() {
			String str2 = " ";
			char [] letters2 = str2.toCharArray();
			assertEquals(" ", Anagram.reverse(letters2));
		}
		
		
		
		@Test
		void MethodReverse_shouldNotReverse_whenAddOnlyNumbers() {
			String str3 = "448";
			char [] letters3 = str3.toCharArray();
			assertEquals("448", Anagram.reverse(letters3));
		}
		
		
		@Test
		void MethodReverse_shouldBeEmpty_whenAddDoubleSpaceInString() {
			String str4 = "  ";
			char [] letters4 = str4.toCharArray();
			assertEquals("  ", Anagram.reverse(letters4));
		}
		

		
		@Test
		void MethodReverse_shouldReverse_whenAddDoubleWordsToString() {
			String str5 = "ab";
			char [] letters5 = str5.toCharArray();
			assertEquals("ba", Anagram.reverse(letters5));
		}
		
		
		@Test
		void MethodReverse_shouldBeNotNull_whenStringIsNotEmpty() {
			String str6 = "my name is2 ol6ga";
			char [] letters6 = str6.toCharArray();
			assertNotNull("my name is2 ol6ga", Anagram.reverse(letters6));
		
}
		
		
		
		
}



