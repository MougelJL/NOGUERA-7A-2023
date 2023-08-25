public class Componente {
	private String nombre;
	private float valor;
	private String unidad;
	
	Componente ()
	Componente (String nombre, float valor, String unidad){
		this.nombre = nombre;
		this.valor = valor;
		this.unidad = unidad;
	}
	public void SetNombre (String nombre) {
		this.nombre = nombre;
	}
	public void Setvalor(float valor){
		this.valor = valor;
	}
	public void Set(String unidad){
		this.unidad = unidad;
	}
	
	public String GetNombre(){
		return nombre;
	}
	public float GetValor(){
		return valor;
	}
	public String GetUnidad(){
		return unidad;
	}
}