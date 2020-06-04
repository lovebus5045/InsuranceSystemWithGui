package insurnaceDesinging;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import control.cFireInsuranceDesigning;
import insurance.carInsurance;
import insurance.insuranceList;
import insurance.insuranceListImpl;
import insurance.onTheSeaInsurance;
import insurance.specialInsurance;
import insurnaceTool.underWriter;

public class insuranceDesigning {

	private int insuranceID;
	private underWriter underWriter;
	private insuranceList insuranceList;
	private String subscriptionTarget;
	private int payment;
	private String insurancePeriod;
	private String paymentMethod;
	private int insuranceMoney;
	private String compensationAmount;
	private String notes;
	private String specialSubscription;
	private String SeaInsurancetype;
	private String SpecialType;
	private boolean waitList = true;
	private int selectInsurance;


	public insuranceDesigning() {

		this.underWriter = new underWriter();
		
	}

	public void association(cFireInsuranceDesigning cFireInsuranceDesigning) {

	}

	public void addPremiumRate() {
		this.underWriter.CalculatePremiumRate();
	}



}