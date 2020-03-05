package jieyi.accservice.dao;

import java.util.List;

import jieyi.accservice.form.TLogOnlinePayment;
/**
 * 联机交易日志表数据库服务接口类
 * @ClassName:     TLogOnlinePaymentMapper
 * @Description:   只用于查询联机账户交易的流水
 * @author:        lacet
 * @date:          2019年3月28日 下午1:46:03
 *
 */
public interface TLogOnlinePaymentMapper {
	
	List<TLogOnlinePayment> selectByRefKey(Object object);
	
	TLogOnlinePayment selectByOrderNo(String orderNo);
	
	TLogOnlinePayment selectByRefno(Object object);
	
	List<TLogOnlinePayment> selectForTxnInfo(Object object);
	
	List<TLogOnlinePayment> selectForClose(Object object);
}