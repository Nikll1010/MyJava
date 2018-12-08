package lession3;

import java.util.*;

/**
 * @Auther: Administrator
 * @Date: 2018/12/6 17:30
 * @Description:
 */
public class CollectionDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,2);
        hashMap.put(2,3);
        hashMap.put(3,4);
        hashMap.put(4,5);
        hashMap.put(1,2);
        System.out.print(hashMap);
        SortedMap sortedMap = new SortedMap() {
            @Override
            public Comparator comparator() {
                return null;
            }

            @Override
            public SortedMap subMap(Object fromKey, Object toKey) {
                return null;
            }

            @Override
            public SortedMap headMap(Object toKey) {
                return null;
            }

            @Override
            public SortedMap tailMap(Object fromKey) {
                return null;
            }

            @Override
            public Object firstKey() {
                return null;
            }

            @Override
            public Object lastKey() {
                return null;
            }

            @Override
            public Set keySet() {
                return null;
            }

            @Override
            public Collection values() {
                return null;
            }

            @Override
            public Set<Entry> entrySet() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map m) {

            }

            @Override
            public void clear() {

            }
        };
    }
}
