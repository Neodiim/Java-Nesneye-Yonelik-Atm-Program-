
package nesneye;


public class Hesap {
    private String kullanici_girisi;
    private String parola;
    private int Bakiye;
    
    public void Paracekme(int miktar)
    {
      if(miktar>Bakiye)
      {
          System.out.println("Bakiye yetersiz");
          
      }
      else
      {
          Bakiye-=miktar;
          System.out.println("Bakiyeniz = " + Bakiye);
      }
                 
    }
    
    public void Parayatirma(int miktar)
    {
        Bakiye+=miktar;
        System.out.println("Bakiyeniz = " + Bakiye);
    }
    

    public Hesap(String kullanici_girisi, String parola, int Bakiye) {
        this.kullanici_girisi = kullanici_girisi;
        this.parola = parola;
        this.Bakiye = Bakiye;
    }

    
    public String getKullanici_girisi() {
        return kullanici_girisi;
    }

    
    public void setKullanici_girisi(String kullanici_girisi) {
        this.kullanici_girisi = kullanici_girisi;
    }

    
    public String getParola() {
        return parola;
    }

   
    public void setParola(String parola) {
        this.parola = parola;
    }

    
    public int getBakiye() {
        return Bakiye;
    }

    
    public void setBakiye(int Bakiye) {
        this.Bakiye = Bakiye;
    }
    
    
}
