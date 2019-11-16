/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apple7032
 */
public class Quize2 {
    public static void main(String [] args){
        int a = 20 , b = 10 , c, d, e =10 , f=4,g=9;
       
       c=b ;
       System.out.println("Value of c = " +c);
       
       a = a+1;
       b = b-1 ;
       e = e*2 ;
       f = f /2;
       g = g%2;
       
       System.out.println("a,b,e,f,g= " + a +"," +b +"," +e +","+f+","+g);
       
a = a -1;
b = b +1;
e = e /2;
f= f*2;

g=f;
g +=2;

a+= 1;
b-= 1;
e*=2;
f/=2;
       System.out.println("a,b,e,f,g("+"using shorted operators)=" +a +","+b+","+e+","+f+","+g);
      
        
    }
}
