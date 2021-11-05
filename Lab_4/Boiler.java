/**
 * @author Artem Syrotenko
 * @version 1.0
 * abstract class for boilers
 */
abstract class Boiler{
	private String model, name, manufactor;
	private int price, power, mode, temperature;
	private double weight;
	private int[] metrics;
	private int[] tempRange;
	private int[] modes;
	private boolean condition;

	/**
	 * Methods for switching boiler on and off
	 */
	void turnBoilerOn() { this.condition = true; this.mode = modes[1]; System.out.println(this.name + " is turned on."); }
	void turnBoilerOff() { this.condition = false;  this.mode = -1; System.out.println(this.name + " is turned off."); }

	/**
	 * Getter for mode
	 * @return mode
	 */
	int getMode() { return mode; }
	/**
	 * Setter for mode
	 * @param value - the mode's index between all the modes
	 */
	void setMode(int value){
		for(int el : modes)
			if(el == value)
				mode = value;
	}

	/**
	 * Getter for temperature
	 * @return temperature
	 */
	int getTemperature() { return temperature; }
	/**
	 * Setter for temperature
	 * @param value - the temperature
	 */
	void setTemperature(int value){ if (value <= tempRange[1] && value >= tempRange[0]) temperature = value; }

	/**
	 * Getter for price
	 * @return price
	 */
	int getPrice() { return price; }
	/**
	 * Setter for price
	 * @param value - the price
	 */
	void setPrice(int value) { this.price = value; }

	/**
	 * Getter for model
	 * @return model
	 */
	String getModel() { return model; }
	/**
	 * Setter for model
	 * @param value - the model
	 */
	void setModel(String value) { this.model = value; }

	/**
	 * Getter for name
	 * @return name
	 */
	String getName() { return name; }
	/**
	 * Setter for name
	 * @param value - the name
	 */
	void setName(String value) { this.name = value; }

	/**
	 * Getter for manufactor
	 * @return manufactor
	 */
	String getManufactor() { return manufactor; }
	/**
	 * Setter for manufactor
	 * @param value - the manufactor
	 */
	void setManufactor(String value) { this.manufactor = value; }

	/**
	 * Getter for power
	 * @return power
	 */
	int getPower() { return power; }
	/**
	 * Setter for power
	 * @param value - the power
	 */
	void setPower(int value) { this.power = value; }
	
	/**
	 * Getter for weight
	 * @return weight
	 */
	double getWeight() { return weight; }
	/**
	 * Setter for weight
	 * @param value - the weight
	 */
	void setWeight(double value) { this.weight = value; }

	/**
	 * Getter for metrics[]
	 * @return metrics[]
	 */
	int[] getMetrics() { return metrics; }
	/**
	 * Setter for metrics
	 * @param value - the metrics
	 */
	void setMetrics(int[] value) { this.metrics = value; }
	
	/**
	 * Getter for model
	 * @return string
	 */
	String getTempRange() {
		String s = "";
		for(int temp : tempRange)
			s += temp + " ";
		return s;
	}
	/**
	 * Setter for tempRange
	 * @param value - the tempRange
	 */
	void setTempRange(int[] value) { this.tempRange = value; }
	
	/**
	 * Getter for modes[]
	 * @return modes[]
	 */
	int[] getModes() { return modes; }
	/**
	 * Setter for modes
	 * @param value - the modes
	 */
	void setModes(int[] value) { this.modes = value; }
}