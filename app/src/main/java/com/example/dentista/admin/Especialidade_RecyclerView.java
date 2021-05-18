package com.example.dentista.admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dentista.R;
import com.example.dentista.objeto.Procedimento_Medico;


import java.util.List;

public class Especialidade_RecyclerView extends RecyclerView.Adapter<Especialidade_RecyclerView.MyViewHolder> {

    Context context;
    private static List<Procedimento_Medico> procedimentoMédicos;

    public Especialidade_RecyclerView(Context context, List<Procedimento_Medico> especialidades1){

        this.context = context;
        this.procedimentoMédicos = especialidades1;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;

        view = LayoutInflater.from(context).inflate(R.layout.especialidade_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view, parent.getContext());
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.title.setText("ESPECIALIDADES");
        holder.nomeEspecialidade.setText(procedimentoMédicos.get(position).getTipoEspecialidade());




    }


    @Override
    public int getItemCount() {
        return procedimentoMédicos.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{


        private TextView nomeEspecialidade, title;


        public MyViewHolder ( @NonNull View itemView, final Context context){
            super(itemView);


            nomeEspecialidade = (TextView) itemView.findViewById(R.id.txt_especialidadeVer);
            title = (TextView) itemView.findViewById(R.id.t_title);


//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//
//                    if (procedimentoMédicos.size()>0){
//
//                        Procedimento_Medico espc = procedimentoMédicos.get(getLayoutPosition());
//                        Intent UpIntent = new Intent(context, User_Perfil.class );
////
//
//                        UpIntent.putExtra("", espc);
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
