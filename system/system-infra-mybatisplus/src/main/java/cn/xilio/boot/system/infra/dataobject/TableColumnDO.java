package cn.xilio.boot.system.infra.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("table_column")
public class TableColumnDO {
    @TableId
    private String id;
}
