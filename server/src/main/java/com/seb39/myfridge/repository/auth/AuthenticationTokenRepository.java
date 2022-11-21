package com.seb39.myfridge.repository.auth;

import com.seb39.myfridge.domain.auth.entity.AuthenticationToken;
import org.springframework.data.repository.CrudRepository;

public interface AuthenticationTokenRepository extends CrudRepository<AuthenticationToken, String> {
}
