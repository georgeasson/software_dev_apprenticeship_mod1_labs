package lab8;

public class Lab8Car {

	private String model;
	private double speed;
	
	public Lab8Car() {
		this.model = "";
		this.speed = 0;
	}
	
	public Lab8Car(String model) {
		this.model = "";
		this.speed = 0;
	}
		public String getModel() {
			return this.model;
		}
		
		public double getSpeed() {
			return this.speed;
		}
		
		public void setModel(String model) {
			this.model = model;
		}
		
		public void setSpeed(double speed) {
			this.speed = speed;
		}
		
		public void accelerate(int seconds) {
			this.speed += 5 * seconds;
		}
		
		public void getToSixty() {
			this.setSpeed(60);
		}
		
	
}
