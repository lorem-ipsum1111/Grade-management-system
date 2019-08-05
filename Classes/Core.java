package ppp.util;
//basic class
public class Core implements ScoreCard {

	int total;
	int subjects = 0;

	//add marks in core
	@Override
	public void add_marks(int marks_core) {
		
		Integer a = marks_core;
		marks.add(a);
		subjects++;
	}
	//calculate net total marks
	@Override
	public int calculate_total() {
		
		int total_m = 0;
		for(int i = 0; i < marks.size();i++) {
			
			total_m+=marks.get(i);
			
		}
		total = total_m;
		return total;
	}
	//return total subjects taken
	@Override
	public int return_subjects(){
		
		return subjects;
	}
	
	

	@Override
	//know if you are pass or fail
	public boolean is_pass() {
		// TODO Auto-generated method stub
		if(total >= subjects*30) {
			return true;
		}
		else {
		return false;
		}
	}

	//description of subject
	public void description() {
		System.out.println("Course code: CS202"
				+ "\nCourse Title: Programming Paradigms and"
				+ "Pragmatics"
				+ "\nCourse Instructor: Abhinav Dhall");
		
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
