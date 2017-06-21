package main;

public class Canidos extends Mascota {

	private float calidadColmillo;
	
	/*
	// Llamada al m�todo constructor del padre - #1
	public Canidos(String nombre){
		super(nombre);
	}
	*/
	
	// Llamada al m�todo constructor del padre - #2
	public Canidos(String nombre, float peso, float altura, float largo){
		super(nombre, peso, altura, largo);
		this.calidadColmillo = 1;
	}
	
	// M�todos sobreescritos
	@Override
	public float getEstadoNutricion(){
		return getPeso()/(getAltura()*getLargo());
	}
	 
	@Override
	public String toString(){
		return "Esto es un perro";
	}

	@Override // definir metodo abstracto de herencia
	public float getPesoRacion() {
		return 0.3f*getPeso()*(2f-calidadColmillo);
	}
	
	public float getCalidadColmillo() {
		return calidadColmillo;
	}


	public void setCalidadColmillo(float calidadColmillo) {
		this.calidadColmillo = calidadColmillo;
	}


}
