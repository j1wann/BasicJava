package kr.or.ddit.study06.sec02;

public class test {
   public static void main(String [] arge) {
   int arr[];
   int i =0;
   arr = new int[10];
   arr[0]=0;
   arr[i]=1;
      while(i<8) {
         arr[i+2] = arr[i+1] + arr[i];
         System.out.println(arr[i+2]);
         i++;
      }
      System.out.println(arr[9]);
   }
}