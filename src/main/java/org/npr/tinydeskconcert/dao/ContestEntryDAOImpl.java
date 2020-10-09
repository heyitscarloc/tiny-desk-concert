package org.npr.tinydeskconcert.dao;

import java.util.Optional;

import org.npr.tinydeskconcert.domain.ContestEntry;
import org.springframework.stereotype.Repository;

// fake stubbing
@Repository
public class ContestEntryDAOImpl implements ContestEntryDAO {
	
	@Override
	public Optional<ContestEntry> create(ContestEntry contestEntry) {
		return Optional.of(contestEntry);
	}
	
	@Override
	public Optional<ContestEntry> read(String groupName) {
		return Optional.of(new ContestEntry.Builder() //
				.groupName(groupName) //
				.build());
	}
	
	@Override
	public Optional<ContestEntry> update(ContestEntry contestEntry) {
		return Optional.of(contestEntry);
	}
	
	@Override
	public boolean delete(String groupName) {
		return true;
	}

}
