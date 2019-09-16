
class MisionRebote {

	
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
				System.out.println(vacioAlNorte);
			}
			
			if (vacioAlNorte){
				for(int i=0;i<pasos;i++){
				
					nave.avanzarAlSur();
				}
			}
			pasos++;
		}
	}
}

