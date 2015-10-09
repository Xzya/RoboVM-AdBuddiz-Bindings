package ro.xzya.adbuddiz.bindings;

import org.robovm.rt.bro.ValuedEnum;

public enum AdBuddizError implements ValuedEnum {

    UNSUPPORTED_IOS_SDK(0),
    CONFIG_NOT_READY(1),
    CONFIG_EXPIRED(2),
    MISSING_PUBLISHER_KEY(3),
    INVALID_PUBLISHER_KEY(4),
    PLACEMENT_BLOCKED(5),
    PLATFORM_MISMATCH_PUBLISHER_KEY(11),
    NO_NETWORK_AVAILABLE(6),
    FORBIDDEN_RECEIVED_FROM_NETWORK(12),
    NO_MORE_AVAILABLE_CACHED_ADS(7),
    NO_MORE_AVAILABLE_ADS(8),
    SHOW_AD_CALLS_TOO_CLOSE(9),
    AD_IS_ALREADY_ON_SCREEN(10),
    UNKNOWN_EXCEPTION_RAISED(999),
    NO_ERROR(-1);

    private final long n;

    private AdBuddizError(long n) {
        this.n = n;
    }

    @Override
    public long value() {
        return n;
    }

}
