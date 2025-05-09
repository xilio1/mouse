package cn.xilio.boot.biz.adapter;

import cn.xilio.boot.biz.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("biz/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("get")
    public Object get() {
        return testService.get();
    }
}
