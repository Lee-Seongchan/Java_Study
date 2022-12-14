public class Main {
    public static void main(String[] args) {

        System.out.println(20220926);
        // ** 2진수
        // 첫번째 자리는 부호를 나머지는 값을 표현

        // 부호   값
        // [0] [0000000] -> 1byte

        // [0]0000000 = 0
        // [0]0000001 = 1
        // [0]0000010 = 2
        // [0]0000011 = 3
        // [0]0000100 = 4
        // [0]0000101 = 5
        // [0]0000110 = 6
        // [0]0000111 = 7
        // [0]0001000 = 8
        // [0]1111111 = 127

        //   [0]0000010 = 2
        // + [0]0000100 = 4
        // ---------------
        //   [0]0000110 = 6


        // ** 2의 보수

        // [0]0000001 = 1

        // ▽ ▽ ▽ ▽ ▽ ▽

        // 1단계 : 반전
        // [1]1111110 = 1

        // ▽ ▽ ▽ ▽ ▽ ▽
        // 2단계 + 1
        // [1]1111111

        // [1]1111111 = -1

        //====================================
        // ** 127의 값에 대한 2의 보수

        // [0]1111111 = 127

        // ▽ ▽ ▽ ▽ ▽ ▽

        // 1단계 : 반전
        // [1]0000000

        // ▽ ▽ ▽ ▽ ▽ ▽
        // 2단계 : +1
        // [1]0000001 = -127
        //====================================

        // 부호   값
        // [0] [0000000 00000000] -> 2byte
        // [0] [1111111 11111111] = 32767

        // 2단계 : + 1
        // [1] [0000000 00000000] = -32767

        // ** 마지막 값
        // [1] [0000000 00000000] = -32768



        // =================================
        // 고정 소수점
        // =================================

        // float -> 4byte
        //      [정수부]           [실수부]
        // 00000000 00000000.00000000 00000000


        // =================================
        // 부동 소수점
        // =================================

        // 부호 [지수부] = 8개   [가수부] 23개
        // [0] [0000000 0].[00000000000000000000000]
        // float 소수점 7번째 자리까지 정확한 데이터를 사용할 수 있다.
        // double 소수점 15번째까지 정확한 데이터를 사용할 수 있다.


        // ** 변수 이름을 지을때 주의사항
        int i = 10;
        System.out.println(i);

        // ** 이름을 봤을때 어떤값을 나타내는지 확인이 가능해야함.
        // ** 변수명 사이에 공백사용불가.
        // ** 대/소문자 구분해서 사용.
        // ** (Apple != apple) 같지 않음.
        // ** 예약어 사용 불가 ex) int int = 10 (x)
        // ** 숫자로 시작할 수 없음
        // ** 특수문자 사용이 가능.( _ , $)

        

    }
}