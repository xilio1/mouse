package cn.xilio.boot.system.infra.repository;

import cn.xilio.boot.system.domain.table.TableColumnRepository;
import cn.xilio.boot.system.infra.mapper.TableColumnMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class TableColumnRepositoryImpl implements TableColumnRepository {
    @Resource
    private TableColumnMapper tableColumnMapper;
}
