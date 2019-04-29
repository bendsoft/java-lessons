package unittests.fakes;

public class Message {
    public Status status;

    private Message(Status status) {
        this.status = status;
    }

    public static Message createOK() {
        return new Message(Status.OK);
    }

    public static Message createNotOK() {
        return new Message(Status.NOT_OK);
    }

    public enum Status {
        OK,
        NOT_OK
    }
}
