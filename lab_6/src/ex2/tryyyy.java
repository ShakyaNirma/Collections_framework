package ex2;

public class tryyyy {

	    public static void main(String[] args) {
	        // create string builder object
	        StringBuilderQuestion sbq = new StringBuilderQuestion("Hello");
	        System.out.println(sbq.sb);

	        sbq.sb.append(" World");
	        System.out.println(sbq.sb); // expected output: Hello World
	        // value of sb= Hello World

	        sbq.sb.delete(0, 6);
	        System.out.println(sbq.sb);
	        // value of sb=World

	        sbq.sb.insert(0, "Hi");
	        System.out.println(sbq.sb);
	        // value of sb=HiWorld

	        sbq.sb.replace(0, 2, "Hello");
	        System.out.println(sbq.sb);
	    }
	}

}
