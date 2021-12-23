package com.example.demo;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@Component
public class User {
private int USER_ID;
private String PASSWORD;
private String USERNAME;
private String EMAIL;
private String FIRST_NAME;
private String LAST_NAME;
private Long CONTACT_NUMBER;
private String ROLE;
private boolean IS_ACTIVE;
private String DOB;
private String CREATED_ON;
public int getUSER_ID() {
	return USER_ID;
}
public void setUSER_ID(int uSER_ID) {
	USER_ID = uSER_ID;
}
public String getPASSWORD() {
	return PASSWORD;
}
public void setPASSWORD(String pASSWORD) {
	PASSWORD = pASSWORD;
}
public String getUSERNAME() {
	return USERNAME;
}
public void setUSERNAME(String uSERNAME) {
	USERNAME = uSERNAME;
}
public String getEMAIL() {
	return EMAIL;
}
public void setEMAIL(String eMAIL) {
	EMAIL = eMAIL;
}
public String getFIRST_NAME() {
	return FIRST_NAME;
}
public void setFIRST_NAME(String fIRST_NAME) {
	FIRST_NAME = fIRST_NAME;
}
public String getLAST_NAME() {
	return LAST_NAME;
}
public void setLAST_NAME(String lAST_NAME) {
	LAST_NAME = lAST_NAME;
}
public Long getCONTACT_NUMBER() {
	return CONTACT_NUMBER;
}
public void setCONTACT_NUMBER(Long cONTACT_NUMBER) {
	CONTACT_NUMBER = cONTACT_NUMBER;
}
public String getROLE() {
	return ROLE;
}
public void setROLE(String rOLE) {
	ROLE = rOLE;
}
public boolean isIS_ACTIVE() {
	return IS_ACTIVE;
}
public void setIS_ACTIVE(boolean iS_ACTIVE) {
	IS_ACTIVE = iS_ACTIVE;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public String getCREATED_ON() {
	return CREATED_ON;
}
public void setCREATED_ON(String cREATED_ON) {
	CREATED_ON = cREATED_ON;
}

}

	
