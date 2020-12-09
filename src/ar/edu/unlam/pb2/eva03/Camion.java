package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Camion extends Vehiculo implements Terrestre{
	private Double velocidad=0d;

	Camion(Integer cod_Vehiculo, String descripcion) {
		super(cod_Vehiculo, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

	@Override
	public void setVelocidad(Double nueva) {
		this.velocidad=nueva;
	}

}
