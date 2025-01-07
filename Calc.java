class Calc{

	void add(int a, int b){
		System.out.println(a+b);
	}
	void sub(int a, int b){
	System.out.println(a-b);
}
	void mul(int a, int b){
		System.out.println(a-b);
	}

	public static void main(String[] args){
		int a = 10, b =5;
		add(a, b);
		sub(a, b);
		div(a, b);
		mul(a, b);
	}
}