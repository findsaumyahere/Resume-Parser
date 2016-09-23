package com.ashish.tool.cvparser;

import org.apache.commons.codec.language.Soundex;
import org.apache.commons.lang3.StringUtils;

public class Tester {
	public static void main(String a[])
	{
		Tester t = new Tester();
		Soundex soundex = new Soundex();
		String phoneticValue = soundex.encode("Program");
		System.out.println(phoneticValue);
		
		System.out.println(soundex.encode("Program"));
		System.out.println(soundex.encode("Programe"));
		System.out.println(soundex.encode("PPPro"));
		System.out.println(t.compareStrings("Father", "Father's"));
	}

	//Usage of Apache Commons Lang 3
//	import org.apache.commons.lang3.StringUtils;   
	public double compareStrings(String stringA, String stringB) {
	    return StringUtils.getJaroWinklerDistance(stringA, stringB);
	}

	 //Usage of Simmetrics
//	import uk.ac.shef.wit.simmetrics.similaritymetrics.JaroWinkler    
//	public double compareStrings(String stringA, String stringB) {
//	    JaroWinkler algorithm = new JaroWinkler();
//	    return algorithm.getSimilarity(stringA, stringB);
//	}

}
