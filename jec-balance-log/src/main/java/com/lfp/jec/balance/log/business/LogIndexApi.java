package com.lfp.jec.balance.log.business;

import com.lfp.jec.frame.base.business.IndexApi;
import com.lfp.jec.frame.base.helper.ret.RetObject;
import com.lfp.jec.frame.base.helper.ret.RetUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Project: lfp-jec
 * Title:
 * Description:
 * Date: 05
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
@RestController
public class LogIndexApi extends IndexApi{

    @Autowired
    RestTemplate restTemplate;

    public RetObject index() {
        return restTemplate.getForObject("http://service-log-in/", RetObject.class);
    }

}
