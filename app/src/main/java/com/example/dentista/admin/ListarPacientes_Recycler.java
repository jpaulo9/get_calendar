package com.example.dentista.admin;

import android.content.Context;
import android.content.Intent;
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

public class ListarPacientes_Recycler extends RecyclerView.Adapter<ListarPacientes_Recycler.MyViewHolder> {

    Context context;
    private static List<Consulta> consultas;

    public ListarPacientes_Recycler(Context context, List<Consulta> consulta){

        this.context = context;
        this.consultas = consulta;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;

        view = LayoutInflater.from(context).inflate(R.layout.dados_consultpac, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view, parent.getContext());
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.dataConsulta.setText(consultas.get(position).getDataAtendimento());
        holder.nomePaciente.setText(consultas.get(position).getNomeUser());
        holder.tipoConsulta.setText(consultas.get(position).getTipoConsulta());

        holder.icomP.setImageResource(R.drawable.ic_event_black_24dp);
        holder.fichaPaciente.setImageResource(R.drawable.ic_assignment_black_24dp);



    }


    @Override
    public int getItemCount() {
        return consultas.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{


        private TextView nomePaciente, dataConsulta, tipoConsulta;
        ImageView icomP, fichaPaciente;


        public MyViewHolder ( @NonNull View itemView, final Context context){
            super(itemView);


            icomP = (ImageView) itemView.findViewById(R.id.img_iconC);
            fichaPaciente = (ImageView) itemView.findViewById(R.id.btn_ficha_paciente);
            nomePaciente = (TextView) itemView.findViewById(R.id.txt_nome_pac);
            tipoConsulta = (TextView) itemView.findViewById(R.id.txt_tipoConsulta);
            dataConsulta = (TextView) itemView.findViewById(R.id.txt_dataCons);


//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//
//                    if (consultas.size()>0){
//
//                        Consulta con = consultas.get(getLayoutPosition());
//                        Intent UpIntent = new Intent(context, ListaPacientes.class );
////
//
//                        UpIntent.putExtra("DadoConsulta", con);
//                        ((AppCompatActivity) context).startActivityForResult(UpIntent, 0) ;
//
//
//
////
//
//                    }
//
//
//                }
//            });


        }
    }



}