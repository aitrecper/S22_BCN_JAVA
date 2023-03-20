package com.recio.aitor;

public class PT31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recursive r = new Recursive();
		String[] technologies = { "Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java" };

		r.apt1(technologies, 0);
		System.out.println();
		r.apt2(technologies, 0);
		
		int n = 11;
		for (int i = 0; i < n; i++) {
		    int resultado = r.fibonacci(i);
		    System.out.print(resultado + " ");
		}
		
		System.out.println("\n");
		
		String newString = r.apt4("supercalifragilisticoespialidoso", 0);
		
		System.out.println(newString);
		
		int apt5 = r.apt5(10);
		
		System.out.println(apt5);
	}

}

class Recursive {

	public void apt1(String[] technologies, int position) {

		System.out.println(technologies[position]);

		if (position == technologies.length - 1)
			return ;
		
		apt1(technologies, position + 1);
	}

	public void apt2(String[] technologies, int position) {

		System.out.println(technologies[position]);

		if (technologies[position].equals("HTML"))
			return ;
		
		apt2(technologies, position + 1);
	}
	
	public int fibonacci(int n) {
	    // Caso base: si n es 0 o 1, el resultado es n
	    if (n == 0 || n == 1) {
	        return n;
	    }
	    
	    // Llamada recursiva para obtener los dos números anteriores de la secuencia
	    int n1 = fibonacci(n - 1);
	    int n2 = fibonacci(n - 2);
	    
	    // Retornar la suma de los dos números anteriores
	    return n1 + n2;
	}
	
	public String apt4(String word, int position) {
		
		if (position == word.length()) {
	        return "";
	    }

		String reversed = apt4(word, position + 1);
	    
	    // Concatenar la letra actual al final de la parte invertida
	    return reversed + word.charAt(position);
	}
	
	public int apt5(int num) {
		if(num == 0)
			return num;
		else return num+apt5(num-1);
	}
}