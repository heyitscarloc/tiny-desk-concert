package org.npr.tinydeskconcert.dao;

import java.util.Optional;

import org.npr.tinydeskconcert.domain.ContestEntry;

public interface ContestEntryDAO {

	Optional<ContestEntry> create(ContestEntry contestEntry);

	Optional<ContestEntry> read(String groupName);

	Optional<ContestEntry> update(ContestEntry contestEntry);

	boolean delete(String groupName);

}
