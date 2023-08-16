package com.user.Interface.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class shelf {
	private @Id @GeneratedValue int ID;
	private int PARENTID;
	private String NAME;
	private String CLEI;
	private String HWREV;
	private String PARTNO;
	private String SERIALNUMBER;
	private String POSITION;
	private String COTID;
	private String IPADDRESS;
	private String EMSID;
	private String COT;
	private String UPDATEDTIME;
	private String REFERENCEID;
	public int getID() {
		return ID;
	}
	public int getPARENTID() {
		return PARENTID;
	}
	public String getNAME() {
		return NAME;
	}
	public String getCLEI() {
		return CLEI;
	}
	public String getHWREV() {
		return HWREV;
	}
	public String getPARTNO() {
		return PARTNO;
	}
	public String getSERIALNUMBER() {
		return SERIALNUMBER;
	}
	public String getPOSITION() {
		return POSITION;
	}
	public String getCOTID() {
		return COTID;
	}
	public String getIPADDRESS() {
		return IPADDRESS;
	}
	public String getEMSID() {
		return EMSID;
	}
	public String getCOT() {
		return COT;
	}
	public String getUPDATEDTIME() {
		return UPDATEDTIME;
	}
	public String getREFERENCEID() {
		return REFERENCEID;
	}
	
	

}
