package ppp.util;
//Gradesheet display functionality
public class GradesheetDisplay extends FunctionalityWrapper {

	public GradesheetDisplay(ScoreCard newRecord) {
		super(newRecord);
		
	}
	//displays all the marks
	public void display_marks() {
		
        for(int i = 0; i < rec.marks.size(); i++) {
			
			System.out.println(rec.marks.get(i));
		}
	}
	//overridden methods
	@Override
	public int calculate_avg() {
		
		return 0;
	}
	@Override
	public void description() {
		
		
	}
	@Override
	public void Grade_assignment() {
		
		
	}

	
	
	
	@Override
	public void findMaxMin() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int percent_calculate() {
		// TODO Auto-generated method stub
		return 0;
	}
}
