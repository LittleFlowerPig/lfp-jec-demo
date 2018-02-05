package com.lfp.jec.frame.base.helper.ret;

import org.apache.commons.lang3.StringUtils;

/**
 * Title:
 * Project: eac
 * Description:
 * Date: 2017-8-1
 * Copyright: Copyright (c) 2020
 * Company: 北京中科院软件中心有限公司 (SEC)
 *
 * @author ZhuTao
 * @version 1.0
 */
public class RetUtil {

    /**
     * 根据信息，封装返回结果
     * @param noMsg         错误时返回信息
     * @return RetObject    返回对象
     */
    public static RetObject returnFailure(String noMsg){
        return new RetObject(0, StringUtils.isNotBlank(noMsg)?noMsg:"操作失败");
    }

    /**
     * 根据信息，封装返回结果
     * @param okMsg         正确时返回信息
     * @return RetObject    返回对象
     */
    public static RetObject returnSuccess(String okMsg){
        return new RetObject(1, StringUtils.isNotBlank(okMsg)?okMsg:"操作成功");
    }

    /**
     * 根据信息，封装返回结果
     * @param noMsg         错误时返回信息
     * @param okMsg         正确时返回信息
     * @return RetObject    返回对象
     */
    public static RetObject returnCommon(String noMsg, String okMsg){
        if (StringUtils.isNotBlank(noMsg)){
            return new RetObject(0, noMsg);
        }
        return new RetObject(1, StringUtils.isNotBlank(okMsg)?okMsg:"操作成功");
    }

    /**
     * 自定义返回结果
     * @param code          返回代码
     * @param msg           返回信息
     * @return RetObject    返回对象
     */
    public static RetObject returnCustom(int code, String msg){
        return new RetObject(code, msg);
    }

    /**
     * 自定义返回结果
     * @param code          返回代码
     * @param msg           返回信息
     * @param data          返回数据
     * @return RetObject    返回对象
     */
    public static RetObject returnCustom(int code, String msg, Object data){
        return new RetObject(code, msg, data);
    }

    /**
     * 自定义返回结果
     * @param data          返回数据（成功条件下）
     * @return RetObject    返回对象
     */
    public static RetObject returnCustom(Object data){
        return new RetObject(data);
    }

}
