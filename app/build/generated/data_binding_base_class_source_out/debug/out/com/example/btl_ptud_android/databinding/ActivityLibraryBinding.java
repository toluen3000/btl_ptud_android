// Generated by view binder compiler. Do not edit!
package com.example.btl_ptud_android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.btl_ptud_android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLibraryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btnAdd;

  @NonNull
  public final ImageView btnAddQuiz;

  @NonNull
  public final ImageView btnHome;

  @NonNull
  public final ImageView btnLibrary;

  @NonNull
  public final ImageView btnUser;

  @NonNull
  public final ListView listLib;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView txtNoData;

  private ActivityLibraryBinding(@NonNull LinearLayout rootView, @NonNull ImageView btnAdd,
      @NonNull ImageView btnAddQuiz, @NonNull ImageView btnHome, @NonNull ImageView btnLibrary,
      @NonNull ImageView btnUser, @NonNull ListView listLib, @NonNull LinearLayout main,
      @NonNull TextView textView3, @NonNull TextView txtNoData) {
    this.rootView = rootView;
    this.btnAdd = btnAdd;
    this.btnAddQuiz = btnAddQuiz;
    this.btnHome = btnHome;
    this.btnLibrary = btnLibrary;
    this.btnUser = btnUser;
    this.listLib = listLib;
    this.main = main;
    this.textView3 = textView3;
    this.txtNoData = txtNoData;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLibraryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLibraryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_library, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLibraryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add;
      ImageView btnAdd = ViewBindings.findChildViewById(rootView, id);
      if (btnAdd == null) {
        break missingId;
      }

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

      id = R.id.btnUser;
      ImageView btnUser = ViewBindings.findChildViewById(rootView, id);
      if (btnUser == null) {
        break missingId;
      }

      id = R.id.list_lib;
      ListView listLib = ViewBindings.findChildViewById(rootView, id);
      if (listLib == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.txtNoData;
      TextView txtNoData = ViewBindings.findChildViewById(rootView, id);
      if (txtNoData == null) {
        break missingId;
      }

      return new ActivityLibraryBinding((LinearLayout) rootView, btnAdd, btnAddQuiz, btnHome,
          btnLibrary, btnUser, listLib, main, textView3, txtNoData);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}