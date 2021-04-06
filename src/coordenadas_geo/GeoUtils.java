package coordenadas_geo;

/**
 * Utilit�rio para opera��es geogr�ficas
 * 
 * @author Thiago Galbiatti Vespa
 */
public class GeoUtils {

	/**
	 * Raio m�dio da terra em quil�metros Ref:
	 * http://en.wikipedia.org/wiki/Earth_radius
	 */
	public static int EARTH_RADIUS_KM = 6371;

	/**
	 * Dist�ncia entre dois pontos geogr�ficos. Os valores devem ser informados
	 * em graus.
	 * 
	 * @param firstLatitude
	 *            Latitude do primeiro ponto
	 * @param firstLongitude
	 *            Longitude do primeiro ponto
	 * @param secondLatitude
	 *            Latitude do segundo ponto
	 * @param secondLongitude
	 *            Longitude do segundo ponto
	 * 
	 * @return Dist�ncia em quil�metros entre os dois pontos
	 */
	public static double geoDistanceInKm(double firstLatitude,
			double firstLongitude, double secondLatitude, double secondLongitude) {

		// Convers�o de graus pra radianos das latitudes
		double firstLatToRad = Math.toRadians(firstLatitude);
		double secondLatToRad = Math.toRadians(secondLatitude);

		// Diferen�a das longitudes
		double deltaLongitudeInRad = Math.toRadians(secondLongitude
				- firstLongitude);

		// C�lcula da dist�ncia entre os pontos
		return Math.acos(Math.cos(firstLatToRad) * Math.cos(secondLatToRad)
				* Math.cos(deltaLongitudeInRad) + Math.sin(firstLatToRad)
				* Math.sin(secondLatToRad))
				* EARTH_RADIUS_KM;
	}

	/**
	 * Dist�ncia entre dois pontos geogr�ficos.
	 * 
	 * @param first
	 *            Primeira coordenada geogr�fica
	 * @param second
	 *            Segunda coordenada geogr�fica
	 * @return Dist�ncia em quil�metros entre os dois pontos
	 */
	public static double geoDistanceInKm(GeoCoordinate first,
			GeoCoordinate second) {
		return geoDistanceInKm(first.getLatitude(), first.getLongitude(),
				second.getLatitude(), second.getLongitude());
	}

}
