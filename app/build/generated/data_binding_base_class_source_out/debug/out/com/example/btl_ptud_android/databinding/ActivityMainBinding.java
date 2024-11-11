// Generated by view binder compiler. Do not edit!
package com.example.btl_ptud_android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.btl_ptud_android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btnAddQuiz;

  @NonNull
  public final ImageView btnHome;

  @NonNull
  public final ImageView btnLibrary;

  @NonNull
  public final ImageView btnSearch;

  @NonNull
  public final ImageView btnUser;

  @NonNull
  public final EditText edtSearchQuiz;

  @NonNull
  public final LinearLayout main;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull ImageView btnAddQuiz,
      @NonNull ImageView btnHome, @NonNull ImageView btnLibrary, @NonNull ImageView btnSearch,
      @NonNull ImageView btnUser, @NonNull EditText edtSearchQuiz, @NonNull LinearLayout main) {
    this.rootView = rootView;
    this.btnAddQuiz = btnAddQuiz;
    this.btnHome = btnHome;
    this.btnLibrary = btnLibrary;
    this.btnSearch = btnSearch;
    this.btnUser = btnUser;
    this.edtSearchQuiz = edtSearchQuiz;
    this.main = main;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
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

      id = R.id.btn_search;
      ImageView btnSearch = ViewBindings.findChildViewById(rootView, id);
      if (btnSearch == null) {
        break missingId;
      }

      id = R.id.btnUser;
      ImageView btnUser = ViewBindings.findChildViewById(rootView, id);
      if (btnUser == null) {
        break missingId;
      }

      id = R.id.edt_searchQuiz;
      EditText edtSearchQuiz = ViewBindings.findChildViewById(rootView, id);
      if (edtSearchQuiz == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      return new ActivityMainBinding((LinearLayout) rootView, btnAddQuiz, btnHome, btnLibrary,
          btnSearch, btnUser, edtSearchQuiz, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}