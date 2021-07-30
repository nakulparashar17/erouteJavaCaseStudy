package com.erouteJavaCaseStudy.erouteJavaStudy.erouteModel;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Biller {

	@Id
	private String blrId;
	private String billerName;
	private String billerDescription;
	private float adhocPayment;
	private String billerValue;
	private String supportBillValidation;
	private String blrCatName;
	private int blrCatId;
	private String billAcceptanceType;
	
	public Biller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Biller(String blrId, String billerName, String billerDescription, float adhocPayment, String billerValue,
			String supportBillValidation, String blrCatName, int blrCatId, String billAcceptanceType) {
		super();
		this.blrId = blrId;
		this.billerName = billerName;
		this.billerDescription = billerDescription;
		this.adhocPayment = adhocPayment;
		this.billerValue = billerValue;
		this.supportBillValidation = supportBillValidation;
		this.blrCatName = blrCatName;
		this.blrCatId = blrCatId;
		this.billAcceptanceType = billAcceptanceType;
	}

	public String getBlrId() {
		return blrId;
	}
	public void setBlrId(String blrId) {
		this.blrId = blrId;
	}
	public String getBillerName() {
		return billerName;
	}
	public void setBillerName(String billerName) {
		this.billerName = billerName;
	}
	public String getBillerDescription() {
		return billerDescription;
	}
	public void setBillerDescription(String billerDescription) {
		this.billerDescription = billerDescription;
	}
	public float getAdhocPayment() {
		return adhocPayment;
	}
	public void setAdhocPayment(float adhocPayment) {
		this.adhocPayment = adhocPayment;
	}
	public String getBillerValue() {
		return billerValue;
	}
	public void setBillerValue(String billerValue) {
		this.billerValue = billerValue;
	}
	public String getSupportBillValidation() {
		return supportBillValidation;
	}
	public void setSupportBillValidation(String supportBillValidation) {
		this.supportBillValidation = supportBillValidation;
	}
	public String getBlrCatName() {
		return blrCatName;
	}
	public void setBlrCatName(String blrCatName) {
		this.blrCatName = blrCatName;
	}
	public int getBlrCatId() {
		return blrCatId;
	}
	public void setBlrCatId(int blrCatId) {
		this.blrCatId = blrCatId;
	}
	public String getBillAcceptanceType() {
		return billAcceptanceType;
	}
	public void setBillAcceptanceType(String billAcceptanceType) {
		this.billAcceptanceType = billAcceptanceType;
	}

	@Override
	public String toString() {
		return "Biller [blrId=" + blrId + ", billerName=" + billerName + ", billerDescription=" + billerDescription
				+ ", adhocPayment=" + adhocPayment + ", billerValue=" + billerValue + ", supportBillValidation="
				+ supportBillValidation + ", blrCatName=" + blrCatName + ", blrCatId=" + blrCatId
				+ ", billAcceptanceType=" + billAcceptanceType + "]";
	}
	
}
