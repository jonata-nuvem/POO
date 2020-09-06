package questao04;

public class Ferramenta extends ItemDeLoja {

//////////////////atributos////////////////////////////////////////////////////////////////////
	private String categoria;
	private Integer serial;

//////////////////construtores////////////////////////////////////////////////////////////////////
	public Ferramenta(int codigoDoitem, String nomeDoItem, String descricaoDoItem, double valorDoItem) {
		super(codigoDoitem, nomeDoItem, descricaoDoItem, valorDoItem);
		// TODO Auto-generated constructor stub
	}

	public Ferramenta(int codigoDoitem, String nomeDoItem, String descricaoDoItem, double valorDoItem, String categoria,
			Integer serial) {
		super(codigoDoitem, nomeDoItem, descricaoDoItem, valorDoItem);
		this.categoria = categoria;
		this.serial = serial;
	}

///////////////////////get e set///////////////////////////////////////////////////

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getSerial() {
		return serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}

///////////////////////metodos///////////////////////////////////////////////////
	public int getIdentificador() {
		return serial;
	}

	public void separar(String valor) {

	}

	public void separar() {
/////duvida//////		
	}

}
