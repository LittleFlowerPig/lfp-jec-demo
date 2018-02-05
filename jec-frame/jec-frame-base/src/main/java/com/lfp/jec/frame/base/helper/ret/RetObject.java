package com.lfp.jec.frame.base.helper.ret;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

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
public class RetObject implements Serializable {
    /** 返回代码 */
    private int responseCode;
    /** 返回信息 */
    private String responseMessage;
    /** 返回数据 */
    private Object responseData;

    public RetObject() {
        super();
    }

    public RetObject(int responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    public RetObject(Object responseData) {
        this.responseCode = 1;
        this.responseMessage = "操作成功";
        this.responseData = responseData;
    }

    public RetObject(int responseCode, String responseMessage, Object responseData) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responseData = responseData;
    }

    public JSONObject toJson(){
        return (JSONObject) JSONObject.toJSON(this);
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Object getResponseData() {
        return responseData;
    }

    public void setResponseData(Object responseData) {
        this.responseData = responseData;
    }

}
