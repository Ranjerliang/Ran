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
			 System.out.println("�����뱾��:");
			 amount = keyboard.nextDouble();
			 System.out.println("����������:");
			 rate = keyboard.nextDouble();
			 rate = rate/100;
			 System.out.println("������ʱ��:");
			 year = keyboard.nextInt();

			 for (int x = 1; x < year; x++){
				amount = amount * Math.pow(1.0 + rate, year);
			    }
		
			System.out.println("���Ϊ"+amount);

			 String go = "n";
			 do{
			  System.out.println("Continue Y/N");
			  go = keyboard.nextLine();
			 }while (go.equals("Y") || go.equals("y"));
			}
			}
	


