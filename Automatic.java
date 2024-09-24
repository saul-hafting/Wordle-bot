package Wordle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Automatic extends Algorithm{
	Automatic() throws IOException{}
		
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
	public String findBestWordAuto2() throws IOException
	{
		setZero();
		createArrays();
		findNumberOfLetterInFirst();
		findNumberOfLetterInSecond();
		findNumberOfLetterInThird();
		findNumberOfLetterInFourth();
		findNumberOfLetterInFifth();
		int[] score = findScore(AllWords);
		
 	//	System.out.println("There are " + AllWords.size() + " possible words left");
 		int index = 0;
 		int max = 0;
		//System.out.println("-------");
 		if(allTheSame(score) && AllWords.size()>2 ) // && AllWords.size()<11
 		{
 			//ArrayList<String> WordList = AllWords;
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
 			for(int i = 0; i<AllWords.size(); i++)
			{
				System.out.println(AllWords.get(i) + ", " + score[i]);
			}	
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
//						System.out.println("Removed: " + Guesses.get(i));
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
// 						guessScore[i] += countOccurences(Guesses.get(i), uncommonLetters.get(j));
 						guessScore[i]++;
 					}
 				}
 			}
// 			for(int i = 0; i<Guesses.size(); i++)
// 				{
// 					System.out.println(Guesses.get(i) + ", " + guessScore[i]);
// 				}
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
 			index1 = index;
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
	
	public void auto(String TheWordIChose) throws IOException
	{
		
		NumberOfGuesses = 0;
		answer = Words.get(answerIndex);
		best = TheWordIChose;
		System.out.println("original: " + answer + "\nguess: " + best);
		System.out.println("The colours are: " + compare(answer , best));
		
		getColours(compare(answer , best), best);
		NumberOfGuesses++;
		do
		{
			System.out.println("original: " + answer + "\nguess: " + best);
			System.out.println("The colours are: " + compare(answer , best));
			answer = Words.get(answerIndex);
			best = findBestWordAuto2();
			
			
			getColours(compare(answer , best), best);
			NumberOfGuesses++;
		}while(!best.equals(answer));
		System.out.println("original: " + answer + "\nguess: " + best);
		System.out.println("The colours are: " + compare(answer , best));
	}
	
	public void play(String TheWordIChose) throws IOException
	{
		
		int[] totalGuesses = new int[Words.size()];
		do
		{
			
			auto(TheWordIChose);
//			System.out.println(answer);
			totalGuesses[answerIndex] = NumberOfGuesses;
//			System.out.println(totalGuesses[answerIndex]);
			answerIndex++;
			System.out.println("----------");
			Guesses = new ArrayList<>(Files.readAllLines(Path.of("Guesses")));
			AllWords = new ArrayList<>(Files.readAllLines(Path.of("AllWords")));
			
		}while(!answer.equals("zonal")); // works with aphid
		int count = 0;
		for(int car : totalGuesses) {
		    if(car != 0) {
		        count++;
		    }
		}
		double a = 0;
		double done = 0;
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		int num6=0;
		int num7=0;
		int num8=0;
		int num9=0;
		int num10=0;
		int num11=0;
		int num12=0;
		for(int i = 0; i<count; i++)
		{
			if(totalGuesses[i] == 1)
			{
				num1++;
			}
			else if(totalGuesses[i] == 2)
			{
				num2++;
			}
			else if(totalGuesses[i] == 3)
			{
				num3++;
			}
			else if(totalGuesses[i] == 4)
			{
				num4++;
			}
			else if(totalGuesses[i] == 5)
			{
				num5++;
			}
			else if(totalGuesses[i] == 6)
			{
				num6++;
			}
			else if(totalGuesses[i] == 7)
			{
				num7++;
			}
			else if(totalGuesses[i] == 8)
			{
				num8++;
			}
			else if(totalGuesses[i] == 9)
			{
				num9++;
			}
			else if(totalGuesses[i] == 10)
			{
				num10++;
			}
			else if(totalGuesses[i] == 11)
			{
				num11++;
			}
			else if(totalGuesses[i] == 12)
			{
				num12++;
			}
			a += totalGuesses[i];
			done++;
		}
		System.out.println("The bot took " + (a-1)/done + " to solve each word");
		System.out.println("1 try: " + (num1+1));
		System.out.println("2 try: " + (num2-1));
		System.out.println("3 try: " + num3);
		System.out.println("4 try: " + num4);
		System.out.println("5 try: " + num5);
		System.out.println("6 try: " + num6);
		System.out.println("7 try: " + num7);
		System.out.println("8 try: " + num8);
		System.out.println("9 try: " + num9);
		System.out.println("10 try: " + num10);
		System.out.println("11 try: " + num11);
		System.out.println("12 try: " + num12);
	}
}