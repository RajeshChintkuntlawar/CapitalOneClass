package com.capitalone.ers.beans;

import java.sql.Timestamp;

public class ErsReimbursement {
	private int ReimbId;
	private String ReimbAmount;
	private Timestamp ReimbSubmitted;
	private Timestamp ReimbResolved;
	private String ReimbDescription;
	private String ReimbReceipt;
	private int ReimbAuthor;
	private int ReimbResolver;
	private int ReimbStatusId;
	private int ReimbTypeId;

	public ErsReimbursement() {
		super();
	}

	public ErsReimbursement(int reimbId, String reimbAmount, Timestamp reimbSubmitted, Timestamp reimbResolved,
			String reimbDescription, String reimbReceipt, int reimbAuthor, int reimbResolver, int reimbStatusId,
			int reimbTypeId) {
		super();
		ReimbId = reimbId;
		ReimbAmount = reimbAmount;
		ReimbSubmitted = reimbSubmitted;
		ReimbResolved = reimbResolved;
		ReimbDescription = reimbDescription;
		ReimbReceipt = reimbReceipt;
		ReimbAuthor = reimbAuthor;
		ReimbResolver = reimbResolver;
		ReimbStatusId = reimbStatusId;
		ReimbTypeId = reimbTypeId;
	}

	public int getReimbId() {
		return ReimbId;
	}

	public void setReimbId(int reimbId) {
		ReimbId = reimbId;
	}

	public String getReimbAmount() {
		return ReimbAmount;
	}

	public void setReimbAmount(String reimbAmount) {
		ReimbAmount = reimbAmount;
	}

	public Timestamp getReimbSubmitted() {
		return ReimbSubmitted;
	}

	public void setReimbSubmitted(Timestamp reimbSubmitted) {
		ReimbSubmitted = reimbSubmitted;
	}

	public Timestamp getReimbResolved() {
		return ReimbResolved;
	}

	public void setReimbResolved(Timestamp reimbResolved) {
		ReimbResolved = reimbResolved;
	}

	public String getReimbDescription() {
		return ReimbDescription;
	}

	public void setReimbDescription(String reimbDescription) {
		ReimbDescription = reimbDescription;
	}

	public String getReimbReceipt() {
		return ReimbReceipt;
	}

	public void setReimbReceipt(String reimbReceipt) {
		ReimbReceipt = reimbReceipt;
	}

	public int getReimbAuthor() {
		return ReimbAuthor;
	}

	public void setReimbAuthor(int reimbAuthor) {
		ReimbAuthor = reimbAuthor;
	}

	public int getReimbResolver() {
		return ReimbResolver;
	}

	public void setReimbResolver(int reimbResolver) {
		ReimbResolver = reimbResolver;
	}

	public int getReimbStatusId() {
		return ReimbStatusId;
	}

	public void setReimbStatusId(int reimbStatusId) {
		ReimbStatusId = reimbStatusId;
	}

	public int getReimbTypeId() {
		return ReimbTypeId;
	}

	public void setReimbTypeId(int reimbTypeId) {
		ReimbTypeId = reimbTypeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ReimbAmount == null) ? 0 : ReimbAmount.hashCode());
		result = prime * result + ReimbAuthor;
		result = prime * result + ((ReimbDescription == null) ? 0 : ReimbDescription.hashCode());
		result = prime * result + ReimbId;
		result = prime * result + ((ReimbReceipt == null) ? 0 : ReimbReceipt.hashCode());
		result = prime * result + ((ReimbResolved == null) ? 0 : ReimbResolved.hashCode());
		result = prime * result + ReimbResolver;
		result = prime * result + ReimbStatusId;
		result = prime * result + ((ReimbSubmitted == null) ? 0 : ReimbSubmitted.hashCode());
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
		ErsReimbursement other = (ErsReimbursement) obj;
		if (ReimbAmount == null) {
			if (other.ReimbAmount != null)
				return false;
		} else if (!ReimbAmount.equals(other.ReimbAmount))
			return false;
		if (ReimbAuthor != other.ReimbAuthor)
			return false;
		if (ReimbDescription == null) {
			if (other.ReimbDescription != null)
				return false;
		} else if (!ReimbDescription.equals(other.ReimbDescription))
			return false;
		if (ReimbId != other.ReimbId)
			return false;
		if (ReimbReceipt == null) {
			if (other.ReimbReceipt != null)
				return false;
		} else if (!ReimbReceipt.equals(other.ReimbReceipt))
			return false;
		if (ReimbResolved == null) {
			if (other.ReimbResolved != null)
				return false;
		} else if (!ReimbResolved.equals(other.ReimbResolved))
			return false;
		if (ReimbResolver != other.ReimbResolver)
			return false;
		if (ReimbStatusId != other.ReimbStatusId)
			return false;
		if (ReimbSubmitted == null) {
			if (other.ReimbSubmitted != null)
				return false;
		} else if (!ReimbSubmitted.equals(other.ReimbSubmitted))
			return false;
		if (ReimbTypeId != other.ReimbTypeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ErsReimbursement [ReimbId=" + ReimbId + ", ReimbAmount=" + ReimbAmount + ", ReimbSubmitted="
				+ ReimbSubmitted + ", ReimbResolved=" + ReimbResolved + ", ReimbDescription=" + ReimbDescription
				+ ", ReimbReceipt=" + ReimbReceipt + ", ReimbAuthor=" + ReimbAuthor + ", ReimbResolver=" + ReimbResolver
				+ ", ReimbStatusId=" + ReimbStatusId + ", ReimbTypeId=" + ReimbTypeId + "]";
	}

}
