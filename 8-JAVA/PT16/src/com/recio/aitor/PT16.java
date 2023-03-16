package com.recio.aitor;

import java.util.Random;

public class PT16 {
	public static void main(String[] args) {
		
		Random random = new Random();
	    int num = random.nextInt(2);
	    
	    if(num==0)
	    	System.out.println("Negro");
	    
	    if(num==1)
	    	System.out.println("Rojo");
	    
	    if(num==0)
	    	System.out.println("Negro");
	    else
	    	System.out.println("Rojo");
	    
	    String color = num==0 ? "Negro" : "Rojo";
	    System.out.println(color);
	    
	    
	    double temp = 26.5;
	    if(temp<10) {
	    	System.out.println("Clima frío");
	    	if(temp<5)
		    	System.out.println("Tipo Polar");
	    	
	    	if(temp>=5 && temp<10)
		    	System.out.println("Tipo Alta Montaña");
	    }
	    
	    if(temp >= 10 && temp < 20) {
	    	System.out.println("Clima templado");
	    	if(temp>=10 && temp < 13.5)
		    	System.out.println("Tipo Oceánico");
	    	if(temp >= 13.5 && temp < 16.5)
		    	System.out.println("Tipo Mediterráneo");
	    	if(temp >= 16.5 && temp < 20)
		    	System.out.println("Tipo Continental");
	    }
	    
	    if(temp >= 20) {
	    	System.out.println("Clima cálidos");
	    	if(temp >= 20 && temp < 23.5)
		    	System.out.println("Tipo Ecuatorial");
	    	if(temp >= 23.5 && temp < 26.5)
		    	System.out.println("Tipo Tropical");
	    	if(temp >= 26.5)
		    	System.out.println("Tipo Desértico");
	    }
	    
	    if(temp<10) {
	    	
	    	System.out.println("Clima frío");
	    	
	    	if(temp<5)
		    	System.out.println("Tipo Polar");
	    	else if(temp>=5 && temp<10)
		    	System.out.println("Tipo Alta Montaña");
	    }else if(temp >= 10 && temp < 20) {
	    	
	    	System.out.println("Clima templado");
	    	
	    	if(temp>=10 && temp < 13.5)
		    	System.out.println("Tipo Oceánico");
	    	else if(temp >= 13.5 && temp < 16.5)
		    	System.out.println("Tipo Mediterráneo");
	    	else
		    	System.out.println("Tipo Continental");
	    	
	    }else{
	    	
	    	System.out.println("Clima cálidos");
	    	
	    	if(temp >= 20 && temp < 23.5)
		    	System.out.println("Tipo Ecuatorial");
	    	else if(temp >= 23.5 && temp < 26.5)
		    	System.out.println("Tipo Tropical");
	    	else
		    	System.out.println("Tipo Desértico");
	    }
	}
}
