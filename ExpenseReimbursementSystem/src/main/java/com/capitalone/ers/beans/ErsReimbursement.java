package com.capitalone.ers.beans;

import java.sql.Timestamp;

public class ErsReimbursement {
	private int ReimbId;
	private Double ReimbAmount;
	private Timestamp ReimbSubmitted;
	private Timestamp ReimbResolved;
	private String ReimbDescription;
	private String ReimbReceipt;
	private String ReimbAuthor;
	private String ReimbResolver;
	private String ReimbStatusId;
	private int ReimbTypeId;
	private String ReimbType;

	public ErsReimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErsReimbursement(int reimbId, Double reimbAmount, Timestamp reimbSubmitted, Timestamp reimbResolved,
			String reimbDescription, String reimbReceipt, String reimbAuthor, String reimbResolver,
			String reimbStatusId, int reimbTypeId) {
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

	public ErsReimbursement(int reimbId, Double reimbAmount, Timestamp reimbSubmitted, Timestamp reimbResolved,
			String reimbDescription, String reimbReceipt, String reimbAuthor, String reimbResolver,
			String reimbStatusId, String reimbType) {
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
		ReimbType = reimbType;
	}

	public int getReimbId() {
		return ReimbId;
	}

	public void setReimbId(int reimbId) {
		ReimbId = reimbId;
	}

	public Double getReimbAmount() {
		return ReimbAmount;
	}

	public void setReimbAmount(Double reimbAmount) {
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

	public String getReimbAuthor() {
		return ReimbAuthor;
	}

	public void setReimbAuthor(String reimbAuthor) {
		ReimbAuthor = reimbAuthor;
	}

	public String getReimbResolver() {
		return ReimbResolver;
	}

	public void setReimbResolver(String reimbResolver) {
		ReimbResolver = reimbResolver;
	}

	public String getReimbStatusId() {
		return ReimbStatusId;
	}

	public void setReimbStatusId(String reimbStatusId) {
		ReimbStatusId = reimbStatusId;
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
		result = prime * result + ((ReimbAmount == null) ? 0 : ReimbAmount.hashCode());
		result = prime * result + ((ReimbAuthor == null) ? 0 : ReimbAuthor.hashCode());
		result = prime * result + ((ReimbDescription == null) ? 0 : ReimbDescription.hashCode());
		result = prime * result + ReimbId;
		result = prime * result + ((ReimbReceipt == null) ? 0 : ReimbReceipt.hashCode());
		result = prime * result + ((ReimbResolved == null) ? 0 : ReimbResolved.hashCode());
		result = prime * result + ((ReimbResolver == null) ? 0 : ReimbResolver.hashCode());
		result = prime * result + ((ReimbStatusId == null) ? 0 : ReimbStatusId.hashCode());
		result = prime * result + ((ReimbSubmitted == null) ? 0 : ReimbSubmitted.hashCode());
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
		ErsReimbursement other = (ErsReimbursement) obj;
		if (ReimbAmount == null) {
			if (other.ReimbAmount != null)
				return false;
		} else if (!ReimbAmount.equals(other.ReimbAmount))
			return false;
		if (ReimbAuthor == null) {
			if (other.ReimbAuthor != null)
				return false;
		} else if (!ReimbAuthor.equals(other.ReimbAuthor))
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
		if (ReimbResolver == null) {
			if (other.ReimbResolver != null)
				return false;
		} else if (!ReimbResolver.equals(other.ReimbResolver))
			return false;
		if (ReimbStatusId == null) {
			if (other.ReimbStatusId != null)
				return false;
		} else if (!ReimbStatusId.equals(other.ReimbStatusId))
			return false;
		if (ReimbSubmitted == null) {
			if (other.ReimbSubmitted != null)
				return false;
		} else if (!ReimbSubmitted.equals(other.ReimbSubmitted))
			return false;
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
		return "ErsReimbursement [ReimbId=" + ReimbId + ", ReimbAmount=" + ReimbAmount + ", ReimbSubmitted="
				+ ReimbSubmitted + ", ReimbResolved=" + ReimbResolved + ", ReimbDescription=" + ReimbDescription
				+ ", ReimbReceipt=" + ReimbReceipt + ", ReimbAuthor=" + ReimbAuthor + ", ReimbResolver=" + ReimbResolver
				+ ", ReimbStatusId=" + ReimbStatusId + ", ReimbTypeId=" + ReimbTypeId + ", ReimbType=" + ReimbType
				+ "]";
	}


}