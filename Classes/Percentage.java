package ppp.util;
//Functionality for calculating percentage
public class Percentage extends FunctionalityWrapper {

	public Percentage(ScoreCard newRecord) {
		super(newRecord);
		
	}//calculate percentage
	public int percent_calculate() {
		
		int a = rec.calculate_total();
		int b = rec.return_subjects();
		return a/b;
		
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
}
