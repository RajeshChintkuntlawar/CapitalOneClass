package com.capitalone.ers.beans;

public class ErsReimbursementType {
	private int ReimbTypeId;
	private String ReimbType;

	public ErsReimbursementType() {
		super();
	}

	public ErsReimbursementType(int reimbTypeId, String reimbType) {
		super();
		ReimbTypeId = reimbTypeId;
		ReimbType = reimbType;
	}

	public int getReimbTypeId() {
		return ReimbTypeId;
	}

	public void setReimbTypeId(int reimbTypeId) {
		ReimbTypeId = reimbTypeId;
	}

	public String getReimbType() {
		return ReimbType;
	}

	public void setReimbType(String reimbType) {
		ReimbType = reimbType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ReimbType == null) ? 0 : ReimbType.hashCode());
		result = prime * result + ReimbTypeId;
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
		ErsReimbursementType other = (ErsReimbursementType) obj;
		if (ReimbType == null) {
			if (other.ReimbType != null)
				return false;
		} else if (!ReimbType.equals(other.ReimbType))
			return false;
		if (ReimbTypeId != other.ReimbTypeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ErsReimbursementType [ReimbTypeId=" + ReimbTypeId + ", ReimbType=" + ReimbType + "]";
	}

}
