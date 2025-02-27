// src/main/java/com/example/demo/model/Greeting.java
package SpringBoot_.UC1_Greeting;

public class Greeting {
    private String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
