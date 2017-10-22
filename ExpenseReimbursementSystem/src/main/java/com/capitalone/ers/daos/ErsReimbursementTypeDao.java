package com.capitalone.ers.daos;

import com.capitalone.ers.beans.ErsReimbursementType;

public interface ErsReimbursementTypeDao {
	public ErsReimbursementType findById(int id);

	public ErsReimbursementType findByType(String reimbType);
}
