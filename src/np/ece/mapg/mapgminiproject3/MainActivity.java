package np.ece.mapg.mapgminiproject3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity implements android.widget.AdapterView.OnItemClickListener {

	DrawerLayout drawerLayout;
	ListView listView;
	String[] planets;
	ActionBarDrawerToggle drawerListener;
	ImageView planetspicture;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
		planets = getResources().getStringArray(R.array.planets);
		planetspicture = (ImageView) findViewById(R.id.ivplanets);
		
		listView = (ListView) findViewById(R.id.drawerList);
		listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, planets));
		listView.setOnItemClickListener(this);
		
		
		drawerLayout.setDrawerListener(drawerListener);
		drawerListener =  new ActionBarDrawerToggle(
				this, 
				drawerLayout, 
				R.drawable.ic_drawer, 
				R.string.drawer_open, 
				R.string.drawer_close){

					@Override
					public void onDrawerClosed(View drawerView) {
						// TODO Auto-generated method stub
						super.onDrawerClosed(drawerView);
					}

					@Override
					public void onDrawerOpened(View drawerView) {
						// TODO Auto-generated method stub
						super.onDrawerOpened(drawerView);
					}

				
		};
		
		
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		
	}


	
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onPostCreate(savedInstanceState);
		drawerListener.syncState();
		
	}

	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		if(drawerLayout.isDrawerOpen(Gravity.LEFT)){
		    drawerLayout.closeDrawer(Gravity.LEFT);
		}else{
		    super.onBackPressed();
		}
		
	}



	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	
		if (drawerListener.onOptionsItemSelected(item)) {
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}



	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		getActionBar().setTitle(planets[position]);
		drawerLayout.closeDrawer(listView);
		switch(position) {
		
		case 0: {
			planetspicture.setImageResource(R.drawable.mercury);
			break;
		}
		case 1: {
			planetspicture.setImageResource(R.drawable.venus);
			break;
		}
		case 2: {
			planetspicture.setImageResource(R.drawable.earth);
			break;
		}
		case 3: {
			planetspicture.setImageResource(R.drawable.mars);
			break;
		}
		case 4: {
			planetspicture.setImageResource(R.drawable.jupiterr);
			break;
		}
		case 5: {
			planetspicture.setImageResource(R.drawable.saturn);
			break;
		}
		case 6: {
			planetspicture.setImageResource(R.drawable.uranus);
			break;
		}
		case 7: {
			planetspicture.setImageResource(R.drawable.neptune);
			break;
		}
		case 8: {
			planetspicture.setImageResource(R.drawable.pluto);
			break;
		}
		
		
	}

	
	
	
}
	}
