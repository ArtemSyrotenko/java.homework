/**
 * @author Artem Syrotenko
 * @version 1.0
 * Main class
*/
public class Main{
	/**
	 * Main method
	*/
	public static void main(String[] args) {
		System.out.println();
		Boiler gbl1 = new GazBoiler("gbl001", "Double Room Water Heater", "KBF", 7000, 350, 87.653, new int[]{65, 65, 120}, new int[]{0, 40}, new int[]{0, 1});

		System.out.println(String.format("Price: %d\nPower: %d\nTempRange(low high): %s\nCurrent temperature: %d", gbl1.getPrice(), gbl1.getPower(), gbl1.getTempRange(), gbl1.getTemperature()));

		gbl1.turnBoilerOn();

		gbl1.setTemperature(30);

		System.out.println(String.format("Current temperature: %d\nCurrent mode: %d",gbl1.getTemperature(), gbl1.getMode()));

		gbl1.turnBoilerOff();

		System.out.println("\n\n");

		Boiler ebl1 = new ElectricalBoiler("ElBoiler1", "Electrical Bedroom Water Heater", "ElBoilers #1", 16000, 700, 46.902, new int[]{50, 45, 80}, new int[]{0, 80}, new int[]{0, 1, 2});

		System.out.println(String.format("Price: %d\nPower: %d\nTempRange(low high): %s\nCurrent temperature: %d", ebl1.getPrice(), ebl1.getPower(), ebl1.getTempRange(), ebl1.getTemperature()));

		ebl1.turnBoilerOn();

		ebl1.setTemperature(30);

		System.out.println(String.format("Current temperature: %d\nCurrent mode: %d",ebl1.getTemperature(), ebl1.getMode()));

		ebl1.turnBoilerOff();
	}
}