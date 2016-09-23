package com.ashish.tool.cvparser;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.codec.language.Soundex;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

public class ReadDocFile
{
    public static void main(String[] args)
    {
        File file = null;
        
        Soundex soundex = new Soundex();
        List<String> soundExLst = new ArrayList<String>();
        
//        soundExLst.add(soundex.encode("name"));
//        soundExLst.add(soundex.encode("dob"));
//        soundExLst.add(soundex.encode("Father"));
//        soundExLst.add(soundex.encode("Father's"));
//        soundExLst.add(soundex.encode("birth"));
        soundExLst.add("name");
        soundExLst.add("Birth");
        soundExLst.add("dob");
        soundExLst.add("Father");
        soundExLst.add("Father's");
        soundExLst.add("Nationality");
        soundExLst.add("phone");
        soundExLst.add("mobile");
        List<List> resumeTxtLst = new ArrayList<List>();
        
        WordExtractor extractor = null;
        try
        {

            file = new File("C:\\Users\\admin\\Downloads\\aanchal_gupta_Delhi_3.04_yrs.doc");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String[] fileData = extractor.getParagraphText();
            StringTokenizer st;
            for (int i = 0; i < fileData.length; i++)
            {
                if (fileData[i] != null){
                	System.out.println(fileData[i]);
                	st=new StringTokenizer(fileData[i], " \t");
                	List<String> lineLst = new ArrayList<String>();
                	
                	while (st.hasMoreTokens())
                	{
                		lineLst.add(st.nextToken());
                	}
                	resumeTxtLst.add(lineLst);
                }
//                    System.out.println(fileData[i]);
                	
            }
            ResumeParser rp = new ResumeParser();
            rp.setPersonalAttributesSound(soundExLst);
            rp.setResumeTxtLst(resumeTxtLst);
            rp.parsePersonal();
        }
        catch (Exception exep)
        {
            exep.printStackTrace();
        }
    }
}