package com.eloancn.tender.api;


import com.eloancn.tender.facade.api.ITenderRecordAPI;
import com.eloancn.tender.facade.entity.TenderRecord;
import com.eloancn.tender.service.ITenderRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by gwr
 * Description
 * Path com.eloancn.tender.api.TenderRecordAPI
 * Date 2016/8/14
 * Time 1:05
 */
@Component
public class TenderRecordAPI implements ITenderRecordAPI {
    @Autowired
    private ITenderRecordService service;

    @Override
    public TenderRecord save(TenderRecord entity) {
        return service.save(entity);
    }
}
