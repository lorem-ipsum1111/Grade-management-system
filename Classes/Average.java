package ppp.util;

public class Average extends FunctionalityWrapper {

	public Average(ScoreCard newRecord) {
		super(newRecord);
		
	}
	
public int calculate_avg() {
		//returns average
		int a = rec.calculate_total();
		int b = rec.return_subjects();
		return a/b;
		
	}
//Overridden methods
@Override
public void description() {
	
	
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
