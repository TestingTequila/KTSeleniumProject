package data;

import java.util.Random;

public interface TestData {

    //Login
    String EMAIL_ID = "ben.fletcher@janbask.com";
    String PASSWORD = "test@1234";
    int WAIT_TIME = 3000;
    String PAGE_TITLE = "My Account";
    String SUCCESS_MESSAGE = "Login is successful...";
    String FAILURE_MESSAGE = "Login failed...please check your credentials....";

    //Registration

    String FIRST_NAME = "Bharati";
    String LAST_NAME = "Mishra";
    int RANDOM_NUMBER = new Random().nextInt(239) + 1;
    String REGISTRATION_EMAIL_ID = "bharati.mishra" + RANDOM_NUMBER + "@janbask.com";
    String TELEPHONE_NUMBER = "8987756745";
    String REGISTRATION_PASSWORD = "test@1234";
    String REGISTRATION_CONFIRM_PASSWORD = "test@1234";
    String SUBSCRIPTION_TYPE = "Monthly";
    String REGISTRATION_SUCCESS_MESSAGE = "Congratulation....you have been registered";
    String REGISTRATION_FAILURE_MESSAGE = "This email already Registered....";

}
