package com.baqynra.withbaqyand.distrop.model

import com.baqynra.withbaqyand.distrop.R


object Detail {
    private val namaKaos = arrayOf(
        "Dreambirds Artwear",
        "Kamengski",
        "Wadezig",
        "Peter Says Denim",
        "Maternal Disaster",
        "Greenlight",
        "Bloods",
        "SCH",
        "Screamous",
        "3 Second"
    )
    private val hargakaos = arrayOf(
        "Rp 85.000 – Rp 250.000",
        "Rp 50.000 – Rp 195.000",
        "Rp 55.000 – Rp 150.000",
        "Rp 100.000 – Rp 329.000",
        "Rp 59.000 – Rp 1.589.000",
        "Rp 47.000 – Rp 500.000",
        "Rp 85.000 – Rp 399.000",
        "Rp 75.000 – Rp 110.000",
        "Rp 45.000 – Rp 150.000",
        "Rp 45.000 – Rp 180.000"
    )
//    private val lokasi = arrayOf(
//        "Kota Jakarta Selatan",
//        "Kota Jakarta Selatan",
//        "Kota Bandung",
//        "Kota Bandung",
//        "Kota Bandung",
//        "Kota Bandung",
//        "Kabupaten Sumedang",
//        "Kota Bandung",
//        "Kota Bandung",
//        "Kota Bandung"
//    )
//    private val alamat = arrayOf(
//        "Jl. Kemang Selatan VIII No.64B1 7 2, RT.7/RW.2, Bangka, Kec. Mampang Prpt., Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12730",
//        "Jl. H. Djayadi IV No.43, RT.6/RW.5, Tj. Bar., Kec. Jagakarsa, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12530",
//        "Jl. Sultan Agung No.7, Citarum, Kec. Bandung Wetan, Kota Bandung, Jawa Barat 40115",
//        "Jl. Ciumbuleuit No.109, Hegarmanah, Kec. Cidadap, Kota Bandung, Jawa Barat 40141",
//        "Jl. Wira Angun Angun No.4B, Citarum, Kec. Bandung Wetan, Kota Bandung, Jawa Barat 40115",
//        "Jl. Buah Batu No.188, Cijagra, Kec. Lengkong, Kota Bandung, Jawa Barat 40265",
//        "Jl. Mayor Abdurahman No.125 B, Kotakaler, Kec. Sumedang Utara, Kabupaten Sumedang, Jawa Barat 45621",
//        "Jl. Buah Batu No.64, Burangrang, Kec. Lengkong, Kota Bandung, Jawa Barat 40262",
//        "Jl. Sultan Agung No.9, Citarum, Kec. Bandung Wetan, Kota Bandung, Jawa Barat 40115",
//        "Jl. Gatot Subroto No.289, Cibangkong, Kec. Batununggal, Kota Bandung, Jawa Barat 40273"
//    )

   private val gambarkaos = intArrayOf(
       R.drawable.dreambirds,
       R.drawable.kamengski,
       R.drawable.wadezig,
       R.drawable.ptrsysdenim,
       R.drawable.maternal,
       R.drawable.greenlight,
       R.drawable.bloods,
       R.drawable.sch,
       R.drawable.screamousf,
       R.drawable.trisecondf

    )
    private val detailkaos = arrayOf( /*1*/
        "Siapa yang tidak mengenal desain logo burung hantu yang terkenal? Bagi kamu yang belum tahu desain ini lekat dengan merk Dreambirds Artwear. " +
                "Warna dan desain yang simpel menunjukan gaya yang elegan. Gaya ini juga cocok bagi kamu yang tidak suka menjadi pusat perhatian, namun tetap " +
                "memiliki selera sebagai pribadi yang kalem namun menarik. Untuk dapat melihat langung baju dari brand ini kamu bisa konjungi Official Store-nya " +
                "secara langsung yang terletak di Kota Jakarta Selatan. Berikut adalah detail mengenai kaos dari brand ini dan alamat lengkap Official store-nya yang dapat kalian kunjungi.",  /*2*/
        ("Desain yang tidak biasa kerap menjadi gaya khas tersendiri di beberapa merek kaos distro. Bagi kamu yang bosan dengan gaya yang biasa-biasa saja, kaos distro satu ini tidak boleh ketinggalan lho!" +
                "Dari desain mangkok mie ayam yang legendaris, desain bunga dari tepung Rose Brand, serta logo-logo produk makanan yang terkenal hingga perubahan gaya edit di beberapa merek yang unik. " +
                "Perubahan gaya edit itu cenderung nyeleneh dan menjurus pada kesan candaan yang tentu cocok bagi kamu yang memiliki kesan humoris dan suka akan lawakan." +
                "Brand kaos ini dapat kamu temukan langsung di Official store-nya, untuk lebih jelasnya berikut adalah detail dari kaos brand ini."),  /*3*/
        ("Kaum muda tidak henti-henti memberikan inspirasi dari desain kaos distro. Di tengah banyaknya warna serta desain yang monoton, Wadezig memberikan nuansa Indonesia yang khas di kalangan anak muda. " +
                "Gaya ini cocok bagi kamu yang gemar menunjukan sisi simpel, keren, kekinian (Ganteng Kalem) namun jenaka dengan nama merk yang familiar di kalangan anak muda. Bukan hanya sekedar desain " +
                "akan tetapi kualitas dan harga yang ditawarkan benar-benar ramah dikantong, maka tak heran kaos dengan brand ini benar-benar banyak peminatnya. " +
                "Inilah informasi lengkap mengenai brand kaos yang satu ini"),  /*4*/
        ("Peter says denim adalah brand asal Bandung yang didirikan oleh Peter Firmansyah, Peter Says Denim menjadi salah satu merk kaos distro yang tren di kalangan anak muda. Bahkan Kini produk ini telah terkenal di Indonesia dan Luar negeri lho. " +
                "Ditambah lagi produk ini sudah digunakan oleh band band terkenal luar negeri seperti Asking alexandria, Silverstein, Before their eyes dan band lainnya. " +
                "Warna dan desain yang kalem membuat para penggunanya jatuh hati. Selain itu, kombinasi dengan kaos ini menambah kesan asik dan menawan. " +
                "Mungkin kamu yang suka bermain skateboard akan familiar dengan merk distro satu ini. Atau, mungkin kamu sudah memilikinya dan berniat mengoleksinya? Anda dapat simak datail dari brand kaos yang satu ini dibawah."),  /*5*/
        ("Buat kamu para pria yang suka pakaian serba hitam, Indonesia memiliki merek streetwear bernama Maternal Disaster dari Bandung. Mereka tidak hanya menyediakan kaos, namun juga kemeja, jaket kulit, celana, hingga sepatu! Maternal " +
                "Disaster memiliki ciri khas yang tidak dimiliki merek streetwear lain, yakni artwork khas seperti kesan metal dan old skull dari sang desainer yang berkerja di Maternal Disaster. " +
                "Gambar-gambar seperti tengkorak, makhluk menyeramkan, hingga kata-kata keren seringkali tertempel di produk-produk mereka. Selain itu, harganya juga tidak terlalu mahal, terutama untuk kaos dan hoodie-nya yang tentu saja dengan harga terjangkau. " +
                "Berikut informasi yang bisa kalian dapatkan mengenai brand Maternal."),  /*6*/
        ("Kaos Greenlight pertama kali berdiri pada akhir 90-an, dengan pasar anak muda, serta dengan corak stylish dan never to end, karena pakaian di merek ini designnya bisa dipakai oleh semua umur. Ciri khas desain kaos Greenlight yaitu trendy dan stylish " +
                "sehingga membuat orang yang memakainya nyaman dan percaya diri. dengan menyuguhkan desain yang juga simpel dengan tulisan merk kaos distro, Greenlight mengutamakan warna dan gaya yang simpel. Kemudahan ini bisa menyesuaikan dengan gaya fashion kamu yang beragam. " +
                "Warna yang disajikan juga mampu cocok di berbagai warna favorit kamu. Kesan yang ditonjolkan ketika menggunakan produk satu ini akan terasa berbeda dengan kaos-kaos lainnya. " +
                "Untuk dapat memiliki kaos greenlight ini kalian bisa lihat informasi berikut."),  /*7*/
        ("Logo Bloods yang sangat khas mampu meningkatkan reputasinya sebagai salah satu merek kaos distro terbaik. Tren para anak muda dengan distro yang satu ini mampu menyihir penggunanya dengan sangat baik. " +
                "Pasalnya, hampir semua anak hingga remaja akan mengetahui tentang merk satu ini. Karna logo petir yang nyentrik sebagai ciri khas merk bloods yang mudah diterima dan mudah dikenali oleh para konsumen. " +
                "dengan hal itu otomatis konsumen yang menggunakan brand ini akan merasa lebih percaya diri mengenakannya. Mungkin kamu akan cocok juga dengan merk kaos distro satu ini, berminat? Berikut informasi lengkapnya."),  /*8*/
        ("Tak hanya dikenal kalangan anak muda era ‘90’ dan 2000’an, tapi juga digandrungi  generasi Z yang mulai mengenal barang-barang distro. Sebagai brand perintis di kategori produk distro tahun 90-an, " +
                "Sch mampu bertahan di era digital ketika yang lain tumbang. Itu karena brand yang satu ini terus berinovasi dari segi tampilan dan desain yang mnegikuti zaman. Desain serta logo SCH/RSCH yang khas membuat orang mengenal merek satu ini " +
                "tanpa harus berpikir panjang. Simpel nan elegan, membaut para pengguna tampil menarik meskipun minim aksesoris. " +
                "Gaya ini juga cocok digunakan dengan berbagai macam atribut fashion lain, seperti sepatu casual hingga yang memiliki desain unik. Untuk infomasi lengkap dan Official Store yang dapat dikunjungi ada dibawah ini."),  /*9*/
        ("Merek  kaos yang legendaris sejak tahun 2004 ini dibuat dengan desain yang mewakili spirit dinamis, young, open minded  namun tetap humble plus kesan simpel dengan nuansa menarik, itulah dua hal yang dapat mendeskripsikan kaos Screamous. " +
                "Pabrikan distro asal Bandung ini memberikan sentuhan aestetik bagi kamu yang bosan dengan desain monoton. " +
                "Warna kalem dan desain yang menyesuaikan mampu menarik hati para calon pembeli. Apalagi kamu yang suka dengan model yang tidak ribet. Berikut detailnya."),  /*10*/
        ("3 Second menyediakan berbagai macam motif yang unik pada setiap t-shirtnya, dengan ciri khas style yang fresh, trendy, dan fun. Selain itu 3 Second bukan hanya menjual produk-produknya untuk para pria saja, melainkan para perempuan pun dapat menikmati brand ini. " +
                "Salah satu merek yang sangat terkenal dan sudah menjamah berbagai macam gerai ritel di mall ternama. 3Second menunjukkan bahwa industri distro tidak lesu dan tidak mati ditelan berbagai zaman. " +
                "Di tengah gempuran berbagai macam merk distro luar, 3Second masih memiliki berbagai macam pencintanya dan menunjukkan asanya sebagai yang terbaik di pasar lokal. Penasaran? Ini informasi lengkap menegenai kaos dari brand 3Second.")
    )

//    private val ciriKhas = arrayOf(
//        "Corak burung hantu dengan sablon plastisol(karet)",
//        "Sablon logo makanan yang diparodikan",
//        "Desain minimalis, stylish serta diikuti logo khas utamanya yaitu tali tambang",
//        "Kualitas bahan yang menggunakan 100% serat kapas alami sangat nyaman dipakai",
//        "Memiliki artwork khas dengan kesan metal dan oldskull",
//        "Desain trendy namun dapat diterima oleh semua kalangan dengan corak stylish never to end",
//        "Logo petir pada tulisan bloods yang nyentrik",
//        "Tulisan logo Sch. dengan font khas brand-nya serta desain yang simple dan dinamis",
//        "Desain yang aestik cenderung kalem tetapi tidak monoton",
//        "Style kaos yang fresh, trendy dan fun"
//    )
//
//    private val bahan = arrayOf(
//        "Cotton Combed 24s/30s premium",
//        "Cotton Combed 30s",
//        "Cotton Combed 30s",
//        "100% Cotton Combed alami",
//        "Cotton Combed 24s",
//        "Cotton Combed 30s premium",
//        "Teteron Cotton/30s",
//        "Cotton Combed 30s",
//        "Cotton Tri-Blend",
//        "Cotton Combed 30s"
//    )


    val listData: ArrayList<Shirt>
    get(){
        val list = arrayListOf<Shirt>()
        for (position in namaKaos.indices){
            val kaos = Shirt("kaos","harga","detail",R.drawable.dreambirds)
            kaos.name = namaKaos[position]
            kaos.harga = hargakaos[position]
            kaos.detail = detailkaos[position]
            kaos.photo = gambarkaos[position]
            list.add(kaos)
        }
        return list
    }
}