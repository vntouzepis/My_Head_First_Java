    public class Enums {  
      public static final int JERRY=1;
      public static final int BOBBY=2;
      public static final int PHIL=3;

private final static int MONDAY = 1;
    private final static int TUESDAY = 2;
    private final static int WEDNESDAY = 3;
    private final static int THURSDAY = 4;
    private final static int FRIDAY = 5;
    private final static int SATURDAY = 6;
    private final static int SUNDAY = 7;

       public static void main(String[] args) {  


int selectedBandMember=1;
selectedBandMember=12;
if(selectedBandMember==JERRY){
   System.out.println("ok");
}
else
   System.out.println("not ok");

int day = MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case TUESDAY:
                System.out.println("Tuesdays are still bad");
                break;
            case WEDNESDAY:
                System.out.println("Wednesdays are so-so");
                break;
        }
       }  
    }  