package br.com.jsnsoftware.jsnsoftware.modelo;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;




@Entity
@Table(name="conta")
public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "conta_id")
    private Integer contaId;
    @Size(max = 45)
    @Column(name = "conta_nome")
    private String contaNome;
    @Size(max = 45)
    @Column(name = "conta_sobrenome")
    private String contaSobrenome;
    @Size(max = 45)
    @Column(name = "conta_tipo")
    private String contaTipo;
    @Size(max = 45)
    @Column(name = "conta_categoria")
    private String contaCategoria;
    @Size(max = 45)
    @Column(name = "conta_email")
    private String contaEmail;
    @Size(max = 45)
    @Column(name = "conta_apelido")
    private String contaApelido;
    @Column(name = "conta_data")
    @Temporal(TemporalType.DATE)
    private Date contaData;
    @Column(name = "conta_nascimento")
    @Temporal(TemporalType.DATE)
    private Date contaNascimento;
    @Size(max = 45)
    @Column(name = "conta_senha")
    private String contaSenha;
    @Lob
    @Size(max = 65535)
    @Column(name = "conta_foto")
    private String contaFoto;
    @Size(max = 45)
    @Column(name = "conta_telefone")
    private String contaTelefone;
    @Size(max = 45)
    @Column(name = "conta_cidade")
    private String contaCidade;
    @Size(max = 45)
    @Column(name = "conta_pais")
    private String contaPais;
    @Size(max = 45)
    @Column(name = "conta_cep")
    private String contaCep;
    @Size(max = 45)
    @Column(name = "conta_endereco")
    private String contaEndereco;
    @Size(max = 45)
    @Column(name = "conta_uf")
    private String contaUf;
  

    public Conta() {
    }

    
    
    public Conta(@Size(max = 45) String contaTipo) {
		super();
		this.contaTipo = contaTipo;
	}



	public Conta(Integer contaId) {
        this.contaId = contaId;
    }

    public Integer getContaId() {
        return contaId;
    }

    public void setContaId(Integer contaId) {
        this.contaId = contaId;
    }

    public String getContaNome() {
        return contaNome;
    }

    public void setContaNome(String contaNome) {
        this.contaNome = contaNome;
    }

    public String getContaSobrenome() {
        return contaSobrenome;
    }

    public void setContaSobrenome(String contaSobrenome) {
        this.contaSobrenome = contaSobrenome;
    }

    public String getContaTipo() {
        return contaTipo;
    }

    public void setContaTipo(String contaTipo) {
        this.contaTipo = contaTipo;
    }

    public String getContaCategoria() {
        return contaCategoria;
    }

    public void setContaCategoria(String contaCategoria) {
        this.contaCategoria = contaCategoria;
    }

    public String getContaEmail() {
        return contaEmail;
    }

    public void setContaEmail(String contaEmail) {
        this.contaEmail = contaEmail;
    }

    public String getContaApelido() {
        return contaApelido;
    }

    public void setContaApelido(String contaApelido) {
        this.contaApelido = contaApelido;
    }

    public Date getContaData() {
        return contaData;
    }

    public void setContaData(Date contaData) {
        this.contaData = contaData;
    }

    public Date getContaNascimento() {
        return contaNascimento;
    }

    public void setContaNascimento(Date contaNascimento) {
        this.contaNascimento = contaNascimento;
    }

    public String getContaSenha() {
        return contaSenha;
    }

    public void setContaSenha(String contaSenha) {
        this.contaSenha = contaSenha;
    }

    public String getContaFoto() {
        return contaFoto;
    }

    public void setContaFoto(String contaFoto) {
        this.contaFoto = contaFoto;
    }

    public String getContaTelefone() {
        return contaTelefone;
    }

    public void setContaTelefone(String contaTelefone) {
        this.contaTelefone = contaTelefone;
    }

    public String getContaCidade() {
        return contaCidade;
    }

    public void setContaCidade(String contaCidade) {
        this.contaCidade = contaCidade;
    }

    public String getContaPais() {
        return contaPais;
    }

    public void setContaPais(String contaPais) {
        this.contaPais = contaPais;
    }

    public String getContaCep() {
        return contaCep;
    }

    public void setContaCep(String contaCep) {
        this.contaCep = contaCep;
    }

    public String getContaEndereco() {
        return contaEndereco;
    }

    public void setContaEndereco(String contaEndereco) {
        this.contaEndereco = contaEndereco;
    }

    public String getContaUf() {
        return contaUf;
    }

    public void setContaUf(String contaUf) {
        this.contaUf = contaUf;
    }

 

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contaId != null ? contaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conta)) {
            return false;
        }
        Conta other = (Conta) object;
        if ((this.contaId == null && other.contaId != null) || (this.contaId != null && !this.contaId.equals(other.contaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jsnsoftware [ contaId=" + contaId + " ]";
    }
    
}
