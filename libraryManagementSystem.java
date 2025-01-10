



 // Diger ikisi sadece class , libraray neden public class?*** library ayni dosyada oldugu icin kitap ve uyeyi gorebiliyor.. Bilgisayarimiz (public oldugu icin)library class i gorebiliyor.


public class libraryManagementSystem{

    public static void main(String[] args) { // burdaki amac ne idi? Neden mainde nesne olusturduk.
      // Nesneleri olusturdugumuz yer.Tanimladigimiz class ve fonksiyonlari kullandigimiz yer.Main, programlarimizin baslatildigi yer.
       // System.out.println("Merhaba Dunya");
       

      kitap kitap1 = new kitap("Savas ve Baris" , "Tolstoy", 200);
      kitap1.bilgileriYazdir();

      kitap kitap2 = new kitap("1984", "Mert" ,1225);
      kitap2.bilgileriYazdir();

      kitap kitap3 =new kitap("Gor Beni", "Azra Kohen" ,155);
      kitap3.bilgileriYazdir();

      kitap kitap4 = new kitap("Serenad", "Livaneli", 500) ;
      kitap4.bilgileriYazdir();

      kitap kitap5 = new kitap("The Longevity Book", "Camiran Diaz", 300);
      kitap5.bilgileriYazdir();

      kitap kitap6 = new kitap("Kucuk Prens ", "Antonie", 700);
      kitap6.bilgileriYazdir();

      kitap kitap7 = new kitap("Ask", "Elif Safak", 800);
      kitap7.bilgileriYazdir();

      kitap kitap8 = new kitap("Milena'ya Mektuplar", "Franz Kafka", 200);
      kitap8.bilgileriYazdir();

      kitap kitap9 =new kitap("Simyaci","Paulo Coelho" , 330);
      kitap9.bilgileriYazdir();

      kitap kitap10 = new kitap("Tutunamayanlar", "Oguz Atay", 724);
      kitap10.bilgileriYazdir();

      kitap kitap11 = new kitap("Kar", "Orhan Pamuk", 900);
      kitap11.bilgileriYazdir();

      kitap kitap12 = new kitap("Harry Potter The Chamber of Secret", "J.K.Rowling", 342);
      kitap12.bilgileriYazdir();

      kitap kitap13 = new kitap("Yasamak Cesaret Ister", "Yilmaz Ozdil", 500);
      kitap13.bilgileriYazdir();
      
      kitap kitap14 = new kitap("Yirtici Kuslar Zamani", "Ahmet Umit", 200);
      kitap14.bilgileriYazdir();

      kitap kitap15 = new kitap("Gece Yarisi Kutuphanesi", "Matt Haig", 296);
      kitap15.bilgileriYazdir();

      //Daha fazla kitap ekle ve bu kitaplari uyelere dagit???****
     // Yazar isim sayfasayi dedistir//

      kitap1.setad("Seyir");
       String text = kitap1.getad();// getad String return yapiyor.
       System.out.println(text);
       kitap1.bilgileriYazdir();

       kitap1.setsayfasayisi(350);
       kitap1.bilgileriYazdir();
       kitap1.setyazar("Piraye");
       System.out.println(kitap1.getyazar());

       kitap4.setyazar("Jose Mauro");
       kitap4.bilgileriYazdir();
       System.out.println(kitap4.getyazar());
       kitap4.setsayfasayisi(1000);
       System.out.println(kitap4.getsayfasayisi());

       kitap5.setyazar(" DR. Melda");
       System.out.println(kitap5.getyazar());

       kitap7.setsayfasayisi(480);
       System.out.println(kitap7.getsayfasayisi());

       kitap8.setsayfasayisi(240);
       System.out.println(kitap8.getsayfasayisi());
       kitap8.setyazar("Paulo Coelho");
       System.out.println(kitap8.getyazar());

       kitap9.setyazar("George Orwell");
       System.out.println(kitap9.getyazar());
       kitap9.setsayfasayisi(555);
       System.out.println(kitap9.getsayfasayisi());

       kitap10.setyazar("Orhan Pamuk");
       System.out.println(kitap10.getyazar());
       kitap10.setsayfasayisi(824);
       System.out.println(kitap10.getsayfasayisi());


      //Uye Olusturma!!**
      uye uye1 = new uye("Mert", "U001");
       uye1.bilgileriYazdir();
       //uye1.kitapOduncAl(kitap1);
       uye1.bilgileriYazdir();

       uye uye2 = new uye("Sezen","U002");
       uye2.bilgileriYazdir();
       //uye2.kitapOduncAl(kitap2);
       uye2.bilgileriYazdir();
      // uye1.kitapIadeEt(kitap1);// yapamadim neden?
       uye1.bilgileriYazdir();
       //uye2.kitapOduncAl(kitap1);
       uye2.bilgileriYazdir();

       uye uye3 = new uye("Talya", "U003");
       uye3.bilgileriYazdir();
       //uye3.kitapOduncAl(kitap3);
       uye3.bilgileriYazdir();

       uye uye4 = new uye("Raya", "U004");
       uye4.bilgileriYazdir();
       //uye4.kitapOduncAl(kitap4);
       uye4.bilgileriYazdir();

       uye uye5 = new uye("Ceren", "U005");
       uye5.bilgileriYazdir();
       //uye5.kitapOduncAl(kitap3);
       uye5.bilgileriYazdir();

       uye uye6 = new uye("Zoe", "U006");
       uye6.bilgileriYazdir();

       uye uye7 = new uye("Cuneyt", "U007");
       uye7.bilgileriYazdir();
       //uye7.kitapOduncAl(kitap7);
       uye7.bilgileriYazdir();

       uye uye8 = new uye("Selma", "U008");
       uye8.bilgileriYazdir();
       //uye8.kitapOduncAl(kitap8);
       uye8.bilgileriYazdir();

       uye uye9 = new uye("Merve", "U009");
       uye9.bilgileriYazdir();
       //uye9.kitapOduncAl(kitap9);
       uye9.bilgileriYazdir();

       uye uye10 = new uye("Ozlem", "U0010");
       uye10.bilgileriYazdir();
       //uye10.kitapOduncAl(kitap10);
       uye10.bilgileriYazdir();
       //uye10.kitapIadeEt(kitap10);
       uye10.bilgileriYazdir();

       uye uye11 = new uye("Alya", "U0011");
       uye11.bilgileriYazdir();
       //uye11.kitapOduncAl(kitap11);
       uye11.bilgileriYazdir();
       //uye11.kitapIadeEt(kitap11);
       uye11.bilgileriYazdir();

       uye uye12 = new uye("Melis", "U0012");
       uye12.bilgileriYazdir();
       //uye12.kitapOduncAl(kitap12);
       uye12.bilgileriYazdir();
       //uye12.kitapIadeEt(kitap12);
       uye12.bilgileriYazdir();

       uye uye13 = new uye("Ibrahim", "U0013");
       uye13.bilgileriYazdir();

       uye uye14 = new uye("Alara", "U0014");
       uye14.bilgileriYazdir();

       uye uye15 = new uye("Asya" , "U0015");
       uye15.bilgileriYazdir();


       kutuphane kutuphane1 = new kutuphane("Halk Kutuphanesi");
      
     // olusturdugun kitap ve uyeleri kutuphaneye ekle,
     // kitaplari uyelere odunc ver.

       //kutuphaneye uye ekliyoruz!
       kutuphane1.uyeEkle(uye1);
       kutuphane1.kitapEkle(kitap1);
       kutuphane1.uyeEkle(uye2);
       kutuphane1.kitapEkle(kitap2);
       kutuphane1.uyeEkle(uye3);
       kutuphane1.kitapEkle(kitap3);
       kutuphane1.uyeEkle(uye4);
       kutuphane1.kitapEkle(kitap4);
       kutuphane1.uyeEkle(uye5);
       kutuphane1.kitapEkle(kitap5);
       kutuphane1.uyeEkle(uye6);
       kutuphane1.kitapEkle(kitap6);
       kutuphane1.uyeEkle(uye7);
       kutuphane1.kitapEkle(kitap6);
       kutuphane1.uyeEkle(uye8);
       kutuphane1.kitapEkle(kitap8);
       kutuphane1.uyeEkle(uye9);
       kutuphane1.kitapEkle(kitap9);
       kutuphane1.uyeEkle(uye10);
       kutuphane1.kitapEkle(kitap10);
       kutuphane1.uyeEkle(uye11);
       kutuphane1.kitapEkle(kitap11);
       kutuphane1.uyeEkle(uye12);
       kutuphane1.kitapEkle(kitap12);
       kutuphane1.uyeEkle(uye13);
       kutuphane1.kitapEkle(kitap13);
       kutuphane1.uyeEkle(uye14);
       kutuphane1.kitapEkle(kitap14);
       kutuphane1.uyeEkle(uye15);
       kutuphane1.kitapEkle(kitap15);


       System.out.println();
       
       
       kutuphane1.KitapOduncVer("Savas ve Baris", "U001");
       kutuphane1.KitapOduncVer("1984", "U002");
       kutuphane1.KitapOduncVer("Gor Beni", "U003");
       kutuphane1.KitapOduncVer("Serenad","U004");
       kutuphane1.KitapOduncVer("Longevity Book", "U005");
       kutuphane1.KitapOduncVer("Kucuk Prens", "U006");
       kutuphane1.KitapOduncVer("Ask", "U007");
       kutuphane1.KitapOduncVer("Milena'ya Mektuplar", "U008");
       kutuphane1.KitapOduncVer("Simyaci", "U009");
       kutuphane1.KitapOduncVer("Tutunamayanlar", "U0010");
       kutuphane1.KitapOduncVer("Kar", "U0011");
       kutuphane1.KitapOduncVer("Harry Potter The Chamber of Secret", "U0012");
       kutuphane1.KitapOduncVer("Yasamak Cesaret Ister", "U0013");
       kutuphane1.KitapOduncVer("Yirtici Kuslar Zamani", "U0014");
       kutuphane1.KitapOduncVer("Gece Yarisi Kutuphanesi", "U0015");

       System.out.println();

       kutuphane1.kitapIadeEt("Savas ve Baris", "U001");
       kutuphane1.kitapIadeEt("1984", "U002");
       kutuphane1.kitapIadeEt("Gor Beni", "U003");
       kutuphane1.kitapIadeEt("Serenad", "U004");
       kutuphane1.kitapIadeEt("Longevity Book", "U005");
       kutuphane1.kitapIadeEt("Kucuk Prens", "U006");
       kutuphane1.kitapIadeEt("Ask", "U007");
       kutuphane1.kitapIadeEt("Milena'ya Mektuplar", "U008");
       kutuphane1.kitapIadeEt("Simyaci", "U009");
       kutuphane1.kitapIadeEt("Tutunamayanlar", "U0010");
       kutuphane1.kitapIadeEt("Kar", "U0011");
       kutuphane1.kitapIadeEt("Harry Potter The Chamber of Secret", "U0012");
       kutuphane1.kitapIadeEt("Yasamak Cesaret Ister", "U0013");
       kutuphane1.kitapIadeEt("Yirtici Kuslar Zamani", "U0014");
       kutuphane1.kitapIadeEt("Gece Yarisi Kutuphanesi", "U0015");


       System.out.println();
       kutuphane1.kitaplariListele();
       System.out.println();
       kutuphane1.uyeleriListele();
       System.out.println();







    }
   
    




}

