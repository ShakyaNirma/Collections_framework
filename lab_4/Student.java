 package ex1;

public class Student {
	private int Studentid;
	private String name;
	private String degree;
	private String mobile;
	private static int max=100;
		public Student(String name, String degree, String mobile) {

		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
		
		}
			public static int getNextStudentid() {
			return ++max;
			}
			public String getName() {
			return name;
			}
			public void setName(String name) {
				this.name=name;
			}
			public String getdegree() {
				return degree;
			}
			public void setDegree(String degree) {
				this.degree= degree;
			}
			public String getmobile() {
				return mobile;
			}
			public void setMobile(String mobile) {
				this.mobile=mobile;
			}
			public void print() {
				System.out.println("Student name: "+getName());
				System.out.println("Student degree: "+getdegree());
				System.out.println("Student mobile: "+getmobile());
				System.out.println("Student id: "+getNextStudentid());
				System.out.println();
			}
			
	
	
}
