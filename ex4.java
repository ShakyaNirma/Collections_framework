
public class ex4 {
 public static void main(String[] args) {
	int dayNum=4;
	String day;
		System.out.println("Enter a day:"+dayNum);
		switch(dayNum){
			case 1: day="Monaday";
			break;
			case 2: day="tuesday";
			break;
			case 3: day="wednesday";
			break;
			case 4: day="thursday";
			break;
			case 5: day="Friday";
			break;
			case 6: day="Saturday";
			break;
			case 7: day="sunday";
			break;
			default: day="invalied";
			break;
		}
		System.out.println("day of the week: "+day);	
 }
}
