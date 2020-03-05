package jieyi.accservice.dao;

import org.springframework.stereotype.Repository;

import jieyi.accservice.form.TParamMacposinfo;
/**
 * 柜面终端管理接口类
 * @ClassName:     TParamMacposinfoMapper
 * @Description:   综合前置主要用来维护内部通讯密钥已经记录交易流水号等信息
 * @author:        lacet
 * @date:          2019年3月28日 下午1:56:38
 *
 */
@Repository
public interface TParamMacposinfoMapper {
    int deleteByPrimaryKey(String posid);

    int insert(TParamMacposinfo record);

    int insertSelective(TParamMacposinfo record);

    TParamMacposinfo selectByPrimaryKey(String posid);
    
    TParamMacposinfo selectAll(Object object);

    int updateByPrimaryKeySelective(TParamMacposinfo record);

    int updateByPrimaryKey(TParamMacposinfo record);
}