package com.eloancn.tender.service;

import com.eloancn.tender.BaseServiceTest;
import com.eloancn.tender.api.entity.TenderRecord;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * Created by gwr
 * Description
 * Path com.eloancn.tender.service.TenderRecordServiceTest
 * Date 2016/8/13
 * Time 21:23
 */
public class TenderRecordServiceTest extends BaseServiceTest {

    @Autowired
    private ITenderRecordService service;
    @Test
    public void testSave() throws Exception {
        TenderRecord entity = new TenderRecord();
        entity.setTitle("老张");
        entity.setAmount(new BigDecimal(78.99));
        service.save(entity);
        System.out.println("service = " + service);
    }
}