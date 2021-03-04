// Generated by view binder compiler. Do not edit!
package com.sss.nearmedemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.navigation.NavigationView;
import com.sss.nearmedemo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NavDrawerLayoutBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final ActivityMainBinding mainActivity;

  @NonNull
  public final DrawerLayout navDrawer;

  @NonNull
  public final NavigationView navigationView;

  private NavDrawerLayoutBinding(@NonNull DrawerLayout rootView,
      @NonNull ActivityMainBinding mainActivity, @NonNull DrawerLayout navDrawer,
      @NonNull NavigationView navigationView) {
    this.rootView = rootView;
    this.mainActivity = mainActivity;
    this.navDrawer = navDrawer;
    this.navigationView = navigationView;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NavDrawerLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavDrawerLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.nav_drawer_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavDrawerLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.main_activity;
      View mainActivity = rootView.findViewById(id);
      if (mainActivity == null) {
        break missingId;
      }
      ActivityMainBinding binding_mainActivity = ActivityMainBinding.bind(mainActivity);

      DrawerLayout navDrawer = (DrawerLayout) rootView;

      id = R.id.navigationView;
      NavigationView navigationView = rootView.findViewById(id);
      if (navigationView == null) {
        break missingId;
      }

      return new NavDrawerLayoutBinding((DrawerLayout) rootView, binding_mainActivity, navDrawer,
          navigationView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
