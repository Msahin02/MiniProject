package biletRezervasyonApp;
public class Ticket {

    //4-mesafe(km),koltuk no,fiyat,yolculuk tipi

    public double distance;
    public int typeNo;
    public String seatNo;
    private double price;
     public  void getTotalPrice(int age){
         double total =0;
         int seat=Integer.parseInt(this.seatNo);

         switch (this.typeNo){
             case 1:
                 if (seat%3==0){
                     total=this.distance*1.2;
                 }else {
                     total=this.distance*1;
                 }

                 System.out.println("Toplam tutar :   "+total);
                 break;
             case 2:
                 if (seat%3==0){
                     total=this.distance*2.4;

                 }else {
                     total=this.distance*2;
                 }
                 System.out.println("Toplam tutar :   "+total);
                 total=total*0.8;
                 System.out.println("Çift yön indirimli Toplam tutar :   "+total);

                 break;



         }

          if (age<12){
              total=total*0.5;
              System.out.println("12 yaş altı indirimli Toplam tutar :   "+total);

          }else if (age>65){
              total=total*0.7;
              System.out.println("65 yaş üstü indirimli  Toplam tutar :   "+total);
          }
          this.price=total;



     }



    public Ticket(){

    }




}



