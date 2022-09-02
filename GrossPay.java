public class GrossPay{

	private String name ;
	private String date ;
	private String descp ;
	
	
	public double rate ;
	public int hours ;
	
	
	GrossPay(String name, String date, String descp, double rate, int hours) {
		this.name = name ;
		this.date = date ;
		this.descp = descp ;
		this.rate = rate ;
		this.hours = hours ;
	}
			
	
	public double getRate() { return rate ;}
	public int getHours() { return hours ;}

	
	public double calculateGrossPay(double rate, int hours) {
		return rate*hours ;
	}
	
	
	public void displayInfo() {
		System.out.println("Name: " + name) ;
		System.out.println("Date: " + date) ;
		System.out.println("Description: " + descp) ;
		System.out.println();
	}
	
	
	public void displayRHGrossPay(double rate, int hours, double gross) {
		System.out.println("The Pay rate is $" + rate + ".") ;
		System.out.println("The Hours worked are " + hours + ".") ;
		System.out.println("The Gross pay is $" + gross + ".") ;
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		GrossPay emp = new GrossPay("XYZ", "DD-MM-YYYY", "Manager", 20.0d, 8) ;
		emp.displayInfo() ;
		
		double r = emp.getRate() ;
		int hr = emp.getHours() ;
		
		double gp = emp.calculateGrossPay(r, hr) ;
		emp.displayRHGrossPay(r, hr, gp) ;
	}
}