package servlets;

import java.util.Date;

public class Device {
    private String title;
    private String created;

    public Device(String title, String created) {
        this.title = title;
        this.created = created;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Device{" +
                "title='" + title + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}
