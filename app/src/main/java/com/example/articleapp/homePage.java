package com.example.articleapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class homePage extends AppCompatActivity {
    private CardView artikel1, artikel2, artikel3, artikel4, artikel5, artikel6, artikel7, artikel8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        artikel1 = findViewById(R.id.artikel1);
        artikel2 = findViewById(R.id.artikel2);
        artikel3 = findViewById(R.id.artikel3);
        artikel4 = findViewById(R.id.artikel4);
        artikel5 = findViewById(R.id.artikel5);
        artikel6 = findViewById(R.id.artikel6);

        artikel1.setOnClickListener(view -> openDetailPage(
                "Kebiasaan Sederhana tapi Powerfull untuk Turunkan Gula Darah",
                "1. Aktif Bergerak\n" +
                        "Cobalah untuk lebih banyak bergerak, sebab dengan rutin bergerak kinerja insulin dalam tubuh akan meningkat sehingga sel-sel tubuh bisa menggunakan gula darah sebagai sumber energi.\n" +
                        "\n" +
                        "Dengan mulai berolahraga, seperti angkat beban, jalan cepat, lari, bersepeda dan lain-lain dapat membantu menurunkan kadar gula darah kamu. Cobalah menargetkan sesi olahraga 10 menit 3 kali sehari selama 5 hari.\n" +
                        "\n" +
                        "2. Kendalikan Asupan Karbohidrat\n" +
                        "Mengonsumsi karbohidrat yang berlebih sangat memengaruhi kadar gula darah dalam tubuh kamu. Tubuh akan memecah karbohidrat menjadi gula, terutama glukosa. Kemudian, insulin membantu tubuh menggunakan dan menyimpannya untuk energi.\n" +
                        "\n" +
                        "Jika kamu mengonsumsi terlalu banyak karbo sehari-hari, maka proses tersebut akan terganggu. Kamu bisa jadi mengalami masalah fungsi insulin, serta meningkatnya kadar glukosa darah.\n" +
                        "\n" +
                        "American Diabetes Association merekomendasikan agar pengidap diabetes dapat mengatur asupan karbohidrat dalam tubuh mereka. Mereka yang mengalami diabetes harus menghitung karbohidrat yang masuk ke dalam tubuh.\n" +
                        "\n" +
                        "Coba juga untuk diet rendah karbohidrat agar mencegah terjadinya lonjakan kadar gula darah. Diet rendah karbohidrat tersebut tidak sama dengan tidak mengonsumsi karbohidrat sama sekali loh.\n" +
                        "\n" +
                        "3. Makan Banyak Serat\n" +
                        "Cobalah untuk memperbanyak konsumsi serat. Serat dapat memperlambat pencernaan karbohidrat dan penyerapan gula, sehingga kadar gula darah secara bertahap. Ada dua jenis serat, yakni tidak larut dan larut.\n" +
                        "\n" +
                        "Makanan tinggi serat meliputi:\n" +
                        "\n" +
                        "sayuran\n" +
                        "buah-buahan\n" +
                        "kacang-kacangan\n" +
                        "biji-bijian utuh\n" +
                        "Bagi wanita direkomendasikan untuk mengonsumsi serat sekitar 25 gram dan 35 gram untuk pria.\n" +
                        "\n" +
                        "4. Minum Air Putih\n" +
                        "Satu hal lagi yang terkesan sederhana tapi dapat membantu menjaga kadar gula darah kamu adalah dengan minum air putih yang cukup. Dengan cukupnya asupan air putih, kamu dapat terhindar dari dehidrasi serta membantu ginjal membuang kelebihan gula melalui urine.\n" +
                        "Dalam studi observasional tahun 2021 ditemukan orang yang lebih banyak minum air putih memiliki risiko yang lebih rendah terkena diabetes.\n",
                R.drawable.image_gula_darah,
                "29 Desember 2024"
        ));

        artikel2.setOnClickListener(view -> openDetailPage(
                "Ternyata Segini Durasi Jalan Kaki yang Bantu Lenyapkan Lemak di Perut",
                "Dikutip dari laman Eat This, kunci utama untuk membakar lemak adalah konsistensi dan durasi yang tepat. Sederhananya, bisa dengan menargetkan berjalan kaki selama 30 hingga 60 menit setiap hari, 5-6 hari seminggu. Waktu tersebut memenuhi kriteria yang direkomendasikan, yang menunjukkan bahwa 150 hingga 300 menit kardio sedang per minggu efektif untuk menghilangkan lemak. " +
                        "\n" +
                        "\n" +
                        "Untuk pemula, mulailah dengan berjalan kaki lebih pendek, sekitar 20-30 menit. Nantinya, secara bertahap waktu dan intensitas dapat ditingkatkan seiring dengan peningkatan daya tahan tubuh.\n" +
                        "Berjalan kaki selama 30 menit dapat membakar lemak tubuh, terutama jika mempertahankan kecepatan tetap yang membuat detak jantung mencapai zona pembakaran lemak, yakni sekitar 65-80 persen dari detak jantung maksimum. Jalan kaki yang lebih lama dengan kecepatan cepat akan meningkatkan pembakaran kalori, sehingga menciptakan defisit yang dibutuhkan untuk menghilangkan lemak menjadi lebih mudah. Pada akhirnya, latihan jalan kaki terbaik adalah yang dapat dilakukan secara konsisten, baik dengan jalan kaki yang lebih pendek dan berintensitas tinggi atau sesi yang lebih lama dan bertempo tetap.\n" +
                        "\n" +
                        "Ada beberapa cara jalan kaki yang dapat dilakukan untuk menghempaskan lemak di perut, yakni:\n" +
                        "\n" +
                        "1. Interval Jalan Cepat\n" +
                        "Ini dapat dilakukan secara bergantian antara 2 menit jalan cepat dan 1 menit dengan kecepatan pemulihan yang lebih lambat. Ulangi selama 20 hingga 30 menit. Interval ini sangat cocok untuk jadwal yang padat.\n" +
                        "\n" +
                        "2. Jalan Menanjak\n" +
                        "Untuk melakukan cara jalan kaki ini, cobalah dengan rute yang berbukit atau gunakan treadmill untuk melatih lebih banyak otot, termasuk otot bokong dan inti tubuh.\n" +
                        "\n" +
                        "3. Jalan dengan Rompi Pemberat\n" +
                        "Berjalan kaki dengan menggunakan rompi pemberat menambah daya tahan, dapat meningkatkan pembakaran kalori, dan mengaktifkan lebih banyak otot.\n" +
                        "\n" +
                        "4. Jalan Jauh yang Stabil\n" +
                        "Cobalah untuk menyisihkan satu hari dalam seminggu untuk jalan yang lebih lambat, dan dengan kecepatan yang stabil selama 60 menit atau lebih. Ini membantu membangun daya tahan dan menjaga momentum pembakaran lemak.\n" +
                        "\n",
                R.drawable.image_jalan,
                "24 Januari 2025"
        ));

        artikel3.setOnClickListener(view -> openDetailPage(
                "Ternyata Rajin Minum Kopi Bisa Turunkan Risiko Pikun, Disarankan Berapa Gelas?",
                "Sebuah studi terbaru menemukan orang yang rajin minum kopi memiliki risiko demensia lebih rendah. Demensia merupakan gangguan kognitif yang dapat menyebabkan menurunnya kemampuan berpikir hingga daya ingat. Kondisi ini paling banyak disebabkan oleh alzheimer.\n" +
                        "Hal tersebut ditemukan dalam sebuah studi catatan kesehatan 204.847 orang di Inggris yang berusia antara 40-69 tahun di awal studi. Catatan tersebut mencakup kebiasaan minum kopi dan diagnosis demensia selama rata-rata 9 tahun.\n" +
                        "\n" +
                        "\"Konsumsi kopi berkafein yang lebih tinggi, terutama jenis tanpa pemanis, dikaitkan dengan penurunan risiko penyakit alzheimer dan demensia terkait, serta penyakit parkinson,\" tulis para peneliti dikutip dari Science Alert, Kamis (23/1/2025).\n" +
                        "\n" +
                        "Untuk membantu menghitung angka-angka tersebut, para peneliti menggunakan laporan peserta tentang asupan kopi mereka untuk membaginya ke dalam lima kelompok. Kelompoknya meliputi bukan peminum kopi, kelompok 0-1 cangkir sehari, 1-2 cangkir sehari, 2-3 cangkir sehari, dan lebih dari 3 cangkir sehari.\n" +
                        "\n" +
                        "Kelompok terakhir dengan 3 cangkir sehari memiliki signifikansi paling besar. Namun, orang yang minum kopi dengan jumlah berapapun memiliki setidaknya 34 persen risiko alzheimer dan penyakit terkait lebih kecil.\n" +
                        "\n" +
                        "Mereka juga 37 persen lebih kecil kemungkinannya mengalami parkinson dan 47 persen lebih kecil kemungkinannya meninggal karena penyakit neurodegeneratif selama penelitian.\n" +
                        "\n" +
                        "\"Berbagai mekanisme menunjukkan adanya hubungan potensial antara konsumsi kopi tanpa pemanis dan berkafein dengan penyakit neurodegeneratif,\" tulis peneliti.\n" +
                        "\n" +
                        "Meski begitu, perlu digarisbawahi bahwa kopi yang dikonsumsi mengandung kafein dan tidak diberi pemanis tambahan. Peneliti menuturkan beberapa sifat kafein dapat melindungi otak dari demensia.\n" +
                        "\n" +
                        "Gula dan pemanis buatan mungkin dapat mengganggu manfaat kafein. Penelitian lebih lanjut diperlukan untuk mengetahui lebih dalam soal apakah ini memiliki hubungan kausal secara langsung. Ada kemungkinan faktor-faktor lain juga berperan, mengingat masalah kesehatan neurodegeneratif sangat kompleks.\n",
                R.drawable.image_kopi,
                "24 Januari 2025"
        ));
        artikel4.setOnClickListener(view -> openDetailPage(
                "Ahli Gizi Soal Tantangan Diet 30 Hari Tanpa Gula, Aman Nggak?",
                "Menurut ahli gizi klinik, dr Davie Muhamad, SpGK, tantangan diet 30 hari tanpa gula bisa dikatakan aman. Namun sebaiknya dilakukan pengecekan kondisi gula darah masing-masing untuk mengetahui kebutuhan tubuh terhadap gula.\n" +
                        "\n" +
                        "Namun secara umum, membatasi konsumsi gula memang menjadi cara hidup agar lebih sehat. Mengonsumsi banyak gula,terlebih dengan pemanis buatan, bisa berdampak buruk pada tubuh.\n" +
                        "\n" +
                        "\"Kalau tujuannya untuk sehat, asupan gulanya harus dibatasi per hari. Tapi, kalau tujuannya untuk diet, itu sebenarnya masih bisa juga, karena sebenarnya gula itu isinya glukosa. Glukosa itu adalah bentuk sederhana dari karbohidrat,\" kata dr Davie seperti dikutip detikHealth.\n" +
                        "\n" +
                        "Menurutnya, tanpa mengonsumsi minuman gula pun sebetulnya tubuh sudah mendapat asupan glukosa dari makanan berkarbohidrat seperti nasi, ubi, dan kentang. Hal yang perlu dikhawatirkan adalah glukosa yang terkandung dari gula pasir, sirup dan minuman kemasan mengandung fruktosa, karena bisa berubah menjadi lemak.\n" +
                        "\n" +
                        "\"Itu yang menyebabkan peningkatan berat badan atau peningkatan massa lemak,\" ujarnya.\n" +
                        "\n" +
                        "Pesan Ahli Gizi untuk Pelaku Diet Gula\n" +
                        "Dokter Davie menambahkan, pelaku diet gula tetap diminta untuk memperhatikan pola makannya. Hal ini mencakup wajib sarapan, hingga mengatur komposisi makanan agar tetap mendapatkan gizi seimbang.\n" +
                        "\n" +
                        "\"Saya lebih menekankan ke sarapan itu wajib. Jadi kalau kita misalnya tipikal orang yang suka makan gula yang manis-manis, tiba-tiba mau diet tanpa gula, perbaiki dulu makanan utamanya atau makan besarnya,\" ujar dr Davie.\n" +
                        "\n" +
                        "\"Makan pagi, siang, malamnya diperbaiki dulu dari komposisinya, jumlahnya, dari jenisnya. Kalau sudah diperbaiki, nggak ada itu rasa ingin makan gula-gula, nafsu makannya bisa terkontrol. Jadi diet gizi seimbang itu bisa menjadi tips untuk membantu diet tanpa gula tadi,\" katanya.\n" +
                        "\n" +
                        "Efek Diet 30 Hari Tanpa Gula\n" +
                        "Inti dari tantangan 30 hari tanpa gula adalah menjaga konsistensi terhadap komitmen berdiet. Dengan membiasakan diri selama sebulan, diharapkan tubuh akan terbiasa nyaman tanpa memerlukan gula tambahan.\n" +
                        "\n" +
                        "Berikut ini 6 efek dari diet 30 hari tanpa gula yang dilansir dari Healthline:\n" +
                        "\n" +
                        "1. Gula Darah Menurun\n" +
                        "Diet tanpa gula akan memberikan dampak penurunan pada tingkat gula darah dan insulin. Hal ini dapat mencegah risiko diabetes tipe-2 yang bisa menyebabkan sejumlah penyakit, seperti demensia, penyakit ginjal kronis, sindrom ovarium polikistik, penyakit hati dan jantung.\n" +
                        "\n" +
                        "2. Berat Badan Turun\n" +
                        "Makanan dan minuman dengan tambahan gula cenderung mengandung kalori yang tinggi dan nutrisi yang rendah, tanpa memberikan serat yang baik. Hal ini akan dengan mudah meningkatkan berat badan dan obesitas. Sebaliknya, mengurangi konsumsi gula bisa membantu menurunkan berat badan.\n" +
                        "\n" +
                        "3. Jantung Lebih Sehat\n" +
                        "Diet 30 hari tanpa gula dapat menurunkan risiko penyakit jantung dan kematian akibat penyakit jantung. Ini termasuk tekanan darah tinggi, peningkatan trigliserida, dan kolesterol tinggi.\n" +
                        "\n" +
                        "4. Kesehatan Hati\n" +
                        "Diet gula, terutama diet fruktosa, dapat mengurangi risiko penumpukan lemak di hati atau NAFLD (Nonalcoholic Fatty Liver Disease). Hasil studi pada 2021 menunjukkan 29 remaja laki-laki dengan NAFLD mengalami penurunan 10,5 persen lemak di hati. Hal ini tentu akan meningkatkan kesehatan hati.\n" +
                        "\n" +
                        "5. Kesehatan Mulut\n" +
                        "Tingginya asupan gula tambahan dari minuman manis sangat mempengaruhi kesehatan mulut. Hal ini bisa meningkatkan risiko gigi berlubang dan kerusakan gigi karena bakteri di dalam mulut memecah gula dan menghasilkan asam yang dapat merusak gigi.\n" +
                        "\n" +
                        "6. Manfaat Potensial Lain\n" +
                        "Selain itu, terdapat beberapa potensi manfaat lain dari diet gula, antara lain mengurangi kecemasan dan gejala depresi, menyehatkan kulit, serta mencegah penuaan kulit secara dini.\n" +
                        "\n" +
                        "Jadi, boleh-boleh saja ikut tantangan diet 30 hari tanpa gula, karena banyak manfaatnya buat kesehatan. Tapi sebaiknya cek dulu kondisi gula darah kamu dan jangan segan berkonsultasi dengan dokter sebelum memulai diet.",
                R.drawable.image_diet,
                "24 Januari 2025"
        ));
        artikel5.setOnClickListener(view -> openDetailPage(
                "Maksimalkan Manfaat Yoga untuk Kesehatan Jiwa dan Raga",
                "Yoga belakangan ini menjadi salah satu olahraga yang cukup diminati. Meskipun lebih sering dikenal sebagai olahraga meditasi, manfaat yoga tidak hanya baik untuk kesehatan mental, tapi juga kesehatan fisik.\n" +
                        "Yoga sebenarnya merupakan olahraga tubuh dan pikiran. Yoga menggabungkan latihan pernapasan, meditasi, serta pose dan gerakan yang dirancang untuk memberikan efek relaksasi dan mengurangi stres.\n" +
                        "Bagi Anda yang baru mencoba yoga, mungkin Anda akan sedikit bingung menentukan jenis yoga apa yang cocok untuk Anda. Semua jenis yoga pada dasarnya dapat membantu Anda menjadi lebih rileks, menghilangkan ketegangan tubuh, dan menenangkan pikiran.\n" +
                        "\n" +
                        "Manfaat Yoga\n" +
                        "Sebelum Anda memutuskan untuk melakukan yoga, tentu tidak ada salahnya untuk mengetahui lebih dulu apa saja manfaat yoga. Berikut adalah beberapa manfaat yang bisa Anda rasakan dengan melakukan yoga:\n" +
                        "\n" +
                        "1. Mengurangi stres\n" +
                        "Hampir semua jenis olahraga dapat membantu seseorang dalam mengatasi stres, begitu juga dengan yoga. Hal ini karena saat melakukan yoga, hormon kortisol yang diproduksi tubuh saat mengalami stres akan berkurang.\n" +
                        "\n" +
                        "Studi menunjukkan bahwa yoga bisa mengurangi rasa gelisah, stres, serta memperbaiki mood dan kesejahteraan fisik maupun psikis seseorang. Bahkan, manfaat yoga juga dapat dirasakan pada seseorang yang mengalami gangguan cemas, skizofrenia, dan gangguan tidur.\n" +
                        "\n" +
                        "2. Meningkatkan kebugaran\n" +
                        "Tidak hanya dapat mengurangi stres, manfaat yoga lainnya adalah membuat tubuh menjadi lebih bugar, memperbaiki postur tubuh, serta menambah kekuatan tubuh, jangkauan gerak, dan kelenturan tubuh.\n" +
                        "\n" +
                        "3. Baik untuk penderita sakit jantung\n" +
                        "Jika Anda memiliki risiko penyakit kronis, seperti tekanan darah tinggi atau penyakit jantung, yoga bisa menjadi olahraga yang cocok. Yoga dapat meningkatkan aliran darah dan melemaskan pembuluh darah, sehingga dapat meringankan beban kerja di jantung.\n" +
                        "\n" +
                        "Studi menunjukkan, di samping pengobatan yang medis, pasien gagal jantung yang berlatih yoga sebagai terapi komplementer mengalami peningkatan kesehatan jantung dan peningkatan kualitas hidup dibandingkan dengan pasien yang tidak melakukan yoga secara rutin.\n" +
                        "\n" +
                        "4. Sakit punggung\n" +
                        "Bagi Anda yang mengalami sakit punggung, yoga juga bisa menjadi pilihan olahraga yang tepat. Bahkan, jika Anda mengalami sakit punggung kronis sekalipun. Hal ini karena gerakan peregangan tubuh yang ada pada yoga dapat membantu Anda melenturkan tubuh.\n" +
                        "\n" +
                        "5. Meringankan gejala asma\n" +
                        "Asma yang kambuh dapat sangat mengganggu dan cukup menyiksa. Guna mengatasinya, cobalah untuk melakukan yoga secara rutin.\n" +
                        "\n" +
                        "Sebuah studi yang dilakukan pada penderita asma ringan hingga sedang menunjukkan bahwa beberapa gerakan yoga yang berhubungan dengan pernapasan, seperti Pranayama, dapat menjadi pilihan olahraga yang aman karena bisa meringankan gejala asma.\n" +
                        "\n" +
                        "Akan tetapi, manfaat yoga untuk menangani asma dianggap belum signifikan secara klinis, jika dibandingkan efektivitas pengobatan asma konvensional.\n" +
                        "\n" +
                        "Tidak hanya itu, yoga juga dipercaya dapat meringankan gejala nyeri, migrain, dan membantu mengatasi insomnia.\n" +
                        "\n" +
                        "Selain beberapa manfaat yoga di atas, manfaat utama yang dicari banyak orang adalah terbakarnya lemak dalam tubuh. Untuk mendapatkan manfaat ini, lakukan yoga jenis ashtanga, power yoga, hot yoga, atau aerial yoga, serta dapat dikombinasikan dengan berjalan kaki, berlari, atau olahraga aerobik lainnya.\n" +
                        "\n" +
                        "Lakukan yoga secara rutin demi kesehatan jiwa dan raga. Namun jika sebelumnya Anda menderita kondisi kesehatan tertentu, ada baiknya berkonsultasi terlebih dahulu dengan dokter sebelum mulai berlatih yoga.\n" +
                        "\n",
                R.drawable.image_yoga,
                "8 November 2024"
        ));

        artikel5.setOnClickListener(view -> openDetailPage(
                "4 Gerakan Yoga Untuk Mengecilkan Perut",
                "Perut buncit bisa memengaruhi penampilan dan menurunkan rasa percaya diri. Nah, yoga untuk mengecilkan perut bisa menjadi salah satu metode yang dapat Anda lakukan untuk mengurangi lemak di bagian perut. Dengan begitu, Anda pun lebih percaya diri dengan perut yang lebih rata.\n" +
                        "\n" +
                        "Tak hanya mampu memperbaiki postur tubuh, yoga juga bisa membantu Anda menurunkan berat badan. Sebuah penelitian mengungkapkan bahwa seseorang yang rutin berolahraga dan menerapkan pola hidup sehat dapat terhindar dari obesitas dan kelebihan lemak di bagian perut.\n" +
                        "Selain itu, yoga juga diketahui dapat mengatasi gangguan pada saluran pencernaan, seperti perut kembung dan konstipasi.\n" +
                        "\n" +
                        "Rangkaian Gerakan Yoga untuk Mengecilkan Perut\n" +
                        "Yoga dilakukan dengan menggabungkan gerakan, teknik pernapasan, dan meditasi. Ketiga hal tersebut diketahui dapat merangsang sistem saraf parasimpatik dalam mengatur fungsi tubuh saat beristirahat dan proses pencernaan.\n" +
                        "\n" +
                        "Jadi, ada dua manfaat yang dapat Anda dapatkan, yaitu lemak di perut terbakar dan saluran pencernaan pun berfungsi dengan baik. Nah, berikut ini adalah beberapa gerakan yoga untuk mengecilkan perut yang Anda bisa coba lakukan:\n" +
                        "\n" +
                        "1. Bhujangasana\n" +
                        "Bhujangasana atau lebih dikenal pose kobra adalah posisi yoga untuk meregangkan otot bagian perut yang juga baik untuk melancarkan pencernaan. Gerakan yoga untuk mengecilkan perut ini diawali dengan posisi tubuh berbaring tengkurap.\n" +
                        "\n" +
                        "Selanjutnya, letakkan telapak tangan di lantai, tepatnya di samping dada. Secara perlahan, tekan telapak tangan ke lantai dan angkat kepala serta dada ke atas. Luruskan siku dan tahan, lalu tarik dan hembuskan napas sebanyak 4–5 kali.\n" +
                        "\n" +
                        "2. Apanasana\n" +
                        "Apasana juga merupakan gerakan dasar yoga untuk mengecilkan perut. Gerakan ini mampu merangsang usus besar sehingga bekerja lebih baik. Untuk melakukannya, Anda perlu merebahkan tubuh di atas matras, kemudian tarik dan tekuk lutut ke arah dada secara perlahan dengan posisi tangan memeluk kedua lutut.\n" +
                        "\n" +
                        "Tahan posisi ini selama 4–5 siklus pernapasan. Pastikan Anda menarik napas secara perlahan melalui hidung dan embuskan melalui mulut. Teknik pernapasan ini juga mampu membuat tubuh lebih rileks.\n" +
                        "\n" +
                        "3. Parsva Sukhasana\n" +
                        "Gerakan yoga untuk mengecilkan perut berikutnya adalah parsva sukhasana. Gerakan ini juga bisa mengatasi perut kembung dan kelebihan gas di dalam tubuh. Awali gerakan dengan posisi duduk bersila, kemudian letakkan tangan kiri ke lantai  dan angkat tangan lainnya ke atas sambil memiringkan tubuh ke kiri.\n" +
                        "\n" +
                        "Tarik napas secara perlahan dan tahan gerakan selama 4–5 tarikan napas. Ulangi beberapa kali dan lakukan pada sisi tubuh lainnya.\n" +
                        "\n" +
                        "4. Supta Matsyendrasana\n" +
                        "Supta matsyendrasana dipercaya dapat mengatasi konstipasi dan perut kembung. Gerakan yoga untuk mengecilkan perut ini dapat Anda lakukan dengan membaringkan tubuh, lalu menekuk lutut bagian kanan. Setelah itu, bawa kaki kanan ke sisi kiri tubuh dan jaga posisi kaki kiri agar tetap lurus.\n" +
                        "\n" +
                        "Tekan lutut kaki kiri dengan tangan kiri, lalu letakkan tangan kanan di lantai dan luruskan tangan ini setinggi bahu. Sementara itu, pastikan posisi tubuh bagian atas menghadap ke arah kanan. Tahan posisi ini selama 4–5 tarikan napas dan ulangi pada sisi lainnya.\n" +
                        "\n" +
                        "Beragam gerakan yoga untuk mengecilkan perut bisa Anda coba di rumah. Namun, Anda juga disarankan untuk mengurangi asupan karbohidrat serta memperbanyak konsumsi makanan tinggi protein dan serat, seperti buah dan sayuran.\n" +
                        "\n" +
                        "Selain itu, ada beberapa jenis makanan yang baik untuk menurunkan lemak perut, seperti dada ayam tanpa kulit, ikan, oatmeal, telur, dan kacang kedelai. Selain menjaga pola makan, Anda juga perlu mengonsumsi air putih setidaknya 2 liter sehari, mengelola stress dengan baik, dan mencukupi waktu tidur.\n" +
                        "\n" +
                        "Selain beberapa gerakan di atas, masih ada gerakan yoga untuk mengecilkan perut lainnya yang bisa dicoba. Anda juga dapat mengikuti kelas yoga yang didampingi instruktur guna mencegah terjadinya cedera. Namun, bila memiliki kondisi kesehatan tertentu, Anda bisa berkonsultasi dengan dokter terlebih dahulu." +
                        "\n",
                R.drawable.image_yoga2,
                "9 November 2024"
        ));
    }

    private void openDetailPage(String title, String description, int imageResource, String date) {
        Intent intent = new Intent(this, detailPage.class);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("image", imageResource);
        intent.putExtra("date", date);
        startActivity(intent);
    }
}
