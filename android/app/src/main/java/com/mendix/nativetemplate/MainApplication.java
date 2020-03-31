package com.mendix.nativetemplate;

import com.airbnb.android.react.maps.MapsPackage;
import com.brentvatne.react.ReactVideoPackage;
import com.calendarevents.CalendarEventsPackage;
import com.codemotionapps.reactnativedarkmode.DarkModePackage;
import com.devfd.RNGeocoder.RNGeocoderPackage;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.horcrux.svg.SvgPackage;
import com.imagepicker.ImagePickerPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.mendix.mendixnative.MendixReactApplication;
import com.microsoft.codepush.react.CodePush;
import com.oblador.vectoricons.VectorIconsPackage;
import com.polidea.reactnativeble.BlePackage;
import com.proyecto26.inappbrowser.RNInAppBrowserPackage;
import com.reactcommunity.rndatetimepicker.RNDateTimePickerPackage;
import com.reactcommunity.rnlocalize.RNLocalizePackage;
import com.reactnativecommunity.art.ARTPackage;
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
import com.reactnativecommunity.cameraroll.CameraRollPackage;
import com.reactnativecommunity.geolocation.GeolocationPackage;
import com.reactnativecommunity.netinfo.NetInfoPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.rnfingerprint.FingerprintAuthPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.th3rdwave.safeareacontext.SafeAreaContextPackage;
import com.zmxv.RNSound.RNSoundPackage;
import com.dylanvann.fastimage.FastImageViewPackage;

import org.pgsqlite.SQLitePluginPackage;
import org.reactnative.camera.RNCameraPackage;
import org.reactnative.maskedview.RNCMaskedViewPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.greweb.reactnativeviewshot.RNViewShotPackage;
import io.invertase.firebase.RNFirebasePackage;
import io.invertase.firebase.messaging.RNFirebaseMessagingPackage;
import io.invertase.firebase.notifications.RNFirebaseNotificationsPackage;

public class MainApplication extends MendixReactApplication {
  @Override
  public boolean getUseDeveloperSupport() {
    return false;
  }

  @Override
  public List<ReactPackage> getPackages() {
    List<ReactPackage> packages = new ArrayList<>();
    packages.addAll(Arrays.asList(
            new MainReactPackage(),
            new AsyncStoragePackage(),
            new BlePackage(),
            new CalendarEventsPackage(),
            new CodePush(getCodePushKey(), getApplicationContext(), BuildConfig.DEBUG),
            new FingerprintAuthPackage(),
            new ImagePickerPackage(),
            new NetInfoPackage(),
            new MapsPackage(),
            new ReactVideoPackage(),
            new RNCameraPackage(),
            new RNCWebViewPackage(),
            new RNDeviceInfo(),
            new RNGeocoderPackage(),
            new RNGestureHandlerPackage(),
            new ReanimatedPackage(),
            new RNInAppBrowserPackage(),
            new RNSoundPackage(),
            new RNViewShotPackage(),
            new SQLitePluginPackage(),
            new SvgPackage(),
            new VectorIconsPackage(),
            new DarkModePackage(),
            new FastImageViewPackage(),
            new RNLocalizePackage(),
            new GeolocationPackage(),
            new CameraRollPackage(),
            new RNCMaskedViewPackage(),
            new SafeAreaContextPackage(),
            new ARTPackage(),
            new RNDateTimePickerPackage()
    ));

    if (BuildConfig.USE_FIREBASE) {
      packages.addAll(Arrays.asList(
        new RNFirebaseMessagingPackage(),
        new RNFirebaseNotificationsPackage(),
        new RNFirebasePackage()
      ));
    }

    return packages;
  }
}
