package myJsp;

//import javax.servlet.http.HttpServletRequest;

public class User {
	private String userName;
	private String userPassword;
	
	private String firstName;
	private String lastName;
	private String IDNumber;
	private String homeAddress;
	private String zipCode;
	private String foreignCountry;
	private String foreignState;
	private String foreignZip;
	private String maritalStatus_1;
	private String maritalStatus_2;
	private String fill_3;
	private String fill_4;
	private String fill_5;
	private String fill_6;
	private String fill_7;
	private String fill_8;
	private String fill_9;
	private String fill_10;
	private String fill_11;
	private String fill_12;
	private String fill_13;
	private String fill_14;
	private String fill_15;
	private String fill_16_check_1;
	private String fill_16_check_2;
	private String fill_16;
	private String fill_17;
	private String fill_18_a;
	private String fill_18_b;
	private String fill_19;
	private String fill_20;
	private String fill_21;
	private String fill_22;
	private String fill_23_a;
	private String fill_23_b;
	private String fill_23_c_check_1;
	private String fill_23_c_check_2;
	private String fill_23_d;
	private String fill_23_e;
	private String fill_24;
	
	public User(){
		userName = "";
		userPassword = "";
		firstName = "";
		lastName = "";
		IDNumber = "";
		homeAddress = "";
		zipCode = "";
		foreignCountry = "";
		foreignState = "";
		foreignZip = "";
		maritalStatus_1 = "";
		maritalStatus_2 = "";
		this.fill_3 = "";
		this.fill_4 = "";
		this.fill_5 = "";
		this.fill_6 = "";
		this.fill_7 = "";
		this.fill_8 = "";
		this.fill_9 = "";
		this.fill_10 = "";
		this.fill_11 = "";
		this.fill_12 = "";
		this.fill_13 = "";
		this.fill_14 = "";
		this.fill_15 = "";
		this.fill_16_check_1 = "";
		this.fill_16_check_2 = "";
		this.fill_16 = "";
		this.fill_17 = "";
		this.fill_18_a = "";
		this.fill_18_b = "";
		this.fill_19 = "";
		this.fill_20 = "";
		this.fill_21 = "";
		this.fill_22 = "";
		this.fill_23_a = "";
		this.fill_23_b = "";
		this.fill_23_c_check_1 = "";
		this.fill_23_c_check_2 = "";
		this.fill_23_d = "";
		this.fill_23_e = "";
		this.fill_24 = "";		
	}
	
	public User(String userName, String userPassword, String firstName, String lastName, String iDNumber,
			String homeAddress, String zipCode, String foreignCountry, String foreignState, String foreignZip,
			String maritalStatus_1, String maritalStatus_2, String fill_3, String fill_4, String fill_5, String fill_6,
			String fill_7, String fill_8, String fill_9, String fill_10, String fill_11, String fill_12, String fill_13,
			String fill_14, String fill_15, String fill_16_check_1, String fill_16_check_2, String fill_16,
			String fill_17, String fill_18_a, String fill_18_b, String fill_19, String fill_20, String fill_21,
			String fill_22, String fill_23_a, String fill_23_b, String fill_23_c_check_1, String fill_23_c_check_2,
			String fill_23_d, String fill_23_e, String fill_24) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		IDNumber = iDNumber;
		this.homeAddress = homeAddress;
		this.zipCode = zipCode;
		this.foreignCountry = foreignCountry;
		this.foreignState = foreignState;
		this.foreignZip = foreignZip;
		this.maritalStatus_1 = maritalStatus_1;
		this.maritalStatus_2 = maritalStatus_2;
		this.fill_3 = fill_3;
		this.fill_4 = fill_4;
		this.fill_5 = fill_5;
		this.fill_6 = fill_6;
		this.fill_7 = fill_7;
		this.fill_8 = fill_8;
		this.fill_9 = fill_9;
		this.fill_10 = fill_10;
		this.fill_11 = fill_11;
		this.fill_12 = fill_12;
		this.fill_13 = fill_13;
		this.fill_14 = fill_14;
		this.fill_15 = fill_15;
		this.fill_16_check_1 = fill_16_check_1;
		this.fill_16_check_2 = fill_16_check_2;
		this.fill_16 = fill_16;
		this.fill_17 = fill_17;
		this.fill_18_a = fill_18_a;
		this.fill_18_b = fill_18_b;
		this.fill_19 = fill_19;
		this.fill_20 = fill_20;
		this.fill_21 = fill_21;
		this.fill_22 = fill_22;
		this.fill_23_a = fill_23_a;
		this.fill_23_b = fill_23_b;
		this.fill_23_c_check_1 = fill_23_c_check_1;
		this.fill_23_c_check_2 = fill_23_c_check_2;
		this.fill_23_d = fill_23_d;
		this.fill_23_e = fill_23_e;
		this.fill_24 = fill_24;
	}
	
	public void setAllParameters(String userName, String userPassword, String firstName, String lastName, String iDNumber,
			String homeAddress, String zipCode, String foreignCountry, String foreignState, String foreignZip,
			String maritalStatus_1, String maritalStatus_2, String fill_3, String fill_4, String fill_5, String fill_6,
			String fill_7, String fill_8, String fill_9, String fill_10, String fill_11, String fill_12, String fill_13,
			String fill_14, String fill_15, String fill_16_check_1, String fill_16_check_2, String fill_16,
			String fill_17, String fill_18_a, String fill_18_b, String fill_19, String fill_20, String fill_21,
			String fill_22, String fill_23_a, String fill_23_b, String fill_23_c_check_1, String fill_23_c_check_2,
			String fill_23_d, String fill_23_e, String fill_24) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		IDNumber = iDNumber;
		this.homeAddress = homeAddress;
		this.zipCode = zipCode;
		this.foreignCountry = foreignCountry;
		this.foreignState = foreignState;
		this.foreignZip = foreignZip;
		this.maritalStatus_1 = maritalStatus_1;
		this.maritalStatus_2 = maritalStatus_2;
		this.fill_3 = fill_3;
		this.fill_4 = fill_4;
		this.fill_5 = fill_5;
		this.fill_6 = fill_6;
		this.fill_7 = fill_7;
		this.fill_8 = fill_8;
		this.fill_9 = fill_9;
		this.fill_10 = fill_10;
		this.fill_11 = fill_11;
		this.fill_12 = fill_12;
		this.fill_13 = fill_13;
		this.fill_14 = fill_14;
		this.fill_15 = fill_15;
		this.fill_16_check_1 = fill_16_check_1;
		this.fill_16_check_2 = fill_16_check_2;
		this.fill_16 = fill_16;
		this.fill_17 = fill_17;
		this.fill_18_a = fill_18_a;
		this.fill_18_b = fill_18_b;
		this.fill_19 = fill_19;
		this.fill_20 = fill_20;
		this.fill_21 = fill_21;
		this.fill_22 = fill_22;
		this.fill_23_a = fill_23_a;
		this.fill_23_b = fill_23_b;
		this.fill_23_c_check_1 = fill_23_c_check_1;
		this.fill_23_c_check_2 = fill_23_c_check_2;
		this.fill_23_d = fill_23_d;
		this.fill_23_e = fill_23_e;
		this.fill_24 = fill_24;
	}
	
	public int validate(){
		if(userName == null && userPassword == null) return -1;
		if(userName == null && userPassword != null) return -2;
		if(userName != null && userPassword == null) return -3;
		if(userName == "" && userPassword == "") return -1;		
		if(userName == "" && userPassword != "") return -2;
		if(userName != "" && userPassword == "") return -3;
		if(userName.length() <= 2 && userPassword.length() <= 2) return -4;
		if(userName.length() <= 2 && userPassword.length() > 2) return -5;
		if(userName.length() > 2 && userPassword.length() <= 2) return -6;
		else return 1;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getForeignCountry() {
		return foreignCountry;
	}

	public void setForeignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
	}

	public String getForeignState() {
		return foreignState;
	}

	public void setForeignState(String foreignState) {
		this.foreignState = foreignState;
	}

	public String getForeignZip() {
		return foreignZip;
	}

	public void setForeignZip(String foreignZip) {
		this.foreignZip = foreignZip;
	}

	public String getMaritalStatus_1() {
		return maritalStatus_1;
	}

	public void setMaritalStatus_1(String maritalStatus_1) {
		this.maritalStatus_1 = maritalStatus_1;
	}

	public String getMaritalStatus_2() {
		return maritalStatus_2;
	}

	public void setMaritalStatus_2(String maritalStatus_2) {
		this.maritalStatus_2 = maritalStatus_2;
	}

	public String getFill_3() {
		return fill_3;
	}

	public void setFill_3(String fill_3) {
		this.fill_3 = fill_3;
	}

	public String getFill_4() {
		return fill_4;
	}

	public void setFill_4(String fill_4) {
		this.fill_4 = fill_4;
	}

	public String getFill_5() {
		return fill_5;
	}

	public void setFill_5(String fill_5) {
		this.fill_5 = fill_5;
	}

	public String getFill_6() {
		return fill_6;
	}

	public void setFill_6(String fill_6) {
		this.fill_6 = fill_6;
	}

	public String getFill_7() {
		return fill_7;
	}

	public void setFill_7(String fill_7) {
		this.fill_7 = fill_7;
	}

	public String getFill_8() {
		return fill_8;
	}

	public void setFill_8(String fill_8) {
		this.fill_8 = fill_8;
	}

	public String getFill_9() {
		return fill_9;
	}

	public void setFill_9(String fill_9) {
		this.fill_9 = fill_9;
	}

	public String getFill_10() {
		return fill_10;
	}

	public void setFill_10(String fill_10) {
		this.fill_10 = fill_10;
	}

	public String getFill_11() {
		return fill_11;
	}

	public void setFill_11(String fill_11) {
		this.fill_11 = fill_11;
	}

	public String getFill_12() {
		return fill_12;
	}

	public void setFill_12(String fill_12) {
		this.fill_12 = fill_12;
	}

	public String getFill_13() {
		return fill_13;
	}

	public void setFill_13(String fill_13) {
		this.fill_13 = fill_13;
	}

	public String getFill_14() {
		return fill_14;
	}

	public void setFill_14(String fill_14) {
		this.fill_14 = fill_14;
	}

	public String getFill_15() {
		return fill_15;
	}

	public void setFill_15(String fill_15) {
		this.fill_15 = fill_15;
	}

	public String getFill_16_check_1() {
		return fill_16_check_1;
	}

	public void setFill_16_check_1(String fill_16_check_1) {
		this.fill_16_check_1 = fill_16_check_1;
	}

	public String getFill_16_check_2() {
		return fill_16_check_2;
	}

	public void setFill_16_check_2(String fill_16_check_2) {
		this.fill_16_check_2 = fill_16_check_2;
	}

	public String getFill_16() {
		return fill_16;
	}

	public void setFill_16(String fill_16) {
		this.fill_16 = fill_16;
	}

	public String getFill_17() {
		return fill_17;
	}

	public void setFill_17(String fill_17) {
		this.fill_17 = fill_17;
	}

	public String getFill_18_a() {
		return fill_18_a;
	}

	public void setFill_18_a(String fill_18_a) {
		this.fill_18_a = fill_18_a;
	}

	public String getFill_18_b() {
		return fill_18_b;
	}

	public void setFill_18_b(String fill_18_b) {
		this.fill_18_b = fill_18_b;
	}

	public String getFill_19() {
		return fill_19;
	}

	public void setFill_19(String fill_19) {
		this.fill_19 = fill_19;
	}

	public String getFill_20() {
		return fill_20;
	}

	public void setFill_20(String fill_20) {
		this.fill_20 = fill_20;
	}

	public String getFill_21() {
		return fill_21;
	}

	public void setFill_21(String fill_21) {
		this.fill_21 = fill_21;
	}

	public String getFill_22() {
		return fill_22;
	}

	public void setFill_22(String fill_22) {
		this.fill_22 = fill_22;
	}

	public String getFill_23_a() {
		return fill_23_a;
	}

	public void setFill_23_a(String fill_23_a) {
		this.fill_23_a = fill_23_a;
	}

	public String getFill_23_b() {
		return fill_23_b;
	}

	public void setFill_23_b(String fill_23_b) {
		this.fill_23_b = fill_23_b;
	}

	public String getFill_23_c_check_1() {
		return fill_23_c_check_1;
	}

	public void setFill_23_c_check_1(String fill_23_c_check_1) {
		this.fill_23_c_check_1 = fill_23_c_check_1;
	}

	public String getFill_23_c_check_2() {
		return fill_23_c_check_2;
	}

	public void setFill_23_c_check_2(String fill_23_c_check_2) {
		this.fill_23_c_check_2 = fill_23_c_check_2;
	}

	public String getFill_23_d() {
		return fill_23_d;
	}

	public void setFill_23_d(String fill_23_d) {
		this.fill_23_d = fill_23_d;
	}

	public String getFill_23_e() {
		return fill_23_e;
	}

	public void setFill_23_e(String fill_23_e) {
		this.fill_23_e = fill_23_e;
	}

	public String getFill_24() {
		return fill_24;
	}

	public void setFill_24(String fill_24) {
		this.fill_24 = fill_24;
	}	
}
