/**
 * Created by shitingji on 2018/3/8.
 */
public class DecoratorBase implements BaseObject {
    private BaseObject baseObject;

    public DecoratorBase(BaseObject baseObject) {
        this.baseObject = baseObject;
    }

    public void doSomething() {
        baseObject.doSomething();
    }
}
