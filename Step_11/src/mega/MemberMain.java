package mega;

public class MemberMain {
        
    //private Member m;
    //private Member m2;

    
    public static void main(String[] args){
        // =========================
        // 메모리 구조 확인
        // =========================
        Member m = new Member();
        Member m2 = new Member();


        if(m == m2){
            System.out.println("같다");
        }else
            System.out.println("다르다");

        //======================================
        // 객체를 배열로 사용
        // =====================================
        Member[] mArray = new Member[5];

        mArray[0] = new Member();
        mArray[0].setId("Key1");

        mArray[1] = new Member();
        mArray[1].setId("Key2");

        mArray[2] = new Member();
        mArray[2].setId("Key3");

        mArray[3] = new Member();
        mArray[3].setId("Key4");

        mArray[4] = new Member();
        mArray[4].setId("Key5");

        for (Member element : mArray)
        {
            String str = element.getId();
            System.out.println(str);
        }



      
    }
}
