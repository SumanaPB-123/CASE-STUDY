package com.example.demo;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;
@XmlRootElement

@Component
public class Task {
	

	private int  TASK_ID,  OWNER_ID,CREATOR_ID;
	private String NAME, DESCRIPTION, STATUS, PRIORITY, NOTES;
	private Boolean ISBOOKMARKED;
	private String CREATED_ON, STATUS_CHANGED_ON;
	public int getTASK_ID() {
		return TASK_ID;
	}
	public void setTASK_ID(int tASK_ID) {
		TASK_ID = tASK_ID;
	}
	public int getOWNER_ID() {
		return OWNER_ID;
	}
	public void setOWNER_ID(int oWNER_ID) {
		OWNER_ID = oWNER_ID;
	}
	public int getCREATOR_ID() {
		return CREATOR_ID;
	}
	public void setCREATOR_ID(int cREATOR_ID) {
		CREATOR_ID = cREATOR_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getPRIORITY() {
		return PRIORITY;
	}
	public void setPRIORITY(String pRIORITY) {
		PRIORITY = pRIORITY;
	}
	public String getNOTES() {
		return NOTES;
	}
	public void setNOTES(String nOTES) {
		NOTES = nOTES;
	}
	public Boolean getISBOOKMARKED() {
		return ISBOOKMARKED;
	}
	public void setISBOOKMARKED(Boolean iSBOOKMARKED) {
		ISBOOKMARKED = iSBOOKMARKED;
	}
	public String getCREATED_ON() {
		return CREATED_ON;
	}
	public void setCREATED_ON(String cREATED_ON) {
		CREATED_ON = cREATED_ON;
	}
	public String getSTATUS_CHANGED_ON() {
		return STATUS_CHANGED_ON;
	}
	public void setSTATUS_CHANGED_ON(String STATUS_CHANGED_ON) {
		STATUS_CHANGED_ON = STATUS_CHANGED_ON;
	}
	
	}



