package com.educacionit.models;

//Clase hijo que hereda de vuelo
public class VueloCarga extends Vuelo {

	public int asientos = 12;
	public float espacioMaximoDeCarga = 1000;
	public float espacioCargaUsado;
	
	public void agregarPaquete(float altura ,float ancho ,float profundidad) {
		double size = altura * ancho * profundidad;
		
		if(espacioDeCargaDisponible(size)) {
			espacioCargaUsado += size;
			System.out.println("paquete agregado");
		}else {
			faltaEspacio();
		}
				
	}
	
	private void faltaEspacio() {
		System.out.println("No tenemos mas espacio de carga en la bodega");
		
	}

	private boolean espacioDeCargaDisponible(double tamanio) {
		return  espacioCargaUsado + tamanio <= espacioMaximoDeCarga ;
				
	}
	
	@Override
	public int getAsiento() {
		return 12;
	}
	
}
