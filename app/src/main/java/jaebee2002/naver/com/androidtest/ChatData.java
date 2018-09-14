package jaebee2002.naver.com.androidtest;

import android.content.Context;
import android.widget.ListView;

public class ChatData {
    private String userName;
    private String message;
    private String time;

    public ChatData() { }

    public ChatData(String userName, String message, String time) {
        this.userName = userName;
        this.message = message;
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }
}
