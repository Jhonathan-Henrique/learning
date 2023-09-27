package br.com.hellodev.controledeprodutos;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.tsuryo.swipeablerv.SwipeLeftRightCallback;
import com.tsuryo.swipeablerv.SwipeableRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterProduto.OnClick {

    private AdapterProduto adapterProduto;
    private List<Produto> produtoList = new ArrayList<>();
    private SwipeableRecyclerView rvProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProdutos = findViewById(R.id.rvProdutos);

        carregaLista();

        configRecyclerView();

    }

    private void configRecyclerView() {
        rvProdutos.setLayoutManager(new LinearLayoutManager(this));
        rvProdutos.setHasFixedSize(true);
        adapterProduto = new AdapterProduto(produtoList, this);
        rvProdutos.setAdapter(adapterProduto);

        rvProdutos.setListener(new SwipeLeftRightCallback.Listener() {
            @Override
            public void onSwipedLeft(int position) {
            }

            @Override
            public void onSwipedRight(int position) {
                produtoList.remove(position);
                adapterProduto.notifyItemRemoved(position);
            }
        });
    }

    private void carregaLista() {

        Produto produto1 = new Produto();
        produto1.setNome("Monitor 34 LG");
        produto1.setEstoque(45);
        produto1.setValor(1349.99);

        Produto produto2 = new Produto();
        produto2.setNome("Caixa de Som C3 Tech");
        produto2.setEstoque(15);
        produto2.setValor(149.99);

        Produto produto3 = new Produto();
        produto3.setNome("Microfone Blue yeti");
        produto3.setEstoque(38);
        produto3.setValor(1699.99);

        Produto produto4 = new Produto();
        produto4.setNome("Gabinete NZXT H440");
        produto4.setEstoque(15);
        produto4.setValor(979.99);

        Produto produto5 = new Produto();
        produto5.setNome("Placa Mãe Asus");
        produto5.setEstoque(60);
        produto5.setValor(1199.99);

        Produto produto6 = new Produto();
        produto6.setNome("Memória Corsair 16GB");
        produto6.setEstoque(44);
        produto6.setValor(599.99);

        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);
        produtoList.add(produto4);
        produtoList.add(produto5);
        produtoList.add(produto6);

        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);
        produtoList.add(produto4);
        produtoList.add(produto5);
        produtoList.add(produto6);

    }

    @Override
    public void onClickListener(Produto produto) {
        Toast.makeText(this, produto.getNome(), Toast.LENGTH_SHORT).show();
    }
}