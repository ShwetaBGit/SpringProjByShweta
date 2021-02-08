package com.sb.test;

import javax.naming.NamingException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.approach4.Flipcart;
import com.sb.jndiRegistry.Flipkart;

//import com.sb.compositon.Flipcart;
//import com.sb.factoryClass.Flipkart;

public class CLientTest {

	public static void main(String[] args) throws NamingException {
 
		 FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");
		 
		 BeanFactory factory = new XmlBeanFactory(res);
		 
	//Flipcart fp	= factory.getBean("flpk",Flipcart.class);
		//Flipkart fp1 = factory.getBean("flpk1",Flipkart.class); 
		 //fp.purchase();
  
		//fp1.purchase();
		
		//Flipkart fp2 = factory.getBean("flpk2",Flipkart.class); 
		 //fp.purchase();
 
		//fp2.purchase(fp2.getId());
	
		 // Flipcart fp3 = factory.getBean("flpk3",Flipcart.class);
		 //fp3.purchase(fp3.getId());
	
		com.sb.approach5.Flipcart fp4 = factory.getBean("flpk4", com.sb.approach5.Flipcart.class);
		  
		fp4.purchase(fp4.getId(), fp4.getDtdc());

	 }
}
