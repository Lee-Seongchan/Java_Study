public class Main {
    public static void main(String[] args) {

        //** [switch/case]
        {
            int num = 0;

            final int ONE = 1;  // 정수이면서 상수만 사용 가능하다.

            //** switch = 정수 & 상수만 사용이 가능하다.
            //** 변수이지만 final 키워드를 사용하여 상수로 만든 경우에는 사용 가능.

            switch (num)
            {
                case 0:
                    switch (num){   //switch문은 중복해서 사용가능하다.
                        case 0 :
                            System.out.println("case 1번입니다.");
                            break;
                        case 1 :
                            System.out.println("case 2번입니다.");
                            break;
                    }
                    System.out.println("case 1번입니다.");
                    break; // 탈출문
                case ONE:   // 변수이지만 final 키워드를 사용하여 상수로 만든 경우에는 사용가능하지만 잘 사용하지 않는다.
                    System.out.println("case 2번입니다.");
                    break;
                case 2:
                    System.out.println("case 3번입니다.");
                    break;
                case 3 :
                    System.out.println("case 4번입니다.");
                    break;
            }

            num = 3;
            switch (num){
                case 0 :
                    break;
                case 1 :
                    break;

                default: //else
                    System.out.println("0과 1만 사용이 가능합니다." + num + "은 사용이 불가 합니다.");
            }


        }
    }
}