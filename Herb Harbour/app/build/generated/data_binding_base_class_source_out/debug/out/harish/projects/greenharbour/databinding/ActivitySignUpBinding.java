// Generated by view binder compiler. Do not edit!
package harish.projects.greenharbour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import harish.projects.greenharbour.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button regBtn;

  @NonNull
  public final TextInputLayout regEmail;

  @NonNull
  public final Button regLoginBtn;

  @NonNull
  public final TextInputLayout regName;

  @NonNull
  public final TextInputLayout regPassword;

  @NonNull
  public final TextInputLayout regPhoneNo;

  @NonNull
  public final TextInputLayout regUsername;

  @NonNull
  public final TextView sloganName;

  private ActivitySignUpBinding(@NonNull LinearLayout rootView, @NonNull Button regBtn,
      @NonNull TextInputLayout regEmail, @NonNull Button regLoginBtn,
      @NonNull TextInputLayout regName, @NonNull TextInputLayout regPassword,
      @NonNull TextInputLayout regPhoneNo, @NonNull TextInputLayout regUsername,
      @NonNull TextView sloganName) {
    this.rootView = rootView;
    this.regBtn = regBtn;
    this.regEmail = regEmail;
    this.regLoginBtn = regLoginBtn;
    this.regName = regName;
    this.regPassword = regPassword;
    this.regPhoneNo = regPhoneNo;
    this.regUsername = regUsername;
    this.sloganName = sloganName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.reg_btn;
      Button regBtn = ViewBindings.findChildViewById(rootView, id);
      if (regBtn == null) {
        break missingId;
      }

      id = R.id.reg_email;
      TextInputLayout regEmail = ViewBindings.findChildViewById(rootView, id);
      if (regEmail == null) {
        break missingId;
      }

      id = R.id.reg_login_btn;
      Button regLoginBtn = ViewBindings.findChildViewById(rootView, id);
      if (regLoginBtn == null) {
        break missingId;
      }

      id = R.id.reg_name;
      TextInputLayout regName = ViewBindings.findChildViewById(rootView, id);
      if (regName == null) {
        break missingId;
      }

      id = R.id.reg_password;
      TextInputLayout regPassword = ViewBindings.findChildViewById(rootView, id);
      if (regPassword == null) {
        break missingId;
      }

      id = R.id.reg_phoneNo;
      TextInputLayout regPhoneNo = ViewBindings.findChildViewById(rootView, id);
      if (regPhoneNo == null) {
        break missingId;
      }

      id = R.id.reg_username;
      TextInputLayout regUsername = ViewBindings.findChildViewById(rootView, id);
      if (regUsername == null) {
        break missingId;
      }

      id = R.id.slogan_name;
      TextView sloganName = ViewBindings.findChildViewById(rootView, id);
      if (sloganName == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((LinearLayout) rootView, regBtn, regEmail, regLoginBtn,
          regName, regPassword, regPhoneNo, regUsername, sloganName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
