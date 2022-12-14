package llax.main.varargs;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VarargsDemo {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private static final java.util.logging.Logger julLogger = java.util.logging.Logger
            .getLogger(MethodHandles.lookup().lookupClass().getName());

    public VarargsDemo() {
        log.info(VarargsDemo.class.getSimpleName() + " has been created " + this);

        if (log.isInfoEnabled()) {
            log.info(VarargsDemo.class.getSimpleName() + " has been created " + this);
        }

        log.info("{} has been created {}", VarargsDemo.class.getSimpleName(), this);

        julLogger.info(() -> VarargsDemo.class.getSimpleName() + " has been created " + this);
    }

}
