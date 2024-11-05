public class Phone {
    static String country = "Sweden";
    String phoneNumber;
    String phoneModel;
    double phoneWeight;

    public Phone() {
    }

    public Phone(String phoneNumber, String phoneModel, double phoneWeight) {
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneWeight = phoneWeight;
    }

    public void receiveCall(String name) {
        receiveCall(name, "N/A");
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит абонент по имени " + name + "номер: " + (callerNumber == "N/A" ? "N/A" : callerNumber));
    }
}
