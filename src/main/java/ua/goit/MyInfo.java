package ua.goit;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyInfo {
    private String name;
    private String lastName;

    public MyInfo(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}

