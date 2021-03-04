package com.sss.nearmedemo.Fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.sss.nearmedemo.R;

public class EmailConfirmationFragmentDirections {
  private EmailConfirmationFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionEmailConfirmationFragmentToPasswordChangeFragment() {
    return new ActionOnlyNavDirections(R.id.action_emailConfirmationFragment_to_passwordChangeFragment);
  }

  @NonNull
  public static NavDirections actionEmailConfirmationFragmentToEmailChangeFragment() {
    return new ActionOnlyNavDirections(R.id.action_emailConfirmationFragment_to_emailChangeFragment);
  }
}
