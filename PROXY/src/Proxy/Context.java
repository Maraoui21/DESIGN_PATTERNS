package Proxy;

public class Context {
    IService iService;
    public void compute(){
        iService.compute();
    }
    public void setiService(IService iService) {
        this.iService = iService;
    }
}
