// Generated by view binder compiler. Do not edit!
package harish.projects.greenharbour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import harish.projects.greenharbour.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPlantDescriptionBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialCardView cardView1;

  @NonNull
  public final ConstraintLayout frameLayout2;

  @NonNull
  public final TextView plantDesc;

  @NonNull
  public final TextView plantDesc2;

  @NonNull
  public final TextView plantFamilyView;

  @NonNull
  public final TextView plantFamilyViewValue;

  @NonNull
  public final ImageView plantImageView;

  @NonNull
  public final TextView plantNameView;

  @NonNull
  public final TextView plantSize;

  @NonNull
  public final TextView plantSizeView;

  @NonNull
  public final TextView plantType;

  private ActivityPlantDescriptionBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialCardView cardView1, @NonNull ConstraintLayout frameLayout2,
      @NonNull TextView plantDesc, @NonNull TextView plantDesc2, @NonNull TextView plantFamilyView,
      @NonNull TextView plantFamilyViewValue, @NonNull ImageView plantImageView,
      @NonNull TextView plantNameView, @NonNull TextView plantSize, @NonNull TextView plantSizeView,
      @NonNull TextView plantType) {
    this.rootView = rootView;
    this.cardView1 = cardView1;
    this.frameLayout2 = frameLayout2;
    this.plantDesc = plantDesc;
    this.plantDesc2 = plantDesc2;
    this.plantFamilyView = plantFamilyView;
    this.plantFamilyViewValue = plantFamilyViewValue;
    this.plantImageView = plantImageView;
    this.plantNameView = plantNameView;
    this.plantSize = plantSize;
    this.plantSizeView = plantSizeView;
    this.plantType = plantType;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPlantDescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPlantDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_plant_description, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPlantDescriptionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView1;
      MaterialCardView cardView1 = ViewBindings.findChildViewById(rootView, id);
      if (cardView1 == null) {
        break missingId;
      }

      ConstraintLayout frameLayout2 = (ConstraintLayout) rootView;

      id = R.id.plant_desc;
      TextView plantDesc = ViewBindings.findChildViewById(rootView, id);
      if (plantDesc == null) {
        break missingId;
      }

      id = R.id.plant_desc2;
      TextView plantDesc2 = ViewBindings.findChildViewById(rootView, id);
      if (plantDesc2 == null) {
        break missingId;
      }

      id = R.id.plant_family_view;
      TextView plantFamilyView = ViewBindings.findChildViewById(rootView, id);
      if (plantFamilyView == null) {
        break missingId;
      }

      id = R.id.plant_family_view_value;
      TextView plantFamilyViewValue = ViewBindings.findChildViewById(rootView, id);
      if (plantFamilyViewValue == null) {
        break missingId;
      }

      id = R.id.plant_image_view;
      ImageView plantImageView = ViewBindings.findChildViewById(rootView, id);
      if (plantImageView == null) {
        break missingId;
      }

      id = R.id.plant_name_view;
      TextView plantNameView = ViewBindings.findChildViewById(rootView, id);
      if (plantNameView == null) {
        break missingId;
      }

      id = R.id.plant_size;
      TextView plantSize = ViewBindings.findChildViewById(rootView, id);
      if (plantSize == null) {
        break missingId;
      }

      id = R.id.plant_size_view;
      TextView plantSizeView = ViewBindings.findChildViewById(rootView, id);
      if (plantSizeView == null) {
        break missingId;
      }

      id = R.id.plant_type;
      TextView plantType = ViewBindings.findChildViewById(rootView, id);
      if (plantType == null) {
        break missingId;
      }

      return new ActivityPlantDescriptionBinding((ConstraintLayout) rootView, cardView1,
          frameLayout2, plantDesc, plantDesc2, plantFamilyView, plantFamilyViewValue,
          plantImageView, plantNameView, plantSize, plantSizeView, plantType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
