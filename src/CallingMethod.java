public class CallingMethod {

    public String harsh() {
        System.out.println("kya haal chal bhai");
        return "kya haal chal";
    }

    public String amit() {
        System.out.println("thik hu bhai");

        return "thik hu bhai";
    }

    public static void main(String[] args) {

       CallingMethod cm = new CallingMethod();

       cm.harsh();
       cm.amit();

    }
}
