package Queue;
import java.util.PriorityQueue;
import java.util.Queue;
public class ex1 {

	public static void main(String[] args) {
		displayPriorityQueue();
	}

	public static void displayPriorityQueue() {
		Queue<Integer> queue= new PriorityQueue<Integer>();
		queue.add(10);
		queue.add(30);
		queue.add(50);
		queue.add(60);
		queue.add(20);
		queue.add(40);
		queue.add(70);
		queue.add(90);
		queue.add(80);
		queue.add(100);
		queue.add(100);
		for(Integer value:queue) {
			System.out.println(value);//not in inserted or any order
		}
		//allow duplicates
		
		System.out.println("Queue peek = "+queue.peek());
		//show the first element
		
		System.out.println("Queue pool = "+ queue.poll());
		System.out.println("Queue pool = "+ queue.poll());
		//poll delete the first element
	}
}
