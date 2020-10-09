package org.npr.tinydeskconcert.domain;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ContestEntry implements Serializable {

	private static final long serialVersionUID = 1L;
	private final String url;
	private final String groupName;
	
	protected ContestEntry(Builder builder) {
		this.url = builder.url;
		this.groupName = builder.groupName;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getGroupName() {
		return groupName;
	}
	
	public static class Builder {
		private String url;
		private String groupName;
		
		public Builder() {
			// 
		}
		
		public Builder url(String url) {
			this.url = url;
			return this;
		}
		
		public Builder groupName(String groupName) {
			this.groupName = groupName;
			return this;
		}
		
		public ContestEntry build() {
			return new ContestEntry(this);
		}
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}
	
	@Override
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o, false);
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
