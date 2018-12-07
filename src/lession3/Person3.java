package lession3;

/**
 * @Auther: Administrator
 * @Date: 2018/12/6 15:13
 * @Description:
 */
public class Person3 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private String name;

    public static void main(String[] args) {
        Person3 person3 = new Person3();
        person3.setAge(20);
        person3.setName("zhangsan");
        System.out.println("Age "+person3.getAge()+"\n"+"Name "+person3.getName());
    }
}
