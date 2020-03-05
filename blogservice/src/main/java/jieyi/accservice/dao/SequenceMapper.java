package jieyi.accservice.dao ;

import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

/**
 * 
 * @ClassName:     SequenceMapper
 * @Description:   取数据库序列号的接口类
 * @author:        lacet
 * @date:          2019年3月28日 下午1:36:47
 *
 */
@Repository
public interface SequenceMapper{
	public String findNextValue(Map<String, Object> parameterMap) throws DataAccessException;
	
	public String selectSyssesq(Map<String, Object> parameterMap) throws DataAccessException;
}
