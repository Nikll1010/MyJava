/**
 * @author Nikll
 * @date 2018/8/30 12:42
 */
package lession1;

/**
 * @author Nikll

 * @date 2018/8/30 12:42

 */
public class MyThread extends Thread {
    @Override
    public void run(){
//        super.run();
     try {
         for (int i = 0; i <10 ; i++) {
             System.out.println("线程"+getName()+"正在打印"+i);
             if (i%10 == 0) {
                 yield();
                 sleep(1000);
             }
         }
     }catch (InterruptedException e){
         System.out.println("lalala");
         e.printStackTrace();
     }
    }

    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        MyThread myThread = new MyThread();
//        myThread.run();
        myThread.start();
//        while (myThread.isAlive()){
//            System.out.println("myThread打印好了");
//        }
        MyThread myThread1 = new MyThread();
        myThread1.start();
        myThread1.setPriority(MAX_PRIORITY);
//        while (myThread1.isAlive()){
//            System.out.println("myThread1打印好了");
//        }
        for (int i = 0; i <10 ; i++) {
            System.out.println("线程"+name+"正在打印"+i);
            System.out.println("线程"+name+"执行完毕");
            System.out.println(myThread.getPriority());
            System.out.println(myThread1.getPriority());
//            System.out.println(myThread.isAlive()?"正在执行":"执行结束");
//            System.out.println(myThread1.isAlive()?"正在执行":"执行结束");
//            while (myThread.isAlive()){
////                System.out.println("myThread打印好了");
//                System.out.println(myThread.isAlive()?"myThread正在执行":"myThread执行结束");
//                System.out.println(myThread1.isAlive()?"myThread1正在执行":"myThread1执行结束");
//            }
//            while (myThread1.isAlive()){
//                System.out.println("myThread1打印好了");
//            }
            if (i%10 == 0) {
                yield();
            }
        }
    }
}