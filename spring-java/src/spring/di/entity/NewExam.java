package spring.di.entity;

public class NewExam implements Exam {

	private int kor=10;
	private int eng=20;
	private int math=30;
	private int com=40;
	
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor+eng+math+com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total() / 4.0f;
	}

}
