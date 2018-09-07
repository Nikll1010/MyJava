/**
 * @author Nikll
 * @date 2018/8/28 22:58
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/28 22:58

 */
public class Student extends Person_S{
    private String school;
    public Student(String name, int age, String school){
        super(name,age);
        school = "s";
    }
//    public Student(String name, int age, String school){
//        this.setName(String name); = name;
//        this.setAge(int age) = age;
//    }
    public Student(String name, int age) {
        this(name, age, null);
    }
    public Student(String name, String school) {
        this(name, 30, school);
    }
    public Student(String name) {
        this(name, 30);
    }
}