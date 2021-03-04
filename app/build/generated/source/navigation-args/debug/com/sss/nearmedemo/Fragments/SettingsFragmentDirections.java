package com.sss.nearmedemo.Fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.sss.nearmedemo.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SettingsFragmentDirections {
  private SettingsFragmentDirections() {
  }

  @NonNull
  public static ActionBtnSettingToEmailConfirmationFragment actionBtnSettingToEmailConfirmationFragment(
      ) {
    return new ActionBtnSettingToEmailConfirmationFragment();
  }

  public static class ActionBtnSettingToEmailConfirmationFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionBtnSettingToEmailConfirmationFragment() {
    }

    @NonNull
    public ActionBtnSettingToEmailConfirmationFragment setIsPassword(boolean isPassword) {
      this.arguments.put("isPassword", isPassword);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("isPassword")) {
        boolean isPassword = (boolean) arguments.get("isPassword");
        __result.putBoolean("isPassword", isPassword);
      } else {
        __result.putBoolean("isPassword", false);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_btnSetting_to_emailConfirmationFragment;
    }

    @SuppressWarnings("unchecked")
    public boolean getIsPassword() {
      return (boolean) arguments.get("isPassword");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionBtnSettingToEmailConfirmationFragment that = (ActionBtnSettingToEmailConfirmationFragment) object;
      if (arguments.containsKey("isPassword") != that.arguments.containsKey("isPassword")) {
        return false;
      }
      if (getIsPassword() != that.getIsPassword()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getIsPassword() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionBtnSettingToEmailConfirmationFragment(actionId=" + getActionId() + "){"
          + "isPassword=" + getIsPassword()
          + "}";
    }
  }
}
