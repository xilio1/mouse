package cn.xilio.boot.biz.infra.convert;

import cn.xilio.boot.biz.domain.entity.TestEntity;
import cn.xilio.boot.biz.infra.dataobject.TestDO;

public final class TestConvert {
    public static TestEntity toEntity(TestDO testDO) {
        TestEntity entity = new TestEntity();
        entity.setId(testDO.getId());
        entity.setName(testDO.getName());
        return entity;
    }

    public static TestDO toDO(TestEntity testEntity) {
        TestDO testDO = new TestDO();
        return testDO;
    }
}
