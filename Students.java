package week3.day1.assessment4;

public class Students {
	public void getStudentInfo(int ID) {
		System.out.println("Student ID : "+ID);
	}
	public void getStudentInfo(int ID, String Name) {
		System.out.println("Student ID: " +ID+ ", Student Name: " +Name);
	}
	public void getStudentInfo(String Email, long Phone) {
		System.out.println("Email ID : "+Email+"Phone Numeber: "+Phone);
	}
	public static void main(String[] args) {
		Students Info = new Students();
		Info.getStudentInfo(8765);
		Info.getStudentInfo(9876, "Deepika");
		Info.getStudentInfo("D@gmail.com", 9587654215L);
		
	}

}
