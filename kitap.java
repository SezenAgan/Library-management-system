public class kitap {
    
    private String ad;// Private neden kullanmistik?Direk olarak class ozelliklerine erisilebilmesin diye kullandik.Araci methodlarla ulasiyoruz, bu durumun adi encapsulasyon. 
    private String yazar;
    private int sayfasayisi;
    private  boolean musait;

// Modifiye edilmis YAPICI method.
public kitap (String ad, String yazar, int sayfasayisi){
    this.ad = ad;
    this.yazar = yazar;
    this.sayfasayisi = sayfasayisi;// yapici methodu kullanma sebebimiz "nesne olusturuyoruz."
    this.musait = true;


 }
  
    //Fonksiyonlar Olusturuyoruz

    // ad icin getter methodu

   public String getad(){
    return ad;

  }
  // Ad icin setter methodu

  public void setad(String isim){
    this.ad = isim;
    System.out.println(" isim " + this.ad + " olarak degistirildi");
  }


  //Yazar icin getter methodu

  public String getyazar(){
    return yazar;

 }
  //Yazar icin setter methodu, neden void kullandik?**Return almiyoruz diye
  public void setyazar(String yazar) {
    this.yazar = yazar;
    System.out.println( "Yazar ismi" + this.yazar + " olarak degistirildi");
    
  }

  //Sayfasayisi icin getter methodu
  public int getsayfasayisi(){
    return sayfasayisi;

  }

  //Sayfasayisi icin setter methodu
  public void setsayfasayisi(int sayi){
    this.sayfasayisi = sayi ;
    System.out.println( "Sayfasayisi" + this.sayfasayisi + " olarak degistirildi");

    
  }
 
  //Musait icin getter methodu
  public boolean getmusait(){
    return musait;

  }

 //Musait icin setter methodu// neden public void kullanildi
  public void setmusait(boolean musait){
    this.musait = musait;
    if(this.musait){
        System.out.println("Kitap musait");
    }else{
       System.out.println("Kitap musait degil!");
    }
    
 }

 
 public void bilgileriYazdir(){
    System.out.println("kitap adi " + ad + " yazar " + yazar +  " sayfasayisi "+ sayfasayisi +  " musait " + musait);
 }

}


