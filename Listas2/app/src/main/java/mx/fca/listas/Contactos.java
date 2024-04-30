package mx.fca.listas;

public class Contactos {

    public static Contacto [] all = {
            new Contacto(
                    1,
                    "Cristian Cardoso",
                    "(55) 5535279883",
                    "me",
                    R.mipmap.kenia,
                    "cris52@comunidad.unam.mx",
                    "",
                    "Av revolucion SN, CDMX, Mexico"),
            new Contacto(
                    2,
                    "La bebesita",
                    "(55) 5535279884",
                    "her",
                    R.mipmap.kenia,
                    "beiby@bebe.mx",
                    "",
                    "Tepito, CDMX, Mexico"),
            new Contacto(
                    3,
                    "Claudia Shein",
                    "(55) 55352798080",
                    "delegada",
                    R.mipmap.kenia,
                    "vota@moreina.mx",
                    "",
                    "Reforma, Col. Centro, CDMX, Mexico"),
            new Contacto(
                    4,
                    "Kenia OS",
                    "",
                    "la mejor",
                    R.mipmap.kenia,
                    "kenia@kenia.os",
                    "contacto@kenia.os",
                    "Reforma, Col. Centro, CDMX, Mexico")
    };

    public static Contacto getContacto(long id) {
        for(int i = 0; i < Contactos.all.length - 1; i++) {
            if (Contactos.all[i].id == id){
                return Contactos.all[i];
            }
        }
        return null;
    }
}
