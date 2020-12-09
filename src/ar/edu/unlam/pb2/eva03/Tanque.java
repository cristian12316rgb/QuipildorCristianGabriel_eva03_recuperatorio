package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Tanque extends Vehiculo implements Terrestre {
	private Double velocidad=0d;

	Tanque(Integer cod_Vehiculo, String descripcion) {
		super(cod_Vehiculo, descripcion);
	}

	@Override
	public Double getVelocidad() {
		return velocidad;
	}

	@Override
	public void setVelocidad(Double nueva) {
		this.velocidad=nueva;
	}

}
