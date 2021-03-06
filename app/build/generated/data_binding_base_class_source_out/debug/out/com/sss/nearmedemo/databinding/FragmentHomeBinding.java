// Generated by view binder compiler. Do not edit!
package com.sss.nearmedemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.sss.nearmedemo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final FloatingActionButton btnMapType;

  @NonNull
  public final CoordinatorLayout coordinate;

  @NonNull
  public final FloatingActionButton currentLocation;

  @NonNull
  public final TextInputEditText edtPlaceName;

  @NonNull
  public final FloatingActionButton enableTraffic;

  @NonNull
  public final ChipGroup placesGroup;

  @NonNull
  public final HorizontalScrollView placesList;

  @NonNull
  public final View view;

  private FragmentHomeBinding(@NonNull RelativeLayout rootView,
      @NonNull FloatingActionButton btnMapType, @NonNull CoordinatorLayout coordinate,
      @NonNull FloatingActionButton currentLocation, @NonNull TextInputEditText edtPlaceName,
      @NonNull FloatingActionButton enableTraffic, @NonNull ChipGroup placesGroup,
      @NonNull HorizontalScrollView placesList, @NonNull View view) {
    this.rootView = rootView;
    this.btnMapType = btnMapType;
    this.coordinate = coordinate;
    this.currentLocation = currentLocation;
    this.edtPlaceName = edtPlaceName;
    this.enableTraffic = enableTraffic;
    this.placesGroup = placesGroup;
    this.placesList = placesList;
    this.view = view;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnMapType;
      FloatingActionButton btnMapType = rootView.findViewById(id);
      if (btnMapType == null) {
        break missingId;
      }

      id = R.id.coordinate;
      CoordinatorLayout coordinate = rootView.findViewById(id);
      if (coordinate == null) {
        break missingId;
      }

      id = R.id.currentLocation;
      FloatingActionButton currentLocation = rootView.findViewById(id);
      if (currentLocation == null) {
        break missingId;
      }

      id = R.id.edtPlaceName;
      TextInputEditText edtPlaceName = rootView.findViewById(id);
      if (edtPlaceName == null) {
        break missingId;
      }

      id = R.id.enableTraffic;
      FloatingActionButton enableTraffic = rootView.findViewById(id);
      if (enableTraffic == null) {
        break missingId;
      }

      id = R.id.placesGroup;
      ChipGroup placesGroup = rootView.findViewById(id);
      if (placesGroup == null) {
        break missingId;
      }

      id = R.id.placesList;
      HorizontalScrollView placesList = rootView.findViewById(id);
      if (placesList == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      return new FragmentHomeBinding((RelativeLayout) rootView, btnMapType, coordinate,
          currentLocation, edtPlaceName, enableTraffic, placesGroup, placesList, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
