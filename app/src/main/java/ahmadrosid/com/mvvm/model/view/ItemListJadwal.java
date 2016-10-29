package ahmadrosid.com.mvvm.model.view;

import android.databinding.BaseObservable;

import java.util.List;

import ahmadrosid.com.mvvm.BR;

/**
 * Created by ocittwo on 10/30/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class ItemListJadwal extends BaseObservable {
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
        notifyPropertyChanged(BR.listJadwal);
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
        notifyPropertyChanged(BR.listJadwal);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(BR.listJadwal);
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
        notifyPropertyChanged(BR.listJadwal);
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

        public JadwalBean(String bioskop, String harga, List<String> jam) {
            this.bioskop = bioskop;
            this.harga = harga;
            this.jam = jam;
        }

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
