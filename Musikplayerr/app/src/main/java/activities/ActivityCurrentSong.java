package activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.sunny.musikplayerr.R;
public class ActivityCurrentSong extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemClickListener{
private Button button1;
    private ListView listsongs;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_current_song);
        init();
    }
    private void init()
    {
        getActionBar();

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
