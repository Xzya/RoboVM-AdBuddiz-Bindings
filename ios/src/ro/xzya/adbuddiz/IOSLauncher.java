package ro.xzya.adbuddiz;

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.foundation.NSString;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIApplicationDelegateAdapter;
import org.robovm.apple.uikit.UIButton;
import org.robovm.apple.uikit.UIControl;
import org.robovm.apple.uikit.UIControlState;
import org.robovm.apple.uikit.UIEvent;
import org.robovm.apple.uikit.UIScreen;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.apple.uikit.UIWindow;

import ro.xzya.adbuddiz.bindings.AdBuddiz;

public class IOSLauncher extends UIApplicationDelegateAdapter {

    private UIViewController viewController;
    private UIWindow window;

    @Override
    public void didFinishLaunching(UIApplication application) {
        viewController = new UIViewController();

        window = new UIWindow(UIScreen.getMainScreen().getBounds());
        window.setRootViewController(viewController);
        window.makeKeyAndVisible();

        CGRect screen = UIScreen.getMainScreen().getBounds();
        UIButton button = new UIButton(new CGRect(screen.getWidth() / 2f - 50, screen.getHeight() / 2f - 25, 100, 50));
        button.setTitle("Show ads", UIControlState.Normal);
        button.addOnTouchUpInsideListener(new UIControl.OnTouchUpInsideListener() {
            @Override
            public void onTouchUpInside(UIControl control, UIEvent event) {

                // show the ads
                AdBuddiz.showAd();

            }
        });

        viewController.getView().addSubview(button);
    }

    @Override
    public void didBecomeActive(UIApplication application) {
        super.didBecomeActive(application);

        // set up the publisher key and cache the ads
        AdBuddiz.setPublisherKey(new NSString("TEST_PUBLISHER_KEY"));
        AdBuddiz.cacheAds();
    }

    public static void main(String[] argv) {
        try (NSAutoreleasePool pool = new NSAutoreleasePool()) {
            UIApplication.main(argv, null, IOSLauncher.class);
        }
    }

}