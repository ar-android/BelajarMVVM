package ahmadrosid.com.mvvm.model.api;

import java.util.List;

/**
 * Created by ocittwo on 10/30/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */
public class JadwalBioskop {

    private String status;
    private String kota;
    private String date;

    private List<DataBean> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String movie;
        private String poster;
        private String genre;
        private String duration;

        private List<JadwalBean> jadwal;

        public String getMovie() {
            return movie;
        }

        public void setMovie(String movie) {
            this.movie = movie;
        }

        public String getPoster() {
            return poster;
        }

        public void setPoster(String poster) {
            this.poster = poster;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public List<JadwalBean> getJadwal() {
            return jadwal;
        }

        public void setJadwal(List<JadwalBean> jadwal) {
            this.jadwal = jadwal;
        }

        public static class JadwalBean {
            private String bioskop;
            private String harga;
            private List<String> jam;

            public String getBioskop() {
                return bioskop;
            }

            public void setBioskop(String bioskop) {
                this.bioskop = bioskop;
            }

            public String getHarga() {
                return harga;
            }

            public void setHarga(String harga) {
                this.harga = harga;
            }

            public List<String> getJam() {
                return jam;
            }

            public void setJam(List<String> jam) {
                this.jam = jam;
            }
        }
    }
}
