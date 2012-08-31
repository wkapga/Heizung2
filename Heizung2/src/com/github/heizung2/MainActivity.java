package com.github.heizung2;

import java.io.InputStream;
import java.net.URL;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;

 
public class MainActivity extends Activity {
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
 
        ImageView imgView =(ImageView)findViewById(R.id.ImageView1);
        
        UrlImageViewHelper.setUrlDrawable(imgView, "http://keyrate2.dyndns.org:8181/rrd/png2.png");
        
        
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