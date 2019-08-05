package ppp.util;
// Wrapper class
public abstract class FunctionalityWrapper implements ScoreCard {

	protected ScoreCard rec;
	
	
	public FunctionalityWrapper(ScoreCard newRecord) {
			rec = newRecord;
		}
	

	//add marks method
	public void add_marks(int marks) {
		
		 rec.add_marks(marks);

	}

	//calculate total method
	public int calculate_total() {
		
		return rec.calculate_total();

	}

	//know pass status method
	public boolean is_pass() {
		return rec.is_pass();
	}


	//return subject method
	public int return_subjects() {
		
		return rec.return_subjects();
	}
	//know the description of a particular course
	public void description() {
		rec.description();
	}



	

}
