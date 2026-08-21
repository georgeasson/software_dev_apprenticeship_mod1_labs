package lab8;

public class Lab8RacingCar extends Lab8Car {

	private String driver;
	private int turboFactor;
	
	public Lab8RacingCar(String driver, int turboFactor) {
		this.driver = driver;
		this.turboFactor = turboFactor;
		
	}
	
	@Override
	public void accelerate(int seconds) {
		super.accelerate(seconds);
		double newSpeed = this.getSpeed() * this.getTurboFactor();
		this.setSpeed(newSpeed);
	}
	
	public String getDriver() {
		return this.driver;
	}
	
	public double getTurboFactor() {
		return this.turboFactor;
	}
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
}
