package Stack;
import java.util.Stack;
import java.util.List;
import java.util.Vector;
public class ex1 {

	public static void main(String[] args) {
		displayStack();

	}
	public static void displayStack() {
		Stack<String> stack =  new Stack<>(); 
		stack.push("aaaaaaa");
		stack.push("bbbbbbb");
		stack.push("ccccccc");
		stack.push("ddddddd");
		stack.push("eeeeeee");
		stack.add("fffffff");//allow add because implement from list
		
		for(String value:stack) {
			System.out.println(value);
		}
		
		System.out.println("Stack pop="+ stack.pop()+"\n");
		//use to delete value lastly input will be deleted
		for(String value:stack) {
			System.out.println(value);
		}
	}
	//in inserted order
	//allow duplicates

}
