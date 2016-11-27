package ivan.com.example.usuario.demoproyecto01.storage;

import java.util.ArrayList;
import java.util.List;

import ivan.com.example.usuario.demoproyecto01.R;
import ivan.com.example.usuario.demoproyecto01.model.PlatoEntity;

public class PlatoCostaRepository {

    public List<PlatoEntity> platoTumbesList;
    public List<PlatoEntity> platoPiuraList;
    public List<PlatoEntity> platoLambayequeList;
    public List<PlatoEntity> platoLaLibertadList;

    public PlatoCostaRepository(){

        mock();
    }

    public void mock(){

        platosTumbes();
        platosPiura();
        platosLambayeque();
        platosLaLibertad();
    }

    private void platosTumbes(){

        platoTumbesList = new ArrayList<>();

        platoTumbesList.add(new PlatoEntity(1, "Ceviche de conchas negras", 3.5 , "El ceviche de conchas negras es sin lugar a dudas " +
                "una de las entradas más exquistas de la gastronomía peruana . Según la tradición peruana es unos de los platillos " +
                "afrodisíacos por excelencia. El platillo es preparado a base de conchas negras, limón, ajíes amarillos, ají limo, rocoto y cebollas. " +
                "Se sirve acompañado de rodajas de camote, choclo desgranado, cancha serrana, chifles y una chicha morada . ",
                R.drawable.cebiche_de_conchas_negras, "Tumbes"));
        platoTumbesList.add(new PlatoEntity(2, "Chilcano de pescado", 5.0 , "Es un caldo es un caldo muy representativo de la costa norte " +
                "peruana se consume en Tumbes y Piura, se prepara usualmente con la cabeza del pescado bonito, cochayuyo y bastante limón." +
                " No obstante, la elaboración de este plato ha ido cambiando al pasar los años.",
                R.drawable.chilcano_de_pescado, "Tumbes"));
        platoTumbesList.add(new PlatoEntity(3, "Majarisco tumbesino", 4.0 , "El majarisco tumbesino es una de las comidas que representa" +
                " al departamento de Tumbes. Es un plato delicioso que no te lo puedes perder si vienes a la región . Es un platillo" +
                " elaborado a base de plátano frito acompañado con una salsa de mariscos de la región norteña.",
                R.drawable.majarisco_de_tumbes, "Tumbes"));
        platoTumbesList.add(new PlatoEntity(4, "Arroz con mariscos", 2.5 , "Es un plato tradicional de la costa norte del Perú es muy popular en toda" +
                " la región, también en Ecuador, Panamá y Colombia. Junto al ceviche y la jalea, el arroz con mariscos es uno de los " +
                "platos marinos más populares en el Perú y la mayoría lo consumen en conjunto. Se elabora con diversos tipos de mariscos" +
                " tal como pulpo, conchas, calamares, langostinos, choros, almejas, camarones o caracol.",
                R.drawable.arroz_mariscos, "Tumbes"));
        platoTumbesList.add(new PlatoEntity(5, "Chicharrón de pescado ", 4.0 , "Uno de nuestros deliciosos platos está hecho a base de filete" +
                " de pescado congrio, el mismo que es cortado en trozos medianos y sazonado adecuadamente, enharinado y puesto a freír" +
                " en aceite vegetal, lo que le brinda esa consistencia crocante y ese color dorado tan provocativo; se sirve acompañado" +
                " de yucas doradas, mayonesa y crema de ají rocoto ligeramente picante, así mismo se adiciona una rodaja de limón para" +
                " aquellas personas que buscan ese toque ácido.",
                R.drawable.chicharron_de_pescado, "Tumbes"));
        platoTumbesList.add(new PlatoEntity(6, "Chupe de cangrejo", 3.0 , "El chupe de cangrejo es un clásico plato tumbesino. El cangrejo por " +
                "su alto contenido de fósforo, nos produce sueño, por eso mucha gente consume un buen chupe, considerado como " +
                "reconstituyente después de una mala noche.",
                R.drawable.chupe_de_camarones, "Tumbes"));
    }

    private void platosPiura(){

        platoPiuraList = new ArrayList<>();

        platoPiuraList.add(new PlatoEntity(7, "Cebiche de Mero", 4.0, "El ceviche piurano es uno de los platos más deliciosos de la " +
                "costa norte peruana.  Son preparados con productos frescos del lugar. Entre los cuales está el ceviche de mero, una " +
                "de las especialidades de la región. Al probarlo se te hará agua la boca, sentirás la mezcla del pescado fresco, " +
                "limones, ajíes limos, cebolla roja.", R.drawable.cebiche_de_mero, "Piura"));
        platoPiuraList.add(new PlatoEntity(8, "Seco de chavelo", 2.5, "Es un plato inmejorable, tradicional de Chulucanas; en el cual se " +
                "combinan tradiciones para producir un sabor delicioso. Consiste en plátano verde, carne seca o cecina, carne aliñada fresca, " +
                "cebolla, tomate, culantro, ají panca, yucas sancochadas y cancha. El plátano es un protagonista importante en el platillo. ",
                R.drawable.seco_de_chabelo, "Piura"));
        platoPiuraList.add(new PlatoEntity(9, "Cabrito a la norteña", 5.0, "El seco a la norteña o seco de cabrito, es típico de todo el norte" +
                " peruano. Además se prepara en otras regiones como Chiclayo en Lambayeque; Trujillo en La Libertad y en la costa de Tumbes. " +
                "Para la elaboración se necesita un cabrito de leche, ají panca, ají mirasol, cebollas, ajo, culantro, chicha de jora. Se sirve " +
                "acompañado de tamalitos verdes y yucas sancochadas.", R.drawable.cabrito_a_la_nortena, "Piura"));
        platoPiuraList.add(new PlatoEntity(10, "Sudado de mariscos", 4.5, "El sudado es un clásico de la región. Primero maceran los filetes de pescado " +
                "con sal, pimienta y chicha de jora,  para cocinarlos a fuego alto con olla cerrada por media hora. Además cortar las cebollas y el tomate en trozos grandes, " +
                "el ají en tiras. Se puede preparar a base de cachema o de mero, se acompañan con yucas sancochadas y salsa criolla. ",
                R.drawable.sudado_de_pescado_nortena, "Piura"));
        platoPiuraList.add(new PlatoEntity(11, "La Malarrabia", 4.0, "Es un plato tradicional de la cuaresma en Semana Santa y típico de Catacaos. Es elaborado a base " +
                "de plátanos maduros sancochados y machacados; para obtener una pasta, la cual se acompaña con queso. Se sirve con arroz, menestra o con sudado de mero. Es un plato " +
                "fuerte y contundente, no olvides servirlo junto a una chicha de jora.  ", R.drawable.malarrabia, "Piura"));
        platoPiuraList.add(new PlatoEntity(12, "Tamalitos verdes", 3.0, "Los tamalitos verdes forman parte de la tradicional comida piurana; sin embargo en la actualidad " +
                "se puede encontrar en diversas regiones costeñas e incluso andinas. Es una de nuestras entradas típicas y fundamentales del Perú. Es primordial que el maíz sea " +
                "tierno, se añade culantro (por lo cual adquiere el color característico).", R.drawable.tamalitos_verdes, "Piura"));
    }

    private void platosLambayeque(){

        platoLambayequeList = new ArrayList<>();

        platoLambayequeList.add(new PlatoEntity(13, "Ceviche de pato", 4.5, "Ceviche de pato es un plato jugoso y de sabor fuerte. Es un potaje" +
                " a base de limón. Debe marinarse mínimo por dos horas y después ponerlo a fuego lento. Es un plato que rompe las reglas del " +
                "ceviche común porque varía en su técnica de cocción. Al terminar de cocerse el pato presenta el mismo efecto que el ceviche de pescado. " +
                "Se sirve acompañado de yucas. Este platillo tiene proteína, fósforo y vitamina A.", R.drawable.cebiche_de_pato, "Lambayeque"));
        platoLambayequeList.add(new PlatoEntity(14, "Tortilla de raya", 4.0, "Es uno de los potajes más económicos y deliciosos de Lambayeque. " +
                "El pescado raya es secado y salado antes de su preparación. El plato consiste en hacer una tortilla con cebolla china, ají molido, harina " +
                "de trigo, algas marinas y la raya deshilachada. Se mezcla en una sartén a fuego lento y se sirve acompañado de choclo y " +
                "yuca sancochada.", R.drawable.tortilla_de_raya, "Lambayeque"));
        platoLambayequeList.add(new PlatoEntity(15, "Chiringuito", 3.0, "Es un plato representativo de la gastronomía lambayecana. El chingo o pez guitarra " +
                "seco y deshilachado se usa como base en este potaje. Se prepara con limón, sal, pimienta y cebolla. Se sirve acompañado de yucas, camotes, cancha. " +
                "Lo puedes acompañar con un vaso de chicha de jora o chicha morada.", R.drawable.chiringuito, "Lambayeque"));
        platoLambayequeList.add(new PlatoEntity(16, "Espesado", 5.0, "Es considerado un plato histórico por su preparación y contextura. El espesado lambayecano es parecido" +
                " a la sopa. Se prepara con choclo rallado, caldo de res o toyo de leche, choclo, frijoles verdes, ajo, ají, culantro y zapallo. Se sirve con arroz blanco. " +
                "Este plato tiene origen precolombino, los investigadores dicen que se remonta a la época del Señor de Sipán. Es un plato rico en " +
                "proteínas y vitaminas.", R.drawable.espesado_de_choclo, "Lambayeque"));
        platoLambayequeList.add(new PlatoEntity(17, "Arroz con pato", 2.5, "Arroz con pato o pato a la chiclayana, es originario del siglo XIX. Es considerado un plato " +
                "prehispánico proveniente de la cultura moche. Surge de la mezcla de la comida española y quechua. Se prepara haciendo una mezcla de aceite, sal, ajos, " +
                "cebolla picada, pimienta, hierbas, ají amarillo, sal y culantro. Es común añadir en la elaboración una taza de cerveza rubia o chicha de jora. La carne del" +
                " pato es rica en vitamina A y proteínas.", R.drawable.arroz_con_pato, "Lambayeque"));
        platoLambayequeList.add(new PlatoEntity(18, "Chirimpico", 4.5, "Es un guiso elaborado con menudencia de cabrito, preparado con cebollas, culantro molido, ají verde, " +
                "hierbabuena picada, ajo y chicha fuerte. Se sirve con yuca sancochada, rodajas de camote y choclo desgranado. Algunos restaurantes lo sirven con sangrecita. " +
                "Es un plato fuerte, se aconseja tomar una infusión al terminar el chirimpico.", R.drawable.chirimpico, "Lambayeque"));
    }

    private void platosLaLibertad(){

        platoLaLibertadList = new ArrayList<>();

        platoLaLibertadList.add(new PlatoEntity(19, "Shámbar", 3.5, "El Shámbar es una de las comidas más representativas de Trujillo, capital de la región de La Libertad. " +
                "Es una suculenta sopa de trigo elaborada a base de menestras y tiene origen andino. La preparación lleva garbanzos, alverjas, habas verdes, trigo morón, pellejo" +
                " de chancho, jamón ahumado, ají panca, ajo cebolla, culantro y gallina. El platillo se acompaña de maíz tostado \"cancha\" y en los restaurantes se sirve " +
                "tradicionalmente los lunes.",R.drawable.shambar , "La Libertad"));
        platoLaLibertadList.add(new PlatoEntity(20, "Sopa teóloga", 4.5, "La sopa teóloga es sabrosa y uno de los potajes más buscados para una noche fresca. Es un caldillo de " +
                "pava o gallina que se sirve acompañado de pan remojado, papa, leche, cebolla, ají amarillo, huacatay, gallina, leche, pan y queso.",R.drawable.sopa_teologa , "La Libertad"));
        platoLaLibertadList.add(new PlatoEntity(21, "Frito trujillano", 5.0, "Es un plato muy rico, propio de la ciudad trujillana. Se prepara a base de costillas de cerdo " +
                "o panceta, las cuales deben estar cocinadas u horneadas con ají panca, ají mirasol, ajo y chicha de jora. Se sirve con yucas y salsa criolla. La salsa " +
                "se elabora con una cebolla roja, rocoto picado y el jugo de limón.",R.drawable.frito_trujillano , "La Libertad"));
        platoLaLibertadList.add(new PlatoEntity(22, "Seco de cabrito a la norteña", 2.0, "El seco de cabrito es el plato clásico de la región moche. Es un guiso de cabrito tierno " +
                "macerado en chicha de jora y vinagre. Por lo general se incluyen frejoles aderezados con cebolla y yucas cocidas. Los frejoles son negros con se prepararan con ajonjolí " +
                "y ají mirasol.",R.drawable.cabrito_nortena , "La Libertad"));
        platoLaLibertadList.add(new PlatoEntity(23, "Pepián de pava", 4.0, "Es un plato típico del norte. Es un guiso que lleva ingredientes como ají panca, cebolla roja, ají amarillo y " +
                "otros más. Se sirve acompañado de arroz, yucas sancochadas y salsa de cebolla (opcional). Algunas personas lo presentan con culantro. Se sirve en " +
                "ocasiones especiales.",R.drawable.pepian_de_pava , "La Libertad"));
        platoLaLibertadList.add(new PlatoEntity(24, "Ceviche de conchas negras", 3.5, "El ceviche de Conchas Negras es nutritivo, delicioso y típico de los departamentos del norte. Se sirve " +
                "de diversas maneras dependiendo de la región sea Tumbes, Lambayeque, La Libertad o Piura. Es considerado un plato afrodisíaco. Se prepara a base de conchas negras, limón, " +
                "cebollas rojas picadas, rocoto y más. En la presentación se incluye choclo, camotes y maíz serrano (cancha). Se puede acompañar con una cerveza helada, una chicha" +
                " de jora o chicha morada.",R.drawable.ceviche_conchas_negras , "La Libertad"));
    }

    public List<PlatoEntity> getPlatoTumbesList() {
        return platoTumbesList;
    }
    public List<PlatoEntity> getPlatoPiuraList() { return platoPiuraList; }
    public List<PlatoEntity> getPlatoLambayequeList() {return platoLambayequeList; }
    public List<PlatoEntity> getPlatoLaLibertadList() { return platoLaLibertadList; }

    /*public void removePlatoTumbes(PlatoEntity plato)
    {
        this.platoTumbesList.remove(plato);
    }

    public void removePlatoTumbesById(int platoId)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoTumbesList.size() ; i++)
        {
            note = platoTumbesList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoTumbesList.size())
        {
            this.platoTumbesList.remove(position);
        }
    }*/

    public void updatePlatoTumbesById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoTumbesList.size() ; i++) {
            note= platoTumbesList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoTumbesList.size())
        {
            this.platoTumbesList.set(position, plato);
        }
    }

    public void updatePlatoPiuraById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoPiuraList.size() ; i++) {
            note= platoPiuraList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoPiuraList.size())
        {
            this.platoPiuraList.set(position, plato);
        }
    }

    public void updatePlatoLambayequeById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoLambayequeList.size() ; i++) {
            note= platoLambayequeList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoLambayequeList.size())
        {
            this.platoLambayequeList.set(position, plato);
        }
    }

    public void updatePlatoLaLibertadById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoLaLibertadList.size() ; i++) {
            note= platoLaLibertadList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoLaLibertadList.size())
        {
            this.platoLaLibertadList.set(position, plato);
        }
    }
}
