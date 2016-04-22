package com.tekdays 

class TekUser {
	String fullName;
	String userName;
	String password;
	String email;
	String website;
	String bio;
	
	@Override
	public String toString() {
//		return super.toString();
		return fullName;
	}

    static constraints = {
		 fullName();
		 userName();
		 password();
		 email();
		 website();
		 bio();
		 
    }
}
