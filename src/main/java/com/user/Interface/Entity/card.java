package com.user.Interface.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class card {
	private @Id @GeneratedValue int ID;
	private int PARENTID;
	private String NAME;
	private String CLEI;
	private String EQUIPPEDTYPE;
	private String ACTUALTYPE;
	private String OPERSTATUS;
	private String PARTNO;
	private String SERNO;
	private String POSITION;
	private String SWVERSION;
	private String ADMINSTATUS;
	private String UPDATEDTIME;
	private String REFERENCEID;
	private String EMSID;
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
	public String getEQUIPPEDTYPE() {
		return EQUIPPEDTYPE;
	}
	public String getACTUALTYPE() {
		return ACTUALTYPE;
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
	public String getPOSITION() {
		return POSITION;
	}
	public String getSWVERSION() {
		return SWVERSION;
	}
	public String getADMINSTATUS() {
		return ADMINSTATUS;
	}
	public String getUPDATEDTIME() {
		return UPDATEDTIME;
	}
	public String getREFERENCEID() {
		return REFERENCEID;
	}
	public String getEMSID() {
		return EMSID;
	}
	
	

}
