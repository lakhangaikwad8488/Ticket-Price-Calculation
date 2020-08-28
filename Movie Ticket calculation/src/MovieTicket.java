import java.util.Scanner;

public class MovieTicket {
	
	public static void main(String[] args) {
		
		int ticket;
		String refreshment,coupanCode,circle;
		int ref=0;
		float dis=0;
		float TotalCost=0;
		float coupanDis=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the no.of ticket");
		ticket=sc.nextInt();  //30
		
		if(ticket>=5 && ticket<=40)
		{
			System.out.print("Do you want refreshment"); //y
			refreshment=sc.next();
			sc.nextLine();
			System.out.println("Do you have coupon code"); //y
			coupanCode=sc.nextLine();
			//sc.nextLine();
			System.out.println("Enter the circle"); //q
			circle=sc.nextLine();
			
			if(circle.equals("q"))
			{  System.out.println("we selected q and value of ticket"+ticket);
				int ticketTotal=ticket*150;
				if(ticket>20) 
				{
					dis=ticketTotal*10/100;
					dis=ticketTotal-dis;
					System.out.println("ticketTotal : "+ticketTotal+"dis:"+dis);
					System.out.println("refreshment: "+refreshment);
					
				}else {
					
					dis=ticketTotal;
				}
				if(refreshment.equals("y"))
				{
					 ref=50*ticket;
					System.out.println("Refreshment:"+ref);
				}
				if(coupanCode.equals("y"))
				{
					coupanDis= dis*2/100;
					coupanDis=dis-coupanDis;
					System.out.println("Coupan Discounted:"+coupanDis);
				}else
				{
					coupanDis= dis;
				}
			 TotalCost= coupanDis+ref;
			 System.out.println("Toatal cost of movie ticket is "+TotalCost);
				
			}else if(circle.equals("k"))
			{
				int ticketTotal=ticket*75;
				if(ticket>20) 
				{
					dis=ticketTotal*10/100;
					
				}else {
					dis=ticketTotal;
				}
				if(refreshment.equals("y"))
				{
					 ref=50*ticket;
					
				}
				if(coupanCode.equals("y"))
				{
					coupanDis= dis*2/100;
				}else
				{
					coupanDis= dis;
				}
			 TotalCost= coupanDis+ref;
			 System.out.println("Toatal cost of movie ticket is "+TotalCost);
				
				
			}
			else {
				
				System.out.println("Invalid Input");
			}
			
			
			
			
		}else {
			
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
			
		}
		
		
	}
	
}
