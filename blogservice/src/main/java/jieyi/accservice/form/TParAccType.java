package jieyi.accservice.form;
import org.apache.ibatis.type.Alias;
/**
 * 账户类型实体类
 * @author 
 * 数据库表 T_PAR_ACC_TYPE
 */
@Alias("TParAccType")
public class TParAccType {
    private String acctype;

    private String attclass;

    private String typename;

    private String typedesc;

    private String outAmtPer;

    private String cancellPer;

    private Long initSvAmt;

    private Long svBaseAmt;

    private Long maxConsAmt;

    private Long maxSvAmt;

    private Long maxOutAmt;

    private Long maxInAmt;

    private Long maxCashAmt;

    private Long dayMaxConsAmt;

    private Long dayMaxSvAmt;

    private Long dayMaxOutAmt;

    private Long dayMaxInAmt;

    private Long dayMaxCashAmt;

    private Long monMaxConsAmt;

    private Long monMaxSvAmt;

    private Long monMaxOutAmt;

    private Long monMaxInAmt;

    private Long monMaxCashAmt;

    private Long dayMaxConsCnt;

    private Long dayMaxSvCnt;

    private Long dayMaxOutCnt;

    private Long dayMaxInCnt;

    private Long dayMaxCashCnt;

    private Long monMaxConsCnt;

    private Long monMaxSvCnt;

    private Long monMaxOutCnt;

    private Long monMaxInCnt;

    private Long monMaxCashCnt;

    private String createUid;

    private String createTime;

    private String lastModifyUid;

    private String lastModifyTime;

    private String status;

    private String nrealOpenPer;

    private String cirSavePer;

    private Long realMaxAccBal;

    private Long nrealMaxAccBal;

    private Long realMaxSvAmt;

    private Long nrealMaxSvAmt;

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public String getAttclass() {
        return attclass;
    }

    public void setAttclass(String attclass) {
        this.attclass = attclass;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getTypedesc() {
        return typedesc;
    }

    public void setTypedesc(String typedesc) {
        this.typedesc = typedesc;
    }

    public String getOutAmtPer() {
        return outAmtPer;
    }

    public void setOutAmtPer(String outAmtPer) {
        this.outAmtPer = outAmtPer;
    }

    public String getCancellPer() {
        return cancellPer;
    }

    public void setCancellPer(String cancellPer) {
        this.cancellPer = cancellPer;
    }

    public Long getInitSvAmt() {
        return initSvAmt;
    }

    public void setInitSvAmt(Long initSvAmt) {
        this.initSvAmt = initSvAmt;
    }

    public Long getSvBaseAmt() {
        return svBaseAmt;
    }

    public void setSvBaseAmt(Long svBaseAmt) {
        this.svBaseAmt = svBaseAmt;
    }

    public Long getMaxConsAmt() {
        return maxConsAmt;
    }

    public void setMaxConsAmt(Long maxConsAmt) {
        this.maxConsAmt = maxConsAmt;
    }

    public Long getMaxSvAmt() {
        return maxSvAmt;
    }

    public void setMaxSvAmt(Long maxSvAmt) {
        this.maxSvAmt = maxSvAmt;
    }

    public Long getMaxOutAmt() {
        return maxOutAmt;
    }

    public void setMaxOutAmt(Long maxOutAmt) {
        this.maxOutAmt = maxOutAmt;
    }

    public Long getMaxInAmt() {
        return maxInAmt;
    }

    public void setMaxInAmt(Long maxInAmt) {
        this.maxInAmt = maxInAmt;
    }

    public Long getMaxCashAmt() {
        return maxCashAmt;
    }

    public void setMaxCashAmt(Long maxCashAmt) {
        this.maxCashAmt = maxCashAmt;
    }

    public Long getDayMaxConsAmt() {
        return dayMaxConsAmt;
    }

    public void setDayMaxConsAmt(Long dayMaxConsAmt) {
        this.dayMaxConsAmt = dayMaxConsAmt;
    }

    public Long getDayMaxSvAmt() {
        return dayMaxSvAmt;
    }

    public void setDayMaxSvAmt(Long dayMaxSvAmt) {
        this.dayMaxSvAmt = dayMaxSvAmt;
    }

    public Long getDayMaxOutAmt() {
        return dayMaxOutAmt;
    }

    public void setDayMaxOutAmt(Long dayMaxOutAmt) {
        this.dayMaxOutAmt = dayMaxOutAmt;
    }

    public Long getDayMaxInAmt() {
        return dayMaxInAmt;
    }

    public void setDayMaxInAmt(Long dayMaxInAmt) {
        this.dayMaxInAmt = dayMaxInAmt;
    }

    public Long getDayMaxCashAmt() {
        return dayMaxCashAmt;
    }

    public void setDayMaxCashAmt(Long dayMaxCashAmt) {
        this.dayMaxCashAmt = dayMaxCashAmt;
    }

    public Long getMonMaxConsAmt() {
        return monMaxConsAmt;
    }

    public void setMonMaxConsAmt(Long monMaxConsAmt) {
        this.monMaxConsAmt = monMaxConsAmt;
    }

    public Long getMonMaxSvAmt() {
        return monMaxSvAmt;
    }

    public void setMonMaxSvAmt(Long monMaxSvAmt) {
        this.monMaxSvAmt = monMaxSvAmt;
    }

    public Long getMonMaxOutAmt() {
        return monMaxOutAmt;
    }

    public void setMonMaxOutAmt(Long monMaxOutAmt) {
        this.monMaxOutAmt = monMaxOutAmt;
    }

    public Long getMonMaxInAmt() {
        return monMaxInAmt;
    }

    public void setMonMaxInAmt(Long monMaxInAmt) {
        this.monMaxInAmt = monMaxInAmt;
    }

    public Long getMonMaxCashAmt() {
        return monMaxCashAmt;
    }

    public void setMonMaxCashAmt(Long monMaxCashAmt) {
        this.monMaxCashAmt = monMaxCashAmt;
    }

    public Long getDayMaxConsCnt() {
        return dayMaxConsCnt;
    }

    public void setDayMaxConsCnt(Long dayMaxConsCnt) {
        this.dayMaxConsCnt = dayMaxConsCnt;
    }

    public Long getDayMaxSvCnt() {
        return dayMaxSvCnt;
    }

    public void setDayMaxSvCnt(Long dayMaxSvCnt) {
        this.dayMaxSvCnt = dayMaxSvCnt;
    }

    public Long getDayMaxOutCnt() {
        return dayMaxOutCnt;
    }

    public void setDayMaxOutCnt(Long dayMaxOutCnt) {
        this.dayMaxOutCnt = dayMaxOutCnt;
    }

    public Long getDayMaxInCnt() {
        return dayMaxInCnt;
    }

    public void setDayMaxInCnt(Long dayMaxInCnt) {
        this.dayMaxInCnt = dayMaxInCnt;
    }

    public Long getDayMaxCashCnt() {
        return dayMaxCashCnt;
    }

    public void setDayMaxCashCnt(Long dayMaxCashCnt) {
        this.dayMaxCashCnt = dayMaxCashCnt;
    }

    public Long getMonMaxConsCnt() {
        return monMaxConsCnt;
    }

    public void setMonMaxConsCnt(Long monMaxConsCnt) {
        this.monMaxConsCnt = monMaxConsCnt;
    }

    public Long getMonMaxSvCnt() {
        return monMaxSvCnt;
    }

    public void setMonMaxSvCnt(Long monMaxSvCnt) {
        this.monMaxSvCnt = monMaxSvCnt;
    }

    public Long getMonMaxOutCnt() {
        return monMaxOutCnt;
    }

    public void setMonMaxOutCnt(Long monMaxOutCnt) {
        this.monMaxOutCnt = monMaxOutCnt;
    }

    public Long getMonMaxInCnt() {
        return monMaxInCnt;
    }

    public void setMonMaxInCnt(Long monMaxInCnt) {
        this.monMaxInCnt = monMaxInCnt;
    }

    public Long getMonMaxCashCnt() {
        return monMaxCashCnt;
    }

    public void setMonMaxCashCnt(Long monMaxCashCnt) {
        this.monMaxCashCnt = monMaxCashCnt;
    }

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastModifyUid() {
        return lastModifyUid;
    }

    public void setLastModifyUid(String lastModifyUid) {
        this.lastModifyUid = lastModifyUid;
    }

    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNrealOpenPer() {
        return nrealOpenPer;
    }

    public void setNrealOpenPer(String nrealOpenPer) {
        this.nrealOpenPer = nrealOpenPer;
    }

    public String getCirSavePer() {
        return cirSavePer;
    }

    public void setCirSavePer(String cirSavePer) {
        this.cirSavePer = cirSavePer;
    }

    public Long getRealMaxAccBal() {
        return realMaxAccBal;
    }

    public void setRealMaxAccBal(Long realMaxAccBal) {
        this.realMaxAccBal = realMaxAccBal;
    }

    public Long getNrealMaxAccBal() {
        return nrealMaxAccBal;
    }

    public void setNrealMaxAccBal(Long nrealMaxAccBal) {
        this.nrealMaxAccBal = nrealMaxAccBal;
    }

    public Long getRealMaxSvAmt() {
        return realMaxSvAmt;
    }

    public void setRealMaxSvAmt(Long realMaxSvAmt) {
        this.realMaxSvAmt = realMaxSvAmt;
    }

    public Long getNrealMaxSvAmt() {
        return nrealMaxSvAmt;
    }

    public void setNrealMaxSvAmt(Long nrealMaxSvAmt) {
        this.nrealMaxSvAmt = nrealMaxSvAmt;
    }
}