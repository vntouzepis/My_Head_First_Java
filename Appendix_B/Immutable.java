public class Immutable {


public static void main (String[] args){

// String s="0";
//     System.out.println(s);

// for (int x=1;x<10;x++){
//     s=s+x;
//     System.out.println(s);

// }
//     System.out.println(s);
String str = "knowledge";
String s1 = str;     
  str = str.concat(" base");
      System.out.println(str);
            System.out.println(s1);

String str1 = new String ("knowledge");
String s11 = str1;     
  str1 = str1.concat(" base");
      System.out.println(str1);
            System.out.println(s11);

String m1 = new String ("knowledge");
String m2 = m1;     
  m1 = m1+1;
      System.out.println(m1);
            System.out.println(m2);

    //   Integer i1=1;
    //         System.out.println(i1);

    //   Integer i2=i1;
    //         System.out.println(i2);
    //         i2=1+i1;
    //         System.out.println(i1);
    //         System.out.println(i2);


    //   Integer j1=new Integer (1);
    //         System.out.println(j1);

    //   Integer j2=j1;
    //         System.out.println(j2);
    //         j2=1+j1;
    //         System.out.println(j1);
    //         System.out.println(j2);


//       String h1 = "java";
//         h1.concat(" rules");
 
//         // Yes, s1 still refers to "java"
//         System.out.println("h1 refers to " + h1);

//                 System.out.println(h1.concat(" rules"));
//         System.out.println("h1 refers to " + h1);

//         h1=h1.concat(" rules");
//    System.out.println("h1 refers to " + h1);

//                 System.out.println(h1.concat(" rules"));
//         System.out.println("h1 refers to " + h1);

}

}    
