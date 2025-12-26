package com.example.demo;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.jspecify.annotations.Nullable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(JdbcConfig.class);
	JdbcTemplate tb =ac.getBean(JdbcTemplate.class);

	Scanner sc = new Scanner(System.in);
	while(true)
	{
		System.err.println(
			    "Welcome to the Data Site\n" +
			    "Press 1 : Retrieve all data\n" +
			    "Press 2 : Insert data\n" +
			    "Press 3 : Update data\n" +
			    "Press 4 : Delete data"
			);

		int num = sc.nextInt();
		
	 switch(num)
	 {
	 
	 case 1: 
			String retrive = "select * from info";
		
		List<Map<String,Object>> queryForList = tb.queryForList(retrive);
     	System.out.println(queryForList);
     	break;
     	
	
		 
		 
		 
	 }
	}
	
//	String insert ="insert into info values(?,?,?,?)";
//	
//	int count =tb.update(insert,"hr","Sourbhpal","Deva","Deepak");
//
//	
//	if(count>0)
//{
//	System.err.println("data-inserted into table");
//}
	
//	String update = "update  info set com_name= ? where dep_name=?";
//    int up =tb.update(update,"Farma","IT");
//    
//    if(up>0)
//    {
//    	System.err.println("data will be updated ");
//    }
//    
//    
//	}

//	String delete = "delete  from info where com_name =?";
//	
//	    
//	int up=tb.update(delete,"Sourbhpal");
//	if(up>0)
//	{
//		System.err.println("data deleted into databases");
//	}
//	
//	}
	
//	String retrive = "select * from info";
//	
//	List<Map<String,Object>> queryForList = tb.queryForList(retrive);
//	System.out.println(queryForList);
//	
//	String specific = "select * from  info where com_name = ?";
//	
//	   List<Map<String, Object>> queryForList = tb.queryForList(specific, "Sourbhpal");
//	System.out.println(queryForList);
//	
	}	
}
