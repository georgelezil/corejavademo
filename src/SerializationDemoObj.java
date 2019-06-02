import java.io.Serializable;

public class SerializationDemoObj implements Serializable{

	public int a;

	public int b;

	public String s;

	public SerializationDemoObj(int a, int b, String s) {
		this.a = a;
		this.b = b;
		this.s = s;
	}

}
