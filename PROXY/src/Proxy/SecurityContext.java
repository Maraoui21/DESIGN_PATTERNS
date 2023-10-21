package Proxy;

public class SecurityContext {
    private static String role;
    private static String userName;
    public static void setContext(String role,String userName) {
        SecurityContext.role = role;
        SecurityContext.userName = userName;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getRole() {
        return role;
    }
}
