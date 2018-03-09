/**
 * Created by shitingji on 2018/3/8.
 */
public class ExtendsDecoratorA extends DecoratorBase {

    public ExtendsDecoratorA(BaseObject baseObject) {
        super(baseObject);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        System.out.println(this.getClass().getName() + " run doSomething");
    }
}
