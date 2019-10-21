package com.jiayuan.test;

import com.jiayuan.domain.User;
import com.jiayuan.util.MyUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by YonJar on 2019/10/21.
 */
public class MyTest {

    /**
     * 测试MyUtils工具类的 Object转list功能
     */
    @Test
    public void test01(){
        //模拟数据
        User user01 = new User(1, "luoyj", 25);
        User user02 = new User(2, "yonjar", 25);
        User user03 = new User(3, "YonJarLuo", 25);
        ArrayList<Object> list = new ArrayList<>();
        list.add(user01);
        list.add(user02);
        list.add(user03);

        //将模拟数据存入map中
        HashMap<String, Object> map = new HashMap<>();
        map.put("user",list);

        //然后通过工具类方法，转换出来
        List<User> userList = MyUtils.ObjectToList(map.get("user"), User.class);

        System.out.println(list);
        System.out.println(userList);
    }
}
