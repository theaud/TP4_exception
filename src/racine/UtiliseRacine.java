package racine;


import racine.Racine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathieu
 */
public class UtiliseRacine
{
 public static void main(String[] argv)
 {
     
 Racine extracteur = new Racine(0.01);
 
 double operande=0.0;
 
 try{
     operande= (Double.valueOf(argv[0])).doubleValue();
 }catch(ArrayIndexOutOfBoundsException e)
 {
      System.out.println(" ArrayIndexOutOfBoundsException ");
 }
 double valeurRacine;
 
 try{
 valeurRacine=extracteur.racine(operande);
 System.out.println(valeurRacine); 
 System.out.println("precision "+extracteur.getPrecision() + " , erreur =" +(valeurRacine-Math.sqrt(operande)));
 extracteur.setPrecision(0.00001);
 valeurRacine=extracteur.racine(operande);
 System.out.println(valeurRacine);
 System.out.println("precision "+extracteur.getPrecision() + " , erreur =" +(valeurRacine-Math.sqrt(operande)));

 }
catch(NegativeException e)
{
    System.out.println("Racine negative ");
}
 

 

 }
}