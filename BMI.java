public class BMI {
    public static void main(String args[])
    {
        System.out.println("This is the body mass index calculator (BMI)");
        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double BMI;

        System.out.println("Please give me your weight(kg): ");
        weight = scanner.nextDouble();

        System.out.println("Please give me your height(m): ");
        height = scanner.nextDouble();

        BMI = weight/(height*height);

        System.out.println("Your BMI is: ");
        //System.out.println(BMI);
        System.out.format("%.2f%n" , BMI);

        if (BMI<18.5)
        {
            System.out.println("Underweight!");
        }
        else if (BMI>24.9)
        {
            System.out.println("Overweight!");
        }
        else
            System.out.println("Your weight is OK!");
    }
}
