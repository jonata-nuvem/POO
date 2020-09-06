package questao02;

import java.util.Date;

public class Produto {
	private Integer id;
	private String nome;
	private String descricao;
	private Date validade;

	
	public Produto(Integer id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	
	
	public Integer getCod() {
		return id;
	}

}


