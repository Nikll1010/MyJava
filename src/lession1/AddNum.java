/**
 * @author Nikll
 * @date 2018/8/26 13:04
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/26 13:04

 */
public class AddNum {
    public int getI() {
        return i;
    }

    int i;
    int z;

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    String y;
    public int getJ() {
        return j;
    }

    int j;
    public AddNum(){
        i = 10;
        j = 20;
    }

    public void setI(int i) {
        this.i = i;
    }

    public AddNum(int i, String y, int z){
        this.i = i;
        this.y = y;
        this.z = z;
//        this(i,y,z);
        System.out.println(i+y+z);
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getz() {
        return z;
    }

    public void setZ(int z) {
        z = z;
    }

    public AddNum(int i, String y){
        i = 10;
        y = "lalalala";
    }
    /**
     *@描述
     *@参数  [i, j]
     *@返回值  int
     *@创建人   Nikll
     *@创建时间  2018/8/26
     *@修改人和其它信息
     */
    public int add(int i,int j){
//        int result = i + j;
//        return result;
        return i+j;
    }

}