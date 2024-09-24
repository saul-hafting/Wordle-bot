package Wordle;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException
	{
		Manual m = new Manual();	
		Automatic a = new Automatic();
		a.play("slate");
	}
}
