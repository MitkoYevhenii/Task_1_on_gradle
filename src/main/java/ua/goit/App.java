package ua.goit;

import com.google.gson.Gson;

public class App {

    private static final String firstName = "Yevhenii";
    private static final String lastName = "Mitko";

    public static void main(String[] args) {

        MyInfo myInfo = new MyInfo(firstName, lastName);
        Gson gson = new Gson();
        String json = gson.toJson(myInfo);

        System.out.println(json);
    }
}