/**
 *
 * @author Jere
 */
/*
  respuesta propuesta: airplaneID es de tipo plane;
  en el constructor no construye el avion, solo para el parametro
 public Flight(Airplane plane, String departureId, String destinationId) {
        this.plane = plane;
        this.departureId = departureId;
        this.destinationId = destinationId;
    }


*/
public class Flight {
    private String airplaneId;
    private String airptDepCode;
    private String airptDestnCode;
    
    public Flight(String airplaneId, String airptDepCode, String airptDestnCode) {
        this.airplaneId = airplaneId;
        this.airptDepCode = airptDepCode;
        this.airptDestnCode = airptDestnCode;
    }

    public String getAirplaneId() {
        return airplaneId;
    }

    public String getAirptDepCode() {
        return airptDepCode;
    }

    public String getAirptDestnCode() {
        return airptDestnCode;
    }
}
