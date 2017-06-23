package br.com.relatorioUniplus.model;

import java.sql.Date;

public class Relatorio {
	
	private int id;
	private Date emissao;
	private Date vencimento;
	private String parcela;
	private String nome;
	private String endereco;
	private String bairro;
	private String complemento;
	private String cep;
	private String cidade;
	private String estado;
	private String cnpjcpf;
	private String telefone;
	private String numeroendereco;
	private float valortotalnota;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getParcela() {
		return parcela;
	}
	public void setParcela(String parcela) {
		this.parcela = parcela;
	}
	public Date getEmissao() {
		return emissao;
	}
	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCnpjcpf() {
		return cnpjcpf;
	}
	public void setCnpjcpf(String cnpjcpf) {
		this.cnpjcpf = cnpjcpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNumeroendereco() {
		return numeroendereco;
	}
	public void setNumeroendereco(String numeroendereco) {
		this.numeroendereco = numeroendereco;
	}
	public float getValortotalnota() {
		return valortotalnota;
	}
	public void setValortotalnota(float valortotalnota) {
		this.valortotalnota = valortotalnota;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cnpjcpf == null) ? 0 : cnpjcpf.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((emissao == null) ? 0 : emissao.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroendereco == null) ? 0 : numeroendereco.hashCode());
		result = prime * result + ((parcela == null) ? 0 : parcela.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + Float.floatToIntBits(valortotalnota);
		result = prime * result + ((vencimento == null) ? 0 : vencimento.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Relatorio other = (Relatorio) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cnpjcpf == null) {
			if (other.cnpjcpf != null)
				return false;
		} else if (!cnpjcpf.equals(other.cnpjcpf))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (emissao == null) {
			if (other.emissao != null)
				return false;
		} else if (!emissao.equals(other.emissao))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroendereco == null) {
			if (other.numeroendereco != null)
				return false;
		} else if (!numeroendereco.equals(other.numeroendereco))
			return false;
		if (parcela == null) {
			if (other.parcela != null)
				return false;
		} else if (!parcela.equals(other.parcela))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (Float.floatToIntBits(valortotalnota) != Float.floatToIntBits(other.valortotalnota))
			return false;
		if (vencimento == null) {
			if (other.vencimento != null)
				return false;
		} else if (!vencimento.equals(other.vencimento))
			return false;
		return true;
	}
	
	

}
