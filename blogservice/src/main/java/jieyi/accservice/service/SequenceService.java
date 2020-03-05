package jieyi.accservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import jieyi.accservice.dao.SequenceMapper;
/**
 * 
 * @ClassName:     SequenceService
 * @Description:   取数据库序列号的服务类
 * @author:        lacet
 * @date:          2019年3月28日 下午1:37:54
 *
 */
@Repository
public class SequenceService{
	@Autowired
	private SequenceMapper sequenceMapper;
	
	public String findNextValue(String sName) throws DataAccessException{
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("sName", sName);
		parameterMap.put("sValue", "");
		String sValue = sequenceMapper.findNextValue(parameterMap);
		if(StringUtils.isEmpty(sValue)){
			sValue = (String)parameterMap.get("sValue");
		}
		return sValue;
	}
}
