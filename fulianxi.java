import java.util.Scanner;


public class fulianxi {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 double amount;
			 double rate;
			 double year;
			
			 Scanner keyboard = new Scanner(System.in);
			 System.out.println("请输入本金:");
			 amount = keyboard.nextDouble();
			 System.out.println("请输入利率:");
			 rate = keyboard.nextDouble();
			 rate = rate/100;
			 System.out.println("请输入时间:");
			 year = keyboard.nextInt();

			 for (int x = 1; x < year; x++){
				amount = amount * Math.pow(1.0 + rate, year);
			    }
		
			System.out.println("结果为"+amount);

			 String go = "n";
			 do{
			  System.out.println("Continue Y/N");
			  go = keyboard.nextLine();
			 }while (go.equals("Y") || go.equals("y"));
			}
			}
	


