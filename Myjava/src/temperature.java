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
        
        
  
       double a, c, f;
        System.out.println("請選擇");
        System.out.println("1.C轉F");
        System.out.println("2.F轉C");
       java.util.Scanner sc = new java.util.Scanner(System.in);
       double input = sc.nextDouble();
        
        if (input == 1){
            System.out.print("請輸入攝氏溫度：");
            double inputc = sc.nextDouble();
            f =inputc*9/5+32;
            System.out.printf("華氏溫度為：%.2f",f);
            
        } 
        if(input ==2){
            System.out.print("請輸入華氏溫度：");
            double inputf = sc.nextDouble();
            c=(inputf-32)*5/9;
            System.out.printf("攝氏溫度為：%.2f",c);
        }
        else{
            System.out.println("請輸入數字1或2");
        }
       
    }
}
