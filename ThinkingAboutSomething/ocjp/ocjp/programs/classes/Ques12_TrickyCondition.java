package ocjp.programs.classes;

public class Ques12_TrickyCondition {

	public static void main(String[] args) {
		int luck =10;
		if((luck>10 ? luck++:--luck)<10) {
			System.out.println("Bear");
		}
		if(luck<10) {
			System.out.println("L");
		}
	}

}
