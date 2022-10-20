package Management;

import java.awt.font.ShapeGraphicAttribute;

public class ManagementMain {

    public static void main(String[] args) {
        Page page = new Page();
        page.setData();

        Member member = Singleton.getInstance().getMember();

            // ** 멤버의 필드값을 받아온다.
            String name = member.getUserName();
            int age = member.getAge();

            String _class = member.getGroup()._class;
            String subject = member.getGroup().getSubject();

            // ** 출력한다.
            System.out.println(name + " : " + age + " [" + _class + "]");


    }
}
