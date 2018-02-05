package com.lfp.jec.service.log.business;

import com.lfp.jec.frame.base.business.IndexApi;
import com.lfp.jec.frame.base.helper.ret.RetObject;
import com.lfp.jec.frame.base.helper.ret.RetUtil;
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
public class LogIndexApi extends IndexApi {

    @Override
    public RetObject index() {
        return RetUtil.returnSuccess("欢迎进入[日志]系统");
    }

}
