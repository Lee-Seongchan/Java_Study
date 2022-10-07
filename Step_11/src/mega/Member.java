package mega;

public class Member
{

    // getter 참조
    // setter 변경

    private String id;
    private String userName;
    private Integer age;

    // 생성 변경 갱신 삭제
    // public void create();
    // public void progress();
    // public void render();
    // public void delete():


    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}

    public Integer getAge( /* 매개변수 -> 지역변수 */ )
    {
        return age;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }


}
