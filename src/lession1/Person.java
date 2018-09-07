/**
 * @author Nikll
 * @date 2018/8/26 8:07
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/26 8:07

 */
public class Person {
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Person(){
        age = 10;
        name = "hahaha";
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int height;
    private String weight;
    public String getWeight() {
        return weight;
    }

    public String setWeight(String weight) {
        this.weight = weight;
        return weight;
    }
    /**
     *@描述
     *@参数  []
     *@返回值  void
     *@创建人   Nikll
     *@创建时间  2018/8/26
     *@修改人和其它信息
     */
    public void move(){
        System.out.println("move!move!move!");
    }
    /**
     *@描述
     *@参数  [height]
     *@返回值  void
     *@创建人   Nikll
     *@创建时间  2018/8/26
     *@修改人和其它信息
     */
    public void setHeight(int height) {
        this.height = height;
    }
    /**
     *@描述
     *@参数  []
     *@返回值  int
     *@创建人   Nikll
     *@创建时间  2018/8/26
     *@修改人和其它信息
     */
    public int getHeight() {
        return height;
    }

}