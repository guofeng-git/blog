package jieyi.accservice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jieyi.accservice.form.TParAccType;

@Repository
public interface TParAccTypeMapper extends BaseDaoMapper {
	
	List<TParAccType> selectAll(Object oject);
}