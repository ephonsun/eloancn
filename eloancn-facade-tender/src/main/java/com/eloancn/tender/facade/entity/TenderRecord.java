package com.eloancn.tender.facade.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by gwr
 * Description
 * Path com.eloancn.tender.com.eloancn.tender.facade.entity.TenderRecord
 * Date 2016/8/13
 * Time 20:50
 */
@Entity
@Table(name = "t_tender_record")
public class TenderRecord implements Serializable {
    private static final long serialVersionUID = 3864600610552365018L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private BigDecimal amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
