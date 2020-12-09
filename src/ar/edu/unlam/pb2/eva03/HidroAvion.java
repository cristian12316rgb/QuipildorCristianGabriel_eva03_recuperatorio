package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class HidroAvion extends Vehiculo implements Volador,Acuatico{
	private Double profundidad=0d;
	private Double altura=0d;

	HidroAvion(Integer cod_Vehiculo, String descripcion) {
		super(cod_Vehiculo, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public void setProfundidad(Double nueva) {
		this.profundidad=nueva;
		
	}

	@Override
	public Double getAltura() {
		return altura;
	}

	@Override
	public void setAltura(Double nueva) {
		this.altura=nueva;
		
	}

}
