#Testausdokumentti

##Yksikkötestaus##
**Testaan pelin logiikkaa yksikkötesteillä:**
* Käyttäjän syötteen oikeellisuuden testaaminen.
* Voittaja osataan valita oikein.
* Käyttäjän syöte muunnetaan luvuksi oikein.
* Tekoälyn randomValinta() metodi arpoo oikein, eli väliltä 0-2.
* Edellisten syötteiden tallentaminen ja käyttäminen toimii halutulla tavalla.
* Metodi, joka täyttää taulukon, jota käytetään syötteiden tallentamiseen, täyttää taulukon oikein.

Koska ohjelman luokkia ja metodeita on hankala testata yksikkötesteillä (esim tulostusta), testaan melkein kaikkea manuaalisesti.

##Manuaalinen testaus##
**Testaan manuaalisesti, että:**
* Kaikki tulostuu oikein tekstikäyttöliittymään.
* Voitot, häviöt ja tasapelit tallentuu oikein.
* Tekoäly valitsee haluamallani tavalla, eli esim. ensimmäisenä valitaan aina paperi, koska ihmiset yleisimmin valitsevat kiven. 

Olen testannut suurinta osaa metodeistani debug tulosteilla, esimerkiksi tekoälyn valitessa omaa valintaansa, olen tulostellut valintoja nähdäkseni, että ohjelma toimii haluamallani tavalla.
