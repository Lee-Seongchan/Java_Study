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

}
