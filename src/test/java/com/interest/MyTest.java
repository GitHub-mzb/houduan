package com.interest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class MyTest {
    public static void main(String[] args) {

        //用户密码
        String password = "123456";
        //密码加密
        BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String newPassword = passwordEncoder.encode(password);//加密
        System.out.println("加密密码为："+newPassword);
        //对比这两个密码是否是同一个密码 
        // true 两个密码一致 false反之
        boolean matches = passwordEncoder.matches(password, newPassword);

    }
}
