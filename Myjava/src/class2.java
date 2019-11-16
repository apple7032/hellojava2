/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apple7032
 */
public class class2 {
    public static void main(String [] args){
        int a =1;
        float c , b=2;
        c=a+b;
         System.out.println("c="+c);
        c=a-b;
         System.out.println("c="+c);
        c=a*b;
         System.out.println("c="+c);
        c=a/b;
         System.out.println("c="+c);
        c=a%b;
         System.out.println("c="+c);
         
         
         int e =1;
         float f=3.14f;
         System.out.println(e*f); //int flaot 運算結果是double//
         
         
         float g= 100000000000000000000000000000000000000.33333333333333333333333f;
         long h=200000000;
         System.out.println(g*f); //long flaot 運算結果是32位元 double//
         
         double t =10;
         float u= 3.0f;
         System.out.println(t/u);
         
         long z=1;
         long v=222222;
         
         System.out.println(z*v);
         
         double x = 1/2.0; //double x =1/2 會是0.0;double x =(double)1/2,double x =1/2f;//
         System.out.println(x);
         
         int i =10;
         i = i+1;
         System.out.println(i);
         i -=2;
         System.out.println(i);
         
         int ta =1;  //++a & a++ 的不同//
         int tb =ta++;
         System.out.println("a++="+tb);
         ta=1;
         tb =++ta;
         System.out.println("++a="+tb);
         
         
         
    }
}
