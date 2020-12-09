package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Anfibio extends Vehiculo implements Acuatico,Terrestre{
	private Double velocidad=0d;
	private Double profundidad=0d;

	Anfibio(Integer cod_Vehiculo, String descripcion) {
		super(cod_Vehiculo, descripcion);
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

	@Override
	public void setVelocidad(Double nueva) {
		this.velocidad=nueva;
		
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public void setProfundidad(Double nueva) {
		this.profundidad=nueva;
		
	}

}
