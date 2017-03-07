import java.util.ArrayList;

import javax.management.InvalidAttributeValueException;

public class Main {

	public static void main(String[] args) throws InvalidAttributeValueException {

		ArrayList<Grade> grades = new ArrayList<Grade>();
		grades.add(new LetterGrade<>("A"));
		grades.add(new PercentageGrade(90));
		grades.add(new PassFailGrade(true));
		
		for (Grade grade : grades) {
			System.out.println("1. " + grade.toString());
			if (grade.isPass()) {
				System.out.println("2. " + "Pass");
			}
			else {
				System.out.println("3. " + "Fail");
			}
			
			if (grade.includeInAverage()) {
				if (grade.getClass().getName() == LetterGrade.class.getName()) {
					System.out.println("4. " + grade.toPercent(grade.toString()));
					System.out.println("\n");
				}
				else if (grade.getClass().getName() == PercentageGrade.class.getName()) {
					System.out.println("5. " + grade.toPercent(grade.toString()));
					System.out.println("\n");
				}
			}
		
		}

		
		
		
		
/*		LetterGrade lg = new LetterGrade("A");
		System.out.println(lg.getGrade());
		System.out.println(lg.getClass());
		System.out.println(lg.getClass().equals(LetterGrade.class));
		System.out.println(lg.toString());
		System.out.println(lg.isPass());
		System.out.println(lg.toPercent("A"));
		
		
		System.out.println();
		
		PercentageGrade pg = new PercentageGrade(100);
		System.out.println(pg.getGrade());
		System.out.println(pg.getClass());
		System.out.println(pg.getClass().equals(PercentageGrade.class));
		System.out.println(pg.toString());
		System.out.println(pg.isPass());
		System.out.println(pg.toPercent(20));
		
		
		System.out.println();
		
		PassFailGrade pfg = new PassFailGrade(true);
		System.out.println(pfg.isGrade());
		System.out.println(pfg.getClass());
		System.out.println(pfg.getClass().equals(PassFailGrade.class));
		System.out.println(pfg.toString());
		System.out.println(pfg.isPass());*/
		
	}

}