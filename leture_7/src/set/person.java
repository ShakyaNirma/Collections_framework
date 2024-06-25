package set;



public class person implements Comparable{

	private int age;
	
	public person(int age)
	{
		this.age=age;
	}
	
	public int getage() {
		return this.age;
	}
	public String toString()
	{
		return ""+this.age;
		}
	@Override
	public boolean equals(Object p) {
		if (p instanceof person ) {
			return (this.age==((person)p).getage());
		}
		else {
			return false;
		}
	}
		
		@Override
		public int hashCode() {
			return this.age;
	
	}

		@Override
		public int compareTo(Object p) {
			if(p!=null) {
				person pobj=((person)p);
				return (this.getage()- pobj.getage());//make ascending
				//if we want to make descending make inter-change here
			}
			else{
					return 0;
				}
			
		}
}
