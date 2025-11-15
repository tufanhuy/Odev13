package com.tufan.odev5;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MaasHesaplamaTest {

    @DataProvider(name = "maasVerileri")
    public Object[][] maasVerileri() {
        return new Object[][]{
                {10, 20000},
                {20, 40000},
                {21, 43000},
                {22, 46000},
                {25, 55000},
                {26, 60000},
                {30, 80000}
        };
    }

    @Test
    public void maas_25Gun_DogruHesaplaniyorMu() {
        MaasHesaplamaService service = new MaasHesaplamaService();
        int beklenen = 55000;
        int sonuc = service.maasHesapla(25);

        Assert.assertEquals(sonuc, beklenen);
    }

    @Test(dataProvider = "maasVerileri")
    public void maas_DataProviderIleTest(int gunSayisi, int beklenen) {
        MaasHesaplamaService service = new MaasHesaplamaService();
        int sonuc = service.maasHesapla(gunSayisi);

        Assert.assertEquals(sonuc, beklenen);
    }
}
