// Generated by view binder compiler. Do not edit!
package com.example.toothscan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.toothscan.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWelcomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnWelcomeLogin;

  @NonNull
  public final Button btnWelcomeSignup;

  @NonNull
  public final ImageView imgWelcome;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView txtWelcomeDesc;

  @NonNull
  public final TextView txtWelcomeOr;

  @NonNull
  public final TextView txtWelcomeTit;

  private ActivityWelcomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnWelcomeLogin, @NonNull Button btnWelcomeSignup,
      @NonNull ImageView imgWelcome, @NonNull LinearLayout linearLayout,
      @NonNull TextView txtWelcomeDesc, @NonNull TextView txtWelcomeOr,
      @NonNull TextView txtWelcomeTit) {
    this.rootView = rootView;
    this.btnWelcomeLogin = btnWelcomeLogin;
    this.btnWelcomeSignup = btnWelcomeSignup;
    this.imgWelcome = imgWelcome;
    this.linearLayout = linearLayout;
    this.txtWelcomeDesc = txtWelcomeDesc;
    this.txtWelcomeOr = txtWelcomeOr;
    this.txtWelcomeTit = txtWelcomeTit;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_welcome, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWelcomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_welcome_login;
      Button btnWelcomeLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnWelcomeLogin == null) {
        break missingId;
      }

      id = R.id.btn_welcome_signup;
      Button btnWelcomeSignup = ViewBindings.findChildViewById(rootView, id);
      if (btnWelcomeSignup == null) {
        break missingId;
      }

      id = R.id.img_welcome;
      ImageView imgWelcome = ViewBindings.findChildViewById(rootView, id);
      if (imgWelcome == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.txt_welcome_desc;
      TextView txtWelcomeDesc = ViewBindings.findChildViewById(rootView, id);
      if (txtWelcomeDesc == null) {
        break missingId;
      }

      id = R.id.txt_welcome_or;
      TextView txtWelcomeOr = ViewBindings.findChildViewById(rootView, id);
      if (txtWelcomeOr == null) {
        break missingId;
      }

      id = R.id.txt_welcome_tit;
      TextView txtWelcomeTit = ViewBindings.findChildViewById(rootView, id);
      if (txtWelcomeTit == null) {
        break missingId;
      }

      return new ActivityWelcomeBinding((ConstraintLayout) rootView, btnWelcomeLogin,
          btnWelcomeSignup, imgWelcome, linearLayout, txtWelcomeDesc, txtWelcomeOr, txtWelcomeTit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}