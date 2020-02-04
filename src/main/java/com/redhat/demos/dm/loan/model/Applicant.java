package com.redhat.demos.dm.loan.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Credit Score")
	private int creditScore;

	private java.lang.Boolean dd1;

	public Applicant() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public int getCreditScore() {
		return this.creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public java.lang.Boolean getDd1() {
		return this.dd1;
	}

	public void setDd1(java.lang.Boolean dd1) {
		this.dd1 = dd1;
	}

	public Applicant(java.lang.String name, int creditScore,
			java.lang.Boolean dd1) {
		this.name = name;
		this.creditScore = creditScore;
		this.dd1 = dd1;
	}

}