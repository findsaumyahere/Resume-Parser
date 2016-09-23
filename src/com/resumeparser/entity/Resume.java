package com.resumeparser.entity;

import java.util.Map;

public class Resume {

	private String id;
	private Personal personal;
	private Technology technology;
	private Map<String,String> linesWithTokens;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the personal
	 */
	public Personal getPersonal() {
		return personal;
	}
	/**
	 * @param personal the personal to set
	 */
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	/**
	 * @return the technology
	 */
	public Technology getTechnology() {
		return technology;
	}
	/**
	 * @param technology the technology to set
	 */
	public void setTechnology(Technology technology) {
		this.technology = technology;
	}
	/**
	 * @return the linesWithTokens
	 */
	public Map<String,String> getLinesWithTokens() {
		return linesWithTokens;
	}
	/**
	 * @param linesWithTokens the linesWithTokens to set
	 */
	public void setLinesWithTokens(Map<String,String> linesWithTokens) {
		this.linesWithTokens = linesWithTokens;
	}
}
