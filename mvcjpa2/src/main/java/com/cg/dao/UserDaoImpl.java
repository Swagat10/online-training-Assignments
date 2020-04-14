package com.cg.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.User;


@Repository("usrdao")
@Transactional
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	private EntityManager em;
	
	


	@Override
	public void addUser(User u) {
       em.persist(u);
	}




	
   


	
	

}
