
package nesneye;


public class Nesneye {

    public static void main(String[] args) {
    Atm atm1=new Atm();
    Hesap hesap=new Hesap("Murat Boyar", "12345", 1500);
    
       atm1.calis(hesap);
        System.out.println("Programdan Cikiliyor...");
   
    
}
 
}
