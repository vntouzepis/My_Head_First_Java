    public class LinkedInvocations {  
       public static void main(String[] args) {  
        StringBuffer sb=new StringBuffer("spring");
        // sb.delete(3,6).insert(2,"umme").deleteCharAt(1);

         //  System.out.println(sb);  
sb=sb.delete(3,6);
          System.out.println(sb);  
sb=sb.insert(2,"umme");
          System.out.println(sb);  
sb=sb.deleteCharAt(1);
          System.out.println(sb);  

          LinkedInvocations myLinkedInvocations=new LinkedInvocations();
          myLinkedInvocations.go();
          new LinkedInvocations().go();
          Car myCar=new Car();
          myCar.start();
          new Car().start();
              Bike myBike=new Bike();
          myBike.start();
                    new Bike().start();

       }  


       void go(){
System.out.println(1+3);
       }
    }  


    class Car{

      void start(){
        System.out.println("Car started");
 
      }
    }