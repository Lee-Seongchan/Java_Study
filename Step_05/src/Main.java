import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //=======================================
        //  [형변환]
        // 묵시적 : 자동 형변환
        // 명시적 : 강제 형변환
        //=======================================

        //1. 묵시적 형변환
        {
            int i = 10;
            long l = i;

            System.out.println("i =" + i);
            System.out.println("l =" + l);
        }
        System.out.println();

        //2. 명시적 형변환
        {
            double d = 3.141592d;
            int i = (int)d;

            System.out.println("d = " + d);
            System.out.println("i = " + i);
        }
        System.out.println();


        //=======================================
        //  [연산자]
        //=======================================
        {
            // ** 산술 연산자
            // [+], [-], [*], [/], [%]

            // ** 대입 연산자
            // [=]
            int a = 4 + 3;
            int b = 4 - 3;
            int c = 4 * 3;
            int d = 4 / 3;
            int e = 4 % 3;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("e = " + e);
            // 대입 연산자는 가장 후순위 연산자.
            
            // **산술 & 대입 연산자의 결합 사용
            // * 산술 결합
            // [+=], [-=], [*=], [/=], [%=]
            // * 비트연산자 결합
            // [&=], [|=], [^=], [<<=], [>>=], [>>>=]
        }
        System.out.println();
        {
            // ** 증감연산자(단항 연산자)
            // 1씩 증가 하거나, 1씩 감소하는 연산자.
            {
                // * 전위연산
                int i = 0;
                System.out.println("전위연산 = " + (++i));
            }

            System.out.println();

            {
                // * 후위연산
                int i = 0;
                System.out.println("후위연산 = " + (i++));
                System.out.println("후위연산 = " + (i));
            }
            
            // ** 비교 연산자
            // [>], [<], [>=], [<=], [==], [!=]

            /*
             * a > b :  a가 b보다 큰가
             * a < b  : a가 b보다 작은가
             * a >= b  : a가 b보다 크거나 같은가
             * a <= b  : a가 b보다 작거나 같은가
             * a == b  : a가 b와 같은가
             * a != b  : a가 b와  같지 않은가
             */


            // ** 논리 연산자
            // [&&], [||], [!], [&], [|]

            /* [&&] = AND : 그리고 (A 그리고 B)
             *  A와 B 둘다 true 인 경우에만 성립됨.

                int num1 = 10;
                int num2 = 20;
                int num3 = 30;
                boolean A = ((num1 < num2) && (num2 <= num3));
                System.out.println("A = " + A);

             * [||] = OR : 또는 (A 또는 B)
             *  A와 B 중에 하나만 true 인 경우에도 성립된다.
             * 예) (10 < 20) || (10 < 5) = true

             *  [!] = NOT : 아니다 (!A)
             *  (!A) = A가 아니다.
             *  (!B) = B가 아니다.

             * [&] = 비트연산에 대한 논리적 개념
             * [&] : 그리고
             *   00011101 = 29
             * & 00000111 = 7
             *-------------
             *   01010000 = 5
             */

            System.out.println();
            System.out.println("29 & 7 = " + (29 & 7));
            System.out.println();

            /*
             * [|]
             *   00011101 = 29
             * | 00000111 = 7
             *-----------------
             *   00011111 = 31
             */

            // ** 비트 연산자
            // ** 삼항 연산자

            // ** 문자열 연산자 +
            System.out.println("문자열" + "출력");

        }

            

    }
}