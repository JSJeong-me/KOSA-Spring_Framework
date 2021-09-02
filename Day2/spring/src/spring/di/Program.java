package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam exam = new NewExam();
		//ExamConsole console = new InlineExamConsole(exam);
		ExamConsole console = new GridExamConsole(exam);
		console.setExam(exam);
		console.print();
	}

}
