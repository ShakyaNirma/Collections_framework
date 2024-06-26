package pack1;



public class Student {
	
		private String name;
		private int age;
		private static int batchId;
		

		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		
		public String getName() {
			return name;
		}


		public int getAge() {
			return age;
		}


		public static int getBatchId() {
			return batchId;
		}
		public static void setBatchId(int batchId) {
			Student.batchId = batchId;
		}
		
		
	}

	class Main{
		public static void main() {
			Student s1=new Student("Amal", 12);
		s1.setBatchId(3);
		
		System.out.println("Student name:"+s1.getName()+"\nAge is:"+s1.getAge()+"Batch id is:"+Student.getBatchId());
		
		}
	}

