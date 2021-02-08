package com.sb.editor;

import java.beans.PropertyEditorSupport;

import com.sb.beans.IntrAmtDetails;

public class IntrAmtDetailsEditor extends PropertyEditorSupport {
	

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		System.out.println("IntrAmtDetails.setAsText()");

		float pamt = 0.0f;
		float rate = 0.0f;
		float time = 0.0f;
	    IntrAmtDetails details=null;
		
		//get content from value
		pamt = Float.parseFloat(text.substring(0,text.indexOf(",")));
		time = Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(",")));
        rate = Float.parseFloat(text.substring(text.lastIndexOf(",")+1,text.length()));
	
        
        //create imtrDetails class object
        details =  new IntrAmtDetails();
        details.setPrinciple(pamt);
        details.setRate(rate);
        details.setTime(time);
       
        //set value object to bean
        setValue(details);
        
	}
}
