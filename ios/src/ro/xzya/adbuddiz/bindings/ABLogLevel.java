package ro.xzya.adbuddiz.bindings;

import org.robovm.rt.bro.ValuedEnum;

public enum ABLogLevel implements ValuedEnum {

    ABLogLevelInfo(1),
    ABLogLevelError(2),
    ABLogLevelSilent(0);

    private final long n;

    private ABLogLevel(long n) {
        this.n = n;
    }

    @Override
    public long value() {
        return n;
    }

}
