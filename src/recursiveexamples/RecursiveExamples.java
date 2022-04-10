
package recursiveexamples;

import java.util.Scanner;


public class RecursiveExamples {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("N sayısı giriniz");
        int n = s.nextInt();
        
        System.out.println("X değeri giriniz");
        int x = s.nextInt();
        
        System.out.println("Y değeri giriniz");
        int y = s.nextInt();
        
        
        System.out.println( "While ile 1 den n'e kadar toplam : " + ToplamBul1(n));
        System.out.println("Recursive fonksiyon ile 1 den n'e kadar toplam : " + ToplamBul2(n));
        System.out.println("----------------------------");
        System.out.println("While ile faktoriyel n faktoriyel : " + FaktoriyelBul1(n));
        System.out.println("Recursive fonksiyon ile n in faktoriyel hesabı : " + FaktoriyelBul2(n));
        System.out.println("----------------------------");
        System.out.println("While ile fibonacci n. sayı : " + FibonacciBul1(n));
        System.out.println("Recursive fonksiyon ile fibonacci n.sayı : " + FibonacciBul2(n));
        System.out.println("-----------------------------");
        System.out.println("While döngüsü ile x üzeri y : "  + UstAl1(x,y));
        System.out.println("Recursive fonksiyon ile x üzeri y : "  + UstAl2(x,y));
        
    }
    
    
    public static int ToplamBul1(int n){
        int sonuc = 0;
        int i = 1;
        while(i<=n){
            sonuc = sonuc+i;
            i++;
        }
        return sonuc;
    }
    
    public static int ToplamBul2(int n){
        if (n==1) {
            return 1;
        }
        else {
            return n+ToplamBul2(n-1);
        }
            
    }
    
    public static int FaktoriyelBul1(int n){
        int fakto = 1;
        int i = 1;
        while(i<=n){
            fakto *= i;
            i++;
        }
        return fakto;
    }
    
    public static int FaktoriyelBul2(int n){
        if(n == 1 || n== 0){
            return 1;
        }
        else {
            return n*FaktoriyelBul2(n-1);
        }
    }
    
    public static int FibonacciBul1(int n){
       
        int sonuc = 1;
        
        if (n == 1 || n==2) {
            return sonuc;
        }
        else{
             int sayi1= 1;
        int sayi2 = 1;
        int i = 3;
        while(i<=n){
            sonuc = sayi1+sayi2;
            sayi1=sayi2;
            sayi2=sonuc;
            i++;
        }
        
        }
        return sonuc;
    }
    
    public static int FibonacciBul2(int n){
        if(n==1 || n==2){
            return 1;
        }
        else{
            return FibonacciBul2(n-1)+FibonacciBul2(n-2);
        }
    }
    
    
    public static int UstAl1(int x,int y){
        int i = 1;
        int sonuc = 1;
       while(i<=y){
           sonuc = sonuc*x;
           i++;
       }
        return sonuc;
    }
    
    public static int UstAl2(int x,int y){
        if(y == 0){
            return 1;
        }
        else {
            return x*UstAl2(x,y-1);
        }
    }
    
}
    
    
    

 