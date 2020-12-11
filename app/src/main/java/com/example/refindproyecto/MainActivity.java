package com.example.refindproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.refindproyecto.CategoriaMain.Categoria_row;
import com.example.refindproyecto.CategoriaMain.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    ArrayList<Categoria_row> arrayCategorias = new ArrayList<>();
    ImageButton inicio, favorito, perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView=findViewById(R.id.reciclerCategorias);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

        inicio=findViewById(R.id.btnInicio);
        favorito=findViewById(R.id.btnFavorito);
        perfil=findViewById(R.id.btnPerfil);

        inicio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        favorito.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ActivityFavoritos.class);
                startActivity(i);
            }
        });
        perfil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ActivityPerfil.class);
                startActivity(i);
            }
        });

    }
    private ArrayList<Categoria_row> getMyList(){


        Categoria_row categoria = new Categoria_row();
        categoria.setTitleCategoria("Hola mundo");
        categoria.setDescripCategoria("Descripcion hola mundo");
        categoria.setImageCategoria(R.drawable.ic_icon_refind);
        arrayCategorias.add(categoria);

        categoria = new Categoria_row();
        categoria.setTitleCategoria("Hola mundo1");
        categoria.setDescripCategoria("Descripcion hola mundo");
        categoria.setImageCategoria(R.drawable.ic_icon_refind);
        arrayCategorias.add(categoria);

        categoria = new Categoria_row();
        categoria.setTitleCategoria("Hola mundo2");
        categoria.setDescripCategoria("Descripcion hola mundo");
        categoria.setImageCategoria(R.drawable.ic_icon_refind);
        arrayCategorias.add(categoria);

        categoria = new Categoria_row();
        categoria.setTitleCategoria("Hola mundo3");
        categoria.setDescripCategoria("Descripcion hola mundo");
        categoria.setImageCategoria(R.drawable.ic_icon_refind);
        arrayCategorias.add(categoria);

        categoria = new Categoria_row();
        categoria.setTitleCategoria("Hola mundo4");
        categoria.setDescripCategoria("Descripcion hola mundo");
        categoria.setImageCategoria(R.drawable.ic_icon_refind);
        arrayCategorias.add(categoria);

        categoria = new Categoria_row();
        categoria.setTitleCategoria("Hola mundo5");
        categoria.setDescripCategoria("Descripcion hola mundo");
        categoria.setImageCategoria(R.drawable.ic_icon_refind);
        arrayCategorias.add(categoria);

        categoria = new Categoria_row();
        categoria.setTitleCategoria("Hola mundo6");
        categoria.setDescripCategoria("Descripcion hola mundo");
        categoria.setImageCategoria(R.drawable.ic_icon_refind);
        arrayCategorias.add(categoria);

        return arrayCategorias;
    }

    public void irActivityCategoria(View view){
        //Todo: falta ver como obtener el id de la cataegoria indicada
       Toast.makeText(this, arrayCategorias.get(1).getTitleCategoria(), Toast.LENGTH_LONG).show();
        //Intent registro_login = new Intent(this, ActivityLogin.class);
        //startActivity(registro_login);
    }

    /**
     * Metoto para mostrar u ocultar el menu
     * Debemos crear un metodo con este nombre exactamente al cual le pasamos un parametro de tipo MenuItem
     * @param menu
     * @return
     */
    public boolean onCreateOptionsMenu(Menu menu){
        //Carpeta res - menu - overflow y pasamos el objeto menu
        getMenuInflater().inflate(R.menu.navigation_items, menu);
        return true;
    }

    /**
     * Metodo para indicar a cual en cual de las opciones se hizo clic
     * Debemos crear un metodo con este nombre exactamente al cual le pasamos un parametro de tipo MenuItem
     * @param item
     * @return
     */
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();

        // Id de cada opcion del menu
        if(id == R.id.inicioId){
            Intent main_C_Menu = new Intent(this, MainActivity.class);
            startActivity(main_C_Menu);
        }else if(id == R.id.favoritoId){
            Intent main_C_Menu = new Intent(this, ActivityFavoritos.class);
            startActivity(main_C_Menu);
        }else if(id == R.id.perfilId){
            Intent main_C_Menu = new Intent(this, ActivityPerfil.class);
            startActivity(main_C_Menu);
        }
        /*else if(id == R.id.profileId){
            Intent main_C_Menu = new Intent(this, ActivityLogin.class);
            startActivity(main_C_Menu);
        }*/

        return super.onOptionsItemSelected(item);
    }

}