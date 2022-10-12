package extend;

public class ExtendMain {
    public static void main(String[] args)
    {
        /*
        Parent p = new Parent();
        p.str1 = "홍길동";
        p.str2 = "임꺽정";
        p.str3 = "이몽룡";

        p.renderHong();
        p.renderLim();
        p.renderLee();
        

        */

        Child c = new Child();

        c.name = "홍길동";
        c.age= 32;

        System.out.println(c.name + " : " + c.age);

        
    }
}
