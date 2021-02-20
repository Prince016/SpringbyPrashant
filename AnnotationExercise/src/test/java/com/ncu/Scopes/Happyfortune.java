package com.ncu.Scopes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//import com.sun.org.apache.xml.internal.security.utils.RFC2253Parser;

//import com.sun.java_cup.internal.runtime.Scanner;

@Component

public class Happyfortune implements IFortune{

	@Override
	public String getFortune() {
		
		return "comming from the happyfortune Class ";
	}

	 
	 
	}
	
	
	
	 


