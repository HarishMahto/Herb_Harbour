// Generated by view binder compiler. Do not edit!
package harish.projects.greenharbour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
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

public final class ActivityUploadPlantBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button buttonChooseImage;

  @NonNull
  public final Button buttonUpload;

  @NonNull
  public final EditText editTextFileName;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textViewShowUploads;

  private ActivityUploadPlantBinding(@NonNull RelativeLayout rootView,
      @NonNull Button buttonChooseImage, @NonNull Button buttonUpload,
      @NonNull EditText editTextFileName, @NonNull ImageView imageView,
      @NonNull ProgressBar progressBar, @NonNull TextView textViewShowUploads) {
    this.rootView = rootView;
    this.buttonChooseImage = buttonChooseImage;
    this.buttonUpload = buttonUpload;
    this.editTextFileName = editTextFileName;
    this.imageView = imageView;
    this.progressBar = progressBar;
    this.textViewShowUploads = textViewShowUploads;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUploadPlantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUploadPlantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_upload_plant, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUploadPlantBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_choose_image;
      Button buttonChooseImage = ViewBindings.findChildViewById(rootView, id);
      if (buttonChooseImage == null) {
        break missingId;
      }

      id = R.id.button_upload;
      Button buttonUpload = ViewBindings.findChildViewById(rootView, id);
      if (buttonUpload == null) {
        break missingId;
      }

      id = R.id.edit_text_file_name;
      EditText editTextFileName = ViewBindings.findChildViewById(rootView, id);
      if (editTextFileName == null) {
        break missingId;
      }

      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.text_view_show_uploads;
      TextView textViewShowUploads = ViewBindings.findChildViewById(rootView, id);
      if (textViewShowUploads == null) {
        break missingId;
      }

      return new ActivityUploadPlantBinding((RelativeLayout) rootView, buttonChooseImage,
          buttonUpload, editTextFileName, imageView, progressBar, textViewShowUploads);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
