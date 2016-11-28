package ivan.com.example.usuario.demoproyecto01.storage;

import java.util.ArrayList;
import java.util.List;

import ivan.com.example.usuario.demoproyecto01.R;
import ivan.com.example.usuario.demoproyecto01.model.PlatoEntity;

public class PlatoSierraRepository {

    public List<PlatoEntity> platoCajamarcaList;
    public List<PlatoEntity> platoHuanucoList;
    public List<PlatoEntity> platoPascoList;
    public List<PlatoEntity> platoJuninList;
    public List<PlatoEntity> platoHuancavelicaList;
    public List<PlatoEntity> platoAyacuchoList;
    public List<PlatoEntity> platoList;

    public PlatoSierraRepository() {

<<<<<<< HEAD
        platoList = new ArrayList<>();
=======
>>>>>>> 0944554e40ad5eaec55754c826ade1814889eabb
        mock();
    }

    public void mock(){

        platosCajamarca();
        platosHuanuco();
        platosPasco();
        platosJunin();
        platosHuancavelica();
        platosAyacucho();
    }

    private void platosCajamarca(){

        platoCajamarcaList = new ArrayList<>();

        platoCajamarcaList.add(new PlatoEntity(61, "Chicharrón con mote", 4.0, "El chicharrón es una fritura de la piel del cerdo con o sin " +
                "grasa, en Perú debe ser crujiente y muy dorado. En las regiones andinas se ponde a dorar el cerdo en su propia grasa. En " +
                "Cajamarca se le condimenta sólo con pimienta y sal, para que coja su propio sabor natural de cerdo. Se sirve con papas sancochadas" +
                " y mote. Se come acompañado de chicha de jora o chicha morada.", R.drawable.chicharron_con_mote, "Cajamarca"));
        platoCajamarcaList.add(new PlatoEntity(62, "Caldo verde", 4.5, "El caldo verde o Yaku Chupe es una receta autóctona de Cajamarca. Este " +
                "platillo se prepara con quesillo, papas, huevos, paico, hierbabuena y perejil. Es una comida de origen andino con un sabor riquísimo. " +
                "Podría sevirlo junto a una porción de cancha o Kamcha serrana o maíz andino.", R.drawable.caldo_verde, "Cajamarca"));
        platoCajamarcaList.add(new PlatoEntity(63, "Sopa de chochoca", 3.0, "El nombre del plato deviene de la palabra Chuchoqa que significa " +
                "maíz cocido y secado de cuya harina se prepara la sopa de Chochoca. Es una sopa muy nutritiva que contiene carne de res, cecina, apio, poro, " +
                "papas y harina de maíz. Existen diversas presentaciones de esta sopa según la región, hay la sopa de chochoca verde que es la más característica y " +
                "representativa, en la cual la sopa lleva huevos y queso.", R.drawable.sopa_de_chochoca, "Cajamarca"));
        platoCajamarcaList.add(new PlatoEntity(64, "Humitas saladas y dulces", 5.0, "La humita es un plato elaborado en base de choclo original de la región andina, " +
                "actualmente se prepara cuando existe abundante cosecha de maíz. Hay muchas historias sobre su preparación, la más reconocida es del peruanista Juan de " +
                "Arona que relata que la palabra humita viene del quechua humint'a, pasta dulce hecha de harina de maíz aderezada con pasas, y que se suele vender, envuelta " +
                "en panca, o sea en hoja seca de maíz y que antiguamente en la época virreinal pasaba el humitero dando pregones a las 2 de al tarde por las calles ofreciendo " +
                "sus sabrosas humitas. Esta entrada suele ser incluida entre los platos que integran una pachamanca o una huatía.", R.drawable.humitas, "Cajamarca"));
        platoCajamarcaList.add(new PlatoEntity(65, "Caldo de cabeza de carnero", 2.5, "En la sierra los caldos forman parte de su nutrición y son estimulantes de calor en " +
                "especial en las épocas de invierno o de helada. Al caldo de cabeza de carnero se le conoce como Uman Caldo, es un sancochado a base de cabeza de cordero. Es un " +
                "plato muy rico preparado en base a carne de oveja, es un animal que abunda en el altiplano, esta sopa forma parte de los platos que se elaboran para una Pachamanca. " +
                "Este plato también se considera un plato importante en la región de Ayacucho y Junín.", R.drawable.caldo_cabeza_cordero, "Cajamarca"));
        platoCajamarcaList.add(new PlatoEntity(66, "Manjar blanco", 2.0, "El manjar blanco es también conocido como dulce de leche, es un postre tradicional que está elaborado " +
                "a base de leche de vaca, canela, azúcar y chuño. Hay variantes de arroz, papa, pallares, lúcuma, chirimoya, chocolate, quinua, etc. En Latinoamérica existen diversos " +
                "tipos de manjar blanco, y cada uno tiene un sabor peculiar que los hace distinguirse entre ellos", R.drawable.manjar_blanco, "Cajamarca"));
    }

    private void platosHuanuco(){

        platoHuanucoList = new ArrayList<>();

        platoHuanucoList.add(new PlatoEntity(67, "Pachamanca", 5.0, "La Pachamanca o huatía es uno de los platillos clásicos de " +
                "Huánuco, se distingue de las otras regiones porque es aderezado con chincho, una hierba peculiar del lugar. La carne " +
                "más utilizada es el carnero y en segundo lugar el lechón tierno; acompañado de diversos tubérculos como papas, yucas." +
                " Además lleva humitas dulces, choclos, tamales y más productos. La Huatía es un agradecimiento a la madre tierra, por" +
                " ello se prepara bajo tierra; aprovechando el calor de las piedras grandes calientes, se cubre con hojas de plátano " +
                "y debe estar tapado herméticamente. Las carnes son asadas o sazonas con diversas especies, en especial salsa picante" +
                " o ají panca. El proceso dura alrededor de 45 minutos a una hora.", R.drawable.pachamanca, "Huanuco"));
        platoHuanucoList.add(new PlatoEntity(68, "Locro de gallina", 4.0, "El locro de gallina es una sopa caliente y deliciosa. Se sirve" +
                " con una presa sancochada; además lleva papas amarillas y blancas; asimismo, un aderezo lleno de sabor, a base de ají " +
                "panca, cebolla, perejil y especies. Es un platillo que representa la mezcla de dos culturas la hispánica y la inca; lo" +
                " más importante es propio de la región huanuqueña.", R.drawable.locro_gallina, "Huanuco"));
        platoHuanucoList.add(new PlatoEntity(69, "Juane de gallina", 3.5, "El juane de gallina es uno de los platos clásicos de gran " +
                "parte de la selva peruana; además es la comida típica de las fiestas de San Juan. Semejante a un tamal está preparado" +
                " a base de gallina, arroz, aceitunas, huevos; la cual se envuelto en una hoja de bijao. También hay juane de yuca con " +
                "paiche y se sirve con patacones y cecina.", R.drawable.juane_gallina, "Huanuco"));
        platoHuanucoList.add(new PlatoEntity(70, "Tacacho con cecina", 4.5, "El tacaco con cecina es un platillo sabroso, elaborado con " +
                "plátano verde asado, cocido o frito, y carne de cerdo seco y ahumado; casi siempre se acompaña con un trozo de cecina. " +
                "Se acompaña con plátano, chorizo, yucas y especies. En la mayoría de sitios el plátano se asa; sin embargo en Huánuco " +
                "se prepara en agua. Además el original se preparara con manteca de cerdo. Es un plato tradicional de la selva, en " +
                "especial de las regiones de San Martín, Madre de Dios, Ucayali y Amazonas. El tacacho forma parte de la comida navideña " +
                "en algunos departamentos. Se sirve con un buen vaso de aguaje.", R.drawable.tacacho_con_cecina, "Huanuco"));
        platoHuanucoList.add(new PlatoEntity(71, "Inchicapi", 5.0, "El Inchicapi es una sopa tradicional y típica de la selva peruana." +
                " Se prepara con gallina de corral o chacra, maní molido, yucas, maíz, choclo picado y otros productos más. Se sirve" +
                " con arroz y lleva hojas de sacha culantro. Es un platillo difícil de preparar, debes tener cierta pericia al elaborarlo, " +
                "al probarlo seguro repetirá el plato.", R.drawable.inchicapi, "Huanuco"));
        platoHuanucoList.add(new PlatoEntity(72, "La Patarashca", 3.0, "La Patarashca es un plato tradicional de la selva peruana y parte de " +
                "la sierra también. Al inicio se elabora el pescado se manera sencilla, se envuelve en una hoja de bijao y se prepara " +
                "a la parrilla o al horno. Se le agrega ajos, pimienta, cebolla, ají y otros productos más. Se acompaña con chicha de " +
                "jora o aguaje.", R.drawable.patarashca, "Huanuco"));
    }

    private void platosPasco(){

        platoPascoList = new ArrayList<>();

        platoPascoList.add(new PlatoEntity(73, "Picante de cuy", 3.0, "El cuy tiene una gran representación cultural en las regiones andinas" +
                " y de la selva peruana. Lleva una diversidad de ingredientes donde la base es el ají panca colorado (rojo), el choclo, " +
                "papas grandes y el cuy. La preparación depende de la región, en cada una se elebora de diferente manera. Se puede probar " +
                "en Ayacucho, Apurímac, Arequipa, Cusco, Huancavelica, Junín y otras más.", R.drawable.picante_de_cuy, "Pasco"));
        platoPascoList.add(new PlatoEntity(74, "Caldo de cabeza", 5.0, "El caldo de cabeza es una sopa clásica de la región. Lleva una " +
                "gran variedad de ingredientes como cabeza de carnero, papas amarillas, mote, ají mirasol, hierbabuena; además se acompaña " +
                "con cebolla china picada y rocoto. El patillo se elaborada de forma semejante en Ancash, como pecan caldo.",
                R.drawable.caldo_de_cabeza, "Pasco"));
        platoPascoList.add(new PlatoEntity(75, "Arvejas con carne", 3.5, "Es un guisado de carne con arvejas, el cual lleva una " +
                "diversidad de ingredientes como caldo de res, papas, carne, ají panca, cebolla picada, ajos, sal, pimienta y otros " +
                "ingredientes más. Es un clásico plato de Cerro de Pasco (capital de Pasco).", R.drawable.arverjas_con_carne, "Pasco"));
        platoPascoList.add(new PlatoEntity(76, "Charquicán", 4.5, "Charquicán es una plato representativo del lugar, ya que fue el " +
                "plato que degustaron los soldados del libertador San Martín. Se elabora a base de yuca, choclo, oca, mashua, olluco, " +
                "papas y maca; es un alimento muy nutritivo. Además lleva sal, pimienta, cebolla picadita, ají colorado, achiote, ajo y " +
                "otros ingredientes más. Existe el vegetariano, de charqui o carne de res. Se sirve calientito, es una especialidad de " +
                "Cerro de Pasco.", R.drawable.charquican, "Pasco"));
        platoPascoList.add(new PlatoEntity(77, "Caldo verde", 4.0, "El caldo verde se prepara en parte de la selva o sierra peruana; " +
                "sin embargo es propio de la ciudad de Cajamarca; sin quitarle el crédito a las regiones que elaboran el platillo a su" +
                " propio estilo. Tiene como base quesillo, papas, huevos, paico, hierbabuena y perejil. Además se acompaña con cancha" +
                " serrana.", R.drawable.caldo_verde, "Pasco"));
        platoPascoList.add(new PlatoEntity(78, "Pachamanca", 2.0, "En la mayoría de las regiones del Perú se prepara una buena pachamanca." +
                " Es un plato prehispánico que viene de siglos atrás; el cual se prepara en un horno de tierra, se cava un hoyo y se " +
                "colocan piedras que serán calentadas a grandes temperaturas, a base de leña. También se agregan diversos ingredientes " +
                "como papas, yucas, ollucos, ocas, choclos. Por último se entierra el horno para que todos los productos se cuezan. La " +
                "utilización de la técnica, todavía se conserva en algunos pueblos andinos o de ceja de selva.",
                R.drawable.pachamanca, "Pasco"));
    }

    private void platosJunin(){

        platoJuninList = new ArrayList<>();

        platoJuninList.add(new PlatoEntity(79, "Trucha frita", 4.5, "Es uno de los platos más representativos de la zona, debido a la " +
                "gran cantidad de truchas que existe en la región y por su riquísimo sabor. Es un plato de fácil acceso y se consigo " +
                "comúnmente a la parrilla o frita en cualquier restaurante de Junín y en el mismo Huancayo. La trucha tiene un gran " +
                "poder alimenticio y su carne goza de un gran potencial en nutrientes, entre ellos fósforo y potasio. Es fácil de " +
                "elaborar y se sirve acompañado de papas sancochadas, ensalada o salsa criolla.", R.drawable.trucha_frita, "Junin"));
        platoJuninList.add(new PlatoEntity(80, "Papa a la huancaína", 5.0, "La papa a la huancaína es el clásico plato de la ciudad de " +
                "Huancayo, en Junín. Aunque este plato no se creó en Huancayo. El nombre y los ingredientes en gran parte son de esta " +
                "ciudad. Por ello, es preparado de manera frecuente por sus pobladores. Hay varias versiones sobre sus orígenes. Es " +
                "considerado uno de los platos fundamentales del Perú por su gran difusión, sencillez y sabor exquisito. Muchos viajeros " +
                "disfrutan de este platillo y es el clásica entrada típica del país en las reuniones familiares.",
                R.drawable.papa_huancaina, "Junin"));
        platoJuninList.add(new PlatoEntity(81, "Cordero al palo", 4.5, "Este platillo es el cordero entero cocinado sobre brasas. Es " +
                "propiamente de Tarma y Junín, es originaria de la región ayacuchana. Prepara las brasas para asar el cordero. Espera " +
                "a que estén al rojo vivo para empezar. Sujeta el cordero de las horquetas de un palo y lo colocas aproximadamente un " +
                "metro de distancia del calor. Pon mayor cantidad de brasas en los extremos para que la carne se cocine lentamente y no" +
                " se prenda. Embadurna el cordero con una marinada de pimienta, vinagre, ajo, ají panca molido y sal. Haga cortes en los" +
                " lugares más carnosos para que se absorba el líquido, voltee cada cierto tiempo caundo sea necesario. La cocción demora" +
                " de 3 a 4 horas en la forma tradicional. La mejor preparación se encuentra en la provincia de Concepción y en la selva " +
                "central del departamento Junín.", R.drawable.carnero_al_palo, "Junin"));
        platoJuninList.add(new PlatoEntity(82, "Huallpa chupe", 2.5, "Huallpa es gallina, Chupe es caldo o consomé gallina en jugo. " +
                "El aderezo lleva ají amarillo y ajo. Se ponen las presas de gallina y poca agua, se añaden las papas, el arroz aparte," +
                " servir con abundante perejil. Es un caldo de gallina propio de Junín llamado huallpa Chupe. Este potaje lleva como " +
                "aderezo ají amarillo y ajo. Se ponen presas de gallina con poca agua, se añaden las papas, el arroz aparte y se sirve" +
                " con perejil cuando todo esta bien cocido. Este caldo es reconocido por ser nutritivo y sabroso. Cuando esté en Junín" +
                " olvide probar este plato, muy similar a ser un chupe de gallina aderezado con ají mirasol, que le da ese saborcito " +
                "picante.", R.drawable.huallpa_chupe, "Junin"));
        platoJuninList.add(new PlatoEntity(83, "Patachi", 4.0, "Este plato es muy nutritivo y conocido por la ciudad de Huancayo y parte" +
                " de Junín. En una olla de barro se ponen a cocer trigo, arvejas, habas, maíz molido, tocino ahumado, carne de res, " +
                "charqui es carne seca de llama o alpaca (opcional), piel de cerdo, patitas y menudencia, se deja a fuego lento " +
                "durante varias horas, con sal al gusto. Al servir se agrega hierba buena, cebolla, ají o rocoto como en la mayoría" +
                " de caldos. ", R.drawable.patachi, "Junin"));
        platoJuninList.add(new PlatoEntity(84, "Patasca", 4.5, "La Patasca o sopa de mote es el plato típico de Huancayo. Es un plato" +
                " sustancioso que debe su nombre a la palabra quechua phatasqa, significa reventado que se traduce en grano de maíz " +
                "reventado al cocer. Se cuece sobre la plataforma de un sustancioso caldo de cabeza de carnero, mondongo y maíz blanco, " +
                "mas conocido como mote. Cada departamento tiene ciertas particularidades al preparar el platillo, depende de las " +
                "diversas carnes o hierbas que se incluyan en la prepración. Una parte de la costa sur del Perú, Huancayo, Tarma, " +
                "Moquegua y Tacna y algunas provincias de la zona serrana del departamento de Lima, tienen en la Patasca a una de " +
                "las sopas más representativas de su región.", R.drawable.patasca, "Junin"));
    }

    private void platosHuancavelica(){

        platoHuancavelicaList = new ArrayList<>();
        platoHuancavelicaList.add(new PlatoEntity(85, "Sopa de mote", 3.5, "Es un platillo que se disfruta en las fiestas y celebraciones de la " +
                "región; para la gente del pueblo es conocido como levanta muertos. Contiene como base maíz pelado o mote, pecho de " +
                "res, cabeza, pecho y panza de carnero, patas de vaca. La cual hierve toda la noche antes de la fiesta. Al preparar " +
                "la sopa, debe ser aderezada con ají panca, cebolla colorada, ajo y pimienta. Se sirve con ají, rocoto, perejil y " +
                "otros aderezos.", R.drawable.sopa_de_mote, "Huancavelica"));
        platoHuancavelicaList.add(new PlatoEntity(86, "Tiqi", 5.0, "plato típico de las zonas cálidas de Huancavelica, preparado " +
                "con abundante quesillo, papas sancochadas picadas, leche, mezclado con yerbas aromáticas de la zona y ají. Pero " +
                "además tienen otros ricos potajes preparados con carne de alpaca considerada en el mundo como una de las carnes " +
                "con menos grasa y colesterol.", R.drawable.tiqi, "Huancavelica"));
        platoHuancavelicaList.add(new PlatoEntity(87, "Carnero al palo", 3.0, "Es un platillo que nace de la fusión española y andina. " +
                "El carnero al palo es preparado con un aderezo especial atravesado en un palo y después cocido al carbón. Usualmente " +
                "se unta con limón el pellejo del carnero, lo expone al sol, se echa ajos, ají panca, comino, sal, pimienta y chicha de " +
                "jora. Se acompaña con papas, habas, ocas y verduras. Además es un plato típico de la selva central.",
                R.drawable.carnero_al_palo, "Huancavelica"));
        platoHuancavelicaList.add(new PlatoEntity(88, "Puchero", 4.5, "El puchero o timpu (hervido)es un plato andino, elaborado con " +
                "charqui (carne seca de alpaca), res, carnero, menestras frescas, frejoles, chuño (papa deshidratada), choclos, zanahoria, " +
                "yuca, camotes y verduras. Se pone a hervir un pecho de res o cordero y el resto de ingredientes. Actualmente se prepara " +
                "de diversas maneras. Es un potaje popular de la sierra, lo puede disfrutar en la época de carnaval. Los platillos varían " +
                "según la región Arequipa, Cusco, Puno, Ayacucho y otras regiones.", R.drawable.puchero, "Huancavelica"));
        platoHuancavelicaList.add(new PlatoEntity(89, "Picante de cuy", 3.5, "Es un platillo sumamente nutritivo. El cuy debe estar " +
                "aderezado al punto con aceite, dientes de ajo, pimienta sal, ají panca molido y comino al gusto. Se le agrega papas, " +
                "huevo, aceituna, lechuga, cebollas, sal, comino, entre otros. Cada región tiene su estilo, sea en Cajamarca, Junín, " +
                "Cusco, Apurímac. Incluso se utiliza su aderezo con otras carnes, por ejemplo, con el pollo.",
                R.drawable.picante_de_cuy, "Huancavelica"));
        platoHuancavelicaList.add(new PlatoEntity(90, "Patachi", 4.0, "Es un plato preparado con variadas carnes (res, cerdo, cordero, " +
                "tocino). Además lleva trigo pelado, maíz molido, frijoles, habas, arvejas, chuño, papas y otros ingredientes más. " +
                "La preparación dura varias horas. ", R.drawable.patachi, "Huancavelica"));
    }

    private void platosAyacucho(){

        platoAyacuchoList = new ArrayList<>();
        platoAyacuchoList.add(new PlatoEntity(91, "Puca Picante", 4.0, "Es un platillo originario de la región ayacuchana, a base " +
                "de chicharrón de patitas de chancho o cordero muy picante, de allí deviene su nombre. Puca es una palabra quechua " +
                "que significa rojo, precisamente por el ají y el color de la comida. Es un plato delicioso, colorido, algo condimentado, " +
                "el cual muchas ciudades de la sierra peruana preparan a su estilo regional.", R.drawable.puca_picante, "Ayacucho"));
        platoAyacuchoList.add(new PlatoEntity(92, "Qapchi", 5.0, "Es un platillo que tiene como ingrediente básico el requesón o " +
                "quesillo andino desmenuzado; asimismo lleva ají rocoto, cebolla china (opcional), huacatay, y leche. Su acompañante " +
                "obligado es la papa, la cual puede ser cualquier variedad del tubérculo; por si se encuentra fuera del país y lo " +
                "desea preparar. Es un delicioso acompañante para algunos platos regionales sureños como el rocoto relleno y muchos " +
                "más. Es una entrada muy consumida en la región ayacuchana.", R.drawable.qapchi, "Ayacucho"));
        platoAyacuchoList.add(new PlatoEntity(93, "Adobo ayacuchano", 4.5, "Es un plato de la sierra sur del Perú. Se elabora a base " +
                "de chancho. Es un platillo fuerte que utiliza ingredientes diversos como ají panca, sal, orégano, pimienta, carne de " +
                "chancho, chicha de jora , ají panca colorado, cebolla y habitualmente se sirve con camote (también se le conoce como " +
                "papa dulce) y arroz. Es un plato lleno de sabor  y se acompaña con  chicha morada . Es propio de Ayacucho y se prepara " +
                "otra versión en la región de Arequipa.", R.drawable.adobo_ayacuchano, "Ayacucho"));
        platoAyacuchoList.add(new PlatoEntity(94, "Picante de quinua", 3.5, "Uno de los platos más nutritivos de la región ayacuchana. " +
                "Es una comida a base de quinua , carne de cerdo, ajo molido, leche evaporada, queso fresco, culantro y otros ingredientes " +
                "más. Es un plato propio de las regiones del sur peruano. ", R.drawable.picante_de_quinua, "Ayacucho"));
        platoAyacuchoList.add(new PlatoEntity(95, "Humitas", 3.0, "Es una de las entradas emblemáticas del Perú . Es un platillo preparado " +
                "una base de choclo o maíz andino. La palabra humita procede de la palabra quechua huminta que significa pasta dulce " +
                "hecha de harina de maíz aderezada con pasas, la cual se envuelve en una panca u hoja seca de maíz y se amarra " +
                "completamente. Este plato  se sirve usualmente en la Pachamancas o huatías o en las Fiestas Patronales o regionales " +
                "de la sierra peruana; en especial en Cajamarca, Junín, Arequipa y otras más.", R.drawable.humitas, "Ayacucho"));
        platoAyacuchoList.add(new PlatoEntity(96, "Patasca", 4.0, "Patasca, sopa de mondongo o sopa de mote según rubro la región. " +
                "Es un platillo sustancioso que viene de la palabra quechua phatasqa , significa reventado que se traduce en grano " +
                "de maíz reventado al cocer. Se prepara sobre la base de un caldo de carne de carnero o vaca (según los gustos), " +
                "cada lugar tiene su forma de elaborarlo. Se prepara en la costa sur peruana, Junín , Huancavelica , Apurímac, Moquegua, " +
                "en algunas provincias limeñas y otras más . En época de frío se consume mucho porque es nutritiva, reconfortante y " +
                "poderosa.", R.drawable.patasca, "Ayacucho"));
    }

    public List<PlatoEntity> getPlatoCajamarcaList() {
        return platoCajamarcaList;
    }
    public List<PlatoEntity> getPlatoHuanucoList() { return platoHuanucoList; }
    public List<PlatoEntity> getPlatoPascoList() {return platoPascoList; }
    public List<PlatoEntity> getPlatoJuninList() { return platoJuninList; }
<<<<<<< HEAD
    public List<PlatoEntity> getPlatoHuancavelicaList() {return platoHuancavelicaList; }
    public List<PlatoEntity> getPlatoAyacuchoList() { return platoAyacuchoList; }

    public void updatePlatoSierraById(int platoId, PlatoEntity platoEntity)
    {
        int position=-1;
        PlatoEntity plato;

        switch (platoEntity.getProvincia()) {

            case "Cajamarca":
                platoList = platoCajamarcaList;
                break;
            case "Huanuco":
                platoList = platoHuanucoList;
                break;
            case "Pasco":
                platoList = platoPascoList;
                break;
            case "Junin":
                platoList = platoJuninList;
                break;
            case "Huancavelica":
                platoList = platoHuancavelicaList;
                break;
            case "Ayacucho":
                platoList = platoAyacuchoList;
                break;
        }
        for (int i = 0; i <this.platoList.size() ; i++) {
            plato= platoList.get(i);
            if(plato.getId()==platoId)
=======

    public void updatePlatoCajamarcaById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoCajamarcaList.size() ; i++) {
            note= platoCajamarcaList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoCajamarcaList.size())
        {
            this.platoCajamarcaList.set(position, plato);
        }
    }

    public void updatePlatoHuanucoById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoHuanucoList.size() ; i++) {
            note= platoHuanucoList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoHuanucoList.size())
        {
            this.platoHuanucoList.set(position, plato);
        }
    }

    public void updatePlatoPascoById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoPascoList.size() ; i++) {
            note= platoPascoList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoPascoList.size())
        {
            this.platoPascoList.set(position, plato);
        }
    }

    public void updatePlatoJuninById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoJuninList.size() ; i++) {
            note= platoJuninList.get(i);
            if(note.getId()==platoId)
>>>>>>> 0944554e40ad5eaec55754c826ade1814889eabb
            {
                position=i;
                break;
            }
        }
<<<<<<< HEAD
        if(position>=0 && position< platoList.size())
        {
            this.platoList.set(position, platoEntity);
=======
        if(position>=0 && position< platoJuninList.size())
        {
            this.platoJuninList.set(position, plato);
>>>>>>> 0944554e40ad5eaec55754c826ade1814889eabb
        }
    }
}
