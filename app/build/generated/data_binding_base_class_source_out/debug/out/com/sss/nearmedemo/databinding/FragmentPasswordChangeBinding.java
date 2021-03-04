// Generated by view binder compiler. Do not edit!
package com.sss.nearmedemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.sss.nearmedemo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPasswordChangeBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final LinearLayout background;

  @NonNull
  public final MaterialButton btnUpdatePassword;

  @NonNull
  public final TextInputEditText edtUPassword;

  private FragmentPasswordChangeBinding(@NonNull CoordinatorLayout rootView,
      @NonNull LinearLayout background, @NonNull MaterialButton btnUpdatePassword,
      @NonNull TextInputEditText edtUPassword) {
    this.rootView = rootView;
    this.background = background;
    this.btnUpdatePassword = btnUpdatePassword;
    this.edtUPassword = edtUPassword;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPasswordChangeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPasswordChangeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_password_change, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPasswordChangeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.background;
      LinearLayout background = rootView.findViewById(id);
      if (background == null) {
        break missingId;
      }

      id = R.id.btnUpdatePassword;
      MaterialButton btnUpdatePassword = rootView.findViewById(id);
      if (btnUpdatePassword == null) {
        break missingId;
      }

      id = R.id.edtUPassword;
      TextInputEditText edtUPassword = rootView.findViewById(id);
      if (edtUPassword == null) {
        break missingId;
      }

      return new FragmentPasswordChangeBinding((CoordinatorLayout) rootView, background,
          btnUpdatePassword, edtUPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}