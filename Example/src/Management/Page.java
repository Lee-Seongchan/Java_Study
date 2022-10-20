package Management;

public class Page {
    public void setData()
    {
        Member member = new Member();

        member.setAge(32);
        member.setUserName("홍길동");

        {
            Group group = new Group("k", "Java");

            group.set_class("k");
            group.set_class("Java");

            member.setGroup(group);
        }

        Singleton.getInstance().setMember(member);
    }

    public Member createMember()
    {
        return new Member();
    }

}
