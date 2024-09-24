package Wordle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SmallTest2 {
	public static ArrayList<String> AllWords;
	
	char[] first;
	 char[] second;
	 char[] third;
	 char[] fourth;
	 char[] fifth;
	
	 int firstA;
	 int firstB;
	 int firstC;
	 int firstD;
	 int firstE;
	 int firstF;
	 int firstG;
	 int firstH;
	 int firstI;
	 int firstJ;
	 int firstK;
	 int firstL;
	 int firstM;
	 int firstN;
	 int firstO;
	 int firstP;
	 int firstQ;
	 int firstR;
	 int firstS;
	 int firstT;
	 int firstU;
	 int firstV;
	 int firstW;
	 int firstX;
	 int firstY;
	 int firstZ;
	
	 int secondA;
	 int secondB;
	 int secondC;
	 int secondD;
	 int secondE;
	 int secondF;
	 int secondG;
	 int secondH;
	 int secondI;
	 int secondJ;
	 int secondK;
	 int secondL;
	 int secondM;
	 int secondN;
	 int secondO;
	 int secondP;
	 int secondQ;
	 int secondR;
	 int secondS;
	 int secondT;
	 int secondU;
	 int secondV;
	 int secondW;
	 int secondX;
	 int secondY;
	 int secondZ;
	
	 int thirdA;
	 int thirdB;
	 int thirdC;
	 int thirdD;
	 int thirdE;
	 int thirdF;
	 int thirdG;
	 int thirdH;
	 int thirdI;
	 int thirdJ;
	 int thirdK;
	 int thirdL;
	 int thirdM;
	 int thirdN;
	 int thirdO;
	 int thirdP;
	 int thirdQ;
	 int thirdR;
	 int thirdS;
	 int thirdT;
	 int thirdU;
	 int thirdV;
	 int thirdW;
	 int thirdX;
	 int thirdY;
	 int thirdZ;
	
	 int fourthA;
	 int fourthB;
	 int fourthC;
	 int fourthD;
	 int fourthE;
	 int fourthF;
	 int fourthG;
	 int fourthH;
	 int fourthI;
	 int fourthJ;
	 int fourthK;
	 int fourthL;
	 int fourthM;
	 int fourthN;
	 int fourthO;
	 int fourthP;
	 int fourthQ;
	 int fourthR;
	 int fourthS;
	 int fourthT;
	 int fourthU;
	 int fourthV;
	 int fourthW;
	 int fourthX;
	 int fourthY;
	 int fourthZ;
	
	 int fifthA;
	 int fifthB;
	 int fifthC;
	 int fifthD;
	 int fifthE;
	 int fifthF;
	 int fifthG;
	 int fifthH;
	 int fifthI;
	 int fifthJ;
	 int fifthK;
	 int fifthL;
	 int fifthM;
	 int fifthN;
	 int fifthO;
	 int fifthP;
	 int fifthQ;
	 int fifthR;
	 int fifthS;
	 int fifthT;
	 int fifthU;
	 int fifthV;
	 int fifthW;
	 int fifthX;
	 int fifthY;
	 int fifthZ;
	
	SmallTest2() throws IOException
	{
		AllWords = new ArrayList<>(Files.readAllLines(Path.of("AllWords")));
		first = new char[AllWords.size()];
		 second = new char[AllWords.size()];
		 third = new char[AllWords.size()];
		 fourth = new char[AllWords.size()];
		 fifth = new char[AllWords.size()];
		
		 firstA = 0;
		 firstB = 0;
		 firstC = 0;
		 firstD = 0;
		 firstE = 0;
		 firstF = 0;
		 firstG = 0;
		 firstH = 0;
		 firstI = 0;
		 firstJ = 0;
		 firstK = 0;
		 firstL = 0;
		 firstM = 0;
		 firstN = 0;
		 firstO = 0;
		 firstP = 0;
		 firstQ = 0;
		 firstR = 0;
		 firstS = 0;
		 firstT = 0;
		 firstU = 0;
		 firstV = 0;
		 firstW = 0;
		 firstX = 0;
		 firstY = 0;
		 firstZ = 0;
		
		 secondA = 0;
		 secondB = 0;
		 secondC = 0;
		 secondD = 0;
		 secondE = 0;
		 secondF = 0;
		 secondG = 0;
		 secondH = 0;
		 secondI = 0;
		 secondJ = 0;
		 secondK = 0;
		 secondL = 0;
		 secondM = 0;
		 secondN = 0;
		 secondO = 0;
		 secondP = 0;
		 secondQ = 0;
		 secondR = 0;
		 secondS = 0;
		 secondT = 0;
		 secondU = 0;
		 secondV = 0;
		 secondW = 0;
		 secondX = 0;
		 secondY = 0;
		 secondZ = 0;
		
		 thirdA = 0;
		 thirdB = 0;
		 thirdC = 0;
		 thirdD = 0;
		 thirdE = 0;
		 thirdF = 0;
		 thirdG = 0;
		 thirdH = 0;
		 thirdI = 0;
		 thirdJ = 0;
		 thirdK = 0;
		 thirdL = 0;
		 thirdM = 0;
		 thirdN = 0;
		 thirdO = 0;
		 thirdP = 0;
		 thirdQ = 0;
		 thirdR = 0;
		 thirdS = 0;
		 thirdT = 0;
		 thirdU = 0;
		 thirdV = 0;
		 thirdW = 0;
		 thirdX = 0;
		 thirdY = 0;
		 thirdZ = 0;
		
		 fourthA = 0;
		 fourthB = 0;
		 fourthC = 0;
		 fourthD = 0;
		 fourthE = 0;
		 fourthF = 0;
		 fourthG = 0;
		 fourthH = 0;
		 fourthI = 0;
		 fourthJ = 0;
		 fourthK = 0;
		 fourthL = 0;
		 fourthM = 0;
		 fourthN = 0;
		 fourthO = 0;
		 fourthP = 0;
		 fourthQ = 0;
		 fourthR = 0;
		 fourthS = 0;
		 fourthT = 0;
		 fourthU = 0;
		 fourthV = 0;
		 fourthW = 0;
		 fourthX = 0;
		 fourthY = 0;
		 fourthZ = 0;
		
		 fifthA = 0;
		 fifthB = 0;
		 fifthC = 0;
		 fifthD = 0;
		 fifthE = 0;
		 fifthF = 0;
		 fifthG = 0;
		 fifthH = 0;
		 fifthI = 0;
		 fifthJ = 0;
		 fifthK = 0;
		 fifthL = 0;
		 fifthM = 0;
		 fifthN = 0;
		 fifthO = 0;
		 fifthP = 0;
		 fifthQ = 0;
		 fifthR = 0;
		 fifthS = 0;
		 fifthT = 0;
		 fifthU = 0;
		 fifthV = 0;
		 fifthW = 0;
		 fifthX = 0;
		 fifthY = 0;
		 fifthZ = 0;
	}
	
	
	
 	public void createArrays()
	{
		for(int i = 0; i<AllWords.size(); i++)
		{
			first[i] = AllWords.get(i).charAt(0);
			second[i] = AllWords.get(i).charAt(1);
			third[i] = AllWords.get(i).charAt(2);
			fourth[i] = AllWords.get(i).charAt(3);
			fifth[i] = AllWords.get(i).charAt(4);
		}
	}

	public void findNumberOfLetterInFirst()
	{
		for(int i = 0; i<AllWords.size(); i++)
		{
			if(first[i]=='a')
			{
				firstA++;
			}
			else if(first[i]=='b')
			{
				firstB++;
			}
			else if(first[i]=='c')
			{
				firstC++;
			}
			else if(first[i]=='b')
			{
				firstD++;
			}
			else if(first[i]=='e')
			{
				firstE++;
			}
			else if(first[i]=='f')
			{
				firstF++;
			}
			else if(first[i]=='g')
			{
				firstG++;
			}
			else if(first[i]=='h')
			{
				firstH++;
			}
			else if(first[i]=='i')
			{
				firstI++;
			}
			else if(first[i]=='j')
			{
				firstJ++;
			}
			else if(first[i]=='k')
			{
				firstK++;
			}
			else if(first[i]=='l')
			{
				firstL++;
			}
			else if(first[i]=='m')
			{
				firstM++;
			}
			else if(first[i]=='n')
			{
				firstN++;
			}
			else if(first[i]=='o')
			{
				firstO++;
			}
			else if(first[i]=='p')
			{
				firstP++;
			}
			else if(first[i]=='q')
			{
				firstQ++;
			}
			else if(first[i]=='r')
			{
				firstR++;
			}
			else if(first[i]=='s')
			{
				firstS++;
			}
			else if(first[i]=='t')
			{
				firstT++;
			}
			else if(first[i]=='u')
			{
				firstU++;
			}
			else if(first[i]=='v')
			{
				firstV++;
			}
			else if(first[i]=='w')
			{
				firstW++;
			}
			else if(first[i]=='x')
			{
				firstX++;
			}
			else if(first[i]=='y')
			{
				firstY++;
			}
			else if(first[i]=='z')
			{
				firstZ++;
			}
		}
	}
	
	public void findNumberOfLetterInSecond()
	{
		for(int i = 0; i<AllWords.size(); i++)
		{
			if(second[i]=='a')
			{
				secondA++;
			}
			else if(second[i]=='b')
			{
				secondB++;
			}
			else if(second[i]=='c')
			{
				secondC++;
			}
			else if(second[i]=='b')
			{
				secondD++;
			}
			else if(second[i]=='e')
			{
				secondE++;
			}
			else if(second[i]=='f')
			{
				secondF++;
			}
			else if(second[i]=='g')
			{
				secondG++;
			}
			else if(second[i]=='h')
			{
				secondH++;
			}
			else if(second[i]=='i')
			{
				secondI++;
			}
			else if(second[i]=='j')
			{
				secondJ++;
			}
			else if(second[i]=='k')
			{
				secondK++;
			}
			else if(second[i]=='l')
			{
				secondL++;
			}
			else if(second[i]=='m')
			{
				secondM++;
			}
			else if(second[i]=='n')
			{
				secondN++;
			}
			else if(second[i]=='o')
			{
				secondO++;
			}
			else if(second[i]=='p')
			{
				secondP++;
			}
			else if(second[i]=='q')
			{
				secondQ++;
			}
			else if(second[i]=='r')
			{
				secondR++;
			}
			else if(second[i]=='s')
			{
				secondS++;
			}
			else if(second[i]=='t')
			{
				secondT++;
			}
			else if(second[i]=='u')
			{
				secondU++;
			}
			else if(second[i]=='v')
			{
				secondV++;
			}
			else if(second[i]=='w')
			{
				secondW++;
			}
			else if(second[i]=='x')
			{
				secondX++;
			}
			else if(second[i]=='y')
			{
				secondY++;
			}
			else if(second[i]=='z')
			{
				secondZ++;
			}
		}
	
	}
	
	public void findNumberOfLetterInThird()
	{

		for(int i = 0; i<AllWords.size(); i++)
		{
			if(third[i]=='a')
			{
				thirdA++;
			}
			else if(third[i]=='b')
			{
				thirdB++;
			}
			else if(third[i]=='c')
			{
				thirdC++;
			}
			else if(third[i]=='b')
			{
				thirdD++;
			}
			else if(third[i]=='e')
			{
				thirdE++;
			}
			else if(third[i]=='f')
			{
				thirdF++;
			}
			else if(third[i]=='g')
			{
				thirdG++;
			}
			else if(third[i]=='h')
			{
				thirdH++;
			}
			else if(third[i]=='i')
			{
				thirdI++;
			}
			else if(third[i]=='j')
			{
				thirdJ++;
			}
			else if(third[i]=='k')
			{
				thirdK++;
			}
			else if(third[i]=='l')
			{
				thirdL++;
			}
			else if(third[i]=='m')
			{
				thirdM++;
			}
			else if(third[i]=='n')
			{
				thirdN++;
			}
			else if(third[i]=='o')
			{
				thirdO++;
			}
			else if(third[i]=='p')
			{
				thirdP++;
			}
			else if(third[i]=='q')
			{
				thirdQ++;
			}
			else if(third[i]=='r')
			{
				thirdR++;
			}
			else if(third[i]=='s')
			{
				thirdS++;
			}
			else if(third[i]=='t')
			{
				thirdT++;
			}
			else if(third[i]=='u')
			{
				thirdU++;
			}
			else if(third[i]=='v')
			{
				thirdV++;
			}
			else if(third[i]=='w')
			{
				thirdW++;
			}
			else if(third[i]=='x')
			{
				thirdX++;
			}
			else if(third[i]=='y')
			{
				thirdY++;
			}
			else if(third[i]=='z')
			{
				thirdZ++;
			}
		}
	
	}
	
	public void findNumberOfLetterInFourth()
	{

		for(int i = 0; i<AllWords.size(); i++)
		{
			if(fourth[i]=='a')
			{
				fourthA++;
			}
			else if(fourth[i]=='b')
			{
				fourthB++;
			}
			else if(fourth[i]=='c')
			{
				fourthC++;
			}
			else if(fourth[i]=='b')
			{
				fourthD++;
			}
			else if(fourth[i]=='e')
			{
				fourthE++;
			}
			else if(fourth[i]=='f')
			{
				fourthF++;
			}
			else if(fourth[i]=='g')
			{
				fourthG++;
			}
			else if(fourth[i]=='h')
			{
				fourthH++;
			}
			else if(fourth[i]=='i')
			{
				fourthI++;
			}
			else if(fourth[i]=='j')
			{
				fourthJ++;
			}
			else if(fourth[i]=='k')
			{
				fourthK++;
			}
			else if(fourth[i]=='l')
			{
				fourthL++;
			}
			else if(fourth[i]=='m')
			{
				fourthM++;
			}
			else if(fourth[i]=='n')
			{
				fourthN++;
			}
			else if(fourth[i]=='o')
			{
				fourthO++;
			}
			else if(fourth[i]=='p')
			{
				fourthP++;
			}
			else if(fourth[i]=='q')
			{
				fourthQ++;
			}
			else if(fourth[i]=='r')
			{
				fourthR++;
			}
			else if(fourth[i]=='s')
			{
				fourthS++;
			}
			else if(fourth[i]=='t')
			{
				fourthT++;
			}
			else if(fourth[i]=='u')
			{
				fourthU++;
			}
			else if(fourth[i]=='v')
			{
				fourthV++;
			}
			else if(fourth[i]=='w')
			{
				fourthW++;
			}
			else if(fourth[i]=='x')
			{
				fourthX++;
			}
			else if(fourth[i]=='y')
			{
				fourthY++;
			}
			else if(fourth[i]=='z')
			{
				fourthZ++;
			}
		}
	
	}
	
	public void findNumberOfLetterInFifth()
	{

		for(int i = 0; i<AllWords.size(); i++)
		{
			if(fifth[i]=='a')
			{
				fifthA++;
			}
			else if(fifth[i]=='b')
			{
				fifthB++;
			}
			else if(fifth[i]=='c')
			{
				fifthC++;
			}
			else if(fifth[i]=='b')
			{
				fifthD++;
			}
			else if(fifth[i]=='e')
			{
				fifthE++;
			}
			else if(fifth[i]=='f')
			{
				fifthF++;
			}
			else if(fifth[i]=='g')
			{
				fifthG++;
			}
			else if(fifth[i]=='h')
			{
				fifthH++;
			}
			else if(fifth[i]=='i')
			{
				fifthI++;
			}
			else if(fifth[i]=='j')
			{
				fifthJ++;
			}
			else if(fifth[i]=='k')
			{
				fifthK++;
			}
			else if(fifth[i]=='l')
			{
				fifthL++;
			}
			else if(fifth[i]=='m')
			{
				fifthM++;
			}
			else if(fifth[i]=='n')
			{
				fifthN++;
			}
			else if(fifth[i]=='o')
			{
				fifthO++;
			}
			else if(fifth[i]=='p')
			{
				fifthP++;
			}
			else if(fifth[i]=='q')
			{
				fifthQ++;
			}
			else if(fifth[i]=='r')
			{
				fifthR++;
			}
			else if(fifth[i]=='s')
			{
				fifthS++;
			}
			else if(fifth[i]=='t')
			{
				fifthT++;
			}
			else if(fifth[i]=='u')
			{
				fifthU++;
			}
			else if(fifth[i]=='v')
			{
				fifthV++;
			}
			else if(fifth[i]=='w')
			{
				fifthW++;
			}
			else if(fifth[i]=='x')
			{
				fifthX++;
			}
			else if(fifth[i]=='y')
			{
				fifthY++;
			}
			else if(fifth[i]=='z')
			{
				fifthZ++;
			}
		}
	
	}

	public int[] findScore(ArrayList<String> a)
	{
		int[] score = new int[a.size()];
		for(int i = 0; i<a.size(); i++)
		{
			if(a.get(i).charAt(0)=='a')
			{
				score[i] += firstA;
			}
			else if(a.get(i).charAt(0)=='b')
			{
				score[i] += firstB;
			}
			else if(a.get(i).charAt(0)=='c')
			{
				score[i] += firstC;
			}
			else if(a.get(i).charAt(0)=='b')
			{
				score[i] += firstD;
			}
			else if(a.get(i).charAt(0)=='e')
			{
				score[i] += firstE;
			}
			else if(a.get(i).charAt(0)=='f')
			{
				score[i] += firstF;
			}
			else if(a.get(i).charAt(0)=='g')
			{
				score[i] += firstG;
			}
			else if(a.get(i).charAt(0)=='h')
			{
				score[i] += firstH;
			}
			else if(a.get(i).charAt(0)=='i')
			{
				score[i] += firstI;
			}
			else if(a.get(i).charAt(0)=='j')
			{
				score[i] += firstJ;
			}
			else if(a.get(i).charAt(0)=='k')
			{
				score[i] += firstK;
			}
			else if(a.get(i).charAt(0)=='l')
			{
				score[i] += firstL;
			}
			else if(a.get(i).charAt(0)=='m')
			{
				score[i] += firstM;
			}
			else if(a.get(i).charAt(0)=='n')
			{
				score[i] += firstN;
			}
			else if(a.get(i).charAt(0)=='o')
			{
				score[i] += firstO;
			}
			else if(a.get(i).charAt(0)=='p')
			{
				score[i] += firstP;
			}
			else if(a.get(i).charAt(0)=='q')
			{
				score[i] += firstQ;
			}
			else if(a.get(i).charAt(0)=='r')
			{
				score[i] += firstR;
			}
			else if(a.get(i).charAt(0)=='s')
			{
				score[i] += firstS;
			}
			else if(a.get(i).charAt(0)=='t')
			{
				score[i] += firstT;
			}
			else if(a.get(i).charAt(0)=='u')
			{
				score[i] += firstU;
			}
			else if(a.get(i).charAt(0)=='v')
			{
				score[i] += firstV;
			}
			else if(a.get(i).charAt(0)=='w')
			{
				score[i] += firstW;
			}
			else if(a.get(i).charAt(0)=='x')
			{
				score[i] += firstX;
			}
			else if(a.get(i).charAt(0)=='y')
			{
				score[i] += firstY;
			}
			else if(a.get(i).charAt(0)=='z')
			{
				score[i] += firstZ;
			}
			
			
			
			if(a.get(i).charAt(1)=='a')
			{
				score[i] += secondA;
			}
			else if(a.get(i).charAt(1)=='b')
			{
				score[i] += secondB;
			}
			else if(a.get(i).charAt(1)=='c')
			{
				score[i] += secondC;
			}
			else if(a.get(i).charAt(1)=='b')
			{
				score[i] += secondD;
			}
			else if(a.get(i).charAt(1)=='e')
			{
				score[i] += secondE;
			}
			else if(a.get(i).charAt(1)=='f')
			{
				score[i] += secondF;
			}
			else if(a.get(i).charAt(1)=='g')
			{
				score[i] += secondG;
			}
			else if(a.get(i).charAt(1)=='h')
			{
				score[i] += secondH;
			}
			else if(a.get(i).charAt(1)=='i')
			{
				score[i] += secondI;
			}
			else if(a.get(i).charAt(1)=='j')
			{
				score[i] += secondJ;
			}
			else if(a.get(i).charAt(1)=='k')
			{
				score[i] += secondK;
			}
			else if(a.get(i).charAt(1)=='l')
			{
				score[i] += secondL;
			}
			else if(a.get(i).charAt(1)=='m')
			{
				score[i] += secondM;
			}
			else if(a.get(i).charAt(1)=='n')
			{
				score[i] += secondN;
			}
			else if(a.get(i).charAt(1)=='o')
			{
				score[i] += secondO;
			}
			else if(a.get(i).charAt(1)=='p')
			{
				score[i] += secondP;
			}
			else if(a.get(i).charAt(1)=='q')
			{
				score[i] += secondQ;
			}
			else if(a.get(i).charAt(1)=='r')
			{
				score[i] += secondR;
			}
			else if(a.get(i).charAt(1)=='s')
			{
				score[i] += secondS;
			}
			else if(a.get(i).charAt(1)=='t')
			{
				score[i] += secondT;
			}
			else if(a.get(i).charAt(1)=='u')
			{
				score[i] += secondU;
			}
			else if(a.get(i).charAt(1)=='v')
			{
				score[i] += secondV;
			}
			else if(a.get(i).charAt(1)=='w')
			{
				score[i] += secondW;
			}
			else if(a.get(i).charAt(1)=='x')
			{
				score[i] += secondX;
			}
			else if(a.get(i).charAt(1)=='y')
			{
				score[i] += secondY;
			}
			else if(a.get(i).charAt(1)=='z')
			{
				score[i] += secondZ;
			}
			
			
			if(a.get(i).charAt(2)=='a')
			{
				score[i] += thirdA;
			}
			else if(a.get(i).charAt(2)=='b')
			{
				score[i] += thirdB;
			}
			else if(a.get(i).charAt(2)=='c')
			{
				score[i] += thirdC;
			}
			else if(a.get(i).charAt(2)=='b')
			{
				score[i] += thirdD;
			}
			else if(a.get(i).charAt(2)=='e')
			{
				score[i] += thirdE;
			}
			else if(a.get(i).charAt(2)=='f')
			{
				score[i] += thirdF;
			}
			else if(a.get(i).charAt(2)=='g')
			{
				score[i] += thirdG;
			}
			else if(a.get(i).charAt(2)=='h')
			{
				score[i] += thirdH;
			}
			else if(a.get(i).charAt(2)=='i')
			{
				score[i] += thirdI;
			}
			else if(a.get(i).charAt(2)=='j')
			{
				score[i] += thirdJ;
			}
			else if(a.get(i).charAt(2)=='k')
			{
				score[i] += thirdK;
			}
			else if(a.get(i).charAt(2)=='l')
			{
				score[i] += thirdL;
			}
			else if(a.get(i).charAt(2)=='m')
			{
				score[i] += thirdM;
			}
			else if(a.get(i).charAt(2)=='n')
			{
				score[i] += thirdN;
			}
			else if(a.get(i).charAt(2)=='o')
			{
				score[i] += thirdO;
			}
			else if(a.get(i).charAt(2)=='p')
			{
				score[i] += thirdP;
			}
			else if(a.get(i).charAt(2)=='q')
			{
				score[i] += thirdQ;
			}
			else if(a.get(i).charAt(2)=='r')
			{
				score[i] += thirdR;
			}
			else if(a.get(i).charAt(2)=='s')
			{
				score[i] += thirdS;
			}
			else if(a.get(i).charAt(2)=='t')
			{
				score[i] += thirdT;
			}
			else if(a.get(i).charAt(2)=='u')
			{
				score[i] += thirdU;
			}
			else if(a.get(i).charAt(2)=='v')
			{
				score[i] += thirdV;
			}
			else if(a.get(i).charAt(2)=='w')
			{
				score[i] += thirdW;
			}
			else if(a.get(i).charAt(2)=='x')
			{
				score[i] += thirdX;
			}
			else if(a.get(i).charAt(2)=='y')
			{
				score[i] += thirdY;
			}
			else if(a.get(i).charAt(2)=='z')
			{
				score[i] += thirdZ;
			}
			
			
			if(a.get(i).charAt(3)=='a')
			{
				score[i] += fourthA;
			}
			else if(a.get(i).charAt(3)=='b')
			{
				score[i] += fourthB;
			}
			else if(a.get(i).charAt(3)=='c')
			{
				score[i] += fourthC;
			}
			else if(a.get(i).charAt(3)=='b')
			{
				score[i] += fourthD;
			}
			else if(a.get(i).charAt(3)=='e')
			{
				score[i] += fourthE;
			}
			else if(a.get(i).charAt(3)=='f')
			{
				score[i] += fourthF;
			}
			else if(a.get(i).charAt(3)=='g')
			{
				score[i] += fourthG;
			}
			else if(a.get(i).charAt(3)=='h')
			{
				score[i] += fourthH;
			}
			else if(a.get(i).charAt(3)=='i')
			{
				score[i] += fourthI;
			}
			else if(a.get(i).charAt(3)=='j')
			{
				score[i] += fourthJ;
			}
			else if(a.get(i).charAt(3)=='k')
			{
				score[i] += fourthK;
			}
			else if(a.get(i).charAt(3)=='l')
			{
				score[i] += fourthL;
			}
			else if(a.get(i).charAt(3)=='m')
			{
				score[i] += fourthM;
			}
			else if(a.get(i).charAt(3)=='n')
			{
				score[i] += fourthN;
			}
			else if(a.get(i).charAt(3)=='o')
			{
				score[i] += fourthO;
			}
			else if(a.get(i).charAt(3)=='p')
			{
				score[i] += fourthP;
			}
			else if(a.get(i).charAt(3)=='q')
			{
				score[i] += fourthQ;
			}
			else if(a.get(i).charAt(3)=='r')
			{
				score[i] += fourthR;
			}
			else if(a.get(i).charAt(3)=='s')
			{
				score[i] += fourthS;
			}
			else if(a.get(i).charAt(3)=='t')
			{
				score[i] += fourthT;
			}
			else if(a.get(i).charAt(3)=='u')
			{
				score[i] += fourthU;
			}
			else if(a.get(i).charAt(3)=='v')
			{
				score[i] += fourthV;
			}
			else if(a.get(i).charAt(3)=='w')
			{
				score[i] += fourthW;
			}
			else if(a.get(i).charAt(3)=='x')
			{
				score[i] += fourthX;
			}
			else if(a.get(i).charAt(3)=='y')
			{
				score[i] += fourthY;
			}
			else if(a.get(i).charAt(3)=='z')
			{
				score[i] += fourthZ;
			}
			
			
			
			if(a.get(i).charAt(4)=='a')
			{
				score[i] += fifthA;
			}
			else if(a.get(i).charAt(4)=='b')
			{
				score[i] += fifthB;
			}
			else if(a.get(i).charAt(4)=='c')
			{
				score[i] += fifthC;
			}
			else if(a.get(i).charAt(4)=='b')
			{
				score[i] += fifthD;
			}
			else if(a.get(i).charAt(4)=='e')
			{
				score[i] += fifthE;
			}
			else if(a.get(i).charAt(4)=='f')
			{
				score[i] += fifthF;
			}
			else if(a.get(i).charAt(4)=='g')
			{
				score[i] += fifthG;
			}
			else if(a.get(i).charAt(4)=='h')
			{
				score[i] += fifthH;
			}
			else if(a.get(i).charAt(4)=='i')
			{
				score[i] += fifthI;
			}
			else if(a.get(i).charAt(4)=='j')
			{
				score[i] += fifthJ;
			}
			else if(a.get(i).charAt(4)=='k')
			{
				score[i] += fifthK;
			}
			else if(a.get(i).charAt(4)=='l')
			{
				score[i] += fifthL;
			}
			else if(a.get(i).charAt(4)=='m')
			{
				score[i] += fifthM;
			}
			else if(a.get(i).charAt(4)=='n')
			{
				score[i] += fifthN;
			}
			else if(a.get(i).charAt(4)=='o')
			{
				score[i] += fifthO;
			}
			else if(a.get(i).charAt(4)=='p')
			{
				score[i] += fifthP;
			}
			else if(a.get(i).charAt(4)=='q')
			{
				score[i] += fifthQ;
			}
			else if(a.get(i).charAt(4)=='r')
			{
				score[i] += fifthR;
			}
			else if(a.get(i).charAt(4)=='s')
			{
				score[i] += fifthS;
			}
			else if(a.get(i).charAt(4)=='t')
			{
				score[i] += fifthT;
			}
			else if(a.get(i).charAt(4)=='u')
			{
				score[i] += fifthU;
			}
			else if(a.get(i).charAt(4)=='v')
			{
				score[i] += fifthV;
			}
			else if(a.get(i).charAt(4)=='w')
			{
				score[i] += fifthW;
			}
			else if(a.get(i).charAt(4)=='x')
			{
				score[i] += fifthX;
			}
			else if(a.get(i).charAt(4)=='y')
			{
				score[i] += fifthY;
			}
			else if(a.get(i).charAt(4)=='z')
			{
				score[i] += fifthZ;
			}
		}
		return score;
	}
	
	public void setZero()
	{
		first = new char[AllWords.size()];
		 second = new char[AllWords.size()];
		 third = new char[AllWords.size()];
		 fourth = new char[AllWords.size()];
		 fifth = new char[AllWords.size()];
		
		 firstA = 0;
		 firstB = 0;
		 firstC = 0;
		 firstD = 0;
		 firstE = 0;
		 firstF = 0;
		 firstG = 0;
		 firstH = 0;
		 firstI = 0;
		 firstJ = 0;
		 firstK = 0;
		 firstL = 0;
		 firstM = 0;
		 firstN = 0;
		 firstO = 0;
		 firstP = 0;
		 firstQ = 0;
		 firstR = 0;
		 firstS = 0;
		 firstT = 0;
		 firstU = 0;
		 firstV = 0;
		 firstW = 0;
		 firstX = 0;
		 firstY = 0;
		 firstZ = 0;
		
		 secondA = 0;
		 secondB = 0;
		 secondC = 0;
		 secondD = 0;
		 secondE = 0;
		 secondF = 0;
		 secondG = 0;
		 secondH = 0;
		 secondI = 0;
		 secondJ = 0;
		 secondK = 0;
		 secondL = 0;
		 secondM = 0;
		 secondN = 0;
		 secondO = 0;
		 secondP = 0;
		 secondQ = 0;
		 secondR = 0;
		 secondS = 0;
		 secondT = 0;
		 secondU = 0;
		 secondV = 0;
		 secondW = 0;
		 secondX = 0;
		 secondY = 0;
		 secondZ = 0;
		
		 thirdA = 0;
		 thirdB = 0;
		 thirdC = 0;
		 thirdD = 0;
		 thirdE = 0;
		 thirdF = 0;
		 thirdG = 0;
		 thirdH = 0;
		 thirdI = 0;
		 thirdJ = 0;
		 thirdK = 0;
		 thirdL = 0;
		 thirdM = 0;
		 thirdN = 0;
		 thirdO = 0;
		 thirdP = 0;
		 thirdQ = 0;
		 thirdR = 0;
		 thirdS = 0;
		 thirdT = 0;
		 thirdU = 0;
		 thirdV = 0;
		 thirdW = 0;
		 thirdX = 0;
		 thirdY = 0;
		 thirdZ = 0;
		
		 fourthA = 0;
		 fourthB = 0;
		 fourthC = 0;
		 fourthD = 0;
		 fourthE = 0;
		 fourthF = 0;
		 fourthG = 0;
		 fourthH = 0;
		 fourthI = 0;
		 fourthJ = 0;
		 fourthK = 0;
		 fourthL = 0;
		 fourthM = 0;
		 fourthN = 0;
		 fourthO = 0;
		 fourthP = 0;
		 fourthQ = 0;
		 fourthR = 0;
		 fourthS = 0;
		 fourthT = 0;
		 fourthU = 0;
		 fourthV = 0;
		 fourthW = 0;
		 fourthX = 0;
		 fourthY = 0;
		 fourthZ = 0;
		
		 fifthA = 0;
		 fifthB = 0;
		 fifthC = 0;
		 fifthD = 0;
		 fifthE = 0;
		 fifthF = 0;
		 fifthG = 0;
		 fifthH = 0;
		 fifthI = 0;
		 fifthJ = 0;
		 fifthK = 0;
		 fifthL = 0;
		 fifthM = 0;
		 fifthN = 0;
		 fifthO = 0;
		 fifthP = 0;
		 fifthQ = 0;
		 fifthR = 0;
		 fifthS = 0;
		 fifthT = 0;
		 fifthU = 0;
		 fifthV = 0;
		 fifthW = 0;
		 fifthX = 0;
		 fifthY = 0;
		 fifthZ = 0;
	}
	
	public static void firstColour()
	{
		if(colours.substring(0,1).equals("g"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(!AllWords.get(i).substring(0,1).equals(word.substring(0,1)))
				{
					AllWords.remove(i);
					i--;
				}
			}
		}
		else if(colours.substring(0,1).equals("y"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(AllWords.get(i).substring(0,1).equals(word.substring(0,1)))
				{
					AllWords.remove(i);
					i--;
				}
				else if(!AllWords.get(i).contains((CharSequence) word.substring(0,1)))
				{
					AllWords.remove(i);
					i--;
				}
			}
		}
		else if(colours.substring(0,1).equals("-"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(word.indexOf(word.substring(0,1))==0)
				{
					if(AllWords.get(i).contains((CharSequence) word.substring(0,1)))
					{
						AllWords.remove(i);
						i--;
					}
				}
				
			}
		}
	}
	
	public static void secondColour()
	{
		if(colours.substring(1,2).equals("g"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(!AllWords.get(i).substring(1,2).equals(word.substring(1,2)))
				{
					AllWords.remove(i);
					i--;
				}
			}
		}
		else if(colours.substring(1,2).equals("y"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(AllWords.get(i).substring(1,2).equals(word.substring(1,2)))
				{
					AllWords.remove(i);
					i--;
				}
				else if(!AllWords.get(i).contains((CharSequence) word.substring(1,2)))
				{
					AllWords.remove(i);
					i--;
				}
			}
		}
		else if(colours.substring(1,2).equals("-"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(word.indexOf(word.substring(1,2))==1)
				{
					if(AllWords.get(i).contains((CharSequence) word.substring(1,2)))
					{
						AllWords.remove(i);
						i--;
					}
					
				}
			}
		}
	}
	
	public static void thirdColour() 
	{
		if(colours.substring(2,3).equals("g"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(!AllWords.get(i).substring(2,3).equals(word.substring(2,3)))
				{
					AllWords.remove(i);
					i--;
				}
			}
		}
		else if(colours.substring(2,3).equals("y"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(AllWords.get(i).substring(2,3).equals(word.substring(2,3)))
				{
					AllWords.remove(i);
					i--;
				}
				else if(!AllWords.get(i).contains((CharSequence) word.substring(2,3)))
				{
					AllWords.remove(i);
					i--;
				}
			}
		}
		else if(colours.substring(2,3).equals("-"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(word.indexOf(word.substring(2,3))==2)
				{
					if(AllWords.get(i).contains((CharSequence) word.substring(2,3)))
					{
						AllWords.remove(i);
						i--;
					}
					
				}
			}
		}
	}
	
	public static void fourthColour()
	{
		if(colours.substring(3,4).equals("g"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(!AllWords.get(i).substring(3,4).equals(word.substring(3,4)))
				{
					AllWords.remove(i);
					i--;
				}
			}
		}
		else if(colours.substring(3,4).equals("y"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(AllWords.get(i).substring(3,4).equals(word.substring(3,4)))
				{
					AllWords.remove(i);
					i--;
				}
				else if(!AllWords.get(i).contains((CharSequence) word.substring(3,4)))
				{
					AllWords.remove(i);
					i--;
				}
			}
		}
		else if(colours.substring(3,4).equals("-"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(word.indexOf(word.substring(3,4))==3)
				{
					
					if(AllWords.get(i).contains((CharSequence) word.substring(3,4)))
					{
						AllWords.remove(i);
						i--;
					}
					
				}
			}
		}
	}
	
	public static void fifthColour()
	{
		if(colours.substring(4).equals("g"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(!AllWords.get(i).substring(4).equals(word.substring(4)))
				{
					AllWords.remove(i);
					i--;
				}
			}
		}
		else if(colours.substring(4).equals("y"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(AllWords.get(i).substring(4).equals(word.substring(4)))
				{
					AllWords.remove(i);
					i--;
				}
				else if(!AllWords.get(i).contains((CharSequence) word.substring(4)))
				{
					AllWords.remove(i);
					i--;
				}
			}
		}
		else if(colours.substring(4).equals("-"))
		{
			for(int i = 0; i<AllWords.size(); i++)
			{
				if(word.indexOf(word.substring(4))==4) 
				{
					
					if(AllWords.get(i).contains((CharSequence) word.substring(4)))
					{
						AllWords.remove(i);
						i--;
					}
					
				}
			}
		}
	}
	
	
	
	static String word;
	static String colours;
	
	public void getColours()
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Green: g\nYellow: y\nGray: -");
		System.out.println("What was the word");
		word = kb.nextLine();
		System.out.println("What are the colours: ");
		colours = kb.nextLine();
		
		firstColour();
		secondColour();
		thirdColour();
		fourthColour();
		fifthColour();
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		List<String> lines = Files.readAllLines(Path.of("Words"));
		List<String> AllWrods = Files.readAllLines(Path.of("AllWords"));
		
		SmallTest2 s = new SmallTest2();
		s.createArrays();
		s.findNumberOfLetterInFirst();
		s.findNumberOfLetterInSecond();
		s.findNumberOfLetterInThird();
		s.findNumberOfLetterInFourth();
		s.findNumberOfLetterInFifth();
		
		int[] score = s.findScore(AllWords);
		
		int index = 0;
		int max = 0;
		for(int i = 0; i<score.length; i++)
		{
			if(max<score[i])
			{
				index = i;
				max = score[i];
			}
		}
		System.out.println(AllWords.get(index));
		System.out.println(AllWords.size());
		
		do
		{
			s.getColours();
			s.setZero();
			s.createArrays();
			s.findNumberOfLetterInFirst();
			s.findNumberOfLetterInSecond();
			s.findNumberOfLetterInThird();
			s.findNumberOfLetterInFourth();
			s.findNumberOfLetterInFifth();
			
			score = s.findScore(AllWords);
			
			index = 0;
			max = 0;
			for(int i = 0; i<score.length; i++)
			{
				if(max<score[i])
				{
					index = i;
					max = score[i];
				}
			}
			System.out.println(AllWords.get(index));
			System.out.println(AllWords.size());
		}while(AllWords.size()>1);
		
	}
}
