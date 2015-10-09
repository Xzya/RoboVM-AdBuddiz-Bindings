package ro.xzya.adbuddiz.bindings;

import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSString;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class AdBuddiz extends NSObject {

    @Method(selector = "setLogLevel:")
    public static native void setLogLevel(ABLogLevel level);

    @Method(selector = "setPublisherKey:")
    public static native void setPublisherKey(NSString publisherKey);

    @Method(selector = "setTestModeActive")
    public static native void setTestModeActive();

    @Method(selector = "cacheAds")
    public static native void cacheAds();

    @Method(selector = "isReadyToShowAd")
    public static native boolean isReadyToShowAd();

    @Method(selector = "isReadyToShowAd:")
    public static native boolean isReadyToShowAd(NSString placement);

    @Method(selector = "showAd")
    public static native void showAd();

    @Method(selector = "showAd:")
    public static native void showAd(NSString placement);

    @Method(selector = "setDelegate:")
    public static native void setDelegate(AdBuddizDelegate delegate);

    @Method(selector = "nameForError:")
    public static native NSString nameForError(AdBuddizError error);

}
