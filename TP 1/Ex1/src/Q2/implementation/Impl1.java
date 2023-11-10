package Q2.implementation;

import Q2.interfaces.Plugin;

public class Impl1 implements Plugin {
    @Override
    public void part1() {
        System.out.println("PART 1");
    }

    @Override
    public void part2() {
        System.out.println("PART 2");
    }
    public void execute(){
        this.part1();
        System.out.println("---------");
        this.part2();
    }
}
