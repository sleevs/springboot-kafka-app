package br.com.jsnsoftware.jsnsoftware.business;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsnsoftware.jsnsoftware.dao.ContaDao;
import br.com.jsnsoftware.jsnsoftware.dao.ContaRepositorio;
import br.com.jsnsoftware.jsnsoftware.modelo.Conta;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Conta")
public class ContaBusiness {
	
	
	@Autowired
	ContaRepositorio produtoRepository;
	
	@ApiOperation(value="Retorna uma lista de Contas")
	@GetMapping("/contas")
	public List<Conta> listaProdutos(){
		return produtoRepository.buscarContas();
	}
	
	@ApiOperation(value="Retorna uma lista de Contratantes")
	@GetMapping("/contratantes")
	public List<Conta> buscarContratantes(){
		String temp = "CONTRATANTE";
		return produtoRepository.buscarContasPorTipo(temp);
	}


}
