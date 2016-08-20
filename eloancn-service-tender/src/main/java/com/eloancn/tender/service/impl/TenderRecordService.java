package com.eloancn.tender.service.impl;

import com.eloancn.tender.dao.TenderRecordRepository;
import com.eloancn.tender.facade.entity.TenderRecord;
import com.eloancn.tender.service.ITenderRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gwr
 * Description
 * Path com.eloancn.tender.core.service.TenderRecordService
 * Date 2016/8/13
 * Time 21:16
 */
@Service
public class TenderRecordService implements ITenderRecordService {

    @Autowired
    private TenderRecordRepository repository;



    @Override
    public TenderRecord save(TenderRecord entity) {
        return repository.save(entity);
    }
}
