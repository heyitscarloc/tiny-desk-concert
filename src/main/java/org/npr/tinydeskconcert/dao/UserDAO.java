package org.npr.tinydeskconcert.dao;

import java.util.Optional;

import org.npr.tinydeskconcert.domain.ContestUser;

public interface UserDAO {

	Optional<ContestUser> create(ContestUser contestUser);

	Optional<ContestUser> read(String username);

	Optional<ContestUser> update(ContestUser contestUser);

	boolean delete(String username);

}
