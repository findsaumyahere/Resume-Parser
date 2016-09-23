package com.ashish.tool.cvparser;

import java.util.List;

import org.apache.commons.codec.language.Soundex;
import org.apache.commons.lang3.StringUtils;

public class ResumeParser {
	
	private List<List> resumeTxtLst; 
	private List<String> personalAttributesSound;
	public void init()
	{
		
		
	}
	
	/**
	 * @return the resumeTxtLst
	 */
	public List<List> getResumeTxtLst() {
		return resumeTxtLst;
	}

	/**
	 * @param resumeTxtLst the resumeTxtLst to set
	 */
	public void setResumeTxtLst(List<List> resumeTxtLst) {
		this.resumeTxtLst = resumeTxtLst;
	}

	/**
	 * @return the personalAttributesSound
	 */
	public List<String> getPersonalAttributesSound() {
		return personalAttributesSound;
	}

	/**
	 * @param personalAttributesSound the personalAttributesSound to set
	 */
	public void setPersonalAttributesSound(List<String> personalAttributesSound) {
		this.personalAttributesSound = personalAttributesSound;
	}

	public void parsePersonal()
	{
//		Soundex soundex = new Soundex();
		for (List<String> lineLst : resumeTxtLst) {
//			System.out.println(lineLst +">>>");
			for (String lineTkn : lineLst) {
				for (String attrbtTkn : personalAttributesSound) {
//					if (attrbtTkn.equalsIgnoreCase(soundex.encode(lineTkn))) {
//					if (lineTkn.equals("Birth"))
					if (compareStrings(attrbtTkn, lineTkn.trim())> 0.90) {
						System.out.println(lineTkn+" >> "+lineLst);
					}
				}
			}
		}
	}

	private double compareStrings(String stringA, String stringB) {
	    return StringUtils.getJaroWinklerDistance(stringA.toLowerCase(), stringB.toLowerCase());
	}

}
