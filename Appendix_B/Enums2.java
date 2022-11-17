    public class Enums2 {  
  
 enum Members{JERRY,BOBBY,PHIL};

       public static void main(String[] args) {  


 Members selectedBandMember;
selectedBandMember=Members.BOBBY;

if(selectedBandMember==Members.BOBBY){
   System.out.println("ok");
}
else
   System.out.println("not ok");

 Members2 selectedBandMember2;
selectedBandMember2=Members2.BOBBY;
if(selectedBandMember2==Members2.JERRY2){
   System.out.println("ok");
}
else
   System.out.println("not ok");

   MyEnum selectedBandMember3;
selectedBandMember3=MyEnum.PHIL;
if(selectedBandMember3==MyEnum.PHIL){
   System.out.println("ok");
}
else
   System.out.println("not ok");


Members n=Members.BOBBY;
if (n.equals(Members.JERRY)) System.out.println("Jerrrrry!");
if (n==Members.BOBBY) System.out.println("Rat Dog");


Members ifName=Members.PHIL;

        switch (ifName) {
            case JERRY:
                System.out.print("make it sing ");
            case PHIL:
                System.out.print("go deep ");
            case BOBBY:
                System.out.println("Cassidy! ");
        }
       }  
    }  

     enum Members2{JERRY2,BOBBY,PHIL};
