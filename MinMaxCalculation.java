import java.util.ArrayList;

class MinMaxCalculation {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);    
        numbers.add(10);  
        numbers.add(100);  
        int max = findMax(numbers);
        int min = findMin(numbers);
        System.out.println("The max of " + numbers + " is " + max);
        System.out.println("The min of " + numbers + " is " + min);
    }
    
    public static int findMax(ArrayList<Integer> nums) {
        if(nums == null || nums.size() == 0) {
            throw new IllegalArgumentException("ArrayList must not be null or empty");
        }
        
        int max = nums.get(0);

        for(Integer i : nums) {
            max = Math.max(i, max);
        }

        return max;
    }

    public static int findMin(ArrayList<Integer> nums) {
    if(nums == null || nums.size() == 0) {
        throw new IllegalArgumentException("ArrayList must not be null or empty");
    }
    
    int min = nums.get(0);

    for(Integer i : nums) {
        min = Math.min(i, min);
    }

    return min;
    }    
}
