package com.user.Interface.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class node {
	
	private @Id @GeneratedValue int ID;
	private int PARENTID;
	private String CLLI;
	private String DEVICETYPE;
	private String NAME;
	private String IPADDRESS1;
	private String IPADDRESS2;
	private String EMSID;
	private String NETWORKNAME;
	private String CREATEDTIME;
	private String STATE;
	private String REFERENCEID;
	private String DISCOVERYSTATUS;
	private String MARTENSDEVICENAME;
	private String CENTRALOFFICE;
	public int getID() {
		return ID;
	}
	public int getPARENTID() {
		return PARENTID;
	}
	public String getCLLI() {
		return CLLI;
	}
	public String getDEVICETYPE() {
		return DEVICETYPE;
	}
	public String getNAME() {
		return NAME;
	}
	public String getIPADDRESS1() {
		return IPADDRESS1;
	}
	public String getIPADDRESS2() {
		return IPADDRESS2;
	}
	public String getEMSID() {
		return EMSID;
	}
	public String getNETWORKNAME() {
		return NETWORKNAME;
	}
	public String getCREATEDTIME() {
		return CREATEDTIME;
	}
	public String getSTATE() {
		return STATE;
	}
	public String getREFERENCEID() {
		return REFERENCEID;
	}
	public String getDISCOVERYSTATUS() {
		return DISCOVERYSTATUS;
	}
	public String getMARTENSDEVICENAME() {
		return MARTENSDEVICENAME;
	}
	public String getCENTRALOFFICE() {
		return CENTRALOFFICE;
	}
	
	

}
