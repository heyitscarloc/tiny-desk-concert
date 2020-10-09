package org.npr.tinydeskconcert.service;

import org.npr.tinydeskconcert.domain.ContestEntry;
import org.npr.tinydeskconcert.domain.ContestUser;

public interface ContestEntryService {

	boolean submit(ContestUser contestUser, ContestEntry contestEntry);
	
}
