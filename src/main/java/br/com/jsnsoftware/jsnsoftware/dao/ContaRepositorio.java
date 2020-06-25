package br.com.jsnsoftware.jsnsoftware.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.jsnsoftware.jsnsoftware.modelo.Conta;

public interface ContaRepositorio extends JpaRepository<Conta , Long>{

	/*
	 @Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d LEFT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataLeftJoin();
*/

	

	/*
	@Query("SELECT u FROM Conta c WHERE u.conta_tipo = ?1 and u.name = ?2")
	Conta findUserByStatusAndName(Integer status, String name);
*/
	
	@Query(value = "SELECT * FROM Conta c", 
			  nativeQuery = true)
			List<Conta> buscarContas();
	

	@Query("SELECT c FROM Conta c WHERE c.contaTipo = ?1")
	List<Conta> buscarContasPorTipo(String contaTipo);
}
