package ppp.util;

public class Maths extends FunctionalityWrapper {

	public Maths(ScoreCard newRecord) {
		super(newRecord);
		
		
	}
	//add marks in math
	public void add_marks(int marks) {
		
		 rec.add_marks(marks);

	}

	//calculate total marks
public int calculate_total() {
		
		return rec.calculate_total();

	}
// know total subjects taken by you
public int return_subjects(){
	
	return rec.return_subjects();
}

	//know if you are pass or fail
	public boolean is_pass() {
		return rec.is_pass();
	}

	//get course description
	public void description() {
		System.out.println("Course code: MA202"
				+ "\nCourse Title: Probability and"
				+ "Statistics"
				+ "\nCourse Instructor: Manju Khan");
		
	}
//overridden methods
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
