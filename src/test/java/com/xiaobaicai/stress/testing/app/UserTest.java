package com.xiaobaicai.stress.testing.app;

import com.xiaobaicai.stress.testing.app.service.UserDaoService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author caijy
 * @description
 * @date 2024/12/3 星期二 18:13
 */
@SpringBootTest
public class UserTest {

    @Resource
    UserDaoService userDaoService;

    @Test
    public void testDeleteUser(){
        userDaoService.removeById(1);
    }
}
