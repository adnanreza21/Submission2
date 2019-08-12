package com.amazing.submission2;

import java.util.ArrayList;

public class MoviesData {

    public static String[][] data = new String[][]{
            {"Aquaman",
                    "Film ini mengungkap asal-usul Arthur Curry, manusia perkasa yang bisa mengendalikan air dan hewan laut. Dari mana ia mendapatkan kekuatannya? Siapa orang tuanya, dan pantaskah dia menjadi seorang raja di 7samudera?",
                    "80%",
                    "1h 57m",
                    "$1,143,689,193.00",
                    "https://adnanreza21.github.io/asset_submission_1/poster_aquaman.jpg",
                    "21 Desember 2018",
                    "Action"
            },
            {"Avenger Infinity War",
                    "The Avengers dan sekutu mereka harus bersedia mengorbankan segalanya dalam upaya untuk mengalahkan Thanos yang kuat sebelum ia berhasil menghancurkan alam semesta.",
                    "78%",
                    "1h 52m",
                    "$2,046,239,637.00",
                    "https://adnanreza21.github.io/asset_submission_1/poster_avengerinfinity.jpg",
                    "25 April 2018",
                    "Action"
            },
            {"Bohemian Rhapsody",
                    "BOHEMIAN RHAPSODY adalah film yang diangkat dari kisah nyata untuk merayakan musik band Rock legendaris QUEEN dan tentunya vokalis mereka yang luar biasa, FREDDIE MERCURY, yang dikenal menentang tradisi dan stereotip hingga menjadi salah satu penghibur yang paling dicintai di planet ini.",
                    "66%",
                    "2h 14m",
                    "$835,137,710.00",
                    "https://adnanreza21.github.io/asset_submission_1/poster_bohemian.jpg",
                    "27 Oktober 2018",
                    "Biography"
            },
            {"Bumblebee",
                    "Dalam pelarian di tahun 1987, Bumblebee menemukan perlindungan di tempat rongsokan di sebuah kota kecil pinggir pantai California. Charlie, gadis yang tengah menyentuh usia 18 tahun dan sedang mencari jati diri, menemukan Bumblebee, yang banyak tergores dan rusak. Ketika berusaha memfungsikannya lagi, Charlie menyaksikan sendiri bahwa ini bukanlah mobil VW kodok berwarna kuning yang biasa.",
                    "68%",
                    "1h 56m",
                    "$275,450,417.00",
                    "https://adnanreza21.github.io/asset_submission_1/poster_bumblebee.jpg",
                    "19 Desember 2018",
                    "Action"
            },
            {"How to Train Your Dragon 3",
                    "Di film ketiganya ini akan berkisah tentang Hiccup (Jay Baruchel) yang berusaha memenuhi impiannya untuk menciptakan sebuah negeri impian bagi para Viking dan naga.",
                    "75%",
                    "2h 15m",
                    "$517,526,875.00",
                    "https://adnanreza21.github.io/asset_submission_1/poster_dragon.jpg",
                    "9 Januari 2019",
                    "Action"
            },
            {"Preman Pensiun",
                    "Preman Pensiun adalah film Indonesia tahun 2019 yang diadaptasi dari sebuah sinetron berjudul sama yang pernah tayang di stasiun televisi RCTI. Film ini disutradarai oleh Aris Nugraha yang juga sebagai penulis skenario dan diputar perdana pada 17 Januari 2019.",
                    "65%",
                    "2h 24m",
                    "$105,450,417.00",
                    "https://adnanreza21.github.io/asset_submission_1/poster_preman.jpg",
                    "17 Januari 2019",
                    "Action"
            },
            {"Robin Hood",
                    "Robin Hood (Taron Egerton) sebagai tentara salib kembali ke negerinya dalam keadaan yang berbeda. Ia menemukan pejabat korup dan menghabiskan uang kerajaan sementara rakyat dalam keadaan sengsara. Bersama Little John (Jamie Foxx) Ia melawan tirani Inggris yang sangat kuat.",
                    "63%",
                    "2h 29m",
                    "$75,050,287.00",
                    "https://adnanreza21.github.io/asset_submission_1/poster_robinhood.jpg",
                    "20 November 2018",
                    "Action"
            },
            {"The Girl",
                    "The Girl akan berkisah tentang seorang peretas komputer muda Lisbeth Salander (Claire Foy) dan jurnalis Mikael Blomkvist (Sverrir Gudnason) menemukan diri mereka terperangkap dalam jaringan mata-mata, penjahat dunia maya, dan pejabat pemerintah yang korup.",
                    "63%",
                    "2h 10m",
                    "$85,450,000.00",
                    "https://adnanreza21.github.io/asset_submission_1/poster_thegirl.jpg",
                    "10 November 2018",
                    "Action"
            },
            {"Venom",
                    "Seorang jurnalis, Eddie Brock (Tom Hardy) ingin melakukan sebuah investasi kasus terhadap penemuan yang dipimpin oleh Dr. Carlton Drake (Riz Ahmed). Karena investigasinya, Eddie mengunjungi lab milik Dr. Calrlton Drake. Semuanya ditujukan untuk membuktikan bahwa Dr. Carlton Drake sedang  melakukan tindakan jahat menggunakan Symbiote.",
                    "76%",
                    "1h 44m",
                    "$475,950,977.00",
                    "https://adnanreza21.github.io/asset_submission_1/poster_venom.jpg",
                    "3 Oktober 2018",
                    "Action"
            },
            {"Creed II",
                    "Creed II akan melanjutkan kisah Adonis Johnson di dalam serta di luar ring saat ia berhadapan dengan ketenaran, masalah keluarga dan misi yang terus berlanjut untuk menjadi juara sejati.",
                    "65%",
                    "2h 9m",
                    "$137,944,327.00",
                    "https://adnanreza21.github.io/asset_submission_1/poster_creed.jpg",
                    "28 November 2018",
                    "Action"
            }

    };

    public static ArrayList<Movies> getListData() {
        ArrayList<Movies> list = new ArrayList<>();
        for (String[] aData : data) {
            Movies movie = new Movies();
            movie.setTitle(aData[0]);
            movie.setOverview(aData[1]);
            movie.setUser_score(aData[2]);
            movie.setRuntime(aData[3]);
            movie.setRevenue(aData[4]);
            movie.setPhoto(aData[5]);
            movie.setYear_in(aData[6]);
            movie.setGenre(aData[7]);
            list.add(movie);
        }
        return list;
    }
}