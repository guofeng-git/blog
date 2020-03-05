package jieyi.accservice.form;

import org.apache.ibatis.type.Alias;

@Alias("TInfoAccountCard")
public class TInfoAccountCard {
    private String recordNo; //记录编号

    private String cardNo; //卡号

    private String acctype; //账户类型 01-基本资金账户

    private String accountNo; //账户号

    private String bindingFlag; //绑定标识

    private String bindingMehod; //绑定方式

    private String mainCardNo; //主卡卡号

    private String mainCustomerNo; //主卡客户编号

    private String bindingTime; //绑定时间

    private String unbindingTime; //解绑时间

    private String bindShopId; //绑定门店号

    private String bindOprId; //绑定操作员

    private String unbindShopId; //解绑门店号

    private String unbindOprId; //解绑操作员号

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBindingFlag() {
        return bindingFlag;
    }

    public void setBindingFlag(String bindingFlag) {
        this.bindingFlag = bindingFlag;
    }

    public String getBindingMehod() {
        return bindingMehod;
    }

    public void setBindingMehod(String bindingMehod) {
        this.bindingMehod = bindingMehod;
    }

    public String getMainCardNo() {
        return mainCardNo;
    }

    public void setMainCardNo(String mainCardNo) {
        this.mainCardNo = mainCardNo;
    }

    public String getMainCustomerNo() {
        return mainCustomerNo;
    }

    public void setMainCustomerNo(String mainCustomerNo) {
        this.mainCustomerNo = mainCustomerNo;
    }

    public String getBindingTime() {
        return bindingTime;
    }

    public void setBindingTime(String bindingTime) {
        this.bindingTime = bindingTime;
    }

    public String getUnbindingTime() {
        return unbindingTime;
    }

    public void setUnbindingTime(String unbindingTime) {
        this.unbindingTime = unbindingTime;
    }

    public String getBindShopId() {
        return bindShopId;
    }

    public void setBindShopId(String bindShopId) {
        this.bindShopId = bindShopId;
    }

    public String getBindOprId() {
        return bindOprId;
    }

    public void setBindOprId(String bindOprId) {
        this.bindOprId = bindOprId;
    }

    public String getUnbindShopId() {
        return unbindShopId;
    }

    public void setUnbindShopId(String unbindShopId) {
        this.unbindShopId = unbindShopId;
    }

    public String getUnbindOprId() {
        return unbindOprId;
    }

    public void setUnbindOprId(String unbindOprId) {
        this.unbindOprId = unbindOprId;
    }


}