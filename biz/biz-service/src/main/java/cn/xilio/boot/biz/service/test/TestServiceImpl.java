package cn.xilio.boot.biz.service.test;

import cn.xilio.boot.biz.domain.entity.TestEntity;
import cn.xilio.boot.biz.domain.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestRepository testRepository;

    @Override
    public TestEntity get() {
        String id = "001";
        TestEntity entity = testRepository.findById(id);
        return entity;
    }
}
