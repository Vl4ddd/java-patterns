package socnet.socnet.FlyWeight;

import socnet.socnet.Logger.Logger;

public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    Logger logger = Logger.getInstance();
		

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        logger.log(intrinsicState + extrinsicState);
    }

}
