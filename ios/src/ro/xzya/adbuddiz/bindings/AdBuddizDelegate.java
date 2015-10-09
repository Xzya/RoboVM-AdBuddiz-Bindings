package ro.xzya.adbuddiz.bindings;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;

public class AdBuddizDelegate extends NSObject {

    @Method(selector = "didCacheAd")
    public native void didCacheAd();

    @Method(selector = "didShowAd")
    public native void didShowAd();

    @Method(selector = "didFailToShowAd:")
    public native void didFailToShowAd(AdBuddizError error);

    @Method(selector = "didClick")
    public native void didClick();

    @Method(selector = "didHideAd")
    public native void didHideAd();

}
