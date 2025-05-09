package cn.xilio.boot.biz.domain.repository;

import cn.xilio.boot.biz.domain.entity.TestEntity;

public interface TestRepository {
    TestEntity findById(String id);
}
