/**
 * @author Artem Syrotenko
 * @version 1.0
 */
public class ElectricalBoiler extends Boiler{
	/**
	 * Constructor for ElectricalBoiler objects
	 * @param model
	 * @param name
	 * @param manufactor
	 * @param price
	 * @param power
	 * @param weight
	 * @param metrics
	 * @param tempRange
	 * @param modes
	 */
	public ElectricalBoiler(String model, String name, String manufactor, int price, int power, double weight, int[] metrics, int[] tempRange, int[] modes){
		setModel("Electrical boiler " + model);
		setName("Electrical boiler \"" + name + "\"");
		setManufactor(manufactor);
		setPrice(price);
		setPower(power);
		setWeight(weight);
		setMetrics(metrics);
		setTempRange(tempRange);
		setModes(modes);

		setTemperature(0);
		setMode(-1);
	}
}