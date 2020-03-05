package jieyi.accservice.dao;

import jieyi.accservice.form.TPrepositionInstkey;
/**
 * 外部通讯密钥接口类
 * @ClassName:     TPrepositionInstkeyMapper
 * @Description:   综合前置用来查询外部的通讯密钥，在外部报文解包后验签和应答组包时签名
 * @author:        lacet
 * @date:          2019年3月28日 下午1:57:20
 *
 */
public interface TPrepositionInstkeyMapper {
    int deleteByPrimaryKey(TPrepositionInstkey key);

    int insert(TPrepositionInstkey record);

    int insertSelective(TPrepositionInstkey record);

    TPrepositionInstkey selectByPrimaryKey(TPrepositionInstkey key);

    int updateByPrimaryKeySelective(TPrepositionInstkey record);

    int updateByPrimaryKey(TPrepositionInstkey record);
}