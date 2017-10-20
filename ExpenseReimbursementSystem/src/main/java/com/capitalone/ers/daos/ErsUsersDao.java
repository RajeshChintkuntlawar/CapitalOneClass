package com.capitalone.ers.daos;

import com.capitalone.ers.beans.ErsUsers;

public interface ErsUsersDao {
	public ErsUsers findUserId(String username);
}
