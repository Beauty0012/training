class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class Q2{

    public static void validateNumber(int n) throws CustomException {
        if (n < 0) {
            throw new CustomException("Negative numbers are not allowed.");
        } else if (n == 0) {
            throw new CustomException("Not valid");
        } else {
            System.out.println("Valid number: " + n);
        }
 }
    public static void main(String[] args) {
        int[] t = {-2, 0, 10};
        
        for (int n : t) {
            try {
                validateNumber(n);
            } catch (CustomException e) {
                System.out.println(" Custom Exception: " + e.getMessage());
            } finally {
                System.out.println("process completed" + n);
            }
        }
        
        System.out.println("successfully.");
    }
}