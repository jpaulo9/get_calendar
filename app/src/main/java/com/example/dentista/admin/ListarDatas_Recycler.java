package com.example.dentista.admin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dentista.R;
import com.example.dentista.objeto.Consulta;

import java.util.List;

public class ListarDatas_Recycler extends RecyclerView.Adapter<ListarDatas_Recycler.MyViewHolder> {

    Context context;
    private static List<Consulta> consultas;

    public ListarDatas_Recycler(Context context, List<Consulta> consulta){

        this.context = context;
        this.consultas = consulta;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;

        view = LayoutInflater.from(context).inflate(R.layout.datas_atendimentos, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view, parent.getContext());
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.datasMarcadas.setText(consultas.get(position).getDataAtendimento());
        holder.tituloPg.setText("DIAS DE ATENDIMENTO");


    }


    @Override
    public int getItemCount() {
        return consultas.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{


        private TextView datasMarcadas, tituloPg;


        public MyViewHolder ( @NonNull View itemView, final Context context){
            super(itemView);


                    datasMarcadas = (TextView) itemView.findViewById(R.id.data_atendimentosVer);
                    tituloPg = (TextView) itemView.findViewById(R.id.txt_title);


            datasMarcadas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (consultas.size()>0){

                        Consulta con = consultas.get(getLayoutPosition());
                        Intent UpIntent = new Intent(context, ListaPacientes.class );
//

                        UpIntent.putExtra("Datas", con);
                        ((AppCompatActivity) context).startActivityForResult(UpIntent, 0) ;


                    }


                }
            });


        }
    }



}

