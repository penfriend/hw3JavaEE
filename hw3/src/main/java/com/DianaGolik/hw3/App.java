package com.DianaGolik.hw3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
       Student stud1 = (Student) context.getBean("student");
       Subject subject1 = (Subject) context.getBean("subject");
       BestStudentGrant grant = ( BestStudentGrant) context.getBean("bestStudentGrant");
       Degree degreeA = (Degree) context.getBean("degreeA");
       RecordBook recBook1 = (RecordBook) context.getBean("recordBook1");
       System.out.println(stud1.getStudName()+stud1.getRecBook());
       System.out.println(subject1);
       System.out.println(grant.getGrantAmount()+" "+grant.getStud().getStudName());
       System.out.println(recBook1+" records: "+recBook1.getRecords());

    }
}
