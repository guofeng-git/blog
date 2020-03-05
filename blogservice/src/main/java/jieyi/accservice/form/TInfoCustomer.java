package jieyi.accservice.form;

import org.apache.ibatis.type.Alias;

@Alias("TInfoCustomer")
public class TInfoCustomer {
    private String customerNo; //客户编号

    private String isRealname; //是否实名：0： 否  1：是

    private String ifCertified; //是否认证：‘0’ 未认证  ‘1’ 已认证。

    private String hldname; //存放密文姓名

    private String hldpptype; //01：身份证 02：军官证 03：护照 04：回乡证 05：台胞证 06：警官证 07：士兵证

    private String hldppno; //存放密文证件号

    private String hldtel; //存放密文手机号

    private String grade; //客户级别：1-普通

    private String custtype; //客户类型-0:个人客户

    private String emailAddress; //EMIAL地址

    private String nickName; //昵称

    private String loginId; //登陆ID

    private String pinkey; //PIN保护密文

    private String gender; //性别：1：男；2：女

    private String homePhone; //家庭电话

    private String officePhone; //办公电话

    private String linkmanAdd; //联系人

    private String linkmanAddPhone; //联系人电话

    private String province; //商户所属省

    private String city; //商户所属市

    private String county; //商户所属区县

    private String qq; //QQ

    private String mmesno; //MSN

    private String contactAddress; //联系地址

    private String contactZipcode; //联系邮编

    private String unitAddress; //单位地址

    private String unitZipcode; //单位邮编

    private Short pwdErrNum; //密码错误次数

    private String lockTimeLimit; //锁定时间

    private String question; //密码提示问题

    private String answer; //密码提示答案

    private String activeAddress; //激活链接地址

    private String activeCode; //激活验证码

    private String activeStatus; //激活状态

    private String registerTime; //注册时间

    private String portrait; //头像

    private String isClosed; //0-否

    private String openChannel; //01:手机 02:柜面 03:pos 04:internet 05:IVR   99：预付卡ops

    private String storeNo; //开通门店号

    private String netabbr; //门店简称

    private String mchntNo; //商户号

    private String mchntAbbr; //商户简称

    private String status; //0-正常

    private String lastSuccessLoginTime; //最后登陆成功时间

    private String lastSuccessLoginIp; //最后成功登陆IP

    private String lastFailLoginTime; //上次失败登陆时间

    private String lastFailLoginIp; //上次失败登陆IP

    private String inputdate; //创建时间

    private String lastUpdateTime; //最后修改日期

    private String instId; //机构号

    private String empno; //员工号

    private String company; //公司名称

    private String post;

    private String department; //所属部门

    private String vHldname; //存放展示姓名

    private String vHldppno; //存放展示证件号

    private String vHldtel; //存放展示手机号

    private String riskGrade; //风险等级 10.高 11.中 12.低

    private String riskDate; //风险评定日期  

    private String idValiddate; //证件有效期

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getIsRealname() {
        return isRealname;
    }

    public void setIsRealname(String isRealname) {
        this.isRealname = isRealname;
    }

    public String getIfCertified() {
        return ifCertified;
    }

    public void setIfCertified(String ifCertified) {
        this.ifCertified = ifCertified;
    }

    public String getHldname() {
        return hldname;
    }

    public void setHldname(String hldname) {
        this.hldname = hldname;
    }

    public String getHldpptype() {
        return hldpptype;
    }

    public void setHldpptype(String hldpptype) {
        this.hldpptype = hldpptype;
    }

    public String getHldppno() {
        return hldppno;
    }

    public void setHldppno(String hldppno) {
        this.hldppno = hldppno;
    }

    public String getHldtel() {
        return hldtel;
    }

    public void setHldtel(String hldtel) {
        this.hldtel = hldtel;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPinkey() {
        return pinkey;
    }

    public void setPinkey(String pinkey) {
        this.pinkey = pinkey;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getLinkmanAdd() {
        return linkmanAdd;
    }

    public void setLinkmanAdd(String linkmanAdd) {
        this.linkmanAdd = linkmanAdd;
    }

    public String getLinkmanAddPhone() {
        return linkmanAddPhone;
    }

    public void setLinkmanAddPhone(String linkmanAddPhone) {
        this.linkmanAddPhone = linkmanAddPhone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMmesno() {
        return mmesno;
    }

    public void setMmesno(String mmesno) {
        this.mmesno = mmesno;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactZipcode() {
        return contactZipcode;
    }

    public void setContactZipcode(String contactZipcode) {
        this.contactZipcode = contactZipcode;
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
    }

    public String getUnitZipcode() {
        return unitZipcode;
    }

    public void setUnitZipcode(String unitZipcode) {
        this.unitZipcode = unitZipcode;
    }

    public Short getPwdErrNum() {
        return pwdErrNum;
    }

    public void setPwdErrNum(Short pwdErrNum) {
        this.pwdErrNum = pwdErrNum;
    }

    public String getLockTimeLimit() {
        return lockTimeLimit;
    }

    public void setLockTimeLimit(String lockTimeLimit) {
        this.lockTimeLimit = lockTimeLimit;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getActiveAddress() {
        return activeAddress;
    }

    public void setActiveAddress(String activeAddress) {
        this.activeAddress = activeAddress;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }

    public String getOpenChannel() {
        return openChannel;
    }

    public void setOpenChannel(String openChannel) {
        this.openChannel = openChannel;
    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }

    public String getNetabbr() {
        return netabbr;
    }

    public void setNetabbr(String netabbr) {
        this.netabbr = netabbr;
    }

    public String getMchntNo() {
        return mchntNo;
    }

    public void setMchntNo(String mchntNo) {
        this.mchntNo = mchntNo;
    }

    public String getMchntAbbr() {
        return mchntAbbr;
    }

    public void setMchntAbbr(String mchntAbbr) {
        this.mchntAbbr = mchntAbbr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastSuccessLoginTime() {
        return lastSuccessLoginTime;
    }

    public void setLastSuccessLoginTime(String lastSuccessLoginTime) {
        this.lastSuccessLoginTime = lastSuccessLoginTime;
    }

    public String getLastSuccessLoginIp() {
        return lastSuccessLoginIp;
    }

    public void setLastSuccessLoginIp(String lastSuccessLoginIp) {
        this.lastSuccessLoginIp = lastSuccessLoginIp;
    }

    public String getLastFailLoginTime() {
        return lastFailLoginTime;
    }

    public void setLastFailLoginTime(String lastFailLoginTime) {
        this.lastFailLoginTime = lastFailLoginTime;
    }

    public String getLastFailLoginIp() {
        return lastFailLoginIp;
    }

    public void setLastFailLoginIp(String lastFailLoginIp) {
        this.lastFailLoginIp = lastFailLoginIp;
    }

    public String getInputdate() {
        return inputdate;
    }

    public void setInputdate(String inputdate) {
        this.inputdate = inputdate;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getvHldname() {
        return vHldname;
    }

    public void setvHldname(String vHldname) {
        this.vHldname = vHldname;
    }

    public String getvHldppno() {
        return vHldppno;
    }

    public void setvHldppno(String vHldppno) {
        this.vHldppno = vHldppno;
    }

    public String getvHldtel() {
        return vHldtel;
    }

    public void setvHldtel(String vHldtel) {
        this.vHldtel = vHldtel;
    }

    public String getRiskGrade() {
        return riskGrade;
    }

    public void setRiskGrade(String riskGrade) {
        this.riskGrade = riskGrade;
    }

    public String getRiskDate() {
        return riskDate;
    }

    public void setRiskDate(String riskDate) {
        this.riskDate = riskDate;
    }

    public String getIdValiddate() {
        return idValiddate;
    }

    public void setIdValiddate(String idValiddate) {
        this.idValiddate = idValiddate;
    }


}