/**
 * @author Nikll
 * @date 2018/8/26 15:44
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/26 15:44

 */
public class Date {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    int y;
    int z;
    public Date(){
        x = 1;
        y = 2;
        z = 3;
    };
    public Date(int x,int y){
        this.x = x;
        this.y = y;
    }
    public Date(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}