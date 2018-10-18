package com.commodity.products.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Type)实体类
 *
 * @author makejava
 * @since 2018-10-17 23:33:59
 */
public class Type implements Serializable {
    private static final long serialVersionUID = -28561213458335567L;
    
    private Integer tId;
    
    private String tBig;
    
    private String tSmall;
    
    private String pId;
    
    private Date updateTime;
    
    private Date createTime;


    public Integer getTId() {
        return tId;
    }

    public void setTId(Integer tId) {
        this.tId = tId;
    }

    public String getTBig() {
        return tBig;
    }

    public void setTBig(String tBig) {
        this.tBig = tBig;
    }

    public String getTSmall() {
        return tSmall;
    }

    public void setTSmall(String tSmall) {
        this.tSmall = tSmall;
    }

    public String getPId() {
        return pId;
    }

    public void setPId(String pId) {
        this.pId = pId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}