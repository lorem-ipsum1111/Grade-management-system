package ppp.util;
//Support for humanities course
public class Humanities extends FunctionalityWrapper {

	public Humanities(ScoreCard newRecord) {
		super(newRecord);
		
	}
//add your humanities marks
	public void add_marks(int marks) {
		
		 rec.add_marks(marks);

	}

	//know total marks
	public int calculate_total() {
		
		return rec.calculate_total();

	}
//know total subjects taken by you
public int return_subjects(){
		
		return rec.return_subjects();
	}
	//know if you are pass or fail
	public boolean is_pass() {
		return rec.is_pass();
	}

	//get description of subject
	public void description() {
		System.out.println("Course code: HS202"
				+ "\nCourse Title: Economics"				
				+ "\nCourse Instructor: Samaresh Bardhan");
		
	}
	//overridden method
	@Override
	public int calculate_avg() {
		
		return 0;
	}

	

	@Override
	public void display_marks() {
		
		
	}

	@Override
	public void Grade_assignment() {
		
		
	}



	@Override
	public void findMaxMin() {
		
		
	}

	@Override
	public int percent_calculate() {
		
		return 0;
	}
}
