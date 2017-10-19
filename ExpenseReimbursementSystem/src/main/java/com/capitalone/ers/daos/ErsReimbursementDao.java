package com.capitalone.ers.daos;

import java.util.List;

import com.capitalone.ers.beans.ErsReimbursement;

public interface ErsReimbursementDao {
	public List<ErsReimbursement> findByAuthor(int id);
}
