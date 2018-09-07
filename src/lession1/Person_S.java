/**
 * @author Nikll
 * @date 2018/8/28 22:53
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/28 22:53

 */
public class Person_S {
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    private String name;
 	private int age;
	private Date birthDate;
	public Person_S(String name, int age, Date d) {
        this.name = name;
        this.age = age;
        this.birthDate = d;
	}
	public Person_S(String name, int age) {
        this(name, age, null);
	}
	public Person_S(String name, Date d) {
        this(name, 30, d);
	}
    public Person_S(String name) {
        this(name, 30);
    }
}
