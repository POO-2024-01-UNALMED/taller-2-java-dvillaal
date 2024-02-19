package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento [] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int totalAsientos = 0;
		for (int i = 0 ; i < asientos.length; i++){
			if (asientos [i] != null) {
				totalAsientos++;
			}
		}
		return totalAsientos ;
	}
	
	public String verificarIntegridad() {
		if (this.registro == this.motor.registro) {
			for (int i = 0; i < asientos.length; i++ ) {
				if (asientos[i] != null) {
					if (asientos[i].registro != registro) {
						return "Las piezas no son originales";
					}	
				}
			}
			return "Auto original";
		} else {
			return "Las piezas no son originales";
		}
	}
}
