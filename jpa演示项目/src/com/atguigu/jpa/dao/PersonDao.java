package com.atguigu.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.atguigu.jpa.spring.entities.Person;

@Repository
public class PersonDao {

	//��λ�ȡ���͵�ǰ��������� EntityManager ������ ?
	//ͨ�� @PersistenceContext ע������ǳ�Ա����!
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Person person){
		entityManager.persist(person);
	}
	
}
