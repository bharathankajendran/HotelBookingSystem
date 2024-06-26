package com.wipro.bookingservice.model;

public class User {
	 	private int userId;
	    private String userName;
	    private String email;
	    private String password;
	    private String role;
	    private String mobile;
	    private String address;
	    
		public User(int userId, String userName, String email, String password, String role, String mobile,
				String address) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.email = email;
			this.password = password;
			this.role = role;
			this.mobile = mobile;
			this.address = address;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}
