package c.c.k;

import org.springframework.stereotype.Service;

@Service
public class HelloWorld2 {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
