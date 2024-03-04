package kr.or.ddit.study05;

import java.util.Scanner;

public class ifExample {
   Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      ifExample obj = new ifExample();
//      obj.method1();
//      obj.method2();
//      obj.method3();
//      obj.method4();
//      obj.method5();
      obj.method6();
   }

   public void method6() {
      /*
       * 0~2 - 3~6 0 7~9 +
       */
      System.out.println("학점을 입력하세요 : ");
      String school = "";
      int score1 = sc.nextInt();
      if (score1 == 100) {
         school = "A+";
      }
      if (score1 >= 90) {
         if (score1 <= 92) {
            school = "A-학점";
         } else if (score1 <= 96) {
            school = "A0학점";
         } else {
            school = "A+학점";
         }
      } else if (score1 >= 80) {
         if (score1 <= 82) {
            school = "B-학점";
         } else if (score1 <= 86) {
            school = "B0학점";
         } else {
            school = "B+학점";
         }
      } else if (score1 >= 70) {
         if (score1 <= 72) {
            school = "C-학점";
         } else if (score1 <= 76) {
            school = "C0학점";
         } else {
            school = "C+학점";
         }
      } else if (score1 >= 60) {
         if (score1 <= 62) {
            school = "D-학점";
         } else if (score1 <= 66) {
            school = "D0학점";
         } else {
            school = "D+학점";
         }
      } else {
//         다른 방법으로 이런식으로 나타낼수 잇음
//         if(score1 %10>=0 && score1<=2) {
//            school = "F-학점";
//         }
//         else if(score1%10>=3 && score1<=6) {
//            school = "F0학점";
//         }
//         if(score1%10>=7 && score1<=9) {
//            school = "F+학점";
         school = "F학점";
      }
      System.out.println(score1 + "는 " + school + "입니다.");
   }

   public void method5() {
      /*
       * 점수를 입력받고 학점을 출력하시오 90이상 a, 80이상 B, 70이상 c, 60이상 D, 60미만 F학점
       */

      System.out.println("학점을 입력하세요 : ");
      String score = "";
      int a = sc.nextInt();
      if (a >= 90) {
         score = "A학점";
      } else if (a >= 80) {
         score = "B학점";
      } else if (a >= 70) {
//      if(a >= 70 && a < 80) {
         score = "C학점";
      } else if (a >= 60) {
//      if(a >= 60 && a < 70) {
         score = "D학점";
      } else {
//      if(a < 60) {
         score = "F학점";
      }
      System.out.println(a + "는 " + score + "입니다.");

   }

   public void method4() {
      /*
       * 달을 입력받아서 봄, 여름, 가을, 겨울을 출력 겨울 12~2 봄 3~5 여름 6~8 가을 9~11
       */

      System.out.println("달을 입력하세요 : ");
      String season = "";
      int month = sc.nextInt();
      if (month == 12 || month == 1 || month == 2) {
         season = "겨율";
      }
      if (month >= 3 && month <= 5) {
         season = "봄";
      }
      if (month == 6 || month == 7 || month == 8) {
         season = "여름";
      }
      if (month == 9 || month == 10 || month == 11) {
         season = "가을";
      }
      System.out.println(month + "는 " + season + "입니다");
   }

//   public void method3 () {
//      /*
//       * 점수를 입력받아서 60점 이상이면 합격
//       * 
//       */
//      System.out.println("점수를 입력하세요 : ");
//      int num = sc.nextInt();
//      
//      if(num >= 60) {
//         System.out.println("합격");
//      } else {
//         System.out.println("불합격");
//      }
//   }

   public void method3() {

      String message;
      System.out.println("점수를 입력하세요 : ");
      int num = sc.nextInt();

      if (num >= 60) {
         message = "합격";
      } else {
         message = "불합격";
      }
      System.out.println(num + "점수는 " + message + "입니다.");
   }

   public void method2() {
      /*
       * if (조건식){ 조건식이 참일때 실행 } else{ 조건식이 거짓일때 실행됨 }
       */
      System.out.println("1");
      if (false) {
         System.out.println("참");
      } else {
         System.out.println("거짓");
      }
      System.out.println("2");

   }

   public void method1() {
      /*
       * if (조건식) 조건식이 참일때 실행
       */
      System.out.println("1");
      if (false) {
         System.out.println("실행됨");
      }
      System.out.println("2");

   }

}