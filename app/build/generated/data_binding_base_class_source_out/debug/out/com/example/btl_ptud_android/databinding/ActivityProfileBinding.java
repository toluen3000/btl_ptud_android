// Generated by view binder compiler. Do not edit!
package com.example.btl_ptud_android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.btl_ptud_android.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btnAddQuiz;

  @NonNull
  public final ImageView btnHome;

  @NonNull
  public final ImageView btnLibrary;

  @NonNull
  public final Button btnLogOut;

  @NonNull
  public final Button btnMode;

  @NonNull
  public final ImageView btnMode1;

  @NonNull
  public final Button btnProfileSetting;

  @NonNull
  public final ImageView btnProfileSetting1;

  @NonNull
  public final ImageView btnUser;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final CircleImageView profileImage;

  private ActivityProfileBinding(@NonNull LinearLayout rootView, @NonNull ImageView btnAddQuiz,
      @NonNull ImageView btnHome, @NonNull ImageView btnLibrary, @NonNull Button btnLogOut,
      @NonNull Button btnMode, @NonNull ImageView btnMode1, @NonNull Button btnProfileSetting,
      @NonNull ImageView btnProfileSetting1, @NonNull ImageView btnUser, @NonNull LinearLayout main,
      @NonNull CircleImageView profileImage) {
    this.rootView = rootView;
    this.btnAddQuiz = btnAddQuiz;
    this.btnHome = btnHome;
    this.btnLibrary = btnLibrary;
    this.btnLogOut = btnLogOut;
    this.btnMode = btnMode;
    this.btnMode1 = btnMode1;
    this.btnProfileSetting = btnProfileSetting;
    this.btnProfileSetting1 = btnProfileSetting1;
    this.btnUser = btnUser;
    this.main = main;
    this.profileImage = profileImage;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_addQuiz;
      ImageView btnAddQuiz = ViewBindings.findChildViewById(rootView, id);
      if (btnAddQuiz == null) {
        break missingId;
      }

      id = R.id.btn_Home;
      ImageView btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.btnLibrary;
      ImageView btnLibrary = ViewBindings.findChildViewById(rootView, id);
      if (btnLibrary == null) {
        break missingId;
      }

      id = R.id.btn_log_out;
      Button btnLogOut = ViewBindings.findChildViewById(rootView, id);
      if (btnLogOut == null) {
        break missingId;
      }

      id = R.id.btn_mode;
      Button btnMode = ViewBindings.findChildViewById(rootView, id);
      if (btnMode == null) {
        break missingId;
      }

      id = R.id.btn_mode1;
      ImageView btnMode1 = ViewBindings.findChildViewById(rootView, id);
      if (btnMode1 == null) {
        break missingId;
      }

      id = R.id.btn_profile_setting;
      Button btnProfileSetting = ViewBindings.findChildViewById(rootView, id);
      if (btnProfileSetting == null) {
        break missingId;
      }

      id = R.id.btn_profile_setting1;
      ImageView btnProfileSetting1 = ViewBindings.findChildViewById(rootView, id);
      if (btnProfileSetting1 == null) {
        break missingId;
      }

      id = R.id.btnUser;
      ImageView btnUser = ViewBindings.findChildViewById(rootView, id);
      if (btnUser == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.profile_image;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      return new ActivityProfileBinding((LinearLayout) rootView, btnAddQuiz, btnHome, btnLibrary,
          btnLogOut, btnMode, btnMode1, btnProfileSetting, btnProfileSetting1, btnUser, main,
          profileImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
