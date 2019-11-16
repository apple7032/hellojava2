/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apple7032
 */
public class QUIZ1 {
   public static void main(String [] args){
       
       int a =20, b=10, c=0, d=20,e=40,f=30;
       boolean condition = true;
       
       c = ++a;
       System.out.println("Value of c (++a)=" +c);
     
       c = b++;
       System.out.println("Value of c (b++)=" +c);
       c = --d;
       System.out.println("Value of c (--d)=" +c);
       
       c= e--;
       System.out.println("Value of c (e--)=" +c);
       System.out.println("Value of c (e--)=" +e);
       
       d=--e;
       System.out.println(d);
       
       b=--e;
       System.out.println(b);
       
       a=b;
       System.out.println(a);
       
       System.out.println("Value of ! condition =" +!condition);
   }
            
    
}
