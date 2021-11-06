package cn.edw.spring.utils;

import com.github.javafaker.Faker;

/**
 * @author taoxu.xu
 * @date 11/5/2021 5:26 PM
 */
public class FakerUtil {
    private static final Faker faker = new Faker();

    public static String fakeName(){
        return faker.name().name();
    }
}
