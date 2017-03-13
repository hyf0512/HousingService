package com.housing.management.backend.dao;

import com.housing.management.backend.domain.EmailUser;

public interface  EmailDAO {

	public abstract void setemailuser(EmailUser emailuser);
	public abstract Integer getemailid();
	public abstract void setmail(EmailUser emailuser);
	public abstract String getemailno(String emailno);
}
