package ppp.util;

import java.util.ArrayList;

public interface ScoreCard {

	
ArrayList<Integer> marks = new ArrayList<Integer>();
	
	
	
	public abstract void add_marks(int marks);
	public abstract int calculate_total();
	public abstract boolean is_pass();
	public abstract int return_subjects();
	public abstract int calculate_avg();
	
	public abstract void display_marks();
	public abstract void Grade_assignment();

	
	public abstract void findMaxMin();
	public abstract int percent_calculate();
	public abstract void description();
	
	
	
}
