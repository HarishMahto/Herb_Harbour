// Generated by view binder compiler. Do not edit!
package harish.projects.greenharbour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import harish.projects.greenharbour.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityScannerBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final TextView classified;

  @NonNull
  public final TextView confidence;

  @NonNull
  public final TextView confidencesText;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView result;

  private ActivityScannerBinding(@NonNull RelativeLayout rootView, @NonNull Button button,
      @NonNull TextView classified, @NonNull TextView confidence, @NonNull TextView confidencesText,
      @NonNull ImageView imageView, @NonNull TextView result) {
    this.rootView = rootView;
    this.button = button;
    this.classified = classified;
    this.confidence = confidence;
    this.confidencesText = confidencesText;
    this.imageView = imageView;
    this.result = result;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_scanner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScannerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.classified;
      TextView classified = ViewBindings.findChildViewById(rootView, id);
      if (classified == null) {
        break missingId;
      }

      id = R.id.confidence;
      TextView confidence = ViewBindings.findChildViewById(rootView, id);
      if (confidence == null) {
        break missingId;
      }

      id = R.id.confidencesText;
      TextView confidencesText = ViewBindings.findChildViewById(rootView, id);
      if (confidencesText == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.result;
      TextView result = ViewBindings.findChildViewById(rootView, id);
      if (result == null) {
        break missingId;
      }

      return new ActivityScannerBinding((RelativeLayout) rootView, button, classified, confidence,
          confidencesText, imageView, result);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
