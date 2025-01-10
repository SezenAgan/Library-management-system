import java.util.ArrayList;

public class uye {
    private String isim;
    private String uyeNumarasi;
    private ArrayList<kitap> oduncAlinanKitaplar;

     // Modifiye edilmis yapici method(burda ilk basya yazmisiz?)***

    public uye (String isim, String uyeNumarasi){
        this.isim = isim;
        this.uyeNumarasi = uyeNumarasi;
        this.oduncAlinanKitaplar = new ArrayList<>();


    }
    public String getisim(){
        return isim;
    
     }
     public String getuyenumarasi(){
        return uyeNumarasi;
        
     }
     public ArrayList<kitap> getoduncAlinanKitaplar(){
        return oduncAlinanKitaplar;
    
     }

     public void kitapOduncAl(kitap nesne){
        oduncAlinanKitaplar.add(nesne);
        System.out.println(nesne.getad() + " Odunc alindi ");

     }
     public void kitapIadeEt(kitap nesne){
        oduncAlinanKitaplar.remove(nesne);
        System.out.println(nesne.getad() + " Iade edildi ");


     }
     public void bilgileriYazdir(){
        System.out.println(" Uye isimi " + isim + " uyeNumarasi " + uyeNumarasi) ;
        System.out.println("Ödünç Alınan Kitaplar:");
        for (kitap kitap : oduncAlinanKitaplar) {
            System.out.println(" - " + kitap.getad());
            System.out.println();
        }
        System.out.println();
        

     }


}
