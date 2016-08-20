package com.eloancn.tender.dao;

import com.eloancn.tender.facade.entity.TenderRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gwr
 * Description
 * Path com.eloancn.tender.dao.TenderRecordRepository
 * Date 2016/8/13
 * Time 21:19
 */
public interface TenderRecordRepository extends JpaRepository<TenderRecord, Integer> {

}
