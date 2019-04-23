import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberLine {

	public static void main(String[] args) {

		
		List<List<Integer>> pointList=new ArrayList<List<Integer>>();
		List<List<Integer>> finalList=new ArrayList<List<Integer>>();
		
		Scanner scanner = new Scanner(System.in);
        while(true) {

	            System.out.print("Enter x1 : ");
	            int x1 = scanner.nextInt();
	            
	            System.out.print("Enter x2 : ");
	            int x2 = scanner.nextInt();
	            
	            List<Integer> pointTmp=new ArrayList<Integer>();
	            pointTmp.add(x1);
	            pointTmp.add(x2);
	            
	            pointList.add(pointTmp);
	            
	            
	            System.out.println("Do you want to enter more elements (y/n) : ");
	            String input = scanner.next();
	
	            if ("n".equalsIgnoreCase(input)) {
	                System.out.println("Exit!");
	                break;
	            }
	    }
        scanner.close();
	
		
		for(int i=0;i<pointList.size();i++) {
			
			if(i+1<pointList.size()) {
				if(pointList.get(i).get(1)>=pointList.get(i+1).get(0) && pointList.get(i).get(1)<=pointList.get(i+1).get(1)) {
					pointList.get(i).set(1, pointList.get(i+1).get(1));
					finalList.add(pointList.get(i));
					i++;
				}
				else if(pointList.get(i+1).get(0)>=pointList.get(i).get(0) && pointList.get(i+1).get(1)<=pointList.get(i).get(1)) {
					finalList.add(pointList.get(i));
					i++;
				}
				else {
					finalList.add(pointList.get(i));
				}
			}
			else {
				finalList.add(pointList.get(i));
			}
			
		}
		
		for(int i=0;i<finalList.size();i++) {
			System.out.println(finalList.get(i));
		}
		
		
		
	}

}
