package com.recio.aitor;

public class PT26 {

	public static void main(String[] args) {
		
		Long numLong = 123456789L;
		byte numByte = 127;
		short numShort = 32767;
		Integer numInteger = 2147483647;
		
		Class claseLong = numLong.getClass();
		Class claseByte = ((Byte) numByte).getClass();
		Class claseShort = ((Short) numShort).getClass();
		Class claseInteger = numInteger.getClass();
		
	}
	
	public static void identificarWrapper(Object objeto) {
        if (objeto instanceof Boolean) {
            System.out.println("El objeto es de tipo boolean y su wrapper correspondiente es Boolean");
        } else if (objeto instanceof Character) {
            System.out.println("El objeto es de tipo char y su wrapper correspondiente es Character");
        } else if (objeto instanceof Byte) {
            System.out.println("El objeto es de tipo byte y su wrapper correspondiente es Byte");
        } else if (objeto instanceof Short) {
            System.out.println("El objeto es de tipo short y su wrapper correspondiente es Short");
        } else if (objeto instanceof Integer) {
            System.out.println("El objeto es de tipo int y su wrapper correspondiente es Integer");
        } else if (objeto instanceof Long) {
            System.out.println("El objeto es de tipo long y su wrapper correspondiente es Long");
        } else if (objeto instanceof Float) {
            System.out.println("El objeto es de tipo float y su wrapper correspondiente es Float");
        } else if (objeto instanceof Double) {
            System.out.println("El objeto es de tipo double y su wrapper correspondiente es Double");
        } else {
            // Si el objeto no es ninguno de los tipos anteriores, se asume que es un tipo primitivo y se obtiene el wrapper correspondiente al castear a Object
            String tipoPrimitivo = objeto.getClass().getSimpleName();
            String nombreWrapper = Character.toUpperCase(tipoPrimitivo.charAt(0)) + tipoPrimitivo.substring(1);
            System.out.println("El objeto es de tipo " + tipoPrimitivo + " y su wrapper correspondiente es " + nombreWrapper);
        }
    }
}

