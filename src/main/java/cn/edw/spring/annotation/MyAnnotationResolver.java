package cn.edw.spring.annotation;

import java.lang.reflect.Field;

/**
 * @author Edwin Xu
 * @date 4/19/2021 11:14 PM.
 */

public class MyAnnotationResolver {
    public void resolveName(Class<?> clazz){
        Field [] fields = clazz.getFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
                // 如果这里是Spring环境，就可以将该注解的秩注入到特定的Bean中
                System.out.println(myAnnotation.name());
            }
        }
    }

    public static void main(String[] args) {
        MyAnnotationResolver resolver = new MyAnnotationResolver();
        resolver.resolveName(AnnotationTest.class);
    }
}
