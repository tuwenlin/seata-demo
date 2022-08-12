package io.seata.demo.storage.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Storage {
    private String id;

    private Integer productId;

    private Integer total;

    private Integer used;

    private Integer residue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
