package come.yedam.stream;
/*
 * 
 * 학생이름,키,몸무게, 점수.
 */
public class Student {
    private String name;
    private double height;
    private double weight;
    private int score;
	
    // constructor.
    public Student(String name, double height, double weight, int score) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.score = score;
	}
    // getter.setter

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public int getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setScore(int score) {
		this.score = score;
	}
    
  

}
