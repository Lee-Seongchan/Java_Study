public class Main {
    public static void main(String[] args) {

        //** 주석 : 컴퓨터가 인식하지 못하는 영역

        /*
         * 주석 : 여러줄의 영역을 인식하지 못하게 해야할 경우에 사용
         *
         */

        System.out.println("Hello world!");
        System.out.println("홍길동");

        System.out.println("20220922");
        System.out.println("push 깃에 올리는 것");
        System.out.println("pull 깃에 다운 받는 것");

        System.out.println("수정사항");

        System.out.println("----- 20220923 ----");

        // ** 변수 : 값이 언제든지 변경 가능한 수.
        // ** 상수 : 값의 변경이 불가능한 수.

        // ** lvalue = rvalue
        //변수를 = lvalue(엘밸류) 상수를 = rvalue(알밸류) 라고 한다.

        // ** 변수 선언
        int number;

        //** 변수 초기화
        number = 10;

        // ** 변수 선언 및 초기화
        int num = 100;

        // ** 출력
        System.out.println(number);
        System.out.println(num);

        // ** 값 변경
        number = 20;
        num = 200;

        // ** 출력
        System.out.println(number);
        System.out.println(num);

        //=======================================================
        //  [자 료 형]
        // =====================================================

        /*
        * 자료형의 종류
        * [정수형 data type]

        * 문자를 표현할 때 사용
        * char : 2byte

        * 숫자를 표현할 때 사용
        * byte : 1byte
        * short : 2byte
        * int  : 4byte
        * long  : 8byte

        * [실수형 data type]
        * float : 4byte
        * double  : 8 byte

        * [논리형 data type]
        * boolean : 1byte
        */



    }
}