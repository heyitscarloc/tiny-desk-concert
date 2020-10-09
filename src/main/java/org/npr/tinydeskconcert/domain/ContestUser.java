package org.npr.tinydeskconcert.domain;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ContestUser implements Serializable {

	private static final long serialVersionUID = 1L;
	private final String username;
	private final String password;

	protected ContestUser(Builder builder) {
		this.username = builder.username;
		this.password = builder.password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public static class Builder {
		private String username;
		private String password;

		public Builder() {
			//
		}

		public Builder username(String username) {
			this.username = username;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public ContestUser build() {
			return new ContestUser(this);
		}
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}

	@Override
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o, false);
	}

}
