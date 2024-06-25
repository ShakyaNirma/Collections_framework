package Inheritence;

public class Box {
	double l;
	double h;
	double w;

Box(){
	this.l=0;
	this.h=0;
	this.w=0;
}

//cube
Box(double side){
	//super();   object class;all classes are inherit from the object class 
	this.l=side;
	this.h=side;
	this.w=side;
}
Box(Box old){
	this.l=old.l;
	this.h=old.h;
	this.w=old.w;

}

Box(double l,double h,double w){
	this.l=l;
	this.h=h;
	this.w=w;	
}

public void information() {
	System.out.println("running the box");
}
}
