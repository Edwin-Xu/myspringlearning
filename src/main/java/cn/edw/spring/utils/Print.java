package cn.edw.spring.utils;

/**
 * @author Edwin Xu
 * @date 4/20/2021 3:04 PM.
 */

public class Print {
    public static void print(Object name, Object value){
        System.out.println(name+" : "+ value);
    }

    public static void print(Class<?> clazz, String msg){
        System.out.println(clazz.getSimpleName()+" : "+ msg);
    }
    public static void print(Object ... objects){
        for (Object object : objects) {
            System.out.print(object+"  ");
        }
        System.out.println();
    }
}
