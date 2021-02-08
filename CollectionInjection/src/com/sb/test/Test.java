package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.sb.beans.EmployeeProfile;
import com.sb.beans.Student;
import com.sb.beans.StudentMap;
import com.sb.beans.StudentSet;
import com.sb.beans.UserForNull;

public class Test {

	public static void main(String[] args) {

        FileSystemResource res = new FileSystemResource("src/com/sb/cfgs/applicationContext.xml");
        
        BeanFactory factory = new XmlBeanFactory(res);
        
      // StudentSet stud = factory.getBean("st",StudentSet.class);
        //StudentMap smap = factory.getBean("st",StudentMap.class);
        
       // EmployeeProfile profile = factory.getBean("empProf",EmployeeProfile.class);
        
        //System.out.println(profile);
        
        
       //System.out.println(smap);
 
		
		
        
        UserForNull user1 = factory.getBean("user", UserForNull.class);
        
        System.out.println(user1);
	}

}
