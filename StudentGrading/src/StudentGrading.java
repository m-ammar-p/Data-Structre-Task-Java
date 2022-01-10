
public class StudentGrading {

	public static void main(String[] args) {
		
		int count = 0;
		
		String key[] = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
		
		String record[][] = {
				
			{"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
			{"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
			{"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
			{"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
			{"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
			{"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
			{"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
			{"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
			
					};// record ends
		
		for (int i = 0; i < record.length; i++) {
			
			count = 0;
			
			for (int j = 0; j < record[i].length; j++) {
				
				if(record[i][j].equalsIgnoreCase(key[j])) {
				
				count++;
				}
				
			}
			
			System.out.println("Student's " + i +  " correct answers are: " + count);
		}// loop i ends
		
	}

}
