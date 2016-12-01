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
    public List<PlatoEntity> platoAncashList;
    public List<PlatoEntity> platoLimaList;
    public List<PlatoEntity> platoIcaList;
    public List<PlatoEntity> platoArequipaList;
    public List<PlatoEntity> platoMoqueguaList;
    public List<PlatoEntity> platoTacnaList;
    public List<PlatoEntity> platoList;

    public PlatoCostaRepository(){

        platoList = new ArrayList<>();
        mock();
    }

    public void mock(){

        platosTumbes();
        platosPiura();
        platosLambayeque();
        platosLaLibertad();
        platosAncash();
        platosLima();
        platosIca();
        platosArequipa();
        platosMoquegua();
        platosTacna();
    }

    private void platosTumbes(){

        platoTumbesList = new ArrayList<>();

        platoTumbesList.add(new PlatoEntity(1, "Ceviche de conchas negras", 3.5 , "El ceviche de conchas negras es sin lugar a dudas " +
                "una de las entradas más exquistas de la gastronomía peruana . Según la tradición peruana es unos de los platillos " +
                "afrodisíacos por excelencia. El platillo es preparado a base de conchas negras, limón, ajíes amarillos, ají limo, " +
                "rocoto y cebollasSe sirve acompañado de rodajas de camote, choclo desgranado, cancha serrana, chifles y una chicha morada.",
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

    private void platosAncash(){

        platoAncashList = new ArrayList<>();

        platoAncashList.add(new PlatoEntity(25, "Kuchi Kanka", 5.0, "El kuchi kanka o Cuchi Canca (cerdo asado), lleva diversos " +
                "ingredientes como vinagre, ajos, ají mirasol, pimienta, comino y otros más al gusto. Se debe adobar previamente " +
                "para que tome el gusto y se deja de un día para otro antes de ponerlo al horno.). El lechón se prepara en una " +
                "asadera y se pone en el horno a temperatura moderada. Se sirve acompañado de papas doradas  o arroz blanco. ",
                R.drawable.kuchi_kanka, "Ancash"));
        platoAncashList.add(new PlatoEntity(26, "Pecan caldo", 4.0, "Pecan Caldo o caldo de cabeza, es un plato típico de la " +
                "región ancashina. Es un caldo madrugador que se toma muy tempranito, alrededor de las seis de la mañana. Para " +
                "prepararlo se hace hervir la cabeza de cordero, mondongo, ajo, cebolla roja, culantro, hierba buena, ají molido; " +
                "también se le puede agregar mote de maíz o trigo, limón,  u otros ingredientes. Es un plato reparador, un \"levanta " +
                "muerto\" como solemos llamar a los platillos energéticos.", R.drawable.pecan_caldo, "Ancash"));
        platoAncashList.add(new PlatoEntity(27, "Patasca", 3.0, "La patasca es uno de los platillos del altiplano, más nutritivos " +
                "y ricos del Perú. En la actualidad lo puedes encontrar en cualquier parte del país, se le conoce también como sopa " +
                "de mote.  Lleva diversos ingredientes como maíz pelado,  carne de carnero o vaca, mote (maíz hervido), hierba buena, " +
                "ají, cebolla y otros ingredientes más.", R.drawable.patasca, "Ancash"));
        platoAncashList.add(new PlatoEntity(28, "Aca Cashqui", 5.0, "El caldo de cuy o Aca Cashqui es un plato típico de Carhuaz " +
                "en Ancash. Se sirve para festejar a la Virgen de las Mercedes desde setiembre hasta octubre. Además se sirve en " +
                "épocas de mucho frío, sirve para reconstituir las energías, por su alto poder nutricional. y regenerativo. El " +
                "caldo se prepara con cuy macho, papas amarillas, cebolla, zapallo, poro, zanahoria, nabo, muña, ajos molidos y " +
                "fideos. El cuy debe haber sido alimentado con alfalfa.", R.drawable.aca_cashqui, "Ancash"));
        platoAncashList.add(new PlatoEntity(29, "Chicha en caldo", 4.5, "Chicha en Caldo es un plato propio de la región ancashina, " +
                "sea en el distrito de Conchucos y su modo especial de preparación o el platillo del distrito de Huallanca. Además " +
                "es el plato bandera de la provincia de Pomabamba donde se preparan la chicha en caldo. Es un plato a base de gallina " +
                "de corral, chicha de jora, chancaca, cebolla china, maní tostado, orégano, ají mirasol, ají panca, aceituna, azúcar y " +
                "especies.", R.drawable.chicha_en_caldo, "Ancash"));
        platoAncashList.add(new PlatoEntity(30, "Llunca Cashqui", 2.5, "Llunca Cashqui es una sopa típica de Huaraz, en Ancash. Es " +
                "elaborada a base de trigo, gallina de corral, cebolla china picada, ají panca, apio, zanahoria, perejil, orégano " +
                "tostado, papa Yungay, aceite de oliva y otros ingredientes más. Se prepara, de preferencia, en una olla de barro. " +
                "Es un plato suculento que se acostumbraba servir en los entierros para agradecer a las personas que llegaban a " +
                "despedir al difunto, considerado por algunos huaracinos como un plato ritual en muchos aspectos. En la actualidad " +
                "lo han reinventado en algunos restaurantes de la región. ", R.drawable.llunca_cashqui, "Ancash"));
    }

    private void platosLima(){

        platoLimaList = new ArrayList<>();

        platoLimaList.add(new PlatoEntity(31, "Cebiche", 4.0, "Sin dudas ni murmuraciones el rey de la cocina peruana. " +
                "Su antecedente más antiguo es la costumbre que los indígenas de la costa norte del Perú tenían de comer " +
                "pescado crudo. En ocasiones, ese pescado era macerado con el jugo del tumbo, una fruta de clima tropical. " +
                "Junto con los españoles llegó el limón. Y el cítrico jugo de este fruto sustituyó al de tumbo. La preparación " +
                "básica consiste en filete de pescado fresco cortado en trozos y cocido en limón. En ella se suma el ají limo y " +
                "astillas de cebolla. Y por supuesto, la diestra mano del cocinero peruano. La guarnición que la acompaña es según " +
                "el lugar y la región. Puede ser un camote sancochado, una papa sancochada, un choclo y cancha (maíz tostado).",
                R.drawable.cebiche_lima, "Lima"));
        platoLimaList.add(new PlatoEntity(32, "Carapulcra", 4.5, "Es el platillo mestizo más antiguo de que se tenga noticia. " +
                "En realidad, es un potaje indígena que se prepara con la papa seca sancochada y guisada con carnes de chancho y " +
                "gallina, ají panca y mirasol, ajos y otras especias. Naturalmente, estos últimos ingredientes los sumó el conquistador " +
                "español. Pero el esclavo negro decidió incluir el maní, originario de América, lo que le dio una contundencia inimitable. ",
                R.drawable.carapulcra, "Lima"));
        platoLimaList.add(new PlatoEntity(33, "Tamal", 3.0, "Tiene diversas variantes en algunos países de América. En el Perú, " +
                "la base de su preparación la hallaron los nativos que descubrieron maravillados el aceite vegetal y la manteca de " +
                "chancho. Ambos elementos se lo agregaron a la masa de maíz. Y en el centro colocaron trocitos de chancho o gallina " +
                "(en la actualidad se le ha sustituido por el pollo), con ají mirasol y una aceituna. Esta masa se envuelve en hojas " +
                "de achira. Y una vez que están bien amarraditas, al agua hirviendo.", R.drawable.tamal_lima, "Lima"));
        platoLimaList.add(new PlatoEntity(34, "Choros a la chalaca", 2.5, "Es de una preparación muy sencilla. Son los conocidos " +
                "mejillones, a los cuales se le saca de su caparazón y luego se le vuelve a colocar sobre una de las partes y se le " +
                "rosea cebollita con una pizca de ají y sazonados con jugo de limón.", R.drawable.choros_chalaca, "Lima"));
        platoLimaList.add(new PlatoEntity(35, "La Butifarra", 5.0, "Si en los Estados Unidos nació la hamburguesa, y en Inglaterra " +
                "el sándwich, en el Perú nació la butifarra. Se prepara con el denominado pan francés, se le coloca al centro unas " +
                "buenas lonjas de jamón del país, lechuga fresca y salsa criolla, que se prepara con las astillas de la cebolla, limón " +
                "y perejil.", R.drawable.butifarra, "Lima"));
        platoLimaList.add(new PlatoEntity(36, "Causa rellena", 4.5, "Pasta de papa amarilla sazonada con ají molido, rellena con atún. " +
                "También se le puede rellenar con pollo. Y en algunos restaurantes del primer nivel la presentan con pulpa de cangrejo. " +
                "Hablar de la Causa Rellena es hablar de uno de los platos más tradicionales de la cocina peruana. Cuenta la historia " +
                "que este plato ya se consumía en la época precolombina. En esos tiempos era una masa preparada a base de papa amarilla " +
                "mezclada con ají amarillo.", R.drawable.causa_rellena, "Lima"));
    }

    private void platosIca(){

        platoIcaList = new ArrayList<>();

        platoIcaList.add(new PlatoEntity(37, "Sopa seca", 3.5, "Es una comida típica de la provincia de Chincha. Es un plato está " +
                "elaborado a base de tallarines y gallina en trozos. aderezado con achiote, perejil, albahaca y diversas especies.  " +
                "La preparación lleva ají colorado, ajos, cebolla, perejil, albahaca, zanahoria, aceitunas. Asimismo puedes agregarle " +
                "vino en la preparación. Usualmente acompaña a la carapulcra; la combinación es reconocida por muchos, como mancha " +
                "pecho.", R.drawable.sopa_seca, "Ica"));
        platoIcaList.add(new PlatoEntity(38, "Carapulcra", 4.5, "La carapulcra es uno de los clásicos platos peruanos.  Es un plato" +
                " andino a base de papa seca sancochada y guisada. Además lleva carne de cerdo, gallina, ají panca y mirasol, ajos " +
                "y maní molido. Se suele servir junto a la sopa seca.  Lo puede acompañar con un vino o una chicha helada. ",
                R.drawable.carapulcra, "Ica"));
        platoIcaList.add(new PlatoEntity(39, "Picante de pallares", 5.0, "La sabrosa morusa se prepara a base de puré de papa " +
                "o yuca con asado de res o cerdo. Casi siempre se acompaña de un delicioso guiso, picante de pallares; el cual " +
                "lleva leche, huevo y queso fresco. En Ica, los pallares forman parte imprescindible de la comida iqueña, " +
                "asimismo los pallares de grano largo; los cuales son cocidos en un aderezo con ají amarillo molido y se " +
                "acompaña con arroz blanco o salsa criolla. Además hay combinaciones a base de pallares y garbanzos.",
                R.drawable.morusa_de_pallares, "Ica"));
        platoIcaList.add(new PlatoEntity(40, "Coctel de camarones", 4.0, "Es una receta marina tradicional, se prepara con un kilo " +
                "de colitas de camarón o langostinos (peladas), cocidas en agua con sal. Además lleva mayonesa, palta, huevo, " +
                "kétchup y lechuga.  Se adereza las colitas con sal y pimienta. Es realmente delicioso y para muchos es una " +
                "entrada afrodisiaca.", R.drawable.coctel_de_camarones, "Ica"));
        platoIcaList.add(new PlatoEntity(41, "Chicha en caldo", 4.5, "Chicha en Caldo es un plato propio de la región ancashina, " +
                "sea en el distrito de Conchucos y su modo especial de preparación o el platillo del distrito de Huallanca. Además " +
                "es el plato bandera de la provincia de Pomabamba donde se preparan la chicha en caldo. Es un plato a base de gallina " +
                "de corral, chicha de jora, chancaca, cebolla china, maní tostado, orégano, ají mirasol, ají panca, aceituna, azúcar y " +
                "especies.", R.drawable.chicha_en_caldo, "Ica"));
        platoIcaList.add(new PlatoEntity(42, "Llunca Cashqui", 2.5, "Llunca Cashqui es una sopa típica de Huaraz, en Ancash. Es " +
                "elaborada a base de trigo, gallina de corral, cebolla china picada, ají panca, apio, zanahoria, perejil, orégano " +
                "tostado, papa Yungay, aceite de oliva y otros ingredientes más. Se prepara, de preferencia, en una olla de barro. " +
                "Es un plato suculento que se acostumbraba servir en los entierros para agradecer a las personas que llegaban a " +
                "despedir al difunto, considerado por algunos huaracinos como un plato ritual en muchos aspectos. En la actualidad " +
                "lo han reinventado en algunos restaurantes de la región. ", R.drawable.llunca_cashqui, "Ica"));
    }

    private void platosArequipa(){

        platoArequipaList = new ArrayList<>();

        platoArequipaList.add(new PlatoEntity(43, "Ocopa", 5.0, "La ocopa arequipeña es el plato más reconocido de Arequipa en el Perú " +
                "y en el extranjero. Se prepara a base de una rama de huacatay, ají mirasol, ají amarillo, maní, galletas de vainilla " +
                "o pan, leche evaporada, queso fresco, ajo y condimentos. En los pueblos muelen los ingredientes utilizando un batán, " +
                "en la mayoría de restaurantes utilizan una licuadora. Se sirve acompañado de papas sancochadas, un huevo duro y una " +
                "aceituna. En su preparación es muy parecido a la papa a la huancaína. Se acompaña con una chicha morada. ",
                R.drawable.ocopa, "Arequipa"));
        platoArequipaList.add(new PlatoEntity(44, "Rocoto Relleno", 4.0, "El rocoto relleno es un plato originario de Arequipa y es una de " +
                "las comidas fundamentales del Perú. Está elaborado a base de rocoto, carne picada, cebolla roja picada, ají panca colorado " +
                "molido, maní tostado o molido, huevos, queso, leche y otros ingredientes más. En la mayoría de restaurantes arequipeños " +
                "se sirve acompañado de papa horneada y a veces con puré de papas. Se recomienda que el ají panca sea molido con batán. ",
                R.drawable.rocoto_relleno, "Arequipa"));
        platoArequipaList.add(new PlatoEntity(45, "Cauchi", 5.0, "El cauchi es una comida típica arequipeña, propia de la gastronomía de " +
                "la región. Tiene una variedad de platillos, entre los cuales está el Cauchi de queso y el cauche de camarones. Ambos " +
                "llevan como base queso fresco serrano, ají amarillo, ají panca molido, huacatay, ajo, cebolla rojas, habas y leche. " +
                "En algunas recetas arequipeñas le echan tomates en el aderezo. Casi siempre se acompaña de papas hervidas peladas en " +
                "rodajas.", R.drawable.cauchi, "Arequipa"));
        platoArequipaList.add(new PlatoEntity(46, "Chaque de tripas", 5.0, "Es uno de los platos tradicionales de Arequipa, se consume " +
                "habitualmente los lunes. Es una sopa elaborada con tripas, carne de cordero, papas, chuño, zapallo, zanahoria, ají " +
                "colorado panca, habas, cebolla roja picada, choclos, trigo, ajo, hierbabuena, papas, tomates, col, orégano y " +
                "condimentos. Hay variaciones según la región.", R.drawable.chaque_tripas, "Arequipa"));
        platoArequipaList.add(new PlatoEntity(47, "Solterito arequipeño", 3.0, "Es un plato colorido, sabroso y aromático. Se " +
                "prepara a base de habas, choclos, cebolla picada, rocoto picado, queso fresco, aceitunas picadas, tomate a " +
                "cuadritos. Las habas debe cocerlas, se añade los otros ingredientes y todo se mezcla con vinagre, una cuchara " +
                "de perejil picado, sal y pimienta al gusto. Se puede acompañar de una lechuga si lo desea. Es una excelente " +
                "entrada. ", R.drawable.solterito, "Arequipa"));
        platoArequipaList.add(new PlatoEntity(48, "Chupe de camarones", 2.5, "El chupe de camarones es una sopa criolla originaria de " +
                "Arequipa. Es un plato muy nutritivo, potente, sustancioso y delicioso. Está preparado con camarones de río de la costa " +
                "del sur del Perú. La preparación lleva diversos ingredientes camarones grandes, cebollas, tomates, ají panca, habas, " +
                "arvejas, papas, choclos, leche evaporada, ajo, cebolla picada, huevos e ingredientes según el lugar. Se sirve " +
                "acompañado de una salsa de rocoto o con pedazos de pan frito.", R.drawable.chupe_camarones, "Arequipa"));
    }

    private void platosMoquegua(){

        platoMoqueguaList = new ArrayList<>();

        platoMoqueguaList.add(new PlatoEntity(49, "Cuy frito", 4.0, "El cuy forma parte de la cultura y los rituales andinos; por eso " +
                "forma parte de la alimentación  y comida peruana. En Moquegua hay dos platillos que sobresalen a base de cuy: el " +
                "picante y frito. El cuy es sumamente nutritivo y rico en proteínas. El cuy frito o chactado, es un plato realmente sabroso, " +
                "para prepararlo debes apanarlo con maíz molido y después freírlo en una plancha de fierro. Se acompañada con papas sancochadas, " +
                "ensalada y cancha.", R.drawable.cuy_frito, "Moquegua"));
        platoMoqueguaList.add(new PlatoEntity(50, "Chicharron de chancho", 4.5, "El chicharrón de chancho o cerdo es una comida típica " +
                "del sur peruano, es fácil de preparar y no necesita mucho tiempo de cocción. Se elabora a base de trozos de cerdo, se " +
                "sirve con camote, papas sancochadas y mote; además puedes agregarle salsa criolla y lechuga.  Es un plato muy sabroso. ",
                R.drawable.chicharron_de_chancho, "Moquegua"));
        platoMoqueguaList.add(new PlatoEntity(51, "La Cacharrada", 3.0, "Es un plato que se prepara solamente en Moquegua. La cacharrada " +
                "está elaborado a base de variadas carnes y papas cocidas, las cuales se elaboran bajo tierra. El plato lleva siete " +
                "carnes distintas, tales como vísceras de res; entre ellas está el chinchuli, anchura, criadilla, venas, hígado, " +
                "mollejas y corazón. Se fríen y se sazonan con pimienta y comino; se sirve caliente.", R.drawable.cacharrada, "Moquegua"));
        platoMoqueguaList.add(new PlatoEntity(52, "Parihuela", 3.0, "La Parihuela forma parte de la costa moqueguana, es una sopa que viene desde " +
                "la época prehispánica. Se elabora a base de ají colorado, tomate, cebolla, ají panca, rocoto, ajo, especies y diversos " +
                "mariscos como conchas, langostinos, choros, caracol, almejas, limón y chilcano (es un caldo a base de pescado).",
                R.drawable.parihuela, "Moquegua"));
        platoMoqueguaList.add(new PlatoEntity(53, "Ceviche mixto", 2.5, "El ceviche es uno de los platos fundamentales del país y se " +
                "prepara a lo largo de la costa peruana. Es considerado Patrimonio Cultural de la Nación. Es una comida que viene " +
                "desde la época precolombina, es una mixtura de sabores. Hay gran variedad de ceviches y mariscos. Se prepara a base " +
                "de pescado o mariscos, los cuales se aderezan con zumo de  limón, rocoto, cebolla, papa, camote, choclo y lechuga. " +
                "Se acompaña con cancha serrana. Para tomar pide una chicha morada heladita.", R.drawable.ceviche_mixto, "Moquegua"));
        platoMoqueguaList.add(new PlatoEntity(54, "Moqueguano de camarón", 5.0, "El moqueguano de camarón o chupe de camarones de " +
                "Moquegua, es un plato clásico de la mayoría de regiones de la costa peruana. Es un platillo a base camarones, los " +
                "cuales se extraen del río Moquegua o río Tambo en Omate. ", R.drawable.moqueguano_camaron, "Moquegua"));
    }

    private void platosTacna(){

        platoTacnaList = new ArrayList<>();

        platoTacnaList.add(new PlatoEntity(55, "Picante a la tacnena", 2.5, "Es el plato bandera de la comida tacneña. Para elaborar " +
                "el picante a la tacneña, hay que tener en cuenta los productos autóctonos de la región. Lleva ingredientes tal " +
                "como, charqui, patas de carnero, mondongo, pata de res, ají panca, papas, orégano, ajo, cebolla y otros más. Es una comida " +
                "mus sustanciosa y se sirve acompañado de pan marraqueta o con arroz. Se acostumbra acompañar con el vino de chacra de Tacna. ",
                R.drawable.picante_a_la_tacnena, "Tacna"));
        platoTacnaList.add(new PlatoEntity(56, "Cazuela de gallina", 5.0, "Es un plato típico, sencillo y sabroso, en especial para " +
                "el invierno. Se puede preparar con diversos tipos de carne, no obstante en la región se prepara con gallina criolla. " +
                "Lleva zapallo, choclo, arvejas, zanahorias, papas, ajo, sal, perejil (opcional), apio y arroz. Se sanchocha el ave en agua y " +
                "sal, se agrega parte de los ingredientes y se deja cocer por unos cinco minutos y se agrega el resto. Se sirve con perjil si " +
                "lo desea. ", R.drawable.cazuela_de_ave, "Tacna"));
        platoTacnaList.add(new PlatoEntity(57, "Chicharrón de chancho", 4.5, "Es un plato muy rico y jugoso. Consiste en trozos de carne de chacho o puerco " +
                "con piel que se cocina con su misma grasa y agua, se prepara sólo con sal. Se sirve con camotes fritos o papas sancochadas y cancha serrana y " +
                "salsa criolla. Para preparar la salsa criolla, se debe cortar la cebolla roja en juliana, se macera con sal, pimienta, " +
                "rocoto picado muy fino y limón. ", R.drawable.chicharron_de_chancho, "Tacna"));
        platoTacnaList.add(new PlatoEntity(58, "Cordero a la parrilla", 3.0, "Es un platillo nutritivo, delicioso y lleno de sabor. Lleva cordero, choclo, " +
                "lechuga, tomates, ajos molidos, ají panca molido, vino o vinagre, sal y romero. Se troza el cordero en varias partes y " +
                "se aliñan con todos los ingredientes por varias horas. Se pone a la parrilla, se asa durante una hora. Luego se va " +
                "esparciendo aceite cada cierto tiempo, hasta que se encuentre completamente asado. Se sirve con choclos, papas " +
                "sancochadas, arroz (opcional) y salsa criolla. Si deseas puedes acompañar el plato con una tradicional chicha morada " +
                "heladita. ", R.drawable.cordero_a_la_parrilla, "Tacna"));
        platoTacnaList.add(new PlatoEntity(59, "Choclo con queso", 4.0, "Uno de los platos más sencillos y ricos. Se prepara con choclos tiernos y de grano " +
                "blando. Luego los pones a hervir en una olla con agua, agregas anís al gusto, azúcar morena (al gusto) una pizca de limón. Cuando está cocido " +
                "lo sirves con queso paria o queso fresco andino y lo acompañas de salsa criolla y lechuga.", R.drawable.choclo_con_queso, "Tacna"));
        platoTacnaList.add(new PlatoEntity(60, "Chupe de camarones", 2.5, "El chupe de camarones es una sopa criolla originaria de " +
                "Arequipa. Es un plato muy nutritivo, potente, sustancioso y delicioso. Está preparado con camarones de río de la costa " +
                "del sur del Perú. La preparación lleva diversos ingredientes camarones grandes, cebollas, tomates, ají panca, habas, " +
                "arvejas, papas, choclos, leche evaporada, ajo, cebolla picada, huevos e ingredientes según el lugar. Se sirve " +
                "acompañado de una salsa de rocoto o con pedazos de pan frito.", R.drawable.chupe_camarones, "Tacna"));
    }

    public List<PlatoEntity> getPlatoTumbesList() {
        return platoTumbesList;
    }
    public List<PlatoEntity> getPlatoPiuraList() { return platoPiuraList; }
    public List<PlatoEntity> getPlatoLambayequeList() {return platoLambayequeList; }
    public List<PlatoEntity> getPlatoLaLibertadList() { return platoLaLibertadList; }
    public List<PlatoEntity> getPlatoAncashList() { return platoAncashList; }
    public List<PlatoEntity> getPlatoLimaList() { return platoLimaList; }
    public List<PlatoEntity> getPlatoIcaList() { return platoIcaList; }
    public List<PlatoEntity> getPlatoArequipaList() { return platoArequipaList; }
    public List<PlatoEntity> getPlatoMoqueguaList() { return platoMoqueguaList; }
    public List<PlatoEntity> getPlatoTacnaList() { return platoTacnaList; }

    public void updatePlatoCostaById(int platoId, PlatoEntity platoEntity) {
        int position = -1;
        PlatoEntity plato;

        switch (platoEntity.getProvincia()) {

            case "Tumbes":
                platoList = platoTumbesList;
                break;
            case "Piura":
                platoList = platoPiuraList;
                break;
            case "Lambayeque":
                platoList = platoLambayequeList;
                break;
            case "La Libertad":
                platoList = platoLaLibertadList;
                break;
            case "Ancash":
                platoList = platoAncashList;
                break;
            case "Lima":
                platoList = platoLimaList;
                break;
            case "Ica":
                platoList = platoIcaList;
                break;
            case "Arequipa":
                platoList = platoArequipaList;
                break;
            case "Moquegua":
                platoList = platoMoqueguaList;
                break;
            case "Tacna":
                platoList = platoTacnaList;
                break;
        }
        for (int i = 0; i < this.platoList.size(); i++) {
            plato = platoList.get(i);
            if (plato.getId() == platoId) {
                position = i;
                break;
            }
        }
        if (position >= 0 && position < platoList.size()) {
            this.platoList.set(position, platoEntity);
        }
    }
}
