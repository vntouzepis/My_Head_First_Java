import java.io.*;

public class Test2 {


    public static void main(String[] args){

        File f=new File("MyCode.txt");
        // try{
        // f.createNewFile();
        // }
        // catch(Exception ex){}
        File dir=new File("Chapter7");
        dir.mkdir();

if (dir.isDirectory()){
    String[] dirContents=dir.list();
    for(int i=0;i<dirContents.length;i++){
System.out.println(dirContents[i]);
    }
}
else
System.out.println("it is a file");
System.out.println(dir.getAbsolutePath());
boolean isDeleted=false;
System.out.println(isDeleted);
isDeleted=f.delete();
System.out.println(isDeleted);

        
// try{
// FileWriter writer=new FileWriter("Foo.txt");
// writer.write("hello foo!");
// writer.close();
// }
// catch(IOException ex){
//     ex.printStackTrace();
// }

    }
}