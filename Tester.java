import ppp.util.*;
import java.util.Scanner;


//This is the most basic class.
//Basic Functionality class starts
 class CoreSub{
	
	ScoreCard cs = new Core();
	
	public void put_marks(int a) {
		cs.add_marks(a);
	}
	
	public void knowSubjects() {
		cs.return_subjects();
	}
	
	public int total() {
		
		return cs.calculate_total();
	}
	
	public boolean passStatus() {
		
		return cs.is_pass();
	}
	
	public void getDescription() {
		
		cs.description();
	}
	
	public ScoreCard returnObj() {
		return cs;
	}
				
}
 
//Basic functionality class ends


//Class using functionality for additional subjects

//Update1 dependant class starts
 
 class AdditionalSubjects{
	 
	 ScoreCard sub ;
	 public void passObject(ScoreCard obj) {
		 sub = obj;
	 }
	 
	 
	 
	 public void SelectSub(int s) {
		 if(s==1) {sub = new Maths(sub);}
		 else if(s==2) {sub = new Science(sub);}
		 else if(s==3) {sub = new Humanities(sub);}
		 else if(s==4) {sub = new NSO(sub);}
		 
		 
	 }
	 
	 public void SelectFn(int f) {
		 if(f==1) {
			 System.out.print("Enter your marks: ");
			 Scanner scan2 = new Scanner(System.in);
			 
			 int marks2 = scan2.nextInt();
			
			 sub.add_marks(marks2);
			 System.out.println("Marks added"
			 		+ "successfully.");
			
		 }
		 
		 else if(f==2) {
			sub.description();
		 }
		 
		 else if(f == 3) {
			 System.out.println("Your total score is: "
			 		+ sub.calculate_total());
		 }
		 
		 else if(f==4) {
			 System.out.println("You have taken total "
					 + sub.return_subjects() + " subjects");
		 }
		 
		 else if(f==5) {
			 if(sub.is_pass()) {
				 System.out.println("You are overall pass.");
			 }
			 else {
				 System.out.println("You are overall fail.");
			 }
			 
			 
			 
		 }
		 
		 	 
	 }
	 
	 
 }

//Update1 class ends

//Class using functionality for additional functions

//Update2 dependant class starts
 
 class AdditionalFunctions{
	 
	 ScoreCard fnctn;
	 public void passObject(ScoreCard obj) {
		 fnctn = obj;
	 }
	 
	 public void selectFnctn(int f) {
		 if(f == 1) {
			 fnctn = new Average(fnctn);
			 System.out.println("The average of your score is: "
		 		+ fnctn.calculate_avg());}
		 else if(f == 2) {fnctn = new Percentage(fnctn);
		 				System.out.println("The percentage is: "
		 						+ fnctn.percent_calculate()+"%");}
		 else if(f == 3) {
			 fnctn = new MaxMin(fnctn);
			 
			 fnctn.findMaxMin();}
		 		 
	 }
	 
 }

//Update2 dependant class ends

//Class using functionality for Grading

//Update3 dependant class starts
 
 class AdditionalGrading{
	 
	 ScoreCard grad ;
	 public void passObject(ScoreCard obj) {
		 grad = obj;
	 }
	 
	 public void selectGradfn(int g) {
		 if(g == 1) {
			 grad = new Grading(grad);
			 grad.Grade_assignment();}
		 else if(g == 2) {
			 System.out.println("Your marks are as follows: ");
			 grad = new GradesheetDisplay(grad);
			 grad.display_marks();}
		
	 }
	 
 }

//Update3 dependant class ends

//Main class starts

public class Tester {

	public static void main(String[] args) {

		//Implementation of basic functionality -- needs basic_tools library --runs on CoreSub

		//Basic function use starts
		
		System.out.println("Welcome to student score management portal");
		
		Scanner scan = new Scanner(System.in);
		
		int marks;
		
							
		System.out.println("Please enter your marks in Core subject.");
		marks = scan.nextInt();
		
		CoreSub core = new CoreSub();
		
		core.put_marks(marks);
		
		while(1>0) {
		System.out.println("Press 1 to get subject description. Press 2 to check"
				+ " if you are pass or fail. Press 3 to continue.");
		int choice_0 = scan.nextInt();
		if(choice_0 == 3) {break;}
		if(choice_0 == 1) {core.getDescription();}
		if(choice_0 == 2) {if(core.passStatus()) {
			System.out.println("You have passed.");
		}
		else {System.out.println("You have failed.");}
		}
		
		}

		//Basic function use ends

		//Implementation of additional subjects -- needs update1 library --runs on AdditonalSubjects

		//Use of additional functions starts
		
		int choice;
		
		System.out.println("Enter 1 to add support for additional subjects."
				+ "Press 0 otherwise");
		
		choice = scan.nextInt();
		
		if(choice == 1) {System.out.println("Support added for"
				+ " Maths, Science, Humanities, NSO, total marks,"
				+ "total subjects, pass check.");
				int maths = 0;
				int science = 0;
				int humanities = 0;
				int nso = 0;
				
			while(1>0) {
				System.out.println("Enter 1 for Maths, 2 for Science, 3 for Hu"
						+ "manities, 4 for NSO, 5 when you are done.");
				int choice2;
				choice2 = scan.nextInt();
				
				if(choice2 == 5) {break;}
				
				AdditionalSubjects adsub = new AdditionalSubjects();
				adsub.passObject(core.returnObj());
				
				if(choice2 == 1) {System.out.println("You chose maths");
				adsub.SelectSub(1);
				}
				else if(choice2 == 2) {
					System.out.println("You chose science");
					adsub.SelectSub(2);
				}
				else if(choice2 == 3) {
					System.out.println("You chose humanities");
					adsub.SelectSub(3);
				}
				else if(choice2 == 4) {
					System.out.println("You chose NSO");
					adsub.SelectSub(4);
				}
				
				else {System.out.println("Please enter one of the specified"
				 		+ " numbers");continue;}
				
			System.out.println("Enter 1 to store your marks of the subject."
						+ "Enter 2 to to get a description of subject."
						+ "Enter 3 to calculate total score."
						+ "Enter 4 to get the total subjects you have taken."
						+ "Enter 5 to get know if you are pass or fail.");
			int choice_f = scan.nextInt();
			
			if(choice_f == 1) {
				if(choice2 == 1) {
					if(maths == 0) {
						adsub.SelectFn(1);
						maths++;
						}
					else {
						System.out.println("Maths marks already added");
						continue;
					}
					}
				if(choice2 == 2) {
					if(science == 0) {
						adsub.SelectFn(1);
						science++;
						}
					else {
						System.out.println("Science marks already added");
						continue;
					}
				}
				if(choice2 == 3) {
					if(humanities == 0) {
						adsub.SelectFn(1);
						humanities++;
						}
					else {
						System.out.println("Humanities marks already added");
						continue;
					}
					}
				if(choice2 == 4) {

					if(nso == 0) {
						adsub.SelectFn(1);
						nso++;
						}
					else {
						System.out.println("NSO marks already added");
						continue;
					}
				}
				
				
				
			else if(choice_f == 2) {adsub.SelectFn(2);}
			else if(choice_f == 3) {adsub.SelectFn(3);}
			else if(choice_f == 4) {adsub.SelectFn(4);}
			else if(choice_f == 5) {adsub.SelectFn(5);}	
			else {System.out.println("Please enter one of the specified "
			 		+ "numbers");continue;}
				
			}
		}
		}

		//Additional subjects use ends

		//Implementation of additional functions starts -- needs update2 library --runs on AdditionalFunctions

		//Additional functions use starts
		
		System.out.println("Enter 1 to add support for additional functions");
		choice = scan.nextInt();
		if(choice == 1) {System.out.println("Support added for Average,"
				+ "Percentage and Min and Max marks.");
			while(1>0) {
				System.out.println("Enter 1 to find average."
						+ "Enter 2 to find percentage."
						+ "Enter 3 to Show the Max and Min marks."
						+ "Enter 4 to exit.");
				int choice2_2 = scan.nextInt();
				if(choice2_2 == 4) {break;}
				AdditionalFunctions adf = new AdditionalFunctions();
				adf.passObject(core.returnObj());
				if(choice2_2 == 1) {adf.selectFnctn(1);}
				else if(choice2_2 == 2) {adf.selectFnctn(2);}
				else if(choice2_2 == 3) {adf.selectFnctn(3);}
				else {System.out.println("Please enter one of the specified"
				 		+ " numbers");continue;}
				
				
			}
		}
		
		//Additional function use ends -- needs update3 library --runs on AdditionalGrading
		
		//Implementation of grading support starts
		System.out.println("Enter 1 to add grading support.");
		choice = scan.nextInt();
		if(choice == 1) {System.out.println("Support added for "
				+ "Finding Grade and Showing Marks");
			while(1>0) {
				System.out.println("Enter 1 to show your overall grade."
						+ "Enter 2 to dispay all your marks."
						+ "Enter 3 to exit.");
				int choice_g;
				choice_g = scan.nextInt();
				if(choice_g == 3) {break;}
				
				AdditionalGrading adg = new AdditionalGrading();
				
				adg.passObject(core.returnObj());
				
				if(choice_g == 1) {adg.selectGradfn(1);}
				else if(choice_g == 2) {adg.selectGradfn(2);}
				else {System.out.println("Please enter one of the specified"
				 		+ "numbers");continue;}
				
			}
		}
		
		
		scan.close();
	}
	
		//Implementation of grading support ends
	

}
