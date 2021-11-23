
package com.example.myapplication2;


public class MedCord {

    @com.squareup.moshi.Json(name = "status")
    private Integer status;
    @com.squareup.moshi.Json(name = "errno")
    private Integer errno;
    @com.squareup.moshi.Json(name = "oer")
    private String oer;
    @com.squareup.moshi.Json(name = "tr")
    private String tr;
    @com.squareup.moshi.Json(name = "errCode")
    private Integer errCode;
    @com.squareup.moshi.Json(name = "oreStatus")
    private String oreStatus;
    @com.squareup.moshi.Json(name = "msg")
    private String msg;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public String getOer() {
        return oer;
    }

    public void setOer(String oer) {
        this.oer = oer;
    }

    public String getTr() {
        return tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getOreStatus() {
        return oreStatus;
    }

    public void setOreStatus(String oreStatus) {
        this.oreStatus = oreStatus;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
