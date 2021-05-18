package com.example.dentista.user;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dentista.R;
import com.example.dentista.objeto.Consulta;

import java.util.List;

public class Lista_Consulta_P extends RecyclerView.Adapter<Lista_Consulta_P.MyViewHolder> {

    Context context;
    private static List<Consulta> consultas;

    public Lista_Consulta_P(Context context, List<Consulta> consul){

        this.context = context;
        this.consultas = consul;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;

        view = LayoutInflater.from(context).inflate(R.layout.consulta_marcadas_paciente, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view, parent.getContext());
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


                holder.tipoAtendimento.setText(consultas.get(position).getTipoConsulta());
                holder.dataConsulta.setText(consultas.get(position).getDataAtendimento());
                holder.imgIcon.setImageResource(R.drawable.ic_event_black_24dp);
                holder.btnFicha.setImageResource(R.drawable.ic_assignment_black_24dp);



    }


    @Override
    public int getItemCount() {
        return consultas.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{


        private TextView tipoAtendimento, dataConsulta;
        private ImageView imgIcon, btnFicha;


        public MyViewHolder ( @NonNull View itemView, final Context context){
            super(itemView);

            tipoAtendimento = (TextView) itemView.findViewById(R.id.txt_tipoPacConsulta);
            dataConsulta = (TextView) itemView.findViewById(R.id.txt_data_marcada);
            imgIcon = (ImageView) itemView.findViewById(R.id.img_pac_icon);
            btnFicha = (ImageView) itemView.findViewById(R.id.btn_dados_consulta);



            btnFicha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (consultas.size()>0){

                        Consulta userConsultas = consultas.get(getLayoutPosition());
                        Intent UpIntent = new Intent(context, User_Perfil.class );
//

                        UpIntent.putExtra("Updata", userConsultas);
                        ((AppCompatActivity) context).startActivityForResult(UpIntent, 0) ;



//

                    }


                }
            });


        }
    }



}