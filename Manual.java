package Wordle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Manual extends Algorithm{
	Manual() throws IOException{}
	
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {
  
        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();
  
        // Traverse through the first list
        for (T element : list) {
  
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
  
                newList.add(element);
            }
        }
  
        // return the new list
        return newList;
    }
	
	static int index1;
	boolean same = false;
	public String findBestWord2() throws IOException
	{
		setZero();
		createArrays();
		findNumberOfLetterInFirst();
		findNumberOfLetterInSecond();
		findNumberOfLetterInThird();
		findNumberOfLetterInFourth();
		findNumberOfLetterInFifth();
		int[] score = findScore(AllWords);
		
 		System.out.println("There are " + AllWords.size() + " possible words left");
 		int index = 0;
 		int max = 0;
 		if(allTheSame(score) && AllWords.size()>2)
 		{
 			ArrayList<Character> uncommonLetters = new ArrayList<Character>();
 			for(int i = 1; i<AllWords.size(); i++)
 			{
 				if(AllWords.get(i).charAt(0) != AllWords.get(i-1).charAt(0))
 				{
 					uncommonLetters.add(AllWords.get(i-1).charAt(0));
 					uncommonLetters.add(AllWords.get(i).charAt(0));
 				}
 				if(AllWords.get(i).charAt(1) != AllWords.get(i-1).charAt(1))
 				{
 					uncommonLetters.add(AllWords.get(i-1).charAt(1));
 					uncommonLetters.add(AllWords.get(i).charAt(1));
 				}
 				if(AllWords.get(i).charAt(2) != AllWords.get(i-1).charAt(2))
 				{
 					uncommonLetters.add(AllWords.get(i-1).charAt(2));
 					uncommonLetters.add(AllWords.get(i).charAt(2));
 				}
 				if(AllWords.get(i).charAt(3) != AllWords.get(i-1).charAt(3))
 				{
 					uncommonLetters.add(AllWords.get(i-1).charAt(3));
 					uncommonLetters.add(AllWords.get(i).charAt(3));
 				}
 				if(AllWords.get(i).charAt(4) != AllWords.get(i-1).charAt(4))
 				{
 					uncommonLetters.add(AllWords.get(i-1).charAt(4));
 					uncommonLetters.add(AllWords.get(i).charAt(4));
 				}
 			}
 			uncommonLetters = removeDuplicates(uncommonLetters);
 			System.out.println(uncommonLetters.toString());
 			if(uncommonLetters.toString().equals("[i, l]"))
 			{
 				return "child";
 			}
 			if(uncommonLetters.toString().equals("[q, e, r, d]"))
 			{
 				return "qapik";
 			}
 			if(uncommonLetters.toString().equals("[d, h, r]"))
 			{
 				return "dandy";
 			}
 			if(uncommonLetters.toString().equals("[b, c, f, t]"))
 			{
 				return "facts";
 			}
 			if(uncommonLetters.toString().equals("[b, p, t]"))
 			{
 				return "bicep";
 			}
 			if(uncommonLetters.toString().equals("[m, p, w]"))
 			{
 				return "whump";
 			}
 			if(uncommonLetters.toString().equals("[b, f, x, y, g, n, h, m, j, k, r]"))
 			{
 				return "bhang";
 			}
 			if(uncommonLetters.toString().equals("[b, c, m, p, w]"))
 			{
 				return "abamp";
 			}
 			if(uncommonLetters.toString().equals("[d, g, j, t, v]"))
 			{
 				return "gadje";
 			}
 			boolean hasLetter = false;
 			for(int i = 0; i<Guesses.size(); i++)
 			{
 				hasLetter = false;
 				for(int j = 0; j<uncommonLetters.size(); j++)
 				{
 					if(Guesses.get(i).contains(uncommonLetters.get(j).toString()))
 					{
 						hasLetter = true;
 					}
 				}
 				if(!hasLetter)
					{
						Guesses.remove(i);
						i--;
					}
					
 			}
 			Guesses = removeDuplicates(Guesses);
 			int[] guessScore = new int[Guesses.size()];
 			for(int i = 0; i<Guesses.size(); i++)
 			{
 				for(int j = 0; j<uncommonLetters.size(); j++)
 				{
 					if(Guesses.get(i).contains(uncommonLetters.get(j).toString()))
 					{
 						guessScore[i]++;
 					}
 				}
 			}
 			index = 0;
 			max = 0;
 			for(int i = 0; i<guessScore.length; i++)
 			{
 				if(max<guessScore[i])
 				{
 					index = i;
 					max = guessScore[i];
 				}
 			}	
 			if(AllWords.size()<=5)
 			{
 				for(int i = 0; i<AllWords.size(); i++)
 				{
 					System.out.println(AllWords.get(i) + ", " + score[i]);
 				}			
 			}
 			same = true;
 			return Guesses.get(index);
 		}
 		else
 		{
 			index = 0;
 			max = 0;
 			for(int i = 0; i<score.length; i++)
 			{
 				if(AllWords.size() > 10) // guess 2
 				{
 					if(countOccurences(AllWords.get(i), AllWords.get(i).charAt(0))>1 || countOccurences(AllWords.get(i), AllWords.get(i).charAt(1))>1 || countOccurences(AllWords.get(i), AllWords.get(i).charAt(2))>1 || countOccurences(AllWords.get(i), AllWords.get(i).charAt(3))>1 || countOccurences(AllWords.get(i), AllWords.get(i).charAt(4))>1)
 					{
 						score[i] = 0;
 					}
 				}	
 				if(max<score[i])
 				{
 					index = i;
 					max = score[i];
 				}
 			}	
 		}
		if(AllWords.size()<=6)
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				System.out.println(AllWords.get(i) + ", " + score[i]);
			}			
		}
		index1 = index;
		return AllWords.get(index);
	}
	
	public static String answer;
	
	public static String compare(String original, String guess)
	{
		char[] resultArray = new char[5];
		
		List<Character> unevaluated = new ArrayList<>();
		
		for(int i = 0; i<original.length(); i++)
		{
			if(original.charAt(i)==guess.charAt(i))
			{
				resultArray[i] = 'g';
			} else
			{
				unevaluated.add(original.charAt(i));
			}
		}
		
		for(int i = 0; i<guess.length(); i++)
		{
			if(resultArray[i] != 'g') {
				int indexOf = unevaluated.indexOf(guess.charAt(i));
				if(indexOf!=-1)
				{
					resultArray[i] = 'y';
				}else {
					resultArray[i] = '-';
				}
			}
		}
		
		String theString = String.valueOf(resultArray);
		return theString;
	}
	static int answerIndex = 0;
	static String best;
	static int NumberOfGuesses;
	
	public void play(String theWordIChose) throws IOException
	{
		int[] totalGuesses = new int[Words.size()];
		
		
		NumberOfGuesses = 0;
		System.out.println("There are " + AllWords.size() + " possible words left");
		
		best = theWordIChose;
		System.out.println("Best Guess is: " + best);
		getColours(best);
		
		NumberOfGuesses++;
		do
		{
					
			
			best = findBestWord2();
			System.out.println("Best Guess is: " + best);
			getColours(best);
			NumberOfGuesses++;
		}while(AllWords.size()>1);
		best = findBestWord2();
		System.out.println("Best Guess is: " + best);
		totalGuesses[0] = NumberOfGuesses;
		//System.out.println(totalGuesses[answerIndex]);
		//System.out.println("----------");
		AllWords = new ArrayList<>(Files.readAllLines(Path.of("AllWords")));
		int count = 0;
		for(int car : totalGuesses) {
		    if(car != 0) {
		        count++;
		    }
		}
		double a = 0;
		double done = 0;
		for(int i = 0; i<count; i++)
		{
			a += totalGuesses[i];
			done++;
		}
		System.out.println("The bot took " + (NumberOfGuesses+1) + " to solve the word");
	}
}
