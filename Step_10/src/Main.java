import java.util.Arrays;

// ** public : 공개 상태
// ** protected : 상속관계일 때 public, 아닐 때에는 private
// ** private : 비공개 상태


// ** OOP의 특징 5가지

// ** 1. 정보 은닉
// * 객체지향 언어는 실제현실과 비슷하게 코드로 만들어 놓은 것.
// * 우리가 지나가는 행인의 이름이나 나이를 알 수 없듯이 객체와 객체 사이에서의
// * 데이터는 정보공유가 규정없이 사용되서는 안된다.

// ** 승인 요청 및 허가 과정이 필요.
// getter & setter

// ** 2. 캡슐화.
// * 데이터와 기능이 함께 사용되는 집합
// * class 라고  부른다.

// ** 3. 상속
// * 상속은 계층구조로 이루어져 있어서 부모계층과 자식계층간의 상속관계로 이루해 할 수 있다.
// * 자식 클래스는 부모클래스의 함수 & 데이터를 사용할 수 있다.

// ** 4. 추상화
// * 대상이 특정되지 않은 상태를 추상적이라고 한다.
// * 클래스는 추상적일 수 있고, 객체 상태가 아닌 클래스를 추상 클래스 라고 부른다.


// ** 5. 다형성
// * 하나의 추상 클래스에 여러 다양한 객체들이 존재할 수 있다.

public class Main {
    public class Member
    {
        private int age = 27;
        //public int age = 27;

        public int getAge(){
            return age;
        }
    }


    Member m = new Member();
    int age = m.getAge();
    //int age = m.age;

    public static void main(String[] args) {




        // 10개의 배열을 생성
        int[] numbers = new int[10];
        
        // ** 현재 생성된 배열의 첫번째 원소부터 값을 초기화 하기 위함
        int index = 0;

        while(true)
        {
            int num = (int)(Math.random() * 100) + 1;
            // ** numbers 배열에 동일한 값이 있는지 확인하기 위한 변수
            boolean check = true;

            /*
            for (int i = 0; i < numbers.length; ++i);
            {
                if(num == numbers[i])
                {

                }
            }
             */
            // 현재 numbers 배열에 존재하는 값을 생성된 난수값을 비교.
            // 만약 값은 값이 존재한다면 재생성.
            for (int element : numbers)
            {
                if(num == element)
                {
                    //**만약 동일한 값이 존재한다면...
                    check = false; // 재생성 하기 위해 false로 설정.
                    break; // 같은 값이 있다면 반복문이 완료될 때까지 돌 필요가 없음.
                }
            }

            // ** 만약 중복값이 없다면
            if(check = true)
            {
                // ** 현재 위치에 난수값을 셋팅
                numbers[index] = num;

                //** 다음 위치를 가리키게 한다.
                ++index;

                // ** 모든 배열이 초기화가 종료되었다면 while 문을 탈출한다.
                if(index == 10) break;

            }

        // for 문을 통해 하나의 값 생성 후 나머지 생성되지 않은 숫자는 0을 생성 반복되며 하나씩 생성됨.
        /*
            for(int i = 0; i < numbers.length; ++i){
            System.out.println(numbers[i]);
        }
        */

        }

        //** 선택 정렬

        for(int i = 0; i < numbers.length - 1; ++i)
        {
            // ** i는 첫번째 원소의 위치를 가르킨다.
            // ** index에 첫번째 원소를 가르키는 i로 초기화 해준다.
            index = i; // index 값은 계속 변경될 수 있다.
            for(int j = i + 1; j < numbers.length; ++j)
            {
                // ** 특정 조건이 만족 되었다면....
                if (numbers[index] > numbers[j])
                    index = j;  // ** 해당 위치를 index 값으로 변경해준다.
            }

            // ** 값을 스왑
            int temp = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = temp;
        }

        // ** 출력한다.
        for(int element : numbers){
            System.out.println(element);
        }


    }
}