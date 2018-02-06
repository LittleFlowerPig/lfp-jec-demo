package com.lfp.jec.balance.job.business;

import com.lfp.jec.frame.base.helper.ret.RetObject;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Project: jec-balance-job
 * Title:
 * Description:
 * Date: 06
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
@FeignClient(value = "jec-service-job")
public interface IIndexApi {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    RetObject index();

}
