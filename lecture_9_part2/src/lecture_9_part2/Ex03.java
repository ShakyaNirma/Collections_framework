package lecture_9_part2;

public class Ex03 {


	public static void main(String[] args) {
		Ex03 ex03=new Ex03();
		Ex02 ex02=new Ex02();
		ThreadWait t1=new ThreadWait(ex02);
		ThreadNotify t2=new ThreadNotify(ex03);
		t1.start();
		t2.start();
	}
}


