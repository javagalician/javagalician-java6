/*
 * =============================================================================
 * 
 *   Copyright (c) 2009, The JAVAGALICIAN team (http://www.javagalician.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.javagalician.java6.util.spi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.spi.LocaleNameProvider;

import org.javagalician.java6.constants.Locales;

public final class GalicianLocaleNameProvider extends LocaleNameProvider {

    private static final Map<String,String> GALICIAN_DISPLAY_COUNTRIES = createGalicianDisplayCountries();
    private static final Map<String,String> GALICIAN_DISPLAY_LANGUAGES = createGalicianDisplayLanguages();

    
    public GalicianLocaleNameProvider() {
        super();
    }
    
    
    @Override
    public String getDisplayCountry(String countryCode, Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.GALICIAN.equals(locale)){
            return GALICIAN_DISPLAY_COUNTRIES.get(countryCode);
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(Locales.GALICIAN_ARRAY) + ")");
    }

    @Override
    public String getDisplayLanguage(String languageCode, Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.GALICIAN.equals(locale)){
            return GALICIAN_DISPLAY_LANGUAGES.get(languageCode);
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(Locales.GALICIAN_ARRAY) + ")");
    }

    @Override
    public String getDisplayVariant(String variant, Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (Locales.GALICIAN.equals(locale)){
            return variant; 
        }
        throw new IllegalArgumentException("Locale \"" + locale + "\" " +
                "is not one of the supported locales (" +  Arrays.asList(Locales.GALICIAN_ARRAY) + ")");
    }
    

    @Override
    public Locale[] getAvailableLocales() {
        return Locales.GALICIAN_ARRAY;
    }
    

    
    private static Map<String,String> createGalicianDisplayCountries() {
        final Map<String,String> displayCountries = new HashMap<String, String>();
        displayCountries.put("AD","Andorra");
        displayCountries.put("AE","Emiratos \u00C1rabes Unidos");
        displayCountries.put("AF","Afganist\u00E1n");
        displayCountries.put("AG","Antigua e Barbuda");
        displayCountries.put("AI","Anguila");
        displayCountries.put("AL","Albania");
        displayCountries.put("AM","Armenia");
        displayCountries.put("AN","Antillas Holandesas");
        displayCountries.put("AO","Angola");
        displayCountries.put("AQ","Ant\u00E1rtida");
        displayCountries.put("AR","Arxentina");
        displayCountries.put("AS","Samoa Americana");
        displayCountries.put("AT","Austria");
        displayCountries.put("AU","Australia");
        displayCountries.put("AW","Aruba");
        displayCountries.put("AX","Illas Aland");
        displayCountries.put("AZ","Azerbaiy\u00E1n");
        displayCountries.put("BA","Bosnia e Hercegovina");
        displayCountries.put("BB","Barbados");
        displayCountries.put("BD","Bangladesh");
        displayCountries.put("BE","B\u00E9lxica");
        displayCountries.put("BF","Burkina Faso");
        displayCountries.put("BG","Bulgaria");
        displayCountries.put("BH","Bahr\u00E1in");
        displayCountries.put("BI","Burundi");
        displayCountries.put("BJ","Ben\u00EDn");
        displayCountries.put("BM","Bermudas");
        displayCountries.put("BN","Brun\u00E9i");
        displayCountries.put("BO","Bolivia");
        displayCountries.put("BR","Brasil");
        displayCountries.put("BS","Bahamas");
        displayCountries.put("BT","But\u00E1n");
        displayCountries.put("BV","Illa Bouvet");
        displayCountries.put("BW","Botsuana");
        displayCountries.put("BY","Bielorrusia");
        displayCountries.put("BZ","Belice");
        displayCountries.put("CA","Canad\u00E1");
        displayCountries.put("CC","Illas Cocos");
        displayCountries.put("CD","Rep\u00FAblica Democr\u00E1tica do Congo");
        displayCountries.put("CF","Rep\u00FAblica Centroafricana");
        displayCountries.put("CG","Congo");
        displayCountries.put("CH","Suiza");
        displayCountries.put("CI","Costa de Marfil");
        displayCountries.put("CK","Illas Cook");
        displayCountries.put("CL","Chile");
        displayCountries.put("CM","Camer\u00FAn");
        displayCountries.put("CN","China");
        displayCountries.put("CO","Colombia");
        displayCountries.put("CR","Costa Rica");
        displayCountries.put("CS","Serbia e Montenegro");
        displayCountries.put("CU","Cuba");
        displayCountries.put("CV","Cabo Verde");
        displayCountries.put("CX","Isla Christmas");
        displayCountries.put("CY","Chipre");
        displayCountries.put("CZ","Chequia");
        displayCountries.put("DE","Alema\u00F1a");
        displayCountries.put("DJ","Yibuti");
        displayCountries.put("DK","Dinamarca");
        displayCountries.put("DM","Dominica");
        displayCountries.put("DO","Rep\u00FAblica Dominicana");
        displayCountries.put("DZ","Arxelia");
        displayCountries.put("EC","Ecuador");
        displayCountries.put("EE","Estonia");
        displayCountries.put("EG","Exipto");
        displayCountries.put("EH","Sahara Occidental");
        displayCountries.put("ER","Eritrea");
        displayCountries.put("ES","España");
        displayCountries.put("ET","Etiop\u00EDa");
        displayCountries.put("FI","Finlandia");
        displayCountries.put("FJ","Fiyi");
        displayCountries.put("FK","Illas Malvinas");
        displayCountries.put("FM","Micronesia");
        displayCountries.put("FO","Illas Feroe");
        displayCountries.put("FR","Francia");
        displayCountries.put("GA","Gab\u00F3n");
        displayCountries.put("GB","Reino Unido");
        displayCountries.put("GD","Granada");
        displayCountries.put("GE","Georgia");
        displayCountries.put("GF","Guayana Francesa");
        displayCountries.put("GH","Ghana");
        displayCountries.put("GI","Xibraltar");
        displayCountries.put("GL","Groenlandia");
        displayCountries.put("GM","Gambia");
        displayCountries.put("GN","Guinea");
        displayCountries.put("GP","Guadalupe");
        displayCountries.put("GQ","Guinea Ecuatorial");
        displayCountries.put("GR","Grecia");
        displayCountries.put("GS","Illas Georgia do Sur e Sandwich do Sur");
        displayCountries.put("GT","Guatemala");
        displayCountries.put("GU","Guam");
        displayCountries.put("GW","Guinea-Bissau");
        displayCountries.put("GY","Guyana");
        displayCountries.put("HK","Hong Kong");
        displayCountries.put("HM","Illas Heard e McDonald");
        displayCountries.put("HN","Honduras");
        displayCountries.put("HR","Croacia");
        displayCountries.put("HT","Hait\u00ED");
        displayCountries.put("HU","Hungr\u00EDa");
        displayCountries.put("ID","Indonesia");
        displayCountries.put("IE","Irlanda");
        displayCountries.put("IL","Israel");
        displayCountries.put("IN","India");
        displayCountries.put("IO","Territorio Brit\u00E1nico do Oc\u00E9ano \u00CDndico");
        displayCountries.put("IQ","Iraq");
        displayCountries.put("IR","Ir\u00E1n");
        displayCountries.put("IS","Islandia");
        displayCountries.put("IT","Italia");
        displayCountries.put("JM","Xamaica");
        displayCountries.put("JO","Xordania");
        displayCountries.put("JP","Xap\u00F3n");
        displayCountries.put("KE","Kenia");
        displayCountries.put("KG","Kirguizist\u00E1n");
        displayCountries.put("KH","Camboxa");
        displayCountries.put("KI","Kiribati");
        displayCountries.put("KM","Comores");
        displayCountries.put("KN","San Crist\u00F3bal e Nieves");
        displayCountries.put("KP","Corea do Norte");
        displayCountries.put("KR","Corea do Sur");
        displayCountries.put("KW","Kuwait");
        displayCountries.put("KY","Illas Caim\u00E1n");
        displayCountries.put("KZ","Kazajst\u00E1n");
        displayCountries.put("LA","Laos");
        displayCountries.put("LB","L\u00EDbano");
        displayCountries.put("LC","Santa Lucia");
        displayCountries.put("LI","Liechtenstein");
        displayCountries.put("LK","Sri Lanka");
        displayCountries.put("LR","Liberia");
        displayCountries.put("LS","Lesoto");
        displayCountries.put("LT","Lituania");
        displayCountries.put("LU","Luxemburgo");
        displayCountries.put("LV","Letonia");
        displayCountries.put("LY","Libia");
        displayCountries.put("MA","Marrocos");
        displayCountries.put("MC","M\u00F3naco");
        displayCountries.put("MD","Moldavia");
        displayCountries.put("ME","Montenegro");
        displayCountries.put("MG","Madagascar");
        displayCountries.put("MH","Illas Marshall");
        displayCountries.put("MK","Macedonia");
        displayCountries.put("ML","Mal\u00ED");
        displayCountries.put("MM","Myanmar");
        displayCountries.put("MN","Mongolia");
        displayCountries.put("MO","Macao");
        displayCountries.put("MP","Illas Marianas do Norte");
        displayCountries.put("MQ","Martinica");
        displayCountries.put("MR","Mauritania");
        displayCountries.put("MS","Montserrat");
        displayCountries.put("MT","Malta");
        displayCountries.put("MU","Mauricio");
        displayCountries.put("MV","Maldivas");
        displayCountries.put("MW","Malaui");
        displayCountries.put("MX","M\u00E9xico");
        displayCountries.put("MY","Malasia");
        displayCountries.put("MZ","Mozambique");
        displayCountries.put("NA","Namibia");
        displayCountries.put("NC","Nova Caledonia");
        displayCountries.put("NE","N\u00EDxer");
        displayCountries.put("NF","Illa Norfolk");
        displayCountries.put("NG","Nixeria");
        displayCountries.put("NI","Nicaragua");
        displayCountries.put("NL","Holanda");
        displayCountries.put("NO","Noruega");
        displayCountries.put("NP","Nepal");
        displayCountries.put("NR","Nauru");
        displayCountries.put("NU","Niue");
        displayCountries.put("NZ","Nova Zelanda");
        displayCountries.put("OM","Om\u00E1n");
        displayCountries.put("PA","Panam\u00E1");
        displayCountries.put("PE","Per\u00FA");
        displayCountries.put("PF","Polinesia Francesa");
        displayCountries.put("PG","Pap\u00FAa Nova Guinea");
        displayCountries.put("PH","Filipinas");
        displayCountries.put("PK","Paquist\u00E1n");
        displayCountries.put("PL","Polonia");
        displayCountries.put("PM","San Pedro e Miquel\u00F3n");
        displayCountries.put("PN","Illas Pitcairn");
        displayCountries.put("PR","Porto Rico");
        displayCountries.put("PS","Palestina");
        displayCountries.put("PT","Portugal");
        displayCountries.put("PW","Palaos");
        displayCountries.put("PY","Paraguai");
        displayCountries.put("QA","Qatar");
        displayCountries.put("RE","Reuni\u00F3n");
        displayCountries.put("RO","Roman\u00EDa");
        displayCountries.put("RS","Serbia");
        displayCountries.put("RU","Rusia");
        displayCountries.put("RW","Ruanda");
        displayCountries.put("SA","Arabia Saudita");
        displayCountries.put("SB","Illas Salom\u00F3n");
        displayCountries.put("SC","Seychelles");
        displayCountries.put("SD","Sud\u00E1n");
        displayCountries.put("SE","Suecia");
        displayCountries.put("SG","Singapur");
        displayCountries.put("SH","Santa Helena");
        displayCountries.put("SI","Eslovenia");
        displayCountries.put("SJ","Svalbard e Jan Mayen");
        displayCountries.put("SK","Eslovaquia");
        displayCountries.put("SL","Serra Leona");
        displayCountries.put("SM","San Marino");
        displayCountries.put("SN","Senegal");
        displayCountries.put("SO","Somalia");
        displayCountries.put("SR","Surinam");
        displayCountries.put("ST","Santo Tom\u00E9 e Pr\u00EDncipe");
        displayCountries.put("SV","O Salvador");
        displayCountries.put("SY","Siria");
        displayCountries.put("SZ","Suazilandia");
        displayCountries.put("TC","Illas Turcas e Caicos");
        displayCountries.put("TD","Chad");
        displayCountries.put("TF","Territorios Franceses do Sur");
        displayCountries.put("TG","Togo");
        displayCountries.put("TH","Tailandia");
        displayCountries.put("TJ","Tayikist\u00E1n");
        displayCountries.put("TK","Tokelau");
        displayCountries.put("TL","Timor Oriental");
        displayCountries.put("TM","Turkmenist\u00E1n");
        displayCountries.put("TN","Tunisia");
        displayCountries.put("TO","Tonga");
        displayCountries.put("TR","Turqu\u00EDa");
        displayCountries.put("TT","Trinidad e Tobago");
        displayCountries.put("TV","Tuvalu");
        displayCountries.put("TW","Taiw\u00E1n");
        displayCountries.put("TZ","Tanzania");
        displayCountries.put("UA","Ucra\u00EDna");
        displayCountries.put("UG","Uganda");
        displayCountries.put("UM","Illas menores alonxadas dos Estados Unidos");
        displayCountries.put("US","Estados Unidos");
        displayCountries.put("UY","Uruguai");
        displayCountries.put("UZ","Uzbekist\u00E1n");
        displayCountries.put("VA","Cidade do Vaticano");
        displayCountries.put("VC","San Vicente e as Granadinas");
        displayCountries.put("VE","Venezuela");
        displayCountries.put("VG","Illas V\u00EDrxes Brit\u00E1nicas");
        displayCountries.put("VI","Illas V\u00EDrxes Americanas");
        displayCountries.put("VN","Vietnam");
        displayCountries.put("VU","Vanuatu");
        displayCountries.put("WF","Wallis e Futuna");
        displayCountries.put("WS","Samoa");
        displayCountries.put("YE","Iemen");
        displayCountries.put("YT","Mayotte");
        displayCountries.put("ZA","Sud\u00E1frica");
        displayCountries.put("ZM","Zambia");
        displayCountries.put("ZW","Zimbabue");
        return displayCountries;
    }

    
    
    
    private static Map<String,String> createGalicianDisplayLanguages() {
        final Map<String,String> displayLanguages = new HashMap<String, String>();
        displayLanguages.put("aa","afarense");
        displayLanguages.put("ab","abxasio");
        displayLanguages.put("ae","av\u00E9stico");
        displayLanguages.put("af","afrikaans");
        displayLanguages.put("ak","akan");
        displayLanguages.put("am","am\u00E1rico");
        displayLanguages.put("an","aragon\u00E9s");
        displayLanguages.put("ar","\u00E1rabe");
        displayLanguages.put("as","asam\u00E9s");
        displayLanguages.put("av","avaro");
        displayLanguages.put("ay","aimara");
        displayLanguages.put("az","azerbaiyano");
        displayLanguages.put("ba","bashkiro");
        displayLanguages.put("be","bielorruso");
        displayLanguages.put("bg","b\u00FAlgaro");
        displayLanguages.put("bh","bihar\u00ED");
        displayLanguages.put("bi","bislama");
        displayLanguages.put("bm","bambara");
        displayLanguages.put("bn","bengal\u00E9s");
        displayLanguages.put("bo","tibetano");
        displayLanguages.put("br","bret\u00F3n");
        displayLanguages.put("bs","bosnio");
        displayLanguages.put("ca","catal\u00E1n");
        displayLanguages.put("ce","checheno");
        displayLanguages.put("ch","chamorro");
        displayLanguages.put("co","corso");
        displayLanguages.put("cr","cree");
        displayLanguages.put("cs","checo");
        displayLanguages.put("cu","glagol\u00EDtico");
        displayLanguages.put("cv","chuvash");
        displayLanguages.put("cy","gal\u00E9s");
        displayLanguages.put("da","dinamarqu\u00E9s");
        displayLanguages.put("de","alem\u00E1n");
        displayLanguages.put("dv","divehi");
        displayLanguages.put("dz","butan\u00E9s");
        displayLanguages.put("ee","ewe");
        displayLanguages.put("el","grego");
        displayLanguages.put("en","ingl\u00E9s");
        displayLanguages.put("eo","esperanto");
        displayLanguages.put("es","castel\u00E1n");
        displayLanguages.put("et","estonio");
        displayLanguages.put("eu","\u00E9uscaro");
        displayLanguages.put("fa","farsi");
        displayLanguages.put("ff","fulb\u00E9");
        displayLanguages.put("fi","fin\u00E9s");
        displayLanguages.put("fj","fijiano");
        displayLanguages.put("fo","faro\u00E9s");
        displayLanguages.put("fr","franc\u00E9s");
        displayLanguages.put("fy","frisio");
        displayLanguages.put("ga","irland\u00E9s");
        displayLanguages.put("gd","ga\u00E9lico escoc\u00E9s");
        displayLanguages.put("gl","galego");
        displayLanguages.put("gn","guaran\u00ED");
        displayLanguages.put("gu","gujarat\u00ED");
        displayLanguages.put("gv","manx");
        displayLanguages.put("ha","hausa");
        displayLanguages.put("he","hebreo");
        displayLanguages.put("hi","hind\u00FA");
        displayLanguages.put("ho","hiri motu");
        displayLanguages.put("hr","croata");
        displayLanguages.put("ht","haitiano");
        displayLanguages.put("hu","h\u00FAngaro");
        displayLanguages.put("hy","armenio");
        displayLanguages.put("hz","herero");
        displayLanguages.put("ia","interlingua");
        displayLanguages.put("id","indonesio");
        displayLanguages.put("ie","interlingua");
        displayLanguages.put("ig","ibo");
        displayLanguages.put("ii","yi de sichuan");
        displayLanguages.put("ik","inupiak");
        displayLanguages.put("in","indonesio");
        displayLanguages.put("io","ido");
        displayLanguages.put("is","island\u00E9s");
        displayLanguages.put("it","italiano");
        displayLanguages.put("iu","inuktitut");
        displayLanguages.put("iw","hebreo");
        displayLanguages.put("ja","xapon\u00E9s");
        displayLanguages.put("ji","y\u00EDdish");
        displayLanguages.put("jv","xavan\u00E9s");
        displayLanguages.put("ka","xeorxiano");
        displayLanguages.put("kg","kikongo");
        displayLanguages.put("ki","gikuyu");
        displayLanguages.put("kj","kwanyama");
        displayLanguages.put("kk","kazajio");
        displayLanguages.put("kl","groenland\u00E9s");
        displayLanguages.put("km","camboiano");
        displayLanguages.put("kn","kanada");
        displayLanguages.put("ko","coreano");
        displayLanguages.put("kr","kanuri");
        displayLanguages.put("ks","cachemir\u00ED");
        displayLanguages.put("ku","curdo");
        displayLanguages.put("kv","komi");
        displayLanguages.put("kw","c\u00F3rnico");
        displayLanguages.put("ky","kirgu\u00EDs");
        displayLanguages.put("la","lat\u00EDn");
        displayLanguages.put("lb","luxemburgu\u00E9s");
        displayLanguages.put("lg","ganda");
        displayLanguages.put("li","limburgu\u00E9s");
        displayLanguages.put("ln","lingala");
        displayLanguages.put("lo","laosiano");
        displayLanguages.put("lt","lituano");
        displayLanguages.put("lu","tshiluba");
        displayLanguages.put("lv","let\u00F3n");
        displayLanguages.put("mg","malgache");
        displayLanguages.put("mh","marshal\u00E9s");
        displayLanguages.put("mi","maor\u00ED");
        displayLanguages.put("mk","macedonio");
        displayLanguages.put("ml","malayalam");
        displayLanguages.put("mn","mongol");
        displayLanguages.put("mo","moldavo");
        displayLanguages.put("mr","m\u00E1rata");
        displayLanguages.put("ms","malayo");
        displayLanguages.put("mt","malt\u00E9s");
        displayLanguages.put("my","birmano");
        displayLanguages.put("na","nauruano");
        displayLanguages.put("nb","noruegu\u00E9s (bokm\u00E5l)");
        displayLanguages.put("nd","ndebele (norte)");
        displayLanguages.put("ne","nepal\u00ED");
        displayLanguages.put("ng","ndonga");
        displayLanguages.put("nl","holand\u00E9s");
        displayLanguages.put("nn","noruegu\u00E9s (nynorsk)");
        displayLanguages.put("no","noruegu\u00E9s");
        displayLanguages.put("nr","ndebele (sur)");
        displayLanguages.put("nv","navallo");
        displayLanguages.put("ny","nyanja");
        displayLanguages.put("oc","occitano");
        displayLanguages.put("oj","ojibwa");
        displayLanguages.put("om","oromo");
        displayLanguages.put("or","oriya");
        displayLanguages.put("os","osetio");
        displayLanguages.put("pa","punjab\u00ED");
        displayLanguages.put("pi","pali");
        displayLanguages.put("pl","polaco");
        displayLanguages.put("ps","pashto");
        displayLanguages.put("pt","portugu\u00E9s");
        displayLanguages.put("qu","quechua");
        displayLanguages.put("rm","retorromano ");
        displayLanguages.put("rn","rund\u00ED");
        displayLanguages.put("ro","roman\u00E9s");
        displayLanguages.put("ru","ruso");
        displayLanguages.put("rw","ruand\u00E9s");
        displayLanguages.put("sa","s\u00E1nscrito");
        displayLanguages.put("sc","sardo");
        displayLanguages.put("sd","sindino");
        displayLanguages.put("se","sami del norte");
        displayLanguages.put("sg","sango");
        displayLanguages.put("si","cingal\u00E9s");
        displayLanguages.put("sk","eslovaco");
        displayLanguages.put("sl","eslovenio");
        displayLanguages.put("sm","samoano");
        displayLanguages.put("sn","son\u00E9s");
        displayLanguages.put("so","somal\u00ED");
        displayLanguages.put("sq","alban\u00E9s");
        displayLanguages.put("sr","serbio");
        displayLanguages.put("ss","suaziland\u00E9s");
        displayLanguages.put("st","sesot\u00E9s");
        displayLanguages.put("su","sudan\u00E9s");
        displayLanguages.put("sv","sueco");
        displayLanguages.put("sw","suajili");
        displayLanguages.put("ta","tamil");
        displayLanguages.put("te","telugu");
        displayLanguages.put("tg","tajik");
        displayLanguages.put("th","tailand\u00E9s");
        displayLanguages.put("ti","tigriñes");
        displayLanguages.put("tk","turcomano");
        displayLanguages.put("tl","tagalo");
        displayLanguages.put("tn","sechuan\u00E9s");
        displayLanguages.put("to","tongu\u00E9s");
        displayLanguages.put("tr","turco");
        displayLanguages.put("ts","tsonga");
        displayLanguages.put("tt","t\u00E1rtaro");
        displayLanguages.put("tw","tui");
        displayLanguages.put("ty","taitiano");
        displayLanguages.put("ug","uighur");
        displayLanguages.put("uk","ucra\u00EDno");
        displayLanguages.put("ur","urdu");
        displayLanguages.put("uz","uzbeco");
        displayLanguages.put("ve","venda");
        displayLanguages.put("vi","vietnamita");
        displayLanguages.put("vo","volapuk");
        displayLanguages.put("wa","val\u00F3n");
        displayLanguages.put("wo","uolof");
        displayLanguages.put("xh","xhosa");
        displayLanguages.put("yi","y\u00EDdish");
        displayLanguages.put("yo","yoruba");
        displayLanguages.put("za","chuang");
        displayLanguages.put("zh","chin\u00E9s");
        displayLanguages.put("zu","zul\u00FA");
        return displayLanguages;
    }

}
