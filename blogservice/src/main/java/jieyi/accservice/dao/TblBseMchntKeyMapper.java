package jieyi.accservice.dao;

import org.springframework.stereotype.Repository;

import jieyi.accservice.form.TParamMacposinfo;
import jieyi.accservice.form.TblBseMchntKey;
/**
 * 商户通讯秘钥接口类
 * @ClassName:     TblBseMchntKeyMapper
 * @Description:   综合前置主要用来查询商户和系统通讯秘钥
 * @author:        guofeng
 * @date:          2019年5月22日 上午9:23:38
 *
 */
@Repository
public interface TblBseMchntKeyMapper {
    int deleteByPrimaryKey(String mchntNo);

    int insert(TblBseMchntKey record);

    int insertSelective(TblBseMchntKey record);

    TblBseMchntKey selectByPrimaryKey(String mchntNo);
    
    TblBseMchntKey selectAll(Object object);

    int updateByPrimaryKeySelective(TblBseMchntKey record);

    int updateByPrimaryKey(TblBseMchntKey record);
}