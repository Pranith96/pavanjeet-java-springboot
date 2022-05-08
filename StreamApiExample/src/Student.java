
public class Student {

	private Integer studentId;
	private String name;
	private Integer age;
	private Integer mobileNumber;

	public Student(Integer studentId, String name, Integer age, Integer mobileNumber) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}

	public Student() {
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber
				+ "]";
	}

}
