
class PruebaAlineadas {

	
	void probar(){
		
		EscenarioEspacial mapa = new EscenarioEspacial(12, 9);
		
		mapa.colocarBaseEn(5, 5);
		
//		mapa.colocarAsteroideEn(8,6);
		mapa.colocarAsteroideEn(3,4);
		
		MisionAlineadas mision = new MisionAlineadas();
		
//		Nave nave = new Nave();
		
		int valorDevuelto;
		
		valorDevuelto = mision.ejecutar();
		
		System.out.println(valorDevuelto);
	}
}
