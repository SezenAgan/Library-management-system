import java.util.ArrayList;

public class kutuphane {
    // kutuphane ile basladik December 16th


   private ArrayList<kitap> Kitaplar;
   private ArrayList<uye>  Uyeler;
   private String kutuphaneIsmi;

// Modifye edilmis yapici method

   public kutuphane(String isim){
      this.kutuphaneIsmi = isim;
      Kitaplar = new ArrayList<>();
      Uyeler = new ArrayList<>();


   }
   public void kitapEkle(kitap nesne){
      Kitaplar.add(nesne);
      System.out.println(" Kitap basari ile  " + this.kutuphaneIsmi  + " eklendi " + nesne.getad());

   }
   public void uyeEkle(uye nesne){
      Uyeler.add(nesne);
      System.out.println(nesne.getisim() + " isimli uye " + this.kutuphaneIsmi + " 'ne eklendi ");



   }
   public void KitapOduncVer(String  kitapAdi, String uyeNumarasi){
      kitap secilenKitap = null; 
      for(kitap kitap : Kitaplar){

         if(kitap.getad().equalsIgnoreCase(kitapAdi) && kitap.getmusait()){
           secilenKitap = kitap;
           break;

         }
      }

      if(secilenKitap == null){
         System.out.println("Kitap musait degil!");
         return;// kitap bulunamadigi icin fonksiyonu bitiriyoruz.

     }
     for(uye uye :Uyeler){
      if(uye.getuyenumarasi().equals(uyeNumarasi)){
         uye.kitapOduncAl(secilenKitap);
         secilenKitap.setmusait(false);
         System.out.println(kitapAdi + " " + uye.getisim() + " adli uyeye odunc verildi");
         return;




      }





     }
     System.out.println("Uye bulunamadi");

   }
  public void kitaplariListele(){
   System.out.println("Kutuphanedeki kitaplar");
   for (kitap k: Kitaplar) {
      k.bilgileriYazdir();
      
   }
  }
  public void uyeleriListele(){
   System.out.println("Uyeleri listele");
   for (uye u: Uyeler) {
      u.bilgileriYazdir();
      
   }

  }

  public void kitapIadeEt(String KitapAdi, String uyeNumarasi){
   uye secilenUye = null ;
   for (uye u : Uyeler) {
      if(u.getuyenumarasi().equals(uyeNumarasi)){
         secilenUye = u ;
         break;


      }
      
   }
   if(secilenUye == null){
      System.out.println("Uye bulunamadi");
      return;

   }
   kitap secilenKitap = null ;
   for (kitap k  : secilenUye.getoduncAlinanKitaplar()) {
      if(k.getad().equalsIgnoreCase(KitapAdi)){
         secilenKitap =  k;
         break;
      
      }
      
      
   }
   if(secilenKitap == null){
      System.out.println("Kitap bulunamadi");
      return;
   }
   secilenKitap.setmusait(true);
   secilenUye.kitapIadeEt(secilenKitap);
   System.out.println(KitapAdi + " adli kitap " + secilenUye.getisim() + " adli uyeden iade edildi.");

   
  }


   // accsess modifier : public, protected, private
   // Odev1: Uye ekle fonksiyonu yaz.   
  // Odev2: Uyeleri ve kitaplari kutuphaneye ekle.

    
}
    

