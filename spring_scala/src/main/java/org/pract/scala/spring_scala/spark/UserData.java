package org.pract.scala.spring_scala.spark;

import java.io.Serializable;

public class UserData implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -1352729066535118852L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserData [name=" + name + "]";
	}

}
