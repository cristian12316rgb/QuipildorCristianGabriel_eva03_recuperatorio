package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Avion extends Vehiculo implements Volador{
	private Double altura=0d;

	Avion(Integer cod_Vehiculo, String descripcion) {
		super(cod_Vehiculo, descripcion);
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}

	@Override
	public void setAltura(Double nueva) {
		this.altura=nueva;
	}

	

}
