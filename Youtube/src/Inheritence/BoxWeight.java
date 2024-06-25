package Inheritence;

public class BoxWeight extends Box{
	double weight;
	
	public BoxWeight() {
		this.weight=0;
	}

	public BoxWeight(double l,double h,double w,double weight) {
		super(l,h,w);//call the parent class constructor
		//used to initialize the values present in parent class
		this.weight = weight;
		
		
		
		/*public BoxWeight(double l,double h,double w,double weight) {
		super(l,h,w);
	   this.weight = weight;
	    system.out.println(this.w); do not show any error
	    either can use as follow
	    system.out.println(super.w);this is also possible
	    why we use super bcz we can use "this"?
	    bcz imagine that super class also have a variable name weight
	    then how can be select what weight that should be print
	    either super class weight or sub class weight
	    so we can use super keyword also
	    
		
		
		public BoxWeight(double l,double h,double w,double weight) {
		  this.weight = weight;
		  super(l,h,w);//this show error give initialize priority for the parent
		  if we not mentioned in here it will be called default constructor
	 
		*/
	}
	

}
