package Extend;

public class ExtendMain {

    public static void main(String[] args) {
        // ** 상속관계에서만 사용이 가능
        Parent p = new Child();

        // ** 보모 클래스에서 호출 가능한 함수 없을 경우에,
        // ** 자식 클래스에 재정의 된 함수가 있다고 하더라도 호출 되지 않는다.
        // -> 자식 클래스에 그 기능이 있더라도 부모 클래스에 그 기능이 없다면 실행 X
        p.walk();

        // 부모 클래스는 자식 클래스보다 상위에 있어 더 넓은 범위에 있기 때문에 강제 형변환을 함.
        // 그러나 이러한 경우 데이터의 손실이 있기 때문에 주의해서 사용해야 한다.
        Child c = (Child)p;
        c.eat();

        // ** 에러 코드
        Parent p1 = new Parent();

        Child c1 = (Child)p1;
        c1.run(); // 에러발생


    }
}
