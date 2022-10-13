package extend;

public class Child extends Parent{

    int age;

    Child()
    {
        System.out.println("Child 생성");
    }
    
    
    int getAge()
    {
       return age;
    }

    // ----- 오버로딩 -----
    // 같은 클래스 내부에서 동일한 이름으로 재정의된 경우로 '오버로딩' 라고 한다.
    // 파라미터의 갯수나 형태에 따라서 호출되는 함수가 달라진다. 
    // 상속과 관련 X

    //========================================================================

    // ----- 오버라이딩 -----
    // 상속간에 이루어질 수 있는 '함수의 재정의' 이다.
    // 파라미터의 갯수나 형태까지 완벽하게 같아야 한다.

    void render()
    {
        // ** 멤버 변수와 똑같은 이름의 지역변수를 선언.
        int age = 100; // 지역변수
        // ** super 키워드를 사용하여 부모 클래스에 있는 변수에 접근 가능.
        // ** age 앞에 this. 를 붙혀주지 않는다면 지역변수를 사용하게 된다.
        System.out.println(super.name + " : " + this.age);
        // this 를 붙이면 홍길동 age 32가 호출되지만 this 를 붙여주지 않는다면 같은 지역에 있는 변수(지역변수)를 우선 사용하게 된다.
    }
    
    
      void render(int num)
    {
        System.out.println("입력한 값은 " + num + "이고 정수 입니다.");

    }

    void render(String str)
    {

        System.out.println("입력한 값은 " + str + "이고 문자열 입니다.");
    }
     
}
