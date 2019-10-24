package com.dicoding.picodiploma.listtop10gachagames;

import java.util.ArrayList;

 class GamesData {
    private static String[] gameNames = {
            "Azur Lane",
            "Fate/Grand Order",
            "Honkai Impact 3",
            "Girl Frontline",
            "Granblue Fantasy",
            "Kantai Collection",
            "Final Fantasy Brave Exvius",
            "Sword Art Online Memory Defrag",
            "Valkyrie Connect",
            "Fire Emblem"


    };

    private static String[] gameDeskripsi ={
            "Azur Lane adalah sebuah mobile game bertemakan perang tentang kapal-kapal yang dirubah menjadi bentuk wanita cantik nan imut. Kapal-kapal imut ini dipersenjatai dengan berbagai senjata, semisal pistol, torpedo, misil dan airstrike. Terdengar familiar? Tentunya karena game ini jelas terinspirasi oleh Kantai Collection.",
            "Fate/Grand Order berlatar belakang tentang penyelamatan umat manusia dari kepunahan, yang diprediksi akan terjadi pada tahun 2016. Kalian akan berperan sebagai seorang “Master” yang mengendalikan sejumlah “Servant,” yang menjelajahi masa lalu untuk menyingkap misteri asal-usul peristiwa tersebut dan menyelamatkan umat manusia dari kepunahanan total.",
            "Honkai Impact 3 adalah game seluler role-playing 3D aksi gratis yang dikembangkan oleh miHoYo. Ini adalah entri ketiga dalam Seri Houkai dan penerus spiritual untuk Houkai Gakuen, menggunakan banyak karakter dari judul sebelumnya dalam cerita terpisah yang sama sekali baru.",
            "Girls 'Frontline adalah gim strategi mobile yang dikembangkan oleh Tim MICA, sebuah perusahaan Cina. Ini adalah permainan antropomorfisme moe di mana pemain mengontrol eselon karakter android, yang dikenal dalam game sebagai T-Dolls atau Tactical Dolls, yang masing-masing mewakili senjata api dunia nyata.",
            "Granblue Fantasy adalah permainan role-playing game yang dikembangkan oleh Cygames untuk Android, iOS dan web browser, yang pertama kali dirilis di Jepang pada bulan Maret 2014.",
            "Kantai Collection atau KanColle adalah permainan daring sosial berbasis web di Jepang yang dibuat oleh Kadokawa Games. Permainan ini diluncurkan pada 23 April 2013. Pada April 2015, permainan hanya dapat dimainkan di Jepang dengan 3 juta pengguna terdaftar.",
            "Final Fantasy Brave Exvius adalah salah satu dari sejumlah game gacha Final Fantasy. Kebanyakan dari mereka cukup bagus, tetapi Brave Exvius hanya satu langkah lebih baik daripada yang lain. Ini sangat ramah F2P. Selain itu, ia hadir dengan alur cerita yang panjang, banyak unit untuk dipanggil, banyak acara khusus, dan banyak hal lain yang harus dilakukan.",
            "Sword Art Online: Memory Defrag adalah salah satu dari beberapa game SAO di ponsel. Kami paling suka yang ini. Pemain dapat bermain dengan peran RPG tradisional dan kemudian juga memanggil banyak karakter dari seri. Yang ini menampilkan cerita yang layak, misi koperasi, guild, dan elemen sosial lainnya.",
            "Valkyrie Connect adalah salah satu game gacha lama. Kematangannya memberikan konten yang sedikit lebih banyak daripada kebanyakan gachas baru. Permainan ini memiliki alur cerita, banyak acara khusus, mode multiplayer online, Multiplayer ini mencakup mode kompetitif dan co-op. Mekaniknya lebih sederhana dari biasanya.",
            "Fire Emblem Heroes adalah perampokan Nintendo ke dunia game gacha. Untungnya, Nintendo melakukan pekerjaan yang cukup bagus. Game ini relatif solid dengan grafis yang menyenangkan, penuh warna dan banyak hal yang harus dilakukan. Ada berbagai karakter untuk dipanggil dari seri Fire Emblem. Ia menggunakan strategi RPG mekanika seperti halnya game konsol."
    };



    private static String[] gameGenre = {

            "Shooter, Simulation.",
            "Action,RPG.",
            "Action role-playing, hack and slash.",
            "Strategy Moe Role-playing game.",
            "Action,RPG.",
            "Action, Trading card.",
            "Action, RPG.",
            "Action,RPG.",
            "Action, RPG.",
            "Tactical role-playing."

    };

    private static String[] gameJenis = {
            "Free To Play",
            "Free To Play",
            "Free To Play",
            "Free To Play",
            "Free To Play",
            "Free To Play",
            "Free To Play",
            "Free To Play",
            "Free To Play",
            "Free To Play",
    };

    private static int[] gameImages= {
            R.drawable.azurlane_icon,
            R.drawable.fgo_icon,
            R.drawable.hi3_icon,
            R.drawable.gfl_icon,
            R.drawable.gbf_icon,
            R.drawable.kc_icon,
            R.drawable.ffbe_icon,
            R.drawable.saomd_icon,
            R.drawable.valkyrie_connect,
            R.drawable.fireemblem_icon,
            R.drawable.profil_gua,
    };

    static ArrayList<Games> getListData() {
        ArrayList<Games> list = new ArrayList<>();
        for (int position = 0; position < gameNames.length; position++){
            Games games = new Games();
            games.setName(gameNames[position]);
            games.setGenre(gameGenre[position]);
            games.setJenis(gameJenis[position]);
            games.setPhoto(gameImages[position]);
            games.setDeskripsi(gameDeskripsi[position]);
            list.add(games);
        }
        return list;
    }
}
