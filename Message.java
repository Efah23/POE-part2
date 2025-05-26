import java.util.Random;

public class Message {
    public String messageID;
    private String recipient;
    private String messageText;
    private int id; // maybe used in hash?

    public Message(int id, String recipient, String messageText) {
        this.id = id;
        this.recipient = recipient;
        this.messageText = messageText.toUpperCase().replaceAll("\\s+", "");
        this.messageID = generateMessageID();
    }

    // Generates a 10-digit random numeric string as messageID
    private String generateMessageID() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }

    // Checks if recipient starts with '+' followed by digits (international format)
    public boolean checkRecipientCell() {
        return recipient.matches("^\\+\\d+$");
    }

    // Creates a message hash in the format: first 2 digits of messageID : id : message text (uppercase, no spaces)
    public String createMessageHash() {
        String prefix = messageID.substring(0, 2);
        return prefix + ":" + id + ":" + messageText;
    }

    // For demonstration or testing
    public String getRecipient() {
        return recipient;
    }

    public String getMessageText() {
        return messageText;
    }
}
