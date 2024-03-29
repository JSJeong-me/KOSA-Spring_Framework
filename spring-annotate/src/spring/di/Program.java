package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub 
		 * Exam exam = new NewExam();
		 * Exam exam = new NewExam(10, 15, 20, 30);
		 * ExamConsole console = new GridExamConsole(exam);
		 * console.setExam(exam);
		 */
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		//ExamConsole	console = (ExamConsole)context.getBean("console");
		ExamConsole	console = (ExamConsole)context.getBean(ExamConsole.class);
		console.print();
		
		
	}

}
