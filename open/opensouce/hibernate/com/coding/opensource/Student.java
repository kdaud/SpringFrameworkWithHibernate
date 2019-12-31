package com.coding.opensource;


public class Student {
	
	private int rollno;
	
	private String name;
	
	private static String college;
	static {
		college = "Computing & Informatics";
		System.out.println(college);
	}
	
	/**
	 * @return the college
	 */
	public static String getCollege() {
		return college;
	}
	
	/**
	 * @param college the college to set
	 */
	public static void setCollege(String college) {
		Student.college = college;
	}
	
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		
		return rollno;
	}
	
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		
		this.rollno = rollno;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the level
	 */
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", level=" + college + "]";
	}
	
}
