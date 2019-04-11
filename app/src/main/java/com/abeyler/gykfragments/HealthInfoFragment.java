package com.abeyler.gykfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HealthInfoFragment extends Fragment {

    private TextView textInfo;
    private String info = "1) Doğru beslenin: Tam tahıllı ürünler, karbonhidrat, protein ve yağı dengeli tüketin. Sigara, alkol, şekerden uzak durun. Antioksidan alın. Antioksidanlar hücreye zarar veren maddeleri, serbest radikalleri yakalar ve yok eder. Soğan, sarımsak, ıspanak, dereotu, maydanoz, turunçgiller, domates, brokoli antioksidan açısından zengindir. Taze ve mevsiminde sebze meyve yiyin. \n" +
            "2) Yeterli ve kaliteli uyuyun: Kaliteli uyku sağlığımız için en az su içmek kadar önemlidir. İyi bir uykunun başlıca ölçüsünün kişinin sabah dinç uyanması ve kendisini gün içinde zinde hissetmesidir. Kalitesiz bir uyku verimi düşürür, konsantrasyonu bozar, bağışıklık sisteminin zayıflamasına neden olur.\n" +
            "3) Haftada en az 3 gün açık havada yürüyün: Yoğun trafik ve egzoz dumanından kurtulun ve yeşil alanlara yürüyüş yapın. Özellikle açık ve temiz havada zaman geçirilmesi sağlam bir vücut ve güçlü bir bağışıklık sistemi için oldukça yardımcıdır.\n" +
            "4) Hareketsiz kalmayın: Bilgisayar başında ve hareketsiz çok zaman geçirmeyin \n" +
            "5) Gereksiz ilaç kullanımından, özellikle gereksiz antibiyotik kullanımından kaçının.\n" +
            "6) Düzenli egzersiz yapın: Hastalıktan korunmada ve engellemede egzersizin çok büyük bir önemi var. Düzenli egzersiz bağışıklık sistemini kuvvetlendiriyor, virüslerle ve bakterilerle savaşmayı sağlıyor.\n" +
            "7) Kendinizi aşırı derecede yormayın: Dinlenmek için kendinize zaman tanıyın.\n" +
            "8) Stresten uzak durun ya da stresi yönetmeye çalışın:Stresliyken vücut stresi yok edebilmek için maddeler üretir ve dengesini şaşırır ve immün sistemde çöküş meydana gelir. Bu nedenle stres dönemlerinde hepimiz daha sık hasta oluruz. Mesela uçuk çıkar. \n" +
            "9) Sevdiklerimizle bol vakit geçirin, güçlü sosyal bağlar kurun \n" +
            "10) Pozitif düşünün, olumlu olmak insanı bedenen ve duygusal olarak rahatlatır.";
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_health_info, container, false);
        textInfo = view.findViewById(R.id.txtInfo);
        textInfo.setText(info);
        return view;
    }
}
