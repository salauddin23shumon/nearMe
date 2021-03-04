package com.sss.nearmedemo.Fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class EmailConfirmationFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private EmailConfirmationFragmentArgs() {
  }

  private EmailConfirmationFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static EmailConfirmationFragmentArgs fromBundle(@NonNull Bundle bundle) {
    EmailConfirmationFragmentArgs __result = new EmailConfirmationFragmentArgs();
    bundle.setClassLoader(EmailConfirmationFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("isPassword")) {
      boolean isPassword;
      isPassword = bundle.getBoolean("isPassword");
      __result.arguments.put("isPassword", isPassword);
    } else {
      __result.arguments.put("isPassword", false);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getIsPassword() {
    return (boolean) arguments.get("isPassword");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    EmailConfirmationFragmentArgs that = (EmailConfirmationFragmentArgs) object;
    if (arguments.containsKey("isPassword") != that.arguments.containsKey("isPassword")) {
      return false;
    }
    if (getIsPassword() != that.getIsPassword()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getIsPassword() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "EmailConfirmationFragmentArgs{"
        + "isPassword=" + getIsPassword()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(EmailConfirmationFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public EmailConfirmationFragmentArgs build() {
      EmailConfirmationFragmentArgs result = new EmailConfirmationFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setIsPassword(boolean isPassword) {
      this.arguments.put("isPassword", isPassword);
      return this;
    }

    @SuppressWarnings("unchecked")
    public boolean getIsPassword() {
      return (boolean) arguments.get("isPassword");
    }
  }
}
