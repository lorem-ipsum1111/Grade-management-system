package ppp.util;
// Grade assigning functionality
public class Grading extends FunctionalityWrapper {

	public Grading(ScoreCard newRecord) {
		super(newRecord);
		
	}
	//assigns grade based on marks
public void Grade_assignment() {
		
		int a = (int) rec.calculate_total();
		int b = (int) rec.return_subjects();
		
		if(a>=(90*b)) {
			System.out.println("Grade: A");
		}
		
		else if((70*b)<=a && a<(90*b)) { System.out.println("Grade: B");}
		
		else if((60*b)<=a && a<(70*b)) { System.out.println("Grade: C");}
		
		else if ((40*b)<=a && a<(60*b)) {System.out.println("Grade: D");}
		
		else if((30*b)<=a && a<(40*b)) {System.out.println("Grade: E");}
		
		else if((30*b)>a) {System.out.println("Grade: F");}
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
public void display_marks() {
	
	
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
