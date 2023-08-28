package taller3.televisores;

public class TV {
	public Marca marca;
	public int canal = 1;
	private int precio = 500;
	public boolean estado;
	public int volumen = 1;
	public Control control;
	private static int numTV = 0;
	
	
	TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public void setNumTV() {
		numTV = numTV++;
	}
	
	public void canalUp() {
		if (canal > 0 && canal < 120 && estado == true) {
			canal = canal++;
		}
		}
	
	public void canalDown() {
		if (canal > 1 && canal < 121 && estado == true) {
			canal = canal--;
		}
	}
	
	public void volumenUp() {
		if (volumen >= 0 && volumen < 7 && estado == true) {
			volumen = volumen++;
		}
	}
	
	public void volumenDown() {
		if (volumen > 0 && volumen < 8 && estado == true) {
			volumen = volumen--;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setMarca(){
		
		return;
	}
	
	public Marca getMarca(){
		return marca;
	}
	
	public void setCanal(int canal){
		this.canal = canal;
	}
	
	public int getCanal(){
		return canal;
	}
	
	public void setPrecio(int precio){
		this.precio = precio;
		;
	}
	
	public int getPrecio(){
		return precio;
	}
	
	public void setVolumen(int volumen){
		this.volumen = volumen;
	}
	
	public int getVolumen(){
		return volumen;
	}
	
	public void setControl(){
		return;
	}
	
	public Control getControl(){
		return control;
	}
	
	
	
}
