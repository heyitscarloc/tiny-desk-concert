package org.npr.tinydeskconcert.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.npr.tinydeskconcert.domain.ContestEntry;
import org.npr.tinydeskconcert.domain.ContestUser;

public class ContestEntryModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String url;
	private String groupName;

	public ContestEntryModel() {
		//
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public ContestUser toContestUser() {
		return new ContestUser.Builder() //
				.username(this.username) //
				.password(this.password) //
				.build();
	}

	public ContestEntry toContestEntry() {
		return new ContestEntry.Builder() //
				.url(this.url) //
				.groupName(this.groupName) //
				.build();
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o, false);
	}

}
