package taller3.televisores;

public class TV {
	public Marca marca;
	public int canal = 1;
	private int precio = 500;
	public boolean estado;
	public int volumen = 1;
	public Control control;
	private static int numTV;
	
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public static void setNumTV(int numerotv) {
		numTV = numerotv;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void canalUp() {
		if (estado == true && canal < 120 && canal >= 1) {
			canal++;
		}
		}
	
	public void canalDown() {
		if (estado == true && canal > 1 && canal <= 120) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if (estado == true && volumen < 7 && volumen >= 0) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if (estado == true && volumen > 0 && volumen <=7) {
			volumen--;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setMarca(Marca marca){
		this.marca = marca;
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
	
	public void setControl(Control control){
		this.control = control;
	}
	
	public Control getControl(){
		return control;
	}
	
	
	
}
