import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // =================================
        // [다차원 배열]
        // =================================

        // 다차원 배열 초기화 1.
        {
            int [][] numbers = new int[3][3];

            numbers[0][0] = 1;
            numbers[0][1] = 2;
            numbers[0][2] = 3;

            numbers[1][0] = 4;
            numbers[1][1] = 5;
            numbers[1][2] = 6;

            numbers[2][0] = 7;
            numbers[2][1] = 8;
            numbers[2][2] = 9;
        }

        // 다차원 배열 초기화 2.
        {
            int[][] numbers = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };

            for(int i = 0; i < 3; ++i)
            {
                for(int j = 0; j < 3; ++j){
                    System.out.println(numbers[i][j]);
                }
            }

        }



        {//    5 4 3
            int[][][] numbers = {
                    //3번째 괄호 각각의 칸, 2번째 중괄호 한줄, 1번째 괄호 중괄호 덩어리
                    {

                            {10,11,12},
                            {13,14,15},
                            {16,17,18},
                            {19,20,00}
                    },

                    {
                            {20,21,22},
                            {23,24,25},
                            {26,27,28},
                            {29,30,00}
                    },

                    {
                            {30,31,32},
                            {33,34,35},
                            {36,37,38},
                            {39,40,00}
                    },

                    {
                            {40,41,42},
                            {43,44,45},
                            {46,47,48},
                            {49,50,00}
                    },

                    {
                            {50,51,52},
                            {53,54,55},
                            {56,57,58},
                            {59,50,00}
                    }
            };

            System.out.println(numbers[2][2][1]);
        }

        System.out.println("--------------------------------------------------");

        // 2차원 배열 number1의 값을 0값만 들어있는 number2에 복사하기

        {
            int[][] numbers1 = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };

            int[][] numbers2 = {
                    {0,0,0},
                    {0,0,0},
                    {0,0,0}
            };

            for(int i = 0; i < 3; ++i)
            {
                for(int j = 0; j < 3; ++j)
                {
                    numbers2[i][j] = numbers1[i][j];
                }
            }

            for(int i = 0; i < 3; ++i)
                for (int j = 0; j < 3; ++j)
                    System.out.println(numbers2[i][j]);
        }
        
        
        //============================================
        // [문자열]
        ///===========================================

        // 정적(프로그램이 실행 전)
        {
            String name1 = "홍길동";
            String name2 = "임꺽정";
            String name3 = "홍길동";

            int nameasd = 22;
            int nameasd1 = 22;

            System.out.println(name1 == name2);
            System.out.println(name1 == name3);
        }
        
        
        System.out.println("---------------------------------");
        
        // 동적(프로그램 실행 중)
        {
            char[] name = {' ',' '};

            String name1 = new String("홍길동");
            String name2 = new String("홍길동");

            System.out.println(name1 == name2);
        }

        //============================================
        //  [졍렬]
        //============================================

        {
            int[] numbers = new int[10];
            int index = 0;

            while (true){
                boolean Check = true;

                int num = (int)(Math.random() * 100) + 1;

                for(int i = 0; i < numbers.length; i++)
                    if(numbers [i] == num)
                    {
                        Check = false;
                        break;
                    }

                if (Check == true)
                {
                    numbers[index] = num;
                    ++index;
                }
                if(index == 10)
                    break;
            }

            for (int i =0; i < numbers.length; ++i)
                System.out.println(numbers[i]);
            // =========================================== 난수 생성 완료.

            // =================[버블 정렬]========================== 정렬 시작.
           // 4개의 숫자를 비교하게 되면 마지막 원소를 제외하기 때문에 배열의 길이 -1를 하게 된다.
            for(int i = 0; i < numbers.length - 1; ++i)
            {
                // 현재 i번째 원소 바로 앞에 있는 다음원소부터 비교해야 하기 때문에 i+1을 통해 앞의 인덱스를 비교하지 않도록 반복문을 설계
                for (int j = (i + 1); j < numbers.length; ++j)
                {
                 // 만일, 앞의 수가 뒤의 수보다 더 크다면 swap 연산을 진행.
                 if(numbers[i] > numbers[j])
                    {
                            int temp = numbers[i];
                            numbers[i] = numbers[j];
                            numbers[j] = temp;
                    }
                }
            }
            //======================================정렬 끝.
            //향상된 for 문
            //for(자료형 변수명 : 배열명){
            //	문장
            //}
            System.out.println("정렬된 값을 출력합니다");
            for(int element : numbers)
                System.out.println(element);

            // =================[선택 정렬]========================== 정렬 시작.

            // 한 번의 배열 탐색에서 가장 작은 원소의 '위치'를 찾고,
            // 그 위치와 배열의 가장 첫 번째 원소부터 차례로 바꿔주는 방식을 사용(오름 차순으로 정렬하는 경우)하는 정렬 방식

            // ===================================================== 정렬 끝. 내림차순으로

            for(int i = 0; i < numbers.length - 1; i++) {
                // 현재 탐색에서 가장 앞의 원소를 초기 값으로 설정
                int MinIndex = i;
                // 탐색을 진행하며, 가장 작은 값을 찾는다.
                for(int j = i + 1; j < numbers.length; j++) {
                    if(numbers[MinIndex] > numbers[j])
                        MinIndex = j;
                }
                // 탐색이 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위치를 바꾸어준다.
                int temp = numbers[MinIndex];
                numbers[MinIndex] = numbers[i];
                numbers[i] = temp;

                System.out.println("<정렬 후>");
                for(int element : numbers)
                    System.out.println(element);
            }

        }


        // =================[선택 정렬]========================== 정렬 시작.

        // ===================================================== 정렬 끝. 내림차순으로
    }
}