package Proxy;

public class Proxy implements IService{
    @Override
    public void compute() {
        if(SecurityContext.getRole().equals("ADMIN")){
            System.out.println("WELECOME MR "+SecurityContext.getUserName());
            return;
        }
        throw new RuntimeException("403 UNAUTHORIZED !!!");
    }
}
