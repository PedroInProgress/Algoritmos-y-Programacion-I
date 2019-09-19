
class MisionAlineadas {

	
	int ejecutar(){
		
//		new BatallaEspacial();
		
		Nave naveAlpha = new Nave();
		Nave naveBeta = new Nave();
		
		Radar radarAlpha = naveAlpha.obtenerRadar();
		Radar radarBeta = naveBeta.obtenerRadar();
		
		naveAlpha.despegar();
		naveAlpha.avanzarAlEste();
		
		naveBeta.despegar();
		naveBeta.avanzarAlOeste();
	
		int posYAlpha = 0;
		int posYBeta = 0;
		
		int direccion = 1;
		int pasos = 1;
		
		int vecesAlineados = 0;
		
		boolean permitirMovimientoAlpha = true;
		
		boolean naveAlphaLlegoAlBorde = false;
		boolean naveBetaLlegoAlBorde = false;
		
		int vecesQueAtaca = 5;
		
		
		// while de la nave Alpha
//		while(permitirMovimientoAlpha){
//	
//			for(int i=0;i<pasos;i++){
//				
//				if(radarAlpha.escanearNorte() != Espectro.VACIO || radarAlpha.escanearSur() != Espectro.VACIO){
//					permitirMovimientoAlpha = false;
//				}
//				
//				if(permitirMovimientoAlpha == true){
//					
//					if(direccion == 1){
//																				
//						naveAlpha.avanzarAlNorte();						
//					}
//					else if(direccion == -1){
//																					
//						naveAlpha.avanzarAlSur();
//					}					
//				}
//			}
//			pasos++;
//			direccion *= -1;
//		}
//		
//		
//		
//		// while de la nave Beta
//		while(radarBeta.escanearNorte() != Espectro.DESCONOCIDO && radarBeta.escanearSur() != Espectro.DESCONOCIDO){
//			
//			for(int i=0;i<pasos;i++){
//				
//				if(direccion == 1){
//						
//					while(radarBeta.escanearSur() == Espectro.ASTEROIDE){
//								
//						naveBeta.atacarAlSur();
//					}
//						
//					if(radarBeta.escanearSur() != Espectro.ASTEROIDE){
//							
//						naveBeta.avanzarAlSur();
//					}
//						
//					
//				}
//				else if(direccion == -1){
//					
//					while(radarBeta.escanearNorte() == Espectro.ASTEROIDE){
//								
//						naveBeta.atacarAlNorte();
//					}
//						
//					if(radarBeta.escanearNorte() != Espectro.ASTEROIDE){
//							
//						naveBeta.avanzarAlNorte();
//					}	
//				}
//			}	
//			pasos++;
//			direccion *= -1;
//		}
//		
		//while conjunto
		while(!(naveAlphaLlegoAlBorde && naveBetaLlegoAlBorde) || permitirMovimientoAlpha){
			
			vecesQueAtaca = 5;
			
			for(int i=0;i<pasos;i++){
				
				if(radarAlpha.escanearNorte() != Espectro.VACIO || radarAlpha.escanearSur() != Espectro.VACIO){
					permitirMovimientoAlpha = false;
					naveAlphaLlegoAlBorde = true;
				}
				if(radarAlpha.escanearNorte() == Espectro.DESCONOCIDO || radarAlpha.escanearSur() == Espectro.DESCONOCIDO){
					naveAlphaLlegoAlBorde = true;
				}
				if(radarBeta.escanearNorte() == Espectro.DESCONOCIDO || radarBeta.escanearSur() == Espectro.DESCONOCIDO){
					naveBetaLlegoAlBorde = true;
				}
				
				if(direccion == 1){
					
					if(permitirMovimientoAlpha && !(naveAlphaLlegoAlBorde)){
						
						naveAlpha.avanzarAlNorte();
						posYAlpha++;
					}
					
					while(radarBeta.escanearSur() == Espectro.ASTEROIDE && vecesQueAtaca >= 0){
						
						naveBeta.atacarAlSur();
						vecesQueAtaca--;
					}
						
					if(radarBeta.escanearSur() != Espectro.ASTEROIDE && !(naveBetaLlegoAlBorde)){
							
						naveBeta.avanzarAlSur();
						posYBeta--;
					}
					
				}
				else if(direccion == -1){
					
					if(permitirMovimientoAlpha && !(naveAlphaLlegoAlBorde)){
						
						naveAlpha.avanzarAlSur();
						posYAlpha--;
					}
					
					while(radarBeta.escanearNorte() == Espectro.ASTEROIDE && vecesQueAtaca >= 0){
						
						naveBeta.atacarAlNorte();
						vecesQueAtaca--;
					}
						
					if(radarBeta.escanearNorte() != Espectro.ASTEROIDE && !(naveBetaLlegoAlBorde)){
							
						naveBeta.avanzarAlNorte();
						posYBeta++;
					}					
				}
				if(posYAlpha == posYBeta){
					
					vecesAlineados++;
				}
				System.out.println(vecesAlineados);
			}
			pasos++;
			direccion *= -1;		
			
			System.out.println(naveAlphaLlegoAlBorde);
			System.out.println(naveBetaLlegoAlBorde);
			System.out.println(!(naveAlphaLlegoAlBorde && naveBetaLlegoAlBorde));
			System.out.println(permitirMovimientoAlpha);
		}
		return vecesAlineados;
	}	
}


//int ejecutar(){
//	
////	new BatallaEspacial();
//	
//	Nave naveAlpha = new Nave();
//	Nave naveBeta = new Nave();
//	
//	Radar radarAlpha = naveAlpha.obtenerRadar();
//	Radar radarBeta = naveBeta.obtenerRadar();
//	
//	naveAlpha.despegar();
//	naveAlpha.avanzarAlEste();
//	
//	naveBeta.despegar();
//	naveBeta.avanzarAlOeste();
//	
//	int posYAlpha = 0;
//	int posYBeta = 0;
//	
//	int direccion = 1;
//	int pasos = 1;
//	
//	int vecesAlineados = 0;
//	
//	while((radarAlpha.escanearNorte() != Espectro.DESCONOCIDO && radarAlpha.escanearSur() != Espectro.DESCONOCIDO) 
//			|| (radarBeta.escanearNorte() != Espectro.DESCONOCIDO && radarBeta.escanearSur() != Espectro.DESCONOCIDO)){
//		
//		if (direccion == 1){
//			if(radarAlpha.escanearNorte() == Espectro.VACIO && radarBeta.escanearSur() == Espectro.VACIO){
//				  
//				for(int i=0;i<pasos;i++){
//					  
//					naveAlpha.avanzarAlNorte();
//					posYAlpha++;
//					  
//					naveBeta.avanzarAlSur();
//					posYBeta--;
//					
//					 if (posYAlpha == posYBeta){
//						  vecesAlineados++;
//						  System.out.println("DIRECCION 1------");  
//					 }
//				}
//			}
//			direccion *= -1;
//			pasos++;
//		}
//		  
//		else if (direccion == -1){
//			if(radarAlpha.escanearSur() == Espectro.VACIO && radarBeta.escanearNorte() == Espectro.VACIO){
//				  
//				for(int i=0;i<pasos;i++){
//						  
//					naveAlpha.avanzarAlSur();
//					posYAlpha--;
//						  
//					naveBeta.avanzarAlNorte();
//					posYBeta++;
//					
//					if (posYAlpha == posYBeta){
//						vecesAlineados++;
//						System.out.println("DIRECCION 2------");  
//					}
//				}
//			  }
//
//			direccion *= -1;
//			pasos++;
//		}
//		System.out.println(posYAlpha);
//		System.out.println(posYBeta);
//	}
//	return vecesAlineados;
//}	