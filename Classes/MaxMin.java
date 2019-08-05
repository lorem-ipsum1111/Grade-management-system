package ppp.util;
//maximum and minimum marks functionality
public class MaxMin extends FunctionalityWrapper {

	public MaxMin(ScoreCard newRecord) {
		super(newRecord);
		
	}
	//find max and min marks
public void findMaxMin() {
		
		int max = rec.marks.get(0);
		int min = rec.marks.get(0);
		
		for(int i = 0; i < rec.marks.size(); i++) {
			
			if(rec.marks.get(i) > max) {
				max = rec.marks.get(i);
				
			}	
			
			if(rec.marks.get(i) < min) 
			{
				min = rec.marks.get(i);
					
			}
		}
		
		System.out.println("Max marks: " + max + " Min marks: "
				+ min);
		
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
public int percent_calculate() {
	
	return 0;
}

}
