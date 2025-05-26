public class Main {
    public static void main(String[] args) {
        Message msg = new Message(1, "+27718693002", "Hello there!");
        System.out.println("Message ID: " + msg.messageID);
        System.out.println("Recipient valid? " + msg.checkRecipientCell());
        System.out.println("Message Hash: " + msg.createMessageHash());
    }
}
