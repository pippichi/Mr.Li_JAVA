public class GradeExam{
	public static void main(String[] args){
		char[][] answers={
			{'A','B','A','C','C','D','E','A','C','E'},
			{'D','B','C','A','A','B','E','A','B','C'},
			{'B','C','A','B','A','B','C','A','B','E'},
			{'A','E','C','A','A','D','E','A','C','B'},	
			{'B','E','D','A','C','E','A','A','D','B'},
			{'D','C','C','D','A','E','B','A','D','C'},
			{'D','E','E','A','B','D','B','E','C','A'},
			{'A','A','A','A','A','A','A','A','A','A'},		
			};
		char[] keys={'b','E','A','A','A','D','E','A','B','E'};
		for(int i=0;i<answers.length;i++){
		 int correctCount=0;
		 for(int j=0;j<answers[i].length;j++)
		  if(answers[i][j]==keys[j])
		   correctCount++;
	  System.out.println("Student "+i+"'s correct count is: "+correctCount);
	 }
		}
	}