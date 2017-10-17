package com.capitalone.ers.beans;

public class ErsUsers {
	private int ErsUsersId;
	private String ErsUserName;
	private String ErsUserPassword;
	private String ErsUserFirstName;
	private String ErsUserLastName;
	private String ErsUserEmail;
	private int ErsRoleId;

	public ErsUsers() {
		super();
	}

	public ErsUsers(int ersUsersId, String ersUserName, String ersUserPassword, String ersUserFirstName,
			String ersUserLastName, String ersUserEmail, int ersRoleId) {
		super();
		ErsUsersId = ersUsersId;
		ErsUserName = ersUserName;
		ErsUserPassword = ersUserPassword;
		ErsUserFirstName = ersUserFirstName;
		ErsUserLastName = ersUserLastName;
		ErsUserEmail = ersUserEmail;
		ErsRoleId = ersRoleId;
	}

	public int getErsUsersId() {
		return ErsUsersId;
	}

	public void setErsUsersId(int ersUsersId) {
		ErsUsersId = ersUsersId;
	}

	public String getErsUserName() {
		return ErsUserName;
	}

	public void setErsUserName(String ersUserName) {
		ErsUserName = ersUserName;
	}

	public String getErsUserPassword() {
		return ErsUserPassword;
	}

	public void setErsUserPassword(String ersUserPassword) {
		ErsUserPassword = ersUserPassword;
	}

	public String getErsUserFirstName() {
		return ErsUserFirstName;
	}

	public void setErsUserFirstName(String ersUserFirstName) {
		ErsUserFirstName = ersUserFirstName;
	}

	public String getErsUserLastName() {
		return ErsUserLastName;
	}

	public void setErsUserLastName(String ersUserLastName) {
		ErsUserLastName = ersUserLastName;
	}

	public String getErsUserEmail() {
		return ErsUserEmail;
	}

	public void setErsUserEmail(String ersUserEmail) {
		ErsUserEmail = ersUserEmail;
	}

	public int getErsRoleId() {
		return ErsRoleId;
	}

	public void setErsRoleId(int ersRoleId) {
		ErsRoleId = ersRoleId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ErsRoleId;
		result = prime * result + ((ErsUserEmail == null) ? 0 : ErsUserEmail.hashCode());
		result = prime * result + ((ErsUserFirstName == null) ? 0 : ErsUserFirstName.hashCode());
		result = prime * result + ((ErsUserLastName == null) ? 0 : ErsUserLastName.hashCode());
		result = prime * result + ((ErsUserName == null) ? 0 : ErsUserName.hashCode());
		result = prime * result + ((ErsUserPassword == null) ? 0 : ErsUserPassword.hashCode());
		result = prime * result + ErsUsersId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErsUsers other = (ErsUsers) obj;
		if (ErsRoleId != other.ErsRoleId)
			return false;
		if (ErsUserEmail == null) {
			if (other.ErsUserEmail != null)
				return false;
		} else if (!ErsUserEmail.equals(other.ErsUserEmail))
			return false;
		if (ErsUserFirstName == null) {
			if (other.ErsUserFirstName != null)
				return false;
		} else if (!ErsUserFirstName.equals(other.ErsUserFirstName))
			return false;
		if (ErsUserLastName == null) {
			if (other.ErsUserLastName != null)
				return false;
		} else if (!ErsUserLastName.equals(other.ErsUserLastName))
			return false;
		if (ErsUserName == null) {
			if (other.ErsUserName != null)
				return false;
		} else if (!ErsUserName.equals(other.ErsUserName))
			return false;
		if (ErsUserPassword == null) {
			if (other.ErsUserPassword != null)
				return false;
		} else if (!ErsUserPassword.equals(other.ErsUserPassword))
			return false;
		if (ErsUsersId != other.ErsUsersId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ErsUsers [ErsUsersId=" + ErsUsersId + ", ErsUserName=" + ErsUserName + ", ErsUserPassword="
				+ ErsUserPassword + ", ErsUserFirstName=" + ErsUserFirstName + ", ErsUserLastName=" + ErsUserLastName
				+ ", ErsUserEmail=" + ErsUserEmail + ", ErsRoleId=" + ErsRoleId + "]";
	}

}
