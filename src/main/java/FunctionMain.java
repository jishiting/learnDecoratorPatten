/**
 * Created by shitingji on 2018/3/8.
 */
public class FunctionMain {
    public static void main(String[] args) {
        //BasicObject bo = new BasicObject();
       // bo.doSomething();

        ExtendsDecoratorA eda = new ExtendsDecoratorA(new BasicObject());
        //eda.doSomething();
        ExtendsDecoratorB edb = new ExtendsDecoratorB(eda);
        edb.doSomething();

        System.out.println("I do a wrong process, and I will revise into the before one.");
    }
}
