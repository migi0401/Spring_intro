package hello.hello_spring.controller;

public class MemberForm {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) { //스프링이 setName 호출!
        this.name = name;
    }

}
