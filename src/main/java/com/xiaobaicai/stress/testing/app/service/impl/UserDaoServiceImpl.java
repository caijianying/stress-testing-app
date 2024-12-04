package com.xiaobaicai.stress.testing.app.service.impl;

import com.xiaobaicai.stress.testing.app.dataobject.UserDO;
import com.xiaobaicai.stress.testing.app.mapper.UserMapper;
import com.xiaobaicai.stress.testing.app.service.UserDaoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author xiaobaicai
 * @since 2024-12-03
 */
@Service
public class UserDaoServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserDaoService {

}
