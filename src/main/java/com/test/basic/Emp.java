package com.test.basic;

class Emp{
	private String fName;
	private String sName;
	private int age;
	private int salary;
	private String address;
	
	
	private Emp(EmpBuilder builder) {
		this.fName=builder.fName;
		this.sName= builder.sName;
		this.salary=builder.salary;
		this.age=builder.age;
		this.address=builder.address;
		
	}
	
	
	public String getfName() {
		return fName;
	}

	public String getsName() {
		return sName;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

	
	 @Override
	    public String toString() {
	        return "User: "+this.fName+", "+this.sName+", "+this.age+", "+this.salary+", "+this.address;
	    }
	 
	
	
	public static class EmpBuilder{
		
		private String fName;
		private String sName;
		private int age;
		private int salary;
		private String address;
		
		
		public EmpBuilder(String fName,String sName) {
			
			this.fName=fName;
			this.sName=sName;
		}
		public EmpBuilder age (int age) {
			
			this.age=age;
			return this;
		}
		public EmpBuilder salary(int salary) {
			
			this.salary=salary;
			return this;
			
		}
		
		public EmpBuilder address(String addr) {
			
			this.address=addr;
			return this;
		}
		
		
		public Emp build() {
			Emp employee = new Emp(this);
			return employee;
		}
		
		
	}
	public static void main(String[] args) {
		  
		  Emp employee1 = new Emp.EmpBuilder("ranjeet", "kartikey") .age(30)
		  .salary(30000)
		  .address("pune")
		  .build(); 
		  System.out.println(employee1);
		  
	}
		  
		  
	
}

/*
 * public class BuilderDesignPatterDemo {
 * 
 * public static void main(String[] args) {
 * 
 * Emp employee1 = new Emp.EmpBuilder("ranjeet", "kartikey") .age(30)
 * .salary(30000) .address("pune") .build(); System.out.println(employee1); }
 * 
 * }
 */
