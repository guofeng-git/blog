package jieyi.accservice.dao;

import jieyi.accservice.form.TInfoAccount;

import org.springframework.stereotype.Repository;

@Repository
public interface TInfoAccountMapper extends BaseDaoMapper {
	
	TInfoAccount selectOne(Object object);
	
	TInfoAccount selectByCustNo (Object object);
	
	int update(Object object);
}