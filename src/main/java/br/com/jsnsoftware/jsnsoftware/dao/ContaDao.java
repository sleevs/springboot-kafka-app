package br.com.jsnsoftware.jsnsoftware.dao;


import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.jsnsoftware.jsnsoftware.modelo.Conta;


public class ContaDao {

	@PersistenceContext
	private EntityManager entityManager;

	
	
	
	
	

}
