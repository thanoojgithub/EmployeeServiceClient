package com.client;

public class CustomerPOJO {

	@Override
	public String toString() {
		return cId + " " + cName;
	}

	private int cId;
	private String cName;
	public CustomerPOJO(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}

	

}
