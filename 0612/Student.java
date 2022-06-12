package basic;

public class Student {
	private String name;
	private int age,score;
	
	public Student() {}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
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

	public boolean setAge(int age) {
		if(age > 0 && age <= 150) {
			this.age = age;
			return true;
		}
		return false;
	}

	public int getScore() {
		return score;
	}

	public boolean setScore(int score) {
		if(score > 0 && score <= 100) {
			this.score = score;
			return true;
		}
		return false;
	}

	@Override // overwrite ÀçÁ¤ÀÇ
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
}
