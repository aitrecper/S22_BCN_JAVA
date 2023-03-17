package com.recio.aitor;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PT22 {
	public static void main(String[] args) {
		
		final String RESET_CODE = "\u001B[0m";
		final String UNICODE_START = "\033[0;";
		final String BOLD_TEXT = "1";
		final String ITALIC_TEXT = "3";
		final String UNDERLINED_TEXT = "4";
		final String UNICODE_ENCLOSURE = "m";
		
		String test1 = "\033[0;1;3;4m";
		String test2 = "\u001B[48;5;39m";
		
		Functions f = new Functions();
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\u001B[48;5;39m                              " + RESET_CODE);
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("\u001B[48;2;255;213;0m                              " + RESET_CODE);
		}
		
		System.out.println("\n" + UNICODE_START + ITALIC_TEXT + UNICODE_ENCLOSURE + "Grecia" + RESET_CODE + "\n");
		
		
		System.out.print("\u001B[48;2;13;94;175m    " + RESET_CODE + "  " + "\u001B[48;2;13;94;175m                        " + RESET_CODE+"\n");
		System.out.print("\u001B[48;2;13;94;175m    " + RESET_CODE + "  " + "\u001B[48;2;13;94;175m    " + RESET_CODE + "                      " + RESET_CODE+"\n");
		System.out.print("          \u001B[48;2;13;94;175m                    " + RESET_CODE+"\n");
		System.out.print("\u001B[48;2;13;94;175m    " + RESET_CODE + "  " + "\u001B[48;2;13;94;175m    " + RESET_CODE + "                      " + RESET_CODE+"\n");
		System.out.print("\u001B[48;2;13;94;175m    " + RESET_CODE + "  " + "\u001B[48;2;13;94;175m                        " + RESET_CODE+"\n");
		for(int i = 0; i < 4; i++) {
			if(i%2==0)
				System.out.println();
			else
				System.out.println("\u001B[48;2;13;94;175m                              "+RESET_CODE);
		}
		
		System.out.println("\n" + UNICODE_START + UNDERLINED_TEXT + UNICODE_ENCLOSURE + "Francia" + RESET_CODE + "\n");
		
		//Le françoise 💩
		
		for(int i = 0; i < 9; i++) {
			System.out.println("\u001B[48;2;4;30;153m          " + RESET_CODE + "          " + "\u001B[48;2;229;4;50m          "+RESET_CODE);
		}

		System.out.println("\n" + UNICODE_START + BOLD_TEXT + ";" + ITALIC_TEXT + ";" + UNDERLINED_TEXT + UNICODE_ENCLOSURE + "ESPAÑÑÑÑÑÑÑÑÑÑÑÑÑÑÑÑÑÑA" + RESET_CODE + "\n");
		
		// ARRIBA ESPANIA
		for(int i = 0; i < 10; i++) {
			if(i>=3 && i<=6)
				System.out.println("\u001B[48;2;250;189;0m                              ");
			else
				System.out.println("\u001B[48;2;173;21;25m                              ");
		}
		
		System.out.println("\n" + UNICODE_START + ITALIC_TEXT + ";" + UNDERLINED_TEXT + UNICODE_ENCLOSURE + "Catalunya" + RESET_CODE + "\n");
		
		for(int i = 0; i < 9; i++) {
			if(i%2==0)
				System.out.println("\u001B[48;2;252;221;9m                              ");
			else
				System.out.println("\u001B[48;2;218;18;26m                              ");
		}

		System.out.println("\n" + UNICODE_START + BOLD_TEXT + ";" + UNDERLINED_TEXT + UNICODE_ENCLOSURE + "Alemania" + RESET_CODE + "\n");
		
		for(int i = 0; i < 9; i++) {
			if(i<3)
				System.out.println("\u001B[40m                              ");
			else if(i >= 3 && i < 6)
				System.out.println("\u001B[48;2;230;38;27m                              ");
			else
				System.out.println("\u001B[48;2;252;204;0m                              ");
		}
		
		
		f.textFormatter(true, true, false, false, false, true, 250, 128, 114, 188, 255, 122, "Otra prueba");
		
		f.unFormat(test1+test2+"Texto de prueba");
	}
}

class Functions{
	
	String reset(String funcionalidad){
		return funcionalidad;
	}
	Functions(){}
	
	void textFormatter(boolean textModifier, boolean bg, boolean bold, boolean italic, boolean underlined, boolean textColor, int rText, int gText, int bText, int rBg, int gBg, int bGb, String text) {
		
		String unicodeText = "\u001B[";
		String unicodeBg = "\u001B[48;2;";
		String textResult = "";
		
		
		
		if(textColor) 
			unicodeText+= "38;2;" + rText + ";" + gText + ";" + bText + ";";
		else
			unicodeText = "\u001B[0;";
		
		if(bold)
			unicodeText+="1;";
		
		if(italic)
			unicodeText+="3;";
		
		if(underlined)
			unicodeText+="4;";
		
		unicodeText = unicodeText.substring(0,unicodeText.length()-1) + "m";
		
		
		
		if(bg)
			unicodeBg += rBg + ";" + gBg + ";" + bGb + "m";
		
		System.out.println(unicodeBg);
		
		if(textModifier && bg)
			textResult = unicodeText + unicodeBg + text;
		else if(textModifier)
			textResult+=unicodeText+text;
		else
			textResult+=unicodeBg+text;
		
		System.out.println(textResult + "\033[0m");
	}

	void unFormat(String formattedText) {

		String[] aux = formattedText.split("m");
		String newText = "";
		
		for(int i = 0; i < aux.length; i++) {
			newText= "\033[0m" + aux[i];
		}
		
		System.out.println(newText);

	}
}
