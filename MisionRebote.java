
class MisionRebote {

	
	void ejecutar(){
		
		new BatallaEspacial();
		Nave nave = new Nave();
		Radar radar = nave.obtenerRadar();
		
		nave.despegar();
		nave.avanzarAlNorte();
		
		// la uso para ir aumentando la cantidad de veces que la nave se mueve 
		// para arriba y para abajo
		int pasos = 1;
		
		
		boolean vacioAlNorte = radar.escanearNorte() == Espectro.VACIO;
		
		// solo mientras que el casillero que esta al norte de la nave este vacio
		while (vacioAlNorte){
			
			// muevo para arriba 'pasos' veces
			for(int i=0;i<pasos;i++){
				
				nave.avanzarAlNorte();
				// redefino la variable vacioAlNorte para que si cuando esta moviendo arriba
				// detecta un asteroide, sale del while, porque no hace el if de abajo
				vacioAlNorte = radar.escanearNorte() == Espectro.VACIO;
			}
			// solo si arriba no hay nada voy a ir para abajo 'pasos' veces
			if (vacioAlNorte){
				for(int i=0;i<pasos;i++){
			
					nave.avanzarAlSur();
				}
			}
			pasos++;
		}
	}
}

