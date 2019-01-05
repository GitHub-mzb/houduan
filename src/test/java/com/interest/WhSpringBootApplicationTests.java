package com.interest;

import com.interest.model.UserEntity;
import com.interest.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WhSpringBootApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void test() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("superAdmin");
        userEntity.setCreateTime("dsadasd");
        userEntity.setHeadimg("sadasdas");
        userEntity.setPassword("123456");
        userEntity.setUsertype(1);
        userEntity.setEmail("sadasdasdad");
        userEntity.setId(5);
        userService.insertUser(userEntity);
    }


}
