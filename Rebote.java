
class Rebote {

	void ejecutar(){
		
		new BatallaEspacial();
		Nave nave = new Nave();
		Radar radar = nave.obtenerRadar();
		
		nave.despegar();
		nave.avanzarAlNorte();
		
		int pasos = 1;
		
		boolean vacioAlNorte = radar.escanearNorte() == Espectro.VACIO;
		
		while (vacioAlNorte){
			
			for(int i=0;i<pasos;i++){
				
				nave.avanzarAlNorte();
				vacioAlNorte = radar.escanearNorte() == Espectro.VACIO;
			}
			
			// si el if no esta, la nave mueve para arriba 'pasos' veces, detecta que hay un asteroide
			// pero igual avanza hasta abajo y recien ahi para
			// y el ejercicio dice que tiene que parar si encuentra un obstaculo
			for(int i=0;i<pasos;i++){
				
				nave.avanzarAlSur();
			}
			
			pasos++;
		}
	}
	
}
