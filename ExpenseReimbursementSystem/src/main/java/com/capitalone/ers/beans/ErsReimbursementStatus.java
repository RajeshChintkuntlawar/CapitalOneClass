package com.capitalone.ers.beans;

public class ErsReimbursementStatus {
	private int ReimbursementStatusId;
	private String ReimbursementStatus;

	public ErsReimbursementStatus() {
		super();
	}

	public ErsReimbursementStatus(int reimbursementStatusId, String reimbursementStatus) {
		super();
		ReimbursementStatusId = reimbursementStatusId;
		ReimbursementStatus = reimbursementStatus;
	}

	public int getReimbursementStatusId() {
		return ReimbursementStatusId;
	}

	public void setReimbursementStatusId(int reimbursementStatusId) {
		ReimbursementStatusId = reimbursementStatusId;
	}

	public String getReimbursementStatus() {
		return ReimbursementStatus;
	}

	public void setReimbursementStatus(String reimbursementStatus) {
		ReimbursementStatus = reimbursementStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ReimbursementStatus == null) ? 0 : ReimbursementStatus.hashCode());
		result = prime * result + ReimbursementStatusId;
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
		ErsReimbursementStatus other = (ErsReimbursementStatus) obj;
		if (ReimbursementStatus == null) {
			if (other.ReimbursementStatus != null)
				return false;
		} else if (!ReimbursementStatus.equals(other.ReimbursementStatus))
			return false;
		if (ReimbursementStatusId != other.ReimbursementStatusId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ErsReimbursementStatus [ReimbursementStatusId=" + ReimbursementStatusId + ", ReimbursementStatus="
				+ ReimbursementStatus + "]";
	}

}
