public class Application {
    /**
     * This class contains a main method that allows you to manually test the HardcodedLogin challenge functionality.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     *
     * The Lab.login method should return true if a login should be permitted given two values.
     */
    public class Lab {
        public boolean login(String username, String password){
            if (username.equals("admin") && password.equals("qwerty")) {
                return true;
            } else if (username.equals("user") && password.equals("password")) {
                return true;
            } else {
                return false;
            }
        }
    }
}    