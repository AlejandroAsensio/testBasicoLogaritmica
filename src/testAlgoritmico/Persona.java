package testAlgoritmico;

public class Persona {
	private String sexo;
	private int edad;
	
	public Persona() {
	}
	public Persona( int edad,String sexo) {
		
		this.edad = edad;
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
