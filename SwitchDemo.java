class SwitchDemo{
	public static void main(String[]args){
		int ch = 2;
		switch(ch){
		case 1: 
				System.out.println("January");
				break;
		case 2: 
				System.out.println("February");
				break;
				
		case 3: 
				System.out.println("March");
				break;
		case 4: 
				System.out.println("April");
				break;
		case 5: 
				System.out.println("May");
				break;
		default:
			System.out.println("Invalid choice");
		}
	}
}