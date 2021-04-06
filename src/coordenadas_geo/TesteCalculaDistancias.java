package coordenadas_geo;

public class TesteCalculaDistancias {
	public static void main(String[] args) {
		//-15.9056633 -48.0700483
		GeoCoordinate pontoVilaButiquim = new GeoCoordinate(-15.9055783, -48.0700550);
		//-15.9056383 -48.0701633
		GeoCoordinate pontoMinhaCasa = new GeoCoordinate(-15.9056383,-48.0701633);
		double distancia = pontoVilaButiquim.distanceInKm(pontoMinhaCasa) * 1000;
		System.out.println("distancia => " + distancia);//227m ?!
	}
}
