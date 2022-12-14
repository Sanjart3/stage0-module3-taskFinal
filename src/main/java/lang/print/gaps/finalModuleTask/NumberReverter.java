package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int newnum=(number%10)*100+(number%100-number%10)+number/100;
        System.out.println(newnum);
    }
}
