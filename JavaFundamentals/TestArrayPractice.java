import java.util.ArrayList;
import java.util.Collections;
public class TestArrayPractice {
    public static void main(String[] args) {
        System.out.println("Hello World");

        ArrayPractice ap = new ArrayPractice();
        System.out.println(ap.companyList[0]);
        // System.out.println(ap.getContractnames());
    
        ArrayList<Object> listOfThings = new ArrayList<Object>();

        listOfThings.add(10);
        listOfThings.add("Hello");
        listOfThings.add(12.0);
        listOfThings.add(new ArrayList<Integer>());
        // listOfThings.add(new Double(15.0));

        // System.out.println(listOfThings.get(0));
        System.out.println("Full List"+ listOfThings);
        for(int i = 0; i < listOfThings.size(); i++){
            System.out.println(listOfThings.get(i));

        }

        ArrayList<String> bookList = new ArrayList<String>();
        bookList.add("Computer Science");
        bookList.add("TV");
        bookList.add("Laptops");
        bookList.add("Cameras");
        
        for(String names: bookList){
            System.out.println(names);
        }
        
        ArrayList<Integer> serialNumbers = new ArrayList<Integer>();
        
        serialNumbers.add(500); 
        serialNumbers.add(20);
        serialNumbers.add(100);
        serialNumbers.add(2);
        serialNumbers.add(10);

        Collections.sort(serialNumbers);

        System.out.println(serialNumbers);

        ArrayList<Integer> checkNumbers = new ArrayList<Integer>();
        
        checkNumbers.add(1); 
        checkNumbers.add(2);
        checkNumbers.add(3);
        checkNumbers.add(4);
        checkNumbers.add(5);

        System.out.println(checkNumbers);
        Collections.shuffle(checkNumbers);
        System.out.println(checkNumbers);
        
  
  
  
  
        /*
        ap.setContractNames();
        ap.getContractnames();
*/
        // ap.setContractNames(companyList[0] = "helo");
    }
}