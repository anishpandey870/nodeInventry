package com.user.Interface.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class port {
	private @Id @GeneratedValue int ID;
	private int PARENTID;
	private String NAME;
	private String POSITION;
	private String PORTTYPE;
	private String ACTUALTYPE;
	private String ADMINSTATUS;
	private String OPERSTATUS;
	private String PARTNO;
	private String SERNO;
	private String PROFILE;
	private String SCP;
	private String EMSID;
	private String UPDATEDTIME;
	private String SVCTYPE;
	private int NODEID;
	private String TEMPLATE;
	private String SUBSCRIBERID;
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
	public String getPOSITION() {
		return POSITION;
	}
	public String getPORTTYPE() {
		return PORTTYPE;
	}
	public String getACTUALTYPE() {
		return ACTUALTYPE;
	}
	public String getADMINSTATUS() {
		return ADMINSTATUS;
	}
	public String getOPERSTATUS() {
		return OPERSTATUS;
	}
	public String getPARTNO() {
		return PARTNO;
	}
	public String getSERNO() {
		return SERNO;
	}
	public String getPROFILE() {
		return PROFILE;
	}
	public String getSCP() {
		return SCP;
	}
	public String getEMSID() {
		return EMSID;
	}
	public String getUPDATEDTIME() {
		return UPDATEDTIME;
	}
	public String getSVCTYPE() {
		return SVCTYPE;
	}
	public int getNODEID() {
		return NODEID;
	}
	public String getTEMPLATE() {
		return TEMPLATE;
	}
	public String getSUBSCRIBERID() {
		return SUBSCRIBERID;
	}
	public String getREFERENCEID() {
		return REFERENCEID;
	}
	
	

}
