package org.npr.tinydeskconcert.service;

import org.npr.tinydeskconcert.dao.ContestEntryDAO;
import org.npr.tinydeskconcert.dao.UserDAO;
import org.npr.tinydeskconcert.domain.ContestEntry;
import org.npr.tinydeskconcert.domain.ContestUser;
import org.springframework.beans.factory.annotation.Autowired;

//TODO: add transactions
public class ContestEntryServiceImpl implements ContestEntryService {
	
	@Autowired
	private ContestEntryDAO contestEntryDAO;
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public boolean submit(ContestUser contestUser, ContestEntry contestEntry) {
		
		// business logic
		contestEntryDAO.create(contestEntry).orElseThrow();
		userDAO.create(contestUser).orElseThrow();
		
		return true;
	}
}
