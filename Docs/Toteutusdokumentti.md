#Toteutusdokumentti

##Ohjelman yleisrakenne##

Ohjelma on jaettu neljään luokkaan;
* Peli-luokka, joka hoitaa pelin pyörimisen ja tekstikäyttöliittymän. Luokka hoitaa myös tiedonvälittämisen tekoälylle, esim mitä pelaaja pelasi viimeksi, voittiko pelaaja edellisen kierroksen jne.
* Pelimekaniikat-luokka, jossa on käytännössä vain metodeita jotka hoitavat erilaisia peliin liittyviä mekaniikkoja, kuten voittajan tarkistus.
* Tekoäly-luokka, joka hoitaa kokonaisuudessaan tekoälyn, eli mitä tekoäly valitsee, edellisten tulosten tallentaminen yms.
* App-luokka (main) jossa käynnistetään peli.


##Saavutetut vaativuudet##
Ohjelman luonteen vuoksi suurin osa metodeista on vakioaikaisia. Ainoat pari poikkeusta ovat:
* Tekoäly-luokan metodi taytaArray(), jonka aikavaativuus on O(n²), koska looppaamme kahta for-looppia sisäkkäin.
* Tekoäly-luokan metodi taulukkoValinta(). Tässä metodissa for-loopataan int array, joten periaatteessa metodin aikavaativuus on O(n).
Kuitenkin molemmissa metodeissa on ohjelmaa käyttäessä n=3, joten metodit ovat käytännössä vakioaikaisia.

Lisäksi Peli-luokan kaynnista()-metodin while loop pyörii koko ohjelman suorituksen ajan, joten tällöin metodin aikavaativuus on O(∞), koska ohjelma saattaa pyöriä loputtomasti riippuen käyttäjän syötteistä.

##Työn mahdolliset puutteet ja parannusehdotukset##
Tekoälyn toimintaa voisi parannella esimerkiksi etsimällä käyttäjän syötteistä tiettyjä toistuvia kuvioita, esimerkiksi jos käyttäjä pelaisi "kivi-kivi-paperi-sakset-paperi" kuviota.

##Lähteet##
Luin ihmisten yleisistä alitajuntaisista valinnoista seuraavalta sivulta: 
http://www.telegraph.co.uk/men/thinking-man/11051704/How-to-always-win-at-rock-paper-scissors.html