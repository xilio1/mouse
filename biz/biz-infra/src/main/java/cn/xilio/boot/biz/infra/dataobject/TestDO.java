package cn.xilio.boot.biz.infra.dataobject;

import java.io.Serializable;

public class TestDO implements Serializable {
    private String id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "TestDO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
