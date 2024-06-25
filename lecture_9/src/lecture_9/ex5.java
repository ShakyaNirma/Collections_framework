package lecture_9;


class Example {
    static void display(Example example ) { 
    	 synchronized (example) {//in this way imagine there is a key for a room if anyone need to go inside he need the key
    		 //when after he use it it can release
    		 //if we change this in synchronized(new Example) then it is like having 2 keys of both. then if anyone need he can it can be both together.
    	     //one way of change
    		 //another way to change is synchronized(Example.class) this make synchronized
    		 
    		 for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
}

public class ex5 implements Runnable {
   Example example;

    public ex5(Example example) {
        this.example = example;
    }

    public static void main(String[] args) {
        Example example = new Example();
        											//above and this not change both in same code
        Thread thread3= new Thread(new ex5(example)); //if we change this in(new ex5(new Example) this is not in synchronized way 
        thread3.start();
        Thread thread4 = new Thread(new ex5(example)); //this also want to change as above
        thread4.start();
    }

    public void run() {
        example.display(example);
    }
}
