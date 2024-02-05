package com.ohgiraffers.level1010.basic;

public class Application01 {

    public static void main(String[] args) {


        int inum1=20;
        int inmu2=30;

        System.out.println("더하기 결과 :" + (inum1+inmu2) );
        System.out.println("빼기 결과 :" + (inum1-inmu2));
        System.out.println("곱하기 결과 :" + (inum1*inmu2));
        System.out.println("나누기 결과 :" + (inum1/inmu2));
        System.out.println("나누고 나머지 결과 :" + (inum1%inmu2));

        System.out.println("=====================================================================");

        double meter =12.5;
        double height =36.4;

        System.out.println("면적 :" + (meter*height));
        System.out.println("둘레 : " + (2*meter + 2*height));

        System.out.println("===========================================================================");

        char ch1 ='a';


        System.out.println("문자 a의 unicode : " + (int)ch1);

        System.out.println("=============================================================================");

        double language = 80.5;
        double math = 50.6;
        double eng = 70.8;

        System.out.println("총점 : " + (int)(language+math+eng)   );
        System.out.println("평균 : "+ (int)((language+math+eng)/3));

        System.out.println("=======================================================================");

        /*Application01
        **/

        int x= 2;
        int y = 5;
        char c = 'A';
        System.out.println(y >= 5|| x<0 && x >2);
        System.out.println(y+=10 - x++);
        System.out.println(x+=2);
        System.out.println(!('A'<=c && c <='Z'));
        System.out.println('C'-c);
        System.out.println('5'-'0');       //문자 5가 출력된것이다 숫자 5가 아니다
        System.out.println(c+1);        //자동 형변환에 의해서 정수가 된다 (char +int->int) 그래서 숫자가 출력된다
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

        System.out.println("===============================================================================");

        int numOfApples = 92;
        int sideOfBucket = 10;

        int numOfBucket = (numOfApples%sideOfBucket > 0)? numOfApples/sideOfBucket+1 : numOfApples/sideOfBucket;

        System.out.println("필요한 바구니의 수 : " + numOfBucket);

        System.out.println("======================================================================================");

        int num = 456;

        System.out.println(num/100*100);

        int num1 =333;

        int res = (num1%10 == 1)? num1:num1-num1%10+1;
        int res2 = num1/10*10+1;

        System.out.println("res2 = " + res2);
        System.out.println("res = " + res);




































    }
}
