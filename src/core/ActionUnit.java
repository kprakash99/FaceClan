package core;

public class ActionUnit {
	
	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public double getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	private int unit;
	private double level;
	
	ActionUnit(int unitNumber, double presence){
		unit = unitNumber;
		level = presence;
	}
	
	
}
