package com.example.onetooneassign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnetooneassignApplication {

	public static void main(String[] args) {
		ApplicationContext context ;
		context = SpringApplication.run(OnetoOneChoiceApplication.class, args);
		
		RoleRepository role ;
		role = context.getBean(RoleRepository.class);
		
		EmpRepository emp ;
		emp = context.getBean(EmpRepository.class);
	

		do {
			
			System.out.println("\t 1.Save Record \n"+
			"\t 2.Select Record \n"+
		    "\t 3.Update Record \n" +
			"\t 4.Delete Record \n" +
		    "\t 5.Exit \n"
			
		   );
			
		    
		   System.out.print("Enter your Choice : ");
		   Scanner sc = new Scanner(System.in);
		   int choice = sc.nextInt();
		   
		   
		   
		   if(choice == 1)
		   {
		   System.out.println("Enter Role ID :");
			   Scanner S1= new Scanner(System.in);
		   int role_id = S1.nextInt();
		   System.out.println("Enter Role  :");
		   String role_name = S1.next();
		   
		   Role r1 = new Role(role_id,role_name);
			   role.save(r1);
			   
			   System.out.println("Enter Employee ID :");
			  
			   int emp_id = S1.nextInt();
			   System.out.println("Enter Employee Name  :");
			   String name = S1.next();
			   
			   Emp e1 = new Emp(emp_id,name,r1);
			   emp.save(e1);
			   
			   System.out.println("Successfully Record Saved !");
				   
					   
			  
			   
			   
		   }else if(choice == 2)
		   {
		   
			   List<Emp> list;
			   list = emp.findAll();
			   
			   System.out.println("Role ID " +" : "+"Employe Name"+" : "+"Employee Id");
			
		for(Emp e : list)
			{			
    		System.out.println(e.getRoleobj().getRole_id()+"  : "+e.getName()+"  : "+e.getEmp_id());      		
      		System.out.println("Successfully Select Query !");
			
					
			}
			   
		   }else if(choice == 3)
		   {
			   Optional<Emp> op;
 				op = emp.findById(100);
      			Emp e1 = op.get();
      			System.out.println(e1.getEmp_id());
            	System.out.println(e1.getName());
            	System.out.println("Enter Updated Name : ");
            	String UName = sc.next();
		    	e1.setName(UName);
			    emp.save(e1);
			    	
			    	System.out.println("Successfully Update Record !");
			    	
		   }else if(choice == 4)
		   {
			
//			   Optional<Role> op1;
//				op1 = role.findById(100);
//				Role r1 = op1.get();
//				System.out.println(r1.getRole_desc());
//				role.delete(r1);
//				
      		System.out.println("Sucessfully Record Delete ");
//			   
		   }else if(choice == 5)
		   {
			  System.exit(0); 
		   }
					
		
			
			
			
			
		}while(true);
		
	}

	}

}
