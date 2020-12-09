package ar.edu.unlam.pb2.eva03;

public class Vehiculo {
	private Integer codigo;
	private String descripcion;
	
	Vehiculo(Integer cod_Vehiculo,String descripcion){
		this.codigo=cod_Vehiculo;
		this.descripcion=descripcion;
	}
	
	
	

	public Integer getCodigo() {
		return codigo;
	}




	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	

}
