void main() {

    IO.println("""
           ===================================
                     BMI CALCULATOR
           ===================================
           +---------------------------------+
           |           BMI RANGES            |
           +---------------------------------+
           | <= 18.5       Underweight       |
           | 18.5 - 22.9   Healthy Weight    |
           | 23.0 - 27.4   Overweight        |
           | 27.5 - 32.4   Obesity Class I   |
           | 32.5 - 37.4   Obesity Class II  |
           | >= 37.5       Obesity Class III |
           +---------------------------------+
           """);

    try{
        IO.println("Enter your height (m) = ");

        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();

        IO.println("Enter your weight (kg) = ");
        double weight = input.nextDouble();

        double bmi = weight / (height * height);

        IO.println("Your BMI is = %.1f".formatted(bmi));

        if (bmi < 18.5) {
            IO.println("Your are Underweight.");
        }  else if (bmi < 23) {
            IO.println("Your are Healthy Weight.");
        }   else if (bmi < 27.5) {
            IO.println("Your are Overweight.");
        } else if (bmi < 32.5) {
            IO.println("Your are Obesity Class I.");
        } else if (bmi < 37.5) {
            IO.println("Your are Obesity Class II.");
        } else {
            IO.println("Your are Obesity Class III.");
        }
    } catch (Exception e) {
        IO.println("Invalid input!");
    }
}