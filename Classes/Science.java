package ppp.util;
// Support for Science course
public class Science extends FunctionalityWrapper {

	public Science(ScoreCard newRecord) {
		super(newRecord);
		
	}
	//add your science marks
	public void add_marks(int marks) {
		
		 rec.add_marks(marks);

	}

	//calculate total marks
public int calculate_total() {
		
		return rec.calculate_total();

	}
//return total subjects
public int return_subjects(){
	
	return rec.return_subjects();
}

	//know if you are pass or fail
	public boolean is_pass() {
		return rec.is_pass();
	}

	//get course description
	public void description() {
		System.out.println("Course code: BM101"
				+ "\nCourse Title: Biology for"
				+ "Engineers"
				+ "\nCourse Instructor: Srivastava Naidu");
		
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
