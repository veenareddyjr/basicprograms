
public class Static {
	public static void main(String[] args) {
	String key = "web driver.gecko.driver";
	String value ="./softwares/gecko.driver";
	System.setProperty(key, value);
	firefoxdriver driver = new firefoxdriver();
}
}
