package com.lti.dao;

import com.lti.model.Institute;

public interface InstituteDao {
	public int createInstitute(Institute institute);
	public void rollBackTransaction();

	public void commitTransaction();

	public void beginTransaction();
}
