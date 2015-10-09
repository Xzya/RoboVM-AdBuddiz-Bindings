AdBuddiz Bindings for RoboVM
============================

### This also works for LibGDX

## How to use
To add the bindings in your project, you have to do the following:

1. Open robovm.xml and add the following lines:

<libs>
  <lib>z</lib>
</libs>
<frameworkPaths>
  <path>libs</path>
</frameworkPaths>
<frameworks>
  <framework>AdBuddiz</framework>
</frameworks>
<weakFrameworks>
  <framework>AdSupport</framework>
  <framework>StoreKit</framework>
</weakFrameworks>

2. Put the AdBuddiz framework into the libs folder

3. Copy the binding classes to your project

4. Add the following to didBecomeActive:

AdBuddiz.setPublisherKey(new NSString("your_publisher_key"));
AdBuddiz.cacheAds();

5. Call this when you want to show the ads:

AdBuddiz.showAd();

