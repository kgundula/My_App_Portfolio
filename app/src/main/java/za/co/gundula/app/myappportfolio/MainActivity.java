package za.co.gundula.app.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void projectButtonClick(View v) {

        int id = v.getId();
        String app_selected = "This button will launch my ";
        switch (id) {
            case R.id.popular_movies:
                showToastMessage(app_selected+ getResources().getString(R.string.popular_movies) + " app!");
                break;
            case R.id.stock_hawk:
                showToastMessage(app_selected+ getResources().getString(R.string.stock_hawks) + " app!");
                break;
            case R.id.build_it_bigger:
                showToastMessage(app_selected+ getResources().getString(R.string.build_it_bigger) + " app!");
                break;
            case R.id.make_your_app:
                showToastMessage(app_selected+ getResources().getString(R.string.make_your_app_material) + " app!");
                break;
            case R.id.go_ubiquitous:
                showToastMessage(app_selected+ getResources().getString(R.string.go_ubiquitous) + " app!");
                break;
            case R.id.capstone:
                showToastMessage(app_selected+ getResources().getString(R.string.capstone) + " app!");
                break;
            default:

                break;
        }
    }

    public void showToastMessage(String message) {
        Toast.makeText(this, message,Toast.LENGTH_LONG).show();
    }
}
