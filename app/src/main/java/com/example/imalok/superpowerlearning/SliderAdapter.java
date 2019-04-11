package com.example.imalok.superpowerlearning;

/**
 * Created by iMalok on 18-03-2018.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by iMalok on 09-02-2018.
 * For Get Started Sliding View
 */

//For Slider effect on Get Started Activity

public class SliderAdapter extends PagerAdapter {

    private int[] image_resources = {
            R.drawable.jenifer_lopez,
            R.drawable.eva_mendes,
            R.drawable.jenifer_lopez,
            R.drawable.mila_kunis,
            R.drawable.jenifer_lopez,
            R.drawable.eva_mendes,
            R.drawable.jenifer_lopez,
            R.drawable.mila_kunis,
            R.drawable.jenifer_lopez,
            R.drawable.eva_mendes,
            R.drawable.jenifer_lopez,
            R.drawable.mila_kunis
    };

    private int[] background_resources={

            R.drawable.bg1,
            R.drawable.bg2,
            R.drawable.bg3,
            R.drawable.bg4,
            R.drawable.bg5,
            R.drawable.bg6,
            R.drawable.bg1,
            R.drawable.bg2,
            R.drawable.bg3,
            R.drawable.bg4,
            R.drawable.bg5,
            R.drawable.bg6,
            R.drawable.bg1

    };


    private String[] name_resources={"JENNIFER LOPEZ","EVA MENDES","JENNIFER LOPEZ","MILA KUNIS","JENNIFER LOPEZ","EVA MENDES","JENNIFER LOPEZ","MILA KUNIS",
            "JENNIFER LOPEZ","EVA MENDES","JENNIFER LOPEZ","MILA KUNIS"};


    private String[] quotes={"“If you want something you’ve never had, you must be willing to do something you’ve never done.”\n",
                    "“Don’t count the days, make the days count.”\n",
                    "“Do what you have to do until you can do what you want to do.”\n",
                    "“Don’t let the scale define you. Be active, be healthy, be happy.”\n",
            "“If you want something you’ve never had, you must be willing to do something you’ve never done.”\n",
            "“Don’t count the days, make the days count.”\n",
            "“Do what you have to do until you can do what you want to do.”\n",
            "“Don’t let the scale define you. Be active, be healthy, be happy.”\n",
            "“If you want something you’ve never had, you must be willing to do something you’ve never done.”\n",
            "“Don’t count the days, make the days count.”\n",
            "“Do what you have to do until you can do what you want to do.”\n",
            "“Don’t let the scale define you. Be active, be healthy, be happy.”\n"};


    private Context ctx;
    private LayoutInflater layoutInflater;

    public SliderAdapter (Context ctx){
        this.ctx=ctx;
    }

    @Override
    public int getCount(){
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
        return (view == (RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View item_view = layoutInflater.inflate(R.layout.fitness_slider,container,false);

        ImageView models = (ImageView)item_view.findViewById(R.id.slide_image_fitness);
        TextView modelName = (TextView)item_view.findViewById(R.id.slide_name_fitness);
        TextView quote = (TextView)item_view.findViewById(R.id.quote_fitness);
        ImageView background = (ImageView)item_view.findViewById(R.id.fitness_background);

        models.setImageResource(image_resources[position]);
        modelName.setText(name_resources[position]);
        quote.setText(quotes[position]);
        background.setImageResource(background_resources[position]);
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }

}
