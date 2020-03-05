package jieyi.accservice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jieyi.accservice.form.TInfoCustomer;

@Repository
public interface TInfoCustomerMapper extends BaseDaoMapper {
	
	List<TInfoCustomer> selectAll(Object oject);
}