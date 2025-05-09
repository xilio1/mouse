package cn.xilio.boot.biz.infra.impl;

import cn.xilio.boot.biz.domain.entity.TestEntity;
import cn.xilio.boot.biz.domain.repository.TestRepository;
import cn.xilio.boot.biz.infra.convert.TestConvert;
import cn.xilio.boot.biz.infra.dataobject.TestDO;
import cn.xilio.boot.biz.infra.ibatis.TestMapper;
import org.springframework.stereotype.Repository;

//接口核心实现类 实现业务领域中的持久层接口 此处可以任意选择自己喜欢的持久层框架
@Repository
public class TestRepositoryImpl implements TestRepository {
    private TestMapper testMapper;

    //private JpaTestRepository jpaTestRepository;
    @Override
    public TestEntity findById(String id) {
        TestDO testDO = new TestDO();
        testDO.setId(id);
        return TestConvert.toEntity(testDO);
    }
}
