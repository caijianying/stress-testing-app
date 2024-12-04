package com.xiaobaicai.stress.testing.app.controller;

import com.alibaba.fastjson2.JSON;
import com.xiaobaicai.stress.testing.app.dataobject.UserDO;
import com.xiaobaicai.stress.testing.app.service.UserDaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobaicai
 * @description 关注公众号【程序员小白菜】获取源码
 * @date 2024/12/3 星期二 18:16
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("api/user")
public class UserController {

    private final UserDaoService userDaoService;

    @GetMapping("getUser")
    public String getUser() {
        UserDO userDO = userDaoService.getById(1);
        return JSON.toJSONString(userDO);
    }

}