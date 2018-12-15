package oo.serialization;

public class SerializationTest {

	public static void main(String[] args) {
		C1 c = new C1();
		System.out.println("{\"c\":" + c.toJSON() + "}");
		System.out.println("<c>\n" + c.toXML() + "\n</c>");
	}

}

class C1 {
	int a = 90;
	String b = "aaa";
	boolean f = false;
	Object[] o = {12, 123.5, new C2(), null};
	C2 n = new C2();
	
	public String toJSON() {
		return "{\"a\":90,\n\"b\":\"aaa\",\n\"f\":false,\"o\":[12,123.5,{\"x\":50},null],\"n\":{\"x\":50}";
	}
	public String toXML() {
		return "<a>90</a>\n<b>\"aaa\"</b>\n<f>false</f>\n<o>12</o>\n<o>123.5</o>\n<o><x>50</x></o>\n<o></o>\n<n><x>50</x></n>";
	}
}
class C2 {
	long x = 50;
}


