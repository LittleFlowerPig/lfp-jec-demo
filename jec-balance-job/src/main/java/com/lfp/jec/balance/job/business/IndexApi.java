package com.lfp.jec.balance.job.business;

import com.lfp.jec.frame.base.helper.ret.RetObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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
public class IndexApi extends com.lfp.jec.frame.base.business.IndexApi{

    @Autowired
    private IIndexApi iIndexApi;

    public RetObject index() {
        return iIndexApi.index();
    }

}
