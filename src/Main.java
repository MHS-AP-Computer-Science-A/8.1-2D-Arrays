public class Main { 

	public static void main(String[] args) {
		// A 2D array is an array of arrays
				
	    // You can make a 2D array with an initializer
		// list. Each row is an array.
		int[][] gradeBook = { {98, 83, 92, 79},
							  {75, 68, 86, 90},
							  {90, 66, 58, 62},
							  {75, 80, 93, 87} };
		
		// gradeBook[3] is the 4th row of gradeBook
		int[] grades = gradeBook[3];
		// grades[2] is the 3rd element of grades
		int score = grades[2];
		System.out.println(score);
		
		//You can also create a 2D array using a size
		int[][] arr = new int[2][4];
		/* 
		   0 0 0 0
		   0 0 0 0
		*/
		//We can access and change values using the roe
		//and column
		arr[1][2] = 9;
		/* 
		   0 0 0 0
		   0 0 9 0
		*/	
	}

}
