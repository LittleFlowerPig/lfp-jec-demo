package com.lfp.jec.frame.base.business;

import com.lfp.jec.frame.base.helper.ret.RetObject;
import com.lfp.jec.frame.base.helper.ret.RetUtil;
import org.springframework.web.bind.annotation.RequestMapping;
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
public abstract class IndexApi {

    @RequestMapping("/")
    public abstract RetObject index();
    
}
