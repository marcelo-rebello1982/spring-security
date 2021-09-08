package com.security.interfaces;


import com.security.auth.ApplicationUser;

import java.util.Optional;

public interface ApplicationUserDao {

    Optional<ApplicationUser> selectApplicationUserByUsername(String username);

}