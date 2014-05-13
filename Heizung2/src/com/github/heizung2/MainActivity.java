package com.github.heizung2;

import java.io.InputStream;
import java.net.URL;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;


import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;


 
public class MainActivity extends Activity  implements OnClickListener {
	protected Button Button1;
	protected Button Button2;
	protected Button Button3;
	protected Button Button4;
	protected Button Button5;
	protected Button Button6;
	protected Button Button7;

	protected TextView SelectedLabel;


	protected int[] nrofpng;
	protected int sel1;
	protected int sel2;
	protected String grafurl;
	protected ImageView imgView;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        
        Button1 = (Button) findViewById(R.id.Button1);
        Button2 = (Button) findViewById(R.id.Button2);
        Button3 = (Button) findViewById(R.id.Button3);
        Button4 = (Button) findViewById(R.id.Button4);
        Button5 = (Button) findViewById(R.id.Button5);
        Button6 = (Button) findViewById(R.id.Button6);
        Button7 = (Button) findViewById(R.id.Button7);
        
        imgView =(ImageView)findViewById(R.id.ImageView1);
        
        SelectedLabel = (TextView) findViewById(R.id.TextView1);        
        
        Button1.setOnClickListener( this);
        Button2.setOnClickListener( this);
        Button3.setOnClickListener( this);
        Button4.setOnClickListener( this);
        Button5.setOnClickListener( this);
        Button6.setOnClickListener( this);
        Button7.setOnClickListener( this);
        
        sel1 = 1;
        sel2 = 1;
        
        
        grafurl="http://keyrate2.dyndns.org:8181/rrd/png"+sel1+sel2+".png";
                
        UrlImageViewHelper.setUrlDrawable(imgView, grafurl, R.drawable.loading ,60000);
       
      /*  Bitmap bmap = BitmapFactory.decodeResource(imgView.getResources(), R.drawable.test);
        Bitmap bMapScaled = Bitmap.createScaledBitmap(bmap, 150, 100, true);
        imgView.setImageBitmap(bMapScaled);
        */
        
    }
 
    public void onClick(View v) {
    	if(v == Button1) {
    		sel1=1;
    	} 
    	else if(v == Button2) {
    		sel1=2;
    	}
    	else if(v == Button3) {
    		sel1=3;
    	}
    	else if(v == Button4) {
    		sel1=4;
    	}
    	else if(v == Button5) {
    		sel2=1;
    	}
    	else if(v == Button6) {
    		sel2=2;
    	}
    	else if(v == Button7) {
    		sel2=3;
    	}

    	grafurl="http://keyrate2.duckdns.org:8181/rrd/png"+sel1+sel2+".png";
        
        UrlImageViewHelper.setUrlDrawable(imgView, grafurl, R.drawable.loading ,60000);
    
    
    
    }
    
 
}