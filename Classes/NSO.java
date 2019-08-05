package ppp.util;
// Support for NSO subject
public class NSO extends FunctionalityWrapper {

	public NSO(ScoreCard newRecord) {
		super(newRecord);
		
	}
	//Add your NSO marks
	public void add_marks(int marks) {
		
		 rec.add_marks(marks);

	}

	//Calculate total marks
public int calculate_total() {
		
		return rec.calculate_total();

	}
	//Know total subjects taken by you
public int return_subjects(){
	
	return rec.return_subjects();
}

	//Know if you are pass or fail
	public boolean is_pass() {
		return rec.is_pass();
	}

	//Get course description
	public void description() {
		System.out.println("Course code: CS202"
				+ "\nCourse Title: Sports"				
				+ "\nCourse Instructor: Rupinder Singh");
		
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
		// TODO Auto-generated method stub
		
	}



	@Override
	public void findMaxMin() {
		
		
	}

	@Override
	public int percent_calculate() {
		
		return 0;
	}


}
