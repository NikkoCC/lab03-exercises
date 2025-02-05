import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

	/**
	 * 
	 * @param dog is the input list
	 * @return a list containing how many times a duplicate integer was encountered (two 7s means there are 2 duplicates out of 3 total)
	 */
    public static List<Integer> findDuplicatesNestedLoops(List<Integer> dog) {
        List<Integer> results = new ArrayList<Integer>();

        for(int i=0; i<dog.size(); i++) {
        	for(int j=i+1; j<dog.size();j++) {
        		if(dog.get(i).equals(dog.get(j))) {
        			results.add(dog.get(i));
        			break;
        		}
        	}
        }
        return results;
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66)); // 3x7, 2x5
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6)); // 2x4, 3x6
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0)); // 2x0
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findDuplicatesNestedLoops(sample1));
        System.out.println("Sample 2: " + findDuplicatesNestedLoops(sample2));
        System.out.println("Sample 3: " + findDuplicatesNestedLoops(sample3));
        System.out.println("Sample 4: " + findDuplicatesNestedLoops(sample4));
    }

}