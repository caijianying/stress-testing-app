package com.xiaobaicai.stress.testing.app.mapper;

import com.xiaobaicai.stress.testing.app.dataobject.UserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息 Mapper 接口
 * </p>
 *
 * @author xiaobaicai
 * @since 2024-12-03
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
