package com.Springrm.ci;

public class certificate {
	private int id;
	private String certificateName;
	public certificate(int id, String certificateName) {
		super();
		this.id = id;
		this.certificateName = certificateName;
	}
	
	
	@Override
	public String toString() {
		return "certificate [id=" + id + ", certificateName=" + certificateName + "]";
	}
	
	
}
