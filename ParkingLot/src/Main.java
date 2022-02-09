
import com.ram.parkinglot.Motorcycle;
import com.ram.parkinglot.ParkingLot;

import java.util.Scanner;

//import com.ram.parkinglot.ParkingSpot;
import com.ram.parkinglot.Car;

public class Main {

	public static void main(String[] args) {

		ParkingLot P1 = new ParkingLot(2);
		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		boolean quit = false;
		String part2 = null;
		String part3 = null;
		int part4 = 0;
		Car c1 = null;
		do {
			System.out.print("Enter a Operation VechileNo Name: ");
			String str = sc.nextLine(); // reads string
			System.out.println("You have entered: " + str);

			String[] parts = str.split(" ");
			String part1 = parts[0]; // 004
			if (part1.isEmpty()) {
				quit = true;

			} else {

				part2 = parts[1];
				//part3 = parts[2];
				c1 = new Car(part2, "ram");
				
				if (part1 =="leave") {
					part4 = Integer.parseInt(parts[2]);
					System.out.println("part4: " + part4);
				}
				
			}
			// System.out.println("part1 " + part1 +" " + "part2 " + part2);

			/*
			 * if (parts[1] != null && parts[2] != null) { c1 = new Car(part2,part3); }
			 */

			switch (part1) {

			case "park":

				P1.parkVehicle(c1);
				break;

			case "leave":
				P1.leave1(c1, part4);
				break;

			default:
				System.out.println("\nInvalid Option");
				quit = true;
				break;

			}
		} while (!quit);
		// ParkingLot P1 = new ParkingLot(2);

		/*
		 * Car c1 = new Car("8907","Ram"); Motorcycle c2 = new Motorcycle("4406","Ram");
		 * Car c3 = new Car("3346","Vimal"); Motorcycle c4 = new
		 * Motorcycle("0786","Vimal"); Car c5 = new Car("9503","Ram");
		 * P1.parkVehicle(c1); P1.parkVehicle(c2); P1.parkVehicle(c3); //
		 * P1.ComapnyParked("Ram"); // P1.ComapnyParked("Vimal"); // P1.parkVehicle(c4);
		 * // P1.leave(c2,0); // P1.leave(c4,1); //Note that c2 is from Ram //
		 * P1.ComapnyParked("Ram"); P1.parkVehicle(c4); P1.parkVehicle(c5);
		 */

	}
}
