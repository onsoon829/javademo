package ncs.test09;

public class PlaneTest {

	public static void main(String[] args) {
		 Airplane airplane = new Airplane("L747", 1000);
	        Cargoplane cargoplane = new Cargoplane("C40", 1000);
	        
	        int flight = 0;
	        int fuelSize = Distance * 30;
	        int refuel =  

	        System.out.println("Plane fuelSize");
	        System.out.println("-----------------------------");
	        System.out.println(airplane.getPlanename() + " " + airplane.getfuelSize());
	        System.out.println(cargoplane.getplaneName() + " " + cargoplane.getfuelSize());

	        airplane.flight(100);
	        cargoplane.flight(100);

	        System.out.println("100 운항");
	        System.out.println("Plane fuelSize");
	        System.out.println("-----------------------------");
	        System.out.println(airplane.getPlanename() + " " + airplane.getfuelSize());
	        System.out.println(cargoplane.getplaneName() + " " + cargoplane.getfuelSize());

	        airplane.refuel(200);
	        cargoplane.refuel(200);

	        System.out.println("200 주유");
	        System.out.println("Plane fuelSize");
	        System.out.println("-----------------------------");
	        System.out.println(airplane.getPlanename() + " " + airplane.getfuelSize());
	        System.out.println(cargoplane.getplaneName() + " " + cargoplane.getfuelSize());
	    }
	}