import java.util.Arrays;

public class MultidimensionalArray {
       public static void main(String[] args) { 
         int[][][] a3d={{{1,2},{3,4},{5,6}},{{7,8},{9,10},{11,12}}};
System.out.println(Arrays.deepToString(a3d));
           int[][][] ar1=a3d;
System.out.println(Arrays.deepToString(ar1));
           int[][] ar2=a3d[1];
System.out.println(Arrays.deepToString(ar2));
           int[] ar3=a3d[0][2];
System.out.println(Arrays.toString(ar3));
         int x=a3d[1][2][1];
System.out.println(x);
       }  

    }


