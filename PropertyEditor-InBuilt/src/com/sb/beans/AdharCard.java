package com.sb.beans;

import java.io.File;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;


import lombok.Data;

@Data
public class AdharCard {

	private long adharNo;
	private String name;
	private Date dob;
	private String[] moles;
	private File photopath;
	private Locale locale;
	private URL linkedUrl;
	private URI linkedUri;
	private Class curlClazz;
	private int age;
	private char favouriteLetter;
	private char[] favouriteLetters;
	private long[] phones;
	private boolean isHandicaft;
	private Reader fileReader;
	private Pattern pattern;

	
	
}
