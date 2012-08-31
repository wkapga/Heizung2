package com.github.heizung2;

import java.io.InputStream;
import java.net.URL;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;


 
public class MainActivity extends Activity {
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
	
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        /*
        ImageView imgView =(ImageView)findViewById(R.id.ImageView1);
        Drawable drawable = LoadImageFromWeb("http://www.lcc-wien.at/images/stories/lichtscheidl/mastersms_234a.jpg");
        imgView.setImageDrawable(drawable);
 		*/
        sel1 = 1;
        sel2 = 1;
        
        
        grafurl="http://keyrate2.dyndns.org:8181/rrd/png"+sel1+".png";
        
        ImageView imgView =(ImageView)findViewById(R.id.ImageView1);
        
        UrlImageViewHelper.setUrlDrawable(imgView, grafurl);
        
        
    }
 
 /*
    private Drawable LoadImageFromWeb(String url)
   {
  try
  {
   InputStream is = (InputStream) new URL(url).getContent();
   Drawable d = Drawable.createFromStream(is, "src name");
   return d;
  }catch (Exception e) {
   System.out.println("Exc="+e);
   return null;
  }
 }
 
 */
 
}