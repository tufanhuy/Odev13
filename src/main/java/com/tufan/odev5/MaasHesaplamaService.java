package com.tufan.odev5;

public class MaasHesaplamaService {

    public int maasHesapla(int gunSayisi) {
        int gunlukUcret = 2000;

        int prim = (gunSayisi > 25)
                ? (5 * 1000 + (gunSayisi - 25) * 3000)
                : (gunSayisi > 20)
                ? (gunSayisi - 20) * 1000
                : 0;

        return gunSayisi * gunlukUcret + prim;
    }
}
