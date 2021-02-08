package com.sb.beams;

public class Bike {

	private int id;
	private String make;
	private String engineCC;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", make=" + make + ", engineCC=" + engineCC + "]";
	}
	
}
