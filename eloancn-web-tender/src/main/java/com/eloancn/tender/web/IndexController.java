package com.eloancn.tender.web;


import com.eloancn.tender.facade.api.ITenderRecordAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
@RequestMapping
public class IndexController {
    @Autowired
    private ITenderRecordAPI tenderRecordAPI;

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        tenderRecordAPI.save(null);
        return "user.index";
    }
}
