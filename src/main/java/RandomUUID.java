
public class RandomUUID {
    public static void main(String[] args) {
        String randomUUID = "18e-2d6bb-4b65-4b07-8e61-cd35d5a18cbc";
        System.out.println("randomUUID = " +
                randomUUID.replaceAll("[^A-Za-z0-9]", "").toUpperCase().substring(0,6));
    }
}
