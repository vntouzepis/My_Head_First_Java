import java.util.* ;


public class TestMap{



public static void main (String[] args){
HashMap<String,Integer> scores=new HashMap<String,Integer>();
// HashMap scores=new HashMap();

scores.put("Kathy", 42);
scores.put("Bert", 343);
scores.put("Skyler", 420);
// scores.put(10, "420");
// scores.put(10, "j");

System.out.println(scores);
System.out.println(scores.get("Bert"));
// System.out.println(scores.get(10));
// System.out.println(scores.get(343));

}


}