// Generated by view binder compiler. Do not edit!
package com.example.vigybag.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.vigybag.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton button3;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final LinearLayout linearLayout4;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final LinearLayout linearLayout6;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final View view3;

  private ActivityCartBinding(@NonNull ConstraintLayout rootView, @NonNull MaterialButton button3,
      @NonNull CardView cardView2, @NonNull ImageView imageView4,
      @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5,
      @NonNull LinearLayout linearLayout6, @NonNull ConstraintLayout main,
      @NonNull RecyclerView recyclerView, @NonNull TextView textView14,
      @NonNull TextView textView15, @NonNull View view3) {
    this.rootView = rootView;
    this.button3 = button3;
    this.cardView2 = cardView2;
    this.imageView4 = imageView4;
    this.linearLayout4 = linearLayout4;
    this.linearLayout5 = linearLayout5;
    this.linearLayout6 = linearLayout6;
    this.main = main;
    this.recyclerView = recyclerView;
    this.textView14 = textView14;
    this.textView15 = textView15;
    this.view3 = view3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button3;
      MaterialButton button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.linearLayout4;
      LinearLayout linearLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout4 == null) {
        break missingId;
      }

      id = R.id.linearLayout5;
      LinearLayout linearLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout5 == null) {
        break missingId;
      }

      id = R.id.linearLayout6;
      LinearLayout linearLayout6 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout6 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.view3;
      View view3 = ViewBindings.findChildViewById(rootView, id);
      if (view3 == null) {
        break missingId;
      }

      return new ActivityCartBinding((ConstraintLayout) rootView, button3, cardView2, imageView4,
          linearLayout4, linearLayout5, linearLayout6, main, recyclerView, textView14, textView15,
          view3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
