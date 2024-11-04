class prog {
    public static void main(String[] args) {
        int n = 82;
        trynumber(n); // Call the method with the first number
        n = 37;
        trynumber(n); // Call the method with the second number
    }

    public static void trynumber(int n) {
        try {
            // Call the checkEvenNumber() method
            checkEvenNumber(n);
            System.out.println(n + " is even.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            // Throw a custom exception
            throw new RuntimeException(number + " is odd."); // Using RuntimeException for simplicity
        }
    }
}
