package com.jiayuan.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YonJar on 2019/10/21.
 */
public class MyUtils {

    /**
     * Object转List
     * List<Student> list = ObjectToList(map.get("name"),Student.class);
     * @param obj
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> ObjectToList(Object obj,Class<T> clazz){
        List<T> result = new ArrayList<>();
        if (obj instanceof List<?>){
            for (Object ob: (List<?>)obj){
                result.add(clazz.cast(ob));
            }
            return result;
        }
        return null;
    }
}
