package com.capitalone.ers.beans;

public class ErsUserRoles {
	private int ErsUserRoleId;
	private String UserRole;

	public ErsUserRoles() {
		super();
	}

	public ErsUserRoles(int ersUserRoleId, String userRole) {
		super();
		ErsUserRoleId = ersUserRoleId;
		UserRole = userRole;
	}

	public int getErsUserRoleId() {
		return ErsUserRoleId;
	}

	public void setErsUserRoleId(int ersUserRoleId) {
		ErsUserRoleId = ersUserRoleId;
	}

	public String getUserRole() {
		return UserRole;
	}

	public void setUserRole(String userRole) {
		UserRole = userRole;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ErsUserRoleId;
		result = prime * result + ((UserRole == null) ? 0 : UserRole.hashCode());
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
		ErsUserRoles other = (ErsUserRoles) obj;
		if (ErsUserRoleId != other.ErsUserRoleId)
			return false;
		if (UserRole == null) {
			if (other.UserRole != null)
				return false;
		} else if (!UserRole.equals(other.UserRole))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ErsUserRoles [ErsUserRoleId=" + ErsUserRoleId + ", UserRole=" + UserRole + "]";
	}

}
