package com.tutorials.hp.rushormgridview.mAdapterView;

import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

import com.tutorials.hp.rushormgridview.R;


/**
 - ViewHolder class.
 - This class will hold views to be recycled for each viewitem by our adapter.
 - This class implements View.OnClickListener interface, hence our custom view shall be clickable.
 - Methods: onLongClick(),setLongClickListener(),onCreateContextMenuListener().
 - In this case we have two textviews.
 - Our views shall be longClickable, hence showing ContextMenu.
 - So we implement two interfaces: OnLongClickListener and OnCreateContextMenuListener, both belong to android.view.View.
 - A view object shall be passed via constructor and we use it to reference our widgets using findViewById.

 */
public class MyViewHolder implements View.OnLongClickListener,View.OnCreateContextMenuListener {

    TextView nameTxt,propTxt;
    MyLongClickListener longClickListener;

    public MyViewHolder(View v) {
        nameTxt= (TextView) v.findViewById(R.id.nameTxt);
        propTxt= (TextView) v.findViewById(R.id.propellantTxt);

        v.setOnLongClickListener(this);
        v.setOnCreateContextMenuListener(this);
    }

    @Override
    public boolean onLongClick(View v) {
        this.longClickListener.onItemLongClick();
        return false;
    }

    public void setLongClickListener(MyLongClickListener longClickListener)
    {
        this.longClickListener=longClickListener;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Action : ");
        menu.add(0, 0, 0, "NEW");
        menu.add(0,1,0,"EDIT");
        menu.add(0,2,0,"DELETE");


    }
}
