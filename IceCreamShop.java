// Custom exception class with a funny name
class TooMuchIceCreamException extends Exception {
    public TooMuchIceCreamException(String message) {
        super(message);
    }
}

public class IceCreamShop {
    // Method to check ice cream limit
    public static void buyIceCream(int scoops) throws TooMuchIceCreamException {
        if (scoops > 3) {
            throw new TooMuchIceCreamException("Whoa! " + scoops + " scoops? That's too much ice cream! 🍦");
        }
        System.out.println("Enjoy your " + scoops + " scoop(s) of ice cream! 😋");
    }

    public static void main(String[] args) {
        try {
            buyIceCream(5);  // This will throw our funny exception
        } catch (TooMuchIceCreamException e) {
            System.out.println("Oops! " + e.getMessage());
        } finally {
            System.out.println("Come back for more ice cream later! 🍨");
        }
    }
}

