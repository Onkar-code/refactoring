package refactoring;

public class Vehicle {

	public static final int BASIC = 1;
	public static final int GENERAL = 2;
	public static final int LUXE = 3;
	
	private String marca;
	private String model;
	private int categoria;
	
	public Vehicle(String marca, String model, int categoria) {
		super();
		this.marca = marca;
		this.model = model;
		this.categoria = categoria;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public int getCategoria() {
		return categoria;
	}
	

}
