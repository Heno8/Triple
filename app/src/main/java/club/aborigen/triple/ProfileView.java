package club.aborigen.triple;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ProfileView extends LinearLayout {
    private final ImageView profileImage;
    private final TextView profileText;
    private final RoundView profileStatus;

    public ProfileView(Context context) {
        this(context, null, 0);
        //we implement only the last constructor, so redirecting all other constructors to the last one
    }
    public ProfileView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
        //we implement only the last constructor, so redirecting all other constructors to the last one
    }
    public ProfileView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //getting system layout inflater to create view from xml
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //passing our xml file to inflater and creating view
        View v = inflater.inflate(R.layout.view_profile, this);
        //finding subviews in our newly created view (v)
        profileImage = v.findViewById(R.id.profile_image);
        profileText = v.findViewById(R.id.profile_text);
        profileStatus = v.findViewById(R.id.profile_status);
    }

    //programmatically setting image and text fields
    public void setup(int resForImage, String txt, Boolean status) {
        profileImage.setImageResource(resForImage);
        profileText.setText(txt);
        profileStatus.setColor( status ? Color.GREEN : Color.RED);
    }
}
