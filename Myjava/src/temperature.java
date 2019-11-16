/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apple7032
 */
public class temperature {
    public static void main(String [] args){
        
        float c =23f, f;
        
        System.out.print("請輸入攝氏溫度：");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double inputc = sc.nextDouble();
        
        f =c*9/5+32;
        System.out.println("華氏溫度為："+f);
        
        c=(f-32)*5/9;
        System.out.println(c);
        
        

    }
}
