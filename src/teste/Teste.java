/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author VitorSantos
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateFormat x = new SimpleDateFormat("HH:mm:ss");
        GregorianCalendar gc01 = new GregorianCalendar();
       
        gc01.set(Calendar.HOUR_OF_DAY, 12);
        gc01.set(Calendar.MINUTE, 0);
        gc01.set(Calendar.SECOND, 0);
        gc01.set(Calendar.DAY_OF_MONTH, 4);
        gc01.set(Calendar.MONTH, 0);// de 0 a 11 ou seja janeiro = 0
        gc01.set(Calendar.YEAR, 1999);
        System.out.println(gc01.getTime());
        System.out.println("_______________________________________");
        
        
        GregorianCalendar gc02 = new GregorianCalendar();
       
        gc02.set(Calendar.HOUR_OF_DAY, 13);
        gc02.set(Calendar.MINUTE, 0);
        gc02.set(Calendar.SECOND, 0);
        
        gc02.set(Calendar.DAY_OF_MONTH, 4);
        gc02.set(Calendar.MONTH, 0);
        gc02.set(Calendar.YEAR, 1999);
        
        System.out.println(gc02.getTime());
        System.out.println("_______________________________________");
        
        System.out.println(gc02.compareTo(gc01)+"    CompareTo com gc02 primeiro");
        System.out.println("_______________________________________");
        System.out.println(gc01.compareTo(gc02)+"    CompareTo com gc01 primeiro");
        System.out.println("_______________________________________");

            System.out.println(gc02.getTimeInMillis() - gc01.getTimeInMillis()+" tempo");
            

        
        System.out.println(gc02.getTime()+"++++");
        
        System.out.println("_______________________________________");
        int resultado = 32/3;
         System.out.println(resultado);
         System.exit(0);
         System.out.println("_______________________________________");
    }
    
}
