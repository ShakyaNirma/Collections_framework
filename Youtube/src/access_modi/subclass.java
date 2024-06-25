package access_modi;

public class subclass extends A {
	public subclass(int num,String nameString) {
		super(num, nameString);
	}

	public static void main(String[] args) {
		A obj=new subclass(22,"shakya");
		int n=obj.num;//show error when A int make private

	}

}
