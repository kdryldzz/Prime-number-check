

package com.mycompany.miniprojeasalsayi;

import java.util.Scanner;
public class MiniProjeAsalSayi {


public static void main(String[] args) {
 String s = "";
    int number = 0;
  int counter=0;
        System.out.println("LÜTFEN SORGULAMAK İSTEDİĞİNİZ SAYIYI GİRİNİZ");
Scanner scan = new Scanner(System.in); 
number = scan.nextInt();        
     
if(number<=0){
    System.out.println("Geçersiz sayı girdiniz");
}else if(number == 0 ){
      System.out.println("0 bir ASAL sayı değildir");
    }else if (number == 2){
      System.out.println("2 bir ASAL sayıdır");
  }else if(number == 1){
      System.out.println("1 bir ASAL sayı değildir");
  }else{
      int [] number1 = new int[number-1];
      for ( int a = 0; a<number-2;a++){
          number1 [a] = a+2;
          
      }
      
      for(int i = 0; i<number1.length-1;i++ ){
          if(number%number1[i]==0){
              counter++;  
          s =  s.concat(number1[i]+",");
          }
          
      }
      if(counter>=1){
          s= s.substring(0,s.length()-1);
          
          System.out.println(number + " bir ASAL sayı değildir"+", bölünebildiği sayılar("+s+")");
      
      }else {
              
              System.out.println(number + " bir ASAL sayıdır");
          }  
  
  
    }
}}
