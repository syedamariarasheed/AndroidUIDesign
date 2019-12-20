package com.example.user.designing;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  ImageView ab;

    Toolbar toolbar;
    ActionMode actionMode;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomnavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navlistener);

           toolbar=(Toolbar)findViewById(R.id.toolbar);
           setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Home Page");
//        toolbar.setSubtitle("Welcome user");
        toolbar.setNavigationIcon(R.drawable.ic_menu_black_24dp);
        toolbar.setNavigationContentDescription("Navigation ");

        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Delete",Toast.LENGTH_LONG).show();
            }
        });

    }
  private BottomNavigationView.OnNavigationItemSelectedListener navlistener=new BottomNavigationView.OnNavigationItemSelectedListener() {
      @Override
      public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
          Fragment selected=null;
          switch (menuItem.getItemId()){
              case R.id.nav_home:
                  selected =new BlankFragment();
                  break;
              case R.id.nav_Email:
                  selected =new BlankFragment3();
                  break;
//              case R.id.nav_Phone:
//                  selected =new BlankFragment5();
                 // break;
              case R.id.nav_Setting:
                  selected =new BlankFragment2();
                  break;
              case R.id.nav_Message:
                  selected =new BlankFragment4();
                  break;

          }
      getSupportFragmentManager().beginTransaction().replace(R.id.fragment,selected).commit();
          return true;
      }

  };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

        int id=item.getItemId();
        switch (id){
            case R.id.nav_Phone:
                actionMode=MainActivity.this.startSupportActionMode(new ActionBarCallback());
                //Toast.makeText(MainActivity.this,"Delete",Toast.LENGTH_LONG).show();
            break;
            case R.id.action_camera:
                Toast.makeText(MainActivity.this,"Camera",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_refresh:
                Toast.makeText(MainActivity.this,"Refresh",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_setting:
                Toast.makeText(MainActivity.this,"Setting",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_clear:
                Toast.makeText(MainActivity.this,"Clear",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    class ActionBarCallback implements ActionMode.Callback{

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
           actionMode.getMenuInflater().inflate(R.menu.contextual,menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle("Make a call");
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            int id=menuItem.getItemId();
            switch (id){
                case R.id.item1:
                   startActivity(new Intent(MainActivity.this,Main2Activity.class));
                    break;
            }
            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {

        }
    }
}
