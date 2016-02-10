package com.echounion.mc.test;

import com.echounion.mc.common.orm.mybatis.Page;
import com.echounion.mc.common.test.TestSupport;
import com.echounion.mc.modules.sys.dao.UserMapper;
import com.echounion.mc.modules.sys.entity.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class UserMapperTest extends TestSupport {
    @Resource
    private UserMapper userMapper;

    @Test
    public void test_selectByExampleAndPage() {
        start();
        Page<User> page = new Page<>(1, 3);
        end();
    }
}
