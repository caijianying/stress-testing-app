package com.xiaobaicai.stress.testing.app.service;

import com.xiaobaicai.stress.testing.app.dataobject.UserDO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author xiaobaicai
 * @description 关注微信公众号【程序员小白菜】领取源码
 * @date 2024/12/19 星期四 16:06
 */
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserDaoService userDaoService;


    public UserDO queryById(Integer id) {
        return userDaoService.getById(id);
    }
}
