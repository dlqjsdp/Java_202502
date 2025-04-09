package ex01;

public class TVTest {

   public static void main(String[] args) {
      
	   //SaleTV, RentalTV 클래스의 객체를 각각 생성한다.
	   	SaleTV saletv = new SaleTV(300000, "SALETV-1", 40, 1);
        RentalTV rentaltv = new RentalTV(100000, "RENTALTV-10", 42, 1);

      
        //SaleTV 객체는 채널을 두 개 높인다.
        saletv.channelUp(); // 1->2
        saletv.channelUp(); // 2->3

        
        //RentalTV 객체는 채널을 세 개 내린다.
        rentaltv.channelDown(); // 1->0
        rentaltv.channelDown(); // 0->9
        rentaltv.channelDown(); // 9->8

        
        //각 객체에 대하여 printAllTV()을 호출한다.
        printAllTV(saletv);
        printAllTV(rentaltv);
        
        
        //Rentable 타입의 객체인 RentalTV 객체는 printRentalTV() 를 호출한다.
        printRentalTV(rentaltv);  // Rentable 인터페이스 타입으로 전달 가능
    
   }

      

   
   static void printAllTV(TV tv) {
       // 아규먼트로 전달된 객체의 toString() 을 호출하여 각 상품의 정보를 출력한다.
      System.out.println(tv.toString());

       // 아규먼트로 전달된 객체의 play() 를 호출한다.
      tv.play();
       // tv 변수에 전달된 객체가 SaleTV 타입이면 sale() 메서드를 호출한다.
      
//      if (tv instanceof SaleTV) {
//          ((SaleTV) tv).play();
//          ((SaleTV) tv).sale();
//      } else if (tv instanceof RentalTV) {
//          ((RentalTV) tv).play();
//      }
   }
   
   static void printRentalTV(Rentable tv) {
       // 아규먼트로 전달된 Rentable 객체의 rent() 메서드를 호출한다.
      tv.rent();
   } 

}