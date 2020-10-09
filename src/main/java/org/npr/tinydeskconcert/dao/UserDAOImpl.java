package org.npr.tinydeskconcert.dao;

import java.util.Optional;

import org.npr.tinydeskconcert.domain.ContestUser;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
	@Override
	public Optional<ContestUser> create(ContestUser contestUser) {
		return Optional.of(contestUser);
	}
	
	@Override
	public Optional<ContestUser> read(String username) {
		return Optional.of(new ContestUser.Builder() //
				.username(username) //
				.build());
	}
	
	@Override
	public Optional<ContestUser> update(ContestUser contestUser) {
		return Optional.of(contestUser);	
	}
	
	@Override
	public boolean delete(String username) {
		return true;
	}
}
