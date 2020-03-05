package jieyi.accservice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jieyi.accservice.form.TInfoAccountCard;

@Repository
public interface TInfoAccountCardMapper extends BaseDaoMapper {
	
	List<TInfoAccountCard> isLargeCard(Object object);
	
	TInfoAccountCard selectByCardNo(Object object);
	
	List<TInfoAccountCard> selectByCustomerNo(Object object);
	
	List<TInfoAccountCard> selectAccount(Object object);
	
}