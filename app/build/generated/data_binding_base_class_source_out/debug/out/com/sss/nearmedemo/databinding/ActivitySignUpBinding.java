// Generated by view binder compiler. Do not edit!
package com.sss.nearmedemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.sss.nearmedemo.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final MaterialButton btnSignUp;

  @NonNull
  public final EditText edtEmail;

  @NonNull
  public final EditText edtPassword;

  @NonNull
  public final EditText edtUsername;

  @NonNull
  public final CircleImageView imgPick;

  @NonNull
  public final TextView txtLogin;

  private ActivitySignUpBinding(@NonNull RelativeLayout rootView, @NonNull ImageView btnBack,
      @NonNull MaterialButton btnSignUp, @NonNull EditText edtEmail, @NonNull EditText edtPassword,
      @NonNull EditText edtUsername, @NonNull CircleImageView imgPick, @NonNull TextView txtLogin) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnSignUp = btnSignUp;
    this.edtEmail = edtEmail;
    this.edtPassword = edtPassword;
    this.edtUsername = edtUsername;
    this.imgPick = imgPick;
    this.txtLogin = txtLogin;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      ImageView btnBack = rootView.findViewById(id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnSignUp;
      MaterialButton btnSignUp = rootView.findViewById(id);
      if (btnSignUp == null) {
        break missingId;
      }

      id = R.id.edtEmail;
      EditText edtEmail = rootView.findViewById(id);
      if (edtEmail == null) {
        break missingId;
      }

      id = R.id.edtPassword;
      EditText edtPassword = rootView.findViewById(id);
      if (edtPassword == null) {
        break missingId;
      }

      id = R.id.edtUsername;
      EditText edtUsername = rootView.findViewById(id);
      if (edtUsername == null) {
        break missingId;
      }

      id = R.id.imgPick;
      CircleImageView imgPick = rootView.findViewById(id);
      if (imgPick == null) {
        break missingId;
      }

      id = R.id.txtLogin;
      TextView txtLogin = rootView.findViewById(id);
      if (txtLogin == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((RelativeLayout) rootView, btnBack, btnSignUp, edtEmail,
          edtPassword, edtUsername, imgPick, txtLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
