package ivan.com.example.usuario.demoproyecto01.adapter;

import android.content.Context;
import android.media.Rating;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import ivan.com.example.usuario.demoproyecto01.R;
import ivan.com.example.usuario.demoproyecto01.model.PlatoEntity;

public class PlatoAdapter extends BaseAdapter {

    private Context context;
    private List<PlatoEntity> data;

    public PlatoAdapter(Context context, List<PlatoEntity> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(this.context).
                    inflate(R.layout.row_plato,parent,false);
        } else {
            view = convertView;
        }
        TextView tvNombre =(TextView)view.findViewById(R.id.tviName);
        ImageView imgPlato = (ImageView)view.findViewById(R.id.iviPlato);
        RatingBar rtgStar = (RatingBar)view.findViewById(R.id.rtgStar);

        final PlatoEntity platoEntity = data.get(position);

        tvNombre.setText(platoEntity.getName());
        imgPlato.setImageResource(platoEntity.getImage());
        rtgStar.setRating(platoEntity.getRating().floatValue());

        return view;
    }
}
