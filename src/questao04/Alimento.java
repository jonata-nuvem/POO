package questao04;

public class Alimento extends ItemDeLoja {

	private Integer selo;

////////////////////construtores/////////////////////////////////////////////////////////
	public Alimento(int codigoDoitem, String nomeDoItem, String descricaoDoItem, double valorDoItem) {
		super(codigoDoitem, nomeDoItem, descricaoDoItem, valorDoItem);
		
	}
	
public Alimento(int codigoDoitem, String nomeDoItem, String descricaoDoItem, double valorDoItem, Integer selo) {
		super(codigoDoitem, nomeDoItem, descricaoDoItem, valorDoItem);
		this.selo = selo;
	}


////////////////////////get / set///////////////////////////////////////////////////	

public Integer getSelo() {
	return selo;
}

public void setSelo(Integer selo) {
	this.selo = selo;
}



/////////////////////metodo//////////////////////////////////////////////////////	
	public int getIdentificador() {
		return selo;
	}

	}
