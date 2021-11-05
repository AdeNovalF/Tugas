package id.ac.persiapan_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.huawei,"HUAWEI","HUAWEI","Produk Huawei " +
                "Huawei Technologies Co., Ltd. adalah sebuah perusahaan teknologi multinasional yang berkantor pusat di Shenzhen, Guangdong, Tiongkok. Perusahaan ini merancang, mengembangkan, dan menjual peralatan telekomunikasi dan elektronik konsumen. "
                ))

        data?.add(DataModel(R.drawable.infinix,"INFINIX","INFINIX", "Produk(Infinix) adalah " +
                "Infinix Mobility adalah sebuah perusahaan elektronik dari Transsion Holdings yang berbasis di Hong Kong. Perusahaan ini didirikan pada tahun 2013 dan memiliki lini produksi di Shenzhen serta pusat litbang di Shanghai, Tiongkok. Adapun, desain produk dikerjakan di Prancis,  "
                ))

        data?.add(DataModel(R.drawable.mi,"XIAOMI","XIAOMI", "XIAOMI " +
                "Xiaomi Inc. adalah perusahaan elektronik swasta dari Tiongkok yang berkantor pusat di Beijing. Didirikan pada tahun 2010, perusahaan ini dengan cepat telah menjadi salah satu perusahaan teknologi terkemuka di dunia. "
                ))

        data?.add(DataModel(R.drawable.oppo,"OPPO","OPPO", "Oppo adalah salah satu merek smarthphone " +
                "Oppo Electronics Corp adalah perusahaan elektronik konsumen dan komunikasi seluler Tiongkok yang berkantor pusat di Dongguan, Guangdong, Tiongkok dan dikenal dengan ponsel cerdas, pemutar Blu-ray dan perangkat elektronik lainnya "
                ))

        data?.add(DataModel(R.drawable.realme,"REALME","REALME", " Realme masih satu keluarga dengan oppo" +
                "Realme adalah produsen smartphone yang berbasis di Shenzhen, Tiongkok. Merk realme didirikan pada 4 Mei 2018 oleh Sky Li, dengan beberapa anak muda lainnya yang berkecimpung di industri smartphone dari beragam negara "
                ))

        data?.add(DataModel(R.drawable.samsung,"SAMSUNG","SAMSUNG", "Samsung berasal dari Negara KorSel " +
                "Samsung Group adalah sebuah konglomerat multinasional yang berkantor pusat di Samsung Town, Seoul, Korea Selatan. Perusahaan ini memiliki sejumlah anak usaha yang mayoritas berbisnis dengan merek Samsung, dan perusahaan ini merupakan chaebol terbesar di Korea Selatan. "
                ))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.jenis)
                intent.putExtra("jenis", item?.nama_jenis)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}