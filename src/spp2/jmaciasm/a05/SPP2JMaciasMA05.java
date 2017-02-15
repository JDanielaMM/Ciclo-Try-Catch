/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.jmaciasm.a05;
import java.util.Scanner;
/**
 *
 * @author danii
 */
public class SPP2JMaciasMA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      solicitaDouble(" un valor tipo double: ");
      solicitaString(" un valor tipo string: ");
      solicitaLong(" un valor tipo Long: ");
   
    }
    static double solicitaDouble (String mensaje)
    {
        Scanner key = new Scanner (System.in);
        double var=0;
        boolean flag;
        
        do{
        try{
        System.out.println("Introduce"+mensaje);
        var=key.nextDouble();
        flag = false;}
        
        catch(Exception ex){
            System.out.println("Introdujiste algo que no es double");
                flag = true;
                key.next();
        }
        }
        while (flag);
        return var;
    }
    
     static String solicitaString (String mensaje)
    {
        Scanner key = new Scanner (System.in);
        String var = "";
        boolean flag;
        
        do{
        try{
        System.out.println("Introduce"+mensaje);
        var=key.nextLine();
        flag = false;}
        
        catch(Exception ex){
            System.out.println("Introdujiste algo que no es string");
                flag = true;
                key.next();
        }
        }
        while (flag);
        return var;
    }
     
     
      static long solicitaLong (String mensaje)
    {
        Scanner key = new Scanner (System.in);
        long var=0;
        boolean flag;
        
        do{
        try{
        System.out.println("Introduce"+mensaje);
        var=key.nextLong();
        flag = false;}
        
        catch(Exception ex){
            System.out.println("Introdujiste algo que no es long");
                flag = true;
                key.next();
        }
        }
        while (flag);
        return var;
    }
    
}
