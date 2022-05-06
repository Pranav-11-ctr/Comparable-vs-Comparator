import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Comparable is using for comparing only one property it changes class 
//Comparator is using for multiComparing property by making different class

//Comparable Example
//class Emp implements Comparable<Emp>
//{
//	private String name;
//	private String phone;
//	private int empId;
//	
//	@Override
//	public int compareTo(Emp O) {
//		// TODO Auto-generated method stub
//		return this.empId-O.empId;
//	}
//	
//	
//	public Emp(String name, String phone, int empId) {
//		super();
//		this.name = name;
//		this.phone = phone;
//		this.empId = empId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//
//	@Override
//	public String toString() {
//		return "\nEmp [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
//	}
//	
//	
//	
//	
//	
//}

//public class ComparableVsComparator {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<Emp> list=new ArrayList<>();
//		list.add(new Emp("Pranav","7029294210",1234));
//		list.add(new Emp("Prabhat","9873713655",12534));
//		list.add(new Emp("Archana","6202701365",12344));
//		
//		
//		
//		System.out.println(list);
//		
//		Collections.sort(list);
//		System.out.println(list);
//
//	}
//
//}



//Comparator Example
class Emp 
{
	private String name;
	private String phone;
	private int empId;
	
	public Emp(String name, String phone, int empId) {
		super();
		this.name = name;
		this.phone = phone;
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}


	@Override
	public String toString() {
		return "\nEmp [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}
	
	
	
	
	
}


public class ComparableVsComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> list=new ArrayList<>();
		list.add(new Emp("Pranav","7029294210",1234));
		list.add(new Emp("Prabhat","9873713655",12534));
		list.add(new Emp("Archana","6202701365",12344));
		
		
		
		System.out.println(list);
		
		Collections.sort(list,new IdComparator());
		System.out.println(list);
		Collections.sort(list,new NameComparator());
		System.out.println(list);
		Collections.sort(list,new PhoneComparator());
		System.out.println(list);

	}

}

class IdComparator implements Comparator<Emp>
{

	@Override
	public int compare(Emp arg1, Emp arg2) {
		// TODO Auto-generated method stub
		return arg1.getEmpId()-arg2.getEmpId();
	}
	
}
class NameComparator implements Comparator<Emp>
{

	@Override
	public int compare(Emp arg1, Emp arg2) {
		// TODO Auto-generated method stub
		return arg1.getName().compareTo(arg2.getName());
	}
	
}
class PhoneComparator implements Comparator<Emp>
{

	@Override
	public int compare(Emp arg1, Emp arg2) {
		// TODO Auto-generated method stub
		return arg1.getPhone().compareTo(arg2.getPhone());
	}
	
}

