package com.changhong.sei.datachange.controller;

import com.changhong.sei.core.dto.ResultData;
import com.changhong.sei.core.test.BaseUnitTest;
import com.changhong.sei.core.util.JsonUtils;
import com.changhong.sei.datachange.controller.HelloController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 实现功能: Hello 单元测试
 */
public class HelloControllerTest extends BaseUnitTest {
    @Autowired
    private HelloController controller;

    @Test
    public void sayHello() {
        String name = "程序员";
        ResultData<String> result = controller.sayHello(name);
        LOG.debug(JsonUtils.toJson(result));
    }
}