package com.capitalone.ers.daos;

import com.capitalone.ers.beans.ErsUserRoles;

public interface ErsUserRolesDao {
	public ErsUserRoles findUserRole(String username, String password);
}
