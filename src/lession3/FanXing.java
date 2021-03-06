package lession3;

import java.util.Comparator;

/**
 * @Auther: Administrator
 * @Date: 2018/12/7 14:08
 * @Description:
 */
public class FanXing {
    public static < E > void printArray(E[] inputArry){
        // 输出数组元素
        for ( E element : inputArry ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
        }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x; // 假设x是初始最大值
        if ( y.compareTo( max ) > 0 ){
            max = y; //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z; // 现在 z 更大
        }
        System.out.println(max.getClass());
        return max; // 返回最大对象
    }
    public static <A extends Comparable> A minimum(A v){
        A min = v ;
        System.out.println(min.getClass());
        return min;
    }

    public static void main( String args[] )
    {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组

        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ) );

        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", maximum( "pear", "apple", "orange" ) );
        System.out.println(maximum( 6.6, 8.8, 7.7 ).getClass());
//        minimum(v);
    }
}
