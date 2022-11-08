/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Hafta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1 ile 7 Arasında Bir Sayı Giriniz(1 ile 7 Dahil): ");
        int sayi = input.nextInt();
        
        
        if(sayi == 1){
        System.out.println("Haftanın Birinci Günü PAZARTESİ.");
        }
        else if(sayi == 2){
         System.out.println("Haftanın İkinci Günü SALI.");
        }
        else if(sayi == 3){
         System.out.println("Haftanın Üçüncü Günü ÇARŞAMBA.");
        }
        else if(sayi == 4){
         System.out.println("Haftanın Dördüncü Günü PERŞEMBE.");
        }
        else if(sayi == 5){
         System.out.println("Haftanın Beşinci Günü CUMA.");
        }
        else if(sayi == 6){
         System.out.println("Haftanın Altıncı Günü CUMARTESİ.");
        }
        else if(sayi == 7){
         System.out.println("Haftanın Yedinci Günü PAZAR.");
        }
        else{
         System.out.println("Lütfen Yukarıda İstenildiği Gibi Bir Sayı Giriniz.");
        }
        
        
        
        
        
        
        
    }
    
}
