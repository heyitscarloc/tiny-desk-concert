package org.npr.tinydeskconcert.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.npr.tinydeskconcert.dao.ContestEntryDAO;
import org.npr.tinydeskconcert.dao.UserDAO;
import org.npr.tinydeskconcert.domain.ContestEntry;
import org.npr.tinydeskconcert.domain.ContestUser;

@ExtendWith(MockitoExtension.class)
public class ContestEntryServiceTest {

	@InjectMocks
	private ContestEntryServiceImpl contestEntryService;

	@Mock
	private ContestEntryDAO contestEntryDAO;

	@Mock
	private UserDAO userDAO;

	@Test
	public void submit_successful() {
		Mockito.when(contestEntryDAO.create(ArgumentMatchers.any(ContestEntry.class))) //
				.thenReturn(Optional.of(new ContestEntry.Builder().build()));

		Mockito.when(userDAO.create(ArgumentMatchers.any(ContestUser.class))) //
				.thenReturn(Optional.of(new ContestUser.Builder().build()));

		Assertions.assertTrue(
				contestEntryService.submit(new ContestUser.Builder().build(), new ContestEntry.Builder().build()));
	}
}
