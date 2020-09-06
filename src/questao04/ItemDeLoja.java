package questao04;

public class ItemDeLoja {

	private int codigoDoitem;
	private String nomeDoItem;
	private String descricaoDoItem;
	private double valorDoItem;

/////////////////////////construtores/////////////////////////////////////////////////////	
	public ItemDeLoja(int codigoDoitem, String nomeDoItem, String descricaoDoItem, double valorDoItem) {
		super();
		this.codigoDoitem = codigoDoitem;
		this.nomeDoItem = nomeDoItem;
		this.descricaoDoItem = descricaoDoItem;
		this.valorDoItem = valorDoItem;
	}

/////////////////////////////////////gets / sets/////////////////////////////////////////////////////////////

	public void setCodigoDoitem(int codigoDoitem) {
		this.codigoDoitem = codigoDoitem;
	}

	public String getNomeDoItem() {
		return nomeDoItem;
	}

	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}

	public String getDescricaoDoItem() {
		return descricaoDoItem;
	}

	public void setDescricaoDoItem(String descricaoDoItem) {
		this.descricaoDoItem = descricaoDoItem;
	}

	public double getValorDoItem() {
		return valorDoItem;
	}

	public void setValorDoItem(double valorDoItem) {
		this.valorDoItem = valorDoItem;
	}

////////////////////////////////////////////////////////////////////////////////////////////////
	public int getIdentificador() {
		return codigoDoitem;

	}

}
