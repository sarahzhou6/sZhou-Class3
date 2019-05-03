public class Student{
	String name;
	String address;
	int numCourses = 0;
	String[] courses = new String[10];
	int[] grades = new int[10];
	public Student(String name, String address){
		this.name = name;
		this.address = address;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String ToString(){
		return name + "(" + address + ")";
	}
	public void addCourseGrade(String course, int grade){
		for(int i = 0; i < courses.length; i ++){
			if(courses[i] == null){
				courses[i] = course;
				grades[i] = grade;
				break;
			}
		}
	}
	public void printGrades(){
		System.out.println(name + " ");
		for(int i = 0; i < grades.length; i ++){
			System.out.print(" course " + courses[i] + ":" + grades[i]);
		}
	}
	public double getAverageGrade(){
		int sum = 0;
		for(int i = 0; i < grades.length; i ++){
			sum += grades[i];
		}
		return Double.valueOf(sum/30);
	}

	public static void main(String[] args) {
		Student olivia = new Student("olivia", "address");
		olivia.addCourseGrade("english", 87);
		olivia.addCourseGrade("math", 91);
    olivia.addCourseGrade("spanish", 94);
    olivia.addCourseGrade("chemistty", 83);
		olivia.printGrades();
	}
}
