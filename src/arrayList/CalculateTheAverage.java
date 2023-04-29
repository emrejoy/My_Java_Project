package arrayList;

public class CalculateTheAverage {

    public static void main(String[] args) {

        int[] numbers = new int[]{20, 30, 40, 50, 60};
        //calculate sum of all array elements,
        int sum = 0;
        double average = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

            average = sum / numbers.length;


        }
        System.out.println("Average value of the array elements is : " + average);
    }


}


//Write a Java program to calculate the average value of array elements.