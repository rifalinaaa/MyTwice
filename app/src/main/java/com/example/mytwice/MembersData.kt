package com.example.mytwice

object MembersData {
    private val data = arrayOf(
        arrayOf(
            "Momo Hirai",
            "Momo Hirai (平井 もも, lahir 9 November 1996), lebih dikenal sebagai Momo (Hangul: 모모; Hiragana: もも), adalah seorang penyanyi dan penari asal Jepang yang berkarier di Korea Selatan. Ia adalah anggota dari grup vokal wanita, Twice, yang dibentuk oleh JYP Entertainment. Momo adalah salah satu dari tiga anggota Twice yang berasal dari Jepang.",
            "https://upload.wikimedia.org/wikipedia/commons/c/ca/20220122%E2%80%94Momo_%EB%AA%A8%EB%AA%A8_Campaign_Film%2C_Pearlygates_x_Twice_2022.jpg",
        ),
        arrayOf(
            "Im Na-yeon",
            "m Na-yeon (Hangul: 임나연; lahir 22 September 1995), lebih dikenal sebagai Nayeon, adalah seorang penyanyi asal Korea Selatan. Setelah ikut serta dalam acara realitas berjudul Sixteen pada tahun 2015, ia terpilih menjadi anggota grup vokal wanita asal Korea Selatan, Twice, yang dibentuk oleh JYP Entertainment.[3][4] Nayeon dideskripsikan sebagai salah satu vokalis dan penari utama Twice, dan sering kali mengisi posisi center selama melakukan tarian.[3][5] Nayeon adalah anggota Twice yang paling tua.[3][6] Selama dua tahun berturut-turut (2017 dan 2018), ia merupakan idola Korea terpopuler keenam dalam jajak pendapat musik tahunan Gallup Korea, dan naik ke posisi kelima pada tahun 2019.",
            "https://upload.wikimedia.org/wikipedia/commons/5/55/220701_Nayeon%28%EB%82%98%EC%97%B0%29_of_Twice_MusicBank_Fancam.jpg",
        ),
        arrayOf(
            "Sana Minatozaki",
            "Sana Minatozaki (Jepang: 湊崎 紗夏, lahir 29 Desember 1996), lebih dikenal sebagai Sana (Hangul: 사나), adalah seorang penyanyi asal Jepang. Ia merupakan anggota dari grup vokal wanita asal Korea Selatan, Twice, yang dibentuk oleh JYP Entertainment melalui acara realitas Sixteen pada tahun 2015.",
            "https://upload.wikimedia.org/wikipedia/commons/5/54/180717_%EC%97%B4%EB%A6%B0%EC%9D%8C%EC%95%85%ED%9A%8C_%ED%8A%B8%EC%99%80%EC%9D%B4%EC%8A%A4_%282%29_%28cropped%29.jpg",
        ),
        arrayOf(
            "Chou Tzu-yu",
            "Chou Tzu-yu (Hanzi: 周子瑜, lahir 14 Juni 1999) atau lebih dikenal sebagai Tzuyu, adalah seorang penyanyi dan penari asal Taiwan. Ia merupakan anggota dari grup vokal wanita asal Korea Selatan Twice, yang dibentuk oleh JYP Entertainment melalui acara realitas Sixteen pada 2015.",
            "https://upload.wikimedia.org/wikipedia/commons/2/20/20220121%E2%80%94Tzuyu_Campaign_Film%2C_Pearlygates_x_Twice_2022.jpg",
        ),
        arrayOf(
            "Yoo Jeong-yeon",
            "Yoo Jeong-yeon (Hangul: 유정연; lahir 1 November 1996), lebih dikenal sebagai Jeongyeon, adalah seorang penyanyi asal Korea Selatan. Ia merupakan anggota dari grup vokal wanita, Twice, yang dibentuk oleh JYP Entertainment melalui acara realitas Sixteen pada tahun 2015.",
            "https://upload.wikimedia.org/wikipedia/commons/8/81/220328_Yoo_Jeong-yeon_TWICE_digital_film.jpg",
        ),
        arrayOf(
            "Park Ji-hyo",
            "Park Ji-hyo (Hangul: 박지효, lahir 1 Februari 1997) atau lebih dikenal sebagai Jihyo, adalah seorang penyanyi dan anggota dari grup vokal wanita Korea Selatan, Twice yang dibentuk oleh JYP Entertainment. Sebagai vokalis utama di dalam grup, ia dikenal karena memiliki suara yang kuat, kemampuan menari, dan karismanya.[1] Jihyo juga merupakan pemimpin dari Twice",
            "https://upload.wikimedia.org/wikipedia/commons/c/ca/190221_%EC%A7%80%ED%9A%A8%EC%83%9D%EC%9D%BC%EA%B8%B0%EB%85%90.jpg",
        ),
        arrayOf(
            "Mina Sharon Myoi",
            "Mina Sharon Myoi[1][2] (名井南, lahir 24 Maret 1997), lebih dikenal sebagai Mina (Hangul: 미나; Katakana: ミナ), adalah seorang penyanyi dan penari berkebangsaan Amerika Serikat yang berkarier di Korea Selatan. Ia pindah dan dibesarkan di Jepang. Ia merupakan anggota dari Twice, grup vokal wanita yang dibentuk oleh JYP Entertainment. Mina adalah salah satu dari tiga anggota Twice yang berasal dari Jepang.",
            "https://upload.wikimedia.org/wikipedia/commons/b/b1/190324_%EB%AF%B8%EB%82%98%EC%83%9D%EC%9D%BC%EA%B8%B0%EB%85%90.jpg",
        ),
        arrayOf(
            "Son Chaeyoung",
            "Son Chaeyoung (bahasa Korea: 손채영; lahir 23 April 1999), atau lebih dikenal sebagai Chaeyoung, adalah seorang penyanyi Korea Selatan. Ia merupakan anggota dari grup vokal wanita, Twice, yang dibentuk oleh JYP Entertainment melalui acara realitas tahun 2015, Sixteen.",
            "https://upload.wikimedia.org/wikipedia/commons/5/52/Chaeyoung_at_Gaon_Awards_red_carpet_on_January_23%2C_2019.jpg",
        ),
        arrayOf(
            "Kim Da-hyun",
            "Kim Da-hyun (김다현, lahir 28 Mei 1998) adalah seorang penyanyi asal Korea Selatan. Ia adalah anggota dari grup vokal wanita Twice, yang dibentuk oleh JYP Entertainment pada 2015 melalui acara realitas Sixteen.",
            "https://upload.wikimedia.org/wikipedia/commons/e/e2/Kim_Dahyun_at_the_KBS_Music_Bank_2019.png",
        ),
    )
    val listData: ArrayList<Member>
        get() {
            val list = arrayListOf<Member>()
            for (aData in data) {
                val member = Member()
                member.name = aData[0]
                member.from = aData[1]
                member.photo = aData[2]
                list.add(member)
            }

            return list
        }
}