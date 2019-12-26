package StudentReflect;

public class Student {
	private String name;
	private int age;
	private boolean isBoy;
	

	public Student(String name, int age, boolean isBoy) {
		super();
		this.name = name;
		this.age = age;
		this.isBoy = isBoy;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", isBoy=" + isBoy + "]";
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isBoy() {
		return isBoy;
	}
	public void setBoy(boolean isBoy) {
		this.isBoy = isBoy;
	}
}
