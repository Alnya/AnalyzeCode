
public class Example1 {

	public static void main(String[] args) {
		/*
		 * �����p�e�X�g�R�[�h for,if,while�̌��擾�o���Ă���̂��̃`�F�b�N�p
		 */
		int sum = 0;
		boolean flag = true;
		String[] strs = {"yamada","tanaka","suzuki"};
		
		
		//for:3 / �g��for:1
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println("AAA");
		}
		for (int i = 0; i < 10; i++) {
			sum += i + 1;
		}
		for(String name : strs) {
			System.out.println(name);
		}
		/*
		for(int i = 0;i < 5;i++){
			for(int j = 0; j< 3;j++) {
				System.out.print("i:" + i + "/" + "j;" + j + "  ");
			}
			System.out.println();
		}
		*/
		
		
		//if:2
		if(sum == 55) {
			System.out.println("sum = " + sum);
		}
		if(flag) {
			System.out.println(true);
		}
		while(flag) {
			System.out.println("change flag");
			flag = false;
		}
		while(flag) {
			System.out.println("aaaaaaa");
		}

	}

}
