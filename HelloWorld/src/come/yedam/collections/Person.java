package come.yedam.collections;

public class Person {	
		// 필드 : 이름,나이,취미
       private String name;
       private int age;
       private String hobby;
       
       //생성자
       public Person(String name,int age,String hobby ) {
    	   this.age = age;
    	   this.hobby = hobby;
    	   this.name = name;

       }
       
       // getter,setter

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
       
       
	
}
