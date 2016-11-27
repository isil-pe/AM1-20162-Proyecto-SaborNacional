package ivan.com.example.usuario.demoproyecto01.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ivan.com.example.usuario.demoproyecto01.R;
import ivan.com.example.usuario.demoproyecto01.model.ProvinciaEntity;

public class ProvinciaAdapter extends BaseAdapter {

    private Context context;
    private List<ProvinciaEntity> data;

    public ProvinciaAdapter(Context context, List<ProvinciaEntity> data) {
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
                    inflate(R.layout.row_provincia_costa,parent,false);
        } else {
            view = convertView;
        }
        TextView tvNombre =(TextView)view.findViewById(R.id.tvNomProvincia);
        ImageView imgProvincia = (ImageView)view.findViewById(R.id.imgProvincia);

        final ProvinciaEntity provinciaEntity = data.get(position);

        tvNombre.setText(provinciaEntity.getName());
        imgProvincia.setImageResource(provinciaEntity.getIcon());
        return view;
    }
}
