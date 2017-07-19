/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armesoft.data.entities;

/**
 *
 * @author jcq012
 */
public class ErrorMessage {
    private Integer code;
    private String msg;
    private String msgDev;

    public ErrorMessage(Integer code, String msg, String msgDev) {
        this.code = code;
        this.msg = msg;
        this.msgDev = msgDev;
    }

    public ErrorMessage() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgDev() {
        return msgDev;
    }

    public void setMsgDev(String msgDev) {
        this.msgDev = msgDev;
    }
    
    
    
}
