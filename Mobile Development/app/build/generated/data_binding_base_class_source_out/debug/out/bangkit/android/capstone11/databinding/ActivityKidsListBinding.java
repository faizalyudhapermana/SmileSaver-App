// Generated by view binder compiler. Do not edit!
package bangkit.android.capstone11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bangkit.android.capstone11.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityKidsListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView bottomBar;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final Button btnNewCheckup;

  @NonNull
  public final TextView checkupHistoryList;

  @NonNull
  public final RecyclerView rvHistoryList;

  @NonNull
  public final View topBar;

  private ActivityKidsListBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView bottomBar, @NonNull ImageView btnBack,
      @NonNull Button btnNewCheckup, @NonNull TextView checkupHistoryList,
      @NonNull RecyclerView rvHistoryList, @NonNull View topBar) {
    this.rootView = rootView;
    this.bottomBar = bottomBar;
    this.btnBack = btnBack;
    this.btnNewCheckup = btnNewCheckup;
    this.checkupHistoryList = checkupHistoryList;
    this.rvHistoryList = rvHistoryList;
    this.topBar = topBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityKidsListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityKidsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_kids_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityKidsListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_bar;
      BottomNavigationView bottomBar = ViewBindings.findChildViewById(rootView, id);
      if (bottomBar == null) {
        break missingId;
      }

      id = R.id.btn_back;
      ImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_new_checkup;
      Button btnNewCheckup = ViewBindings.findChildViewById(rootView, id);
      if (btnNewCheckup == null) {
        break missingId;
      }

      id = R.id.checkup_history_list;
      TextView checkupHistoryList = ViewBindings.findChildViewById(rootView, id);
      if (checkupHistoryList == null) {
        break missingId;
      }

      id = R.id.rv_history_list;
      RecyclerView rvHistoryList = ViewBindings.findChildViewById(rootView, id);
      if (rvHistoryList == null) {
        break missingId;
      }

      id = R.id.top_bar;
      View topBar = ViewBindings.findChildViewById(rootView, id);
      if (topBar == null) {
        break missingId;
      }

      return new ActivityKidsListBinding((ConstraintLayout) rootView, bottomBar, btnBack,
          btnNewCheckup, checkupHistoryList, rvHistoryList, topBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
