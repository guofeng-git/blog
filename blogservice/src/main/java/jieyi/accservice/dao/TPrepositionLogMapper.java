package jieyi.accservice.dao;

import jieyi.accservice.form.TPrepositionLog;
/**
 * 综合前置交易受理日志表接口类
 * @ClassName:     TPrepositionLogMapper
 * @Description:   用于记录所有综合前置发生的交易流水
 * @author:        lacet
 * @date:          2019年3月28日 下午1:58:24
 *
 */
public interface TPrepositionLogMapper {
    int deleteByPrimaryKey(TPrepositionLog key);

    int insert(TPrepositionLog record);

    int insertSelective(Object object);

    TPrepositionLog selectByPrimaryKey(TPrepositionLog key);

    int updateByPrimaryKeySelective(Object object);

    int updateByPrimaryKey(TPrepositionLog record);
}