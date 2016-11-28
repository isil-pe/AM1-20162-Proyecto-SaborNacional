package ivan.com.example.usuario.demoproyecto01.storage;

import java.util.ArrayList;
import java.util.List;

import ivan.com.example.usuario.demoproyecto01.R;
import ivan.com.example.usuario.demoproyecto01.model.PlatoEntity;

public class PlatoSelvaRepository {

    public List<PlatoEntity> platoAmazonasList;
    public List<PlatoEntity> platoSanMartinList;
    public List<PlatoEntity> platoLoretoList;
    public List<PlatoEntity> platoUcayaliList;
    public List<PlatoEntity> platoMadreDiosList;
    public List<PlatoEntity> platoList;

    public PlatoSelvaRepository() {

<<<<<<< HEAD
        platoList = new ArrayList<>();
=======
>>>>>>> 0944554e40ad5eaec55754c826ade1814889eabb
        mock();
    }

    public void mock(){

        platosAmazonas();
        platosSanMartin();
        platosLoreto();
        platosUcayali();
        platosMadreDios();
    }

    private void platosAmazonas(){

        platoAmazonasList = new ArrayList<>();
        platoAmazonasList.add(new PlatoEntity(115, "Cazuela", 3.0, "Uno de los platillos clásicos de Chachapoyas en " +
                "Amazonas es la cazuela de gallina, res, carnero o pescado. La cual se prepara con leche, fideos " +
                "cabellos de ángel o arroz, camote, papas, choclo, zapallo, verduras, arvejas, vainitas, zanahorias, " +
                "orégano, perejil y ají verde. También se consume en Chile y Ecuador; sin embargo la preparación y " +
                "algunos ingredientes son distintos.", R.drawable.cazuela, "Amazonas"));
        platoAmazonasList.add(new PlatoEntity(116, "Carne arrollada", 4.5, "La carne arrollada tiene como base la " +
                "carne molida frita de res (sin grasa), huevos batidos, huevos duros, aceitunas, leche, pan, perejil, " +
                "ajo, jamón, zanahoria cocida, pimiento morrón  (cocido) y cebolla. Se pone la preparación dentro de la " +
                "carne (se ve similar a un pionono). Luego debe arrollarla y atarla. Después ponerla al horno. La " +
                "preparación varía según la región.", R.drawable.carne_arrollada, "Amazonas"));
        platoAmazonasList.add(new PlatoEntity(117, "Juanes de yuca", 3.5, "Los juanes de yuca hervida rallada se " +
                "elabora con gallina, cecina de res o paiche. Lleva yuca amarilla, pimiento verde, ajo, hojas de " +
                "plátano o bijao, ají mirasol, huevos, palillo y otros ingredientes más. Es uno de los platos " +
                "típicos de Semana Santa.", R.drawable.juane_de_yuca, "Amazonas"));
        platoAmazonasList.add(new PlatoEntity(118, "Tacachos con cecina", 5.0, "Es un plato tradicional de la " +
                "Amazonía peruana y de gran parte de la selva peruana. Se elabora a base de plátanos verdes, tocino, " +
                "jamón o cecina. Usualmente se asan los plátanos en la parrilla, se hace puré con ellos, se las da " +
                "forma de bolas, se rellenan con chicharrón o tocino. Los tacachos se sirven con un trozo de jamón o " +
                "cecina. En caso que no tenga parrilla puede usar la sartén. Es un plato fuerte en grasas. ",
                R.drawable.tacacho_con_cecina, "Amazonas"));
        platoAmazonasList.add(new PlatoEntity(119, "Ensalada de chonta", 3.0, "El palmito, chonta o jebato es un " +
                "producto alimentario obtenido del cogollo de varias especies de palmera, en particular del " +
                "cocotero (Cocos nucifera), la jusará (Euterpe edulis), el açai (Euterpe oleracea), el pijuayo " +
                "o pejibayo (Bactris gasipaes) y una variedad de moriche de la especie Mauritia minor, común y " +
                "nativa de la cuenca del Orinoco y de otras partes de la América del Sur.",
                R.drawable.ensalada_de_chonta, "Amazonas"));
        platoAmazonasList.add(new PlatoEntity(120, "Purtumute", 2.5, "Se prepara a base de frijoles y mote. Estos " +
                "se mezclan con un aderezo hecho de culantro o cilantro. Este rico plato es muy consumido en " +
                "Amazonas. Consiste en un guiso cuyo ingrediente base son los frijoles, tanto blancos como negros, " +
                "los cuales se condimentan con mote y cilantro. Algunas recetas añaden también maíz o incluso " +
                "piñones, aunque estos ingredientes son opcionales.", R.drawable.purtumute, "Amazonas"));
    }

    private void platosSanMartin(){

        platoSanMartinList = new ArrayList<>();
        platoSanMartinList.add(new PlatoEntity(121, "Juane", 5.0, "Es el plato más reconocido de la selva peruana, " +
                "el cual es muy popular en la fiesta de San Juan. Con el devenir del tiempo se come en cualquier " +
                "ocasión. El clásico juane suele elaborarse a base de arroz con especies, gallina o carne, aceituna, " +
                "huevo duro o cocido; todo debe estar envuelto en una hoja de bijao (se suaviza con antelación en agua) " +
                "y se debe poner a cocer durante hora y media. Existen muchas formas de juane; se cambian algunos " +
                "ingredientes en vez de arroz usan chonta, yuca u otros productos. Una de las variaciones más conocidas " +
                "es el ninajuane, preparado a base de huevos batidos con carne de pollo y envuelto en hoja de plátano. " +
                "Se sirve con chicha de jora. Otra variedad es la avispajuane, es similar al juane tradicional, pero no " +
                "tiene huevo y lleva carne molida de cerdo.", R.drawable.juane, "San Martin"));
        platoSanMartinList.add(new PlatoEntity(122, "Inchicapi", 3.0, "Es una de las sopas más populares y " +
                "tradicionales de la selva peruana. Se elabora con maní molido, gallina de corral o chacra, " +
                "culantro, yuca,  maíz o choclo picado o molido, ajo, sal, pimienta y cebolla picada. Se sirve " +
                "acompañado de arroz o plátano.", R.drawable.inchicapi, "San Martin"));
        platoSanMartinList.add(new PlatoEntity(123, "Timbuche", 2.0, "El timbuche es una sopa de pescado fresco, " +
                "la cual es conocida como levanta muerto por sus propiedades vigorizantes. Lleva huevos batidos y " +
                "culantro. Se puede usar pescados como palometa, lisa, corvina o paiche. La palabra timbuche es de " +
                "origen quechua y significa hervido.", R.drawable.timbuche, "San Martin"));
        platoSanMartinList.add(new PlatoEntity(124, "Patarashca", 4.5, "La patarashca es uno de los platillos que " +
                "descienden de los antiguos pobladores de la selva. El platillo es un pescado envuelto en hoja " +
                "plátano o de la planta bijao; lleva condimentos, cebollas, sacha culantro,ajíes verdes, ajo molido " +
                "y  otras especies (según el gusto). Se prepara al horno, parrilla o asado. Además se sirve " +
                "acompañado con yuca sancochada o plátanos asados.", R.drawable.patarashca, "San Martin"));
        platoSanMartinList.add(new PlatoEntity(125, "Tacacho con cecina", 4.0, "Es un plato típico del departamento " +
                "de San Martín y Madre de dios. El tacacho con cecina o chorizo, se prepara una masa a base de " +
                "plátano  frito machacado mezclado con manteca de chancho y chorizo y se sirve con cecina (carne " +
                "seca de cerdo o chancho). No es recomendable para las personas intolerantes al colesterol. Puede " +
                "acompañarlo con chicha de jora, chicha morada y masato.", R.drawable.tacacho_con_cecina, "San Martin"));
        platoSanMartinList.add(new PlatoEntity(126, "Chipado de pescado", 3.5, "El chipado de pescado se prepara " +
                "con el pez barbón (este pez abunda en la selva central), típico de las comunidades asháninkas. El " +
                "pescado se prepara con sal y sachaculantro y se enrolla en hojas de plátano. Se cocina a la brasa o " +
                "a la leña a fuego lento y se sirve con ají de cocona. Se acompaña con yuca asada o sancochada. Una de " +
                "las bebidas favoritas es el masato o jugo de yuca y se sirve junto a este platillo.",
                R.drawable.chipado_de_pescado, "San Martin"));
    }

    private void platosLoreto(){

        platoLoretoList = new ArrayList<>();
        platoLoretoList.add(new PlatoEntity(127, "Tacacho con cecina", 3.5, "El tacacho con cecina es uno de los " +
                "clásicos platos del nor oriente peruano. La mayoría de regiones de la selva lo preparan, cada uno " +
                "con su propio estilo. Es una platillo elaborado a base de cecina de cerdo, se preapara con una " +
                "masa de plátano verde asado y otros ingredientes más. En algunas otras regiones de la selva, como " +
                "Ucayali,  Amazonas o San Martín, lo sirven  en el desayuno.   Por otra parte, el plato se sirve " +
                "acompañado de chicha de jora, masato o aguaje.", R.drawable.tacacho_con_cecina, "Loreto"));
        platoLoretoList.add(new PlatoEntity(128, "Juane", 4.0, "El juane es uno de los platos tradicionales de la " +
                "selva peruana, se presume que deviene desde la época colonial. Se prepara a base de yuca o arroz, " +
                "pollo guisado, huevo duro, aceitunas y otros ingredientes más; la cual se envuelve en una hoja de " +
                "bijao. Se sirve con plátanos maduros y se acompaña con chicha de jora. El nombre es en memoria de " +
                "San Juan Bautista; por ende, se festeja el día de San Juan, el 24 de junio todos los años. " +
                "Por otra parte, el juane es un platillo que muchos turistas lo compran para comerlo en la ruta. ",
                R.drawable.juane, "Loreto"));
        platoLoretoList.add(new PlatoEntity(129, "Patarashca", 4.5, "Es un plato popular de la selva peruana. La " +
                "elaboración varía según las regiones. Se prepara al carbón y se envuelve en hojas de bijao, " +
                "atravesado por una caña de bambú. Se consume especialmente enIquitos (Loreto), Tarapoto " +
                "(San Martín), Pucallpa (Ucayali) y Huallaga. Los pueblos nativos utilizan el hualao (rana gigante) " +
                "y lo cocinan en caña de bambu. En la actualidad la mayoría de regiones amazónicas lo preparan con " +
                "pescados chicos.", R.drawable.patarashca, "Loreto"));
        platoLoretoList.add(new PlatoEntity(130, "Inchicapi", 5.0, "Es una sopa emblemática de la selva peruana. " +
                "Se prepara con gallina de corral, yucas, maíz, choclo, harina de maíz, cebolla, ajos, culantro, " +
                "ají limo y otros ingredientes. Se acostumbra comer en familia. Para el inchicapi debes tener " +
                "cierta pericia y ganas de prepararlo, para que salga bien.", R.drawable.inchicapi, "Loreto"));
        platoLoretoList.add(new PlatoEntity(131, "Ensalada de chonta", 5.0, "La ensalada de chonta, platillo " +
                "clásico de la Amazonía peruana; en especial para las épocas de calor. La chonta es un producto " +
                "obtenido del centro de la palmera, en particular del cocotero. Por tradición se sirve por Semana " +
                "Santa. Se prepara con chontas, cebollas, picante,limones, tomate, sal y pimienta. Para utilizar " +
                "las partes suaves de la chonta debes ponerlas en limón y se pica; se mezcla con los otros " +
                "ingredientes con aceite de oliva. Se sirve acompañado de carne o pescado.",
                R.drawable.ensalada_de_chonta, "Loreto"));
        platoLoretoList.add(new PlatoEntity(132, "Paiche a la loretana", 3.5, "Es un plato elaborado con paiche, " +
                "el cual es cortado en láminas para luego ser frito acompañado de otros ingredientes. También se " +
                "puede utilizar el pescado completo y sazonarlo con pimienta, comino, sal, aji limo y limón. El " +
                "paiche es un pescado típico de la selva y uno de los deliciosos en sabor, el cual se conserva " +
                "con sal y puede ser utilizado después de varios días. Por otra parte, existen otras variaciones " +
                "del platillo como picadillo de paiche y enrollado de paiche. Se acostumbra servir con plátano " +
                "maduro y ensalada de chonta.", R.drawable.paiche_loretana, "Loreto"));
    }

    private void platosUcayali(){

        platoUcayaliList = new ArrayList<>();
        platoUcayaliList.add(new PlatoEntity(133, "Zarapatera", 5.0, "Es una comida típica de algunas comunidades " +
                "indígenas, en especial de Pucallpa (Ucayali) y Amazonas. El plato tiene como ingrediente principal " +
                "a la tortuga; se utiliza incluso su caparazón para la presentación. Lleva plátanos verdes, yucas, " +
                "ají mirasol, ajos, cilantro o culantro picado, cebolla. La zarapatera es una sopa espesa, a base " +
                "de tortuga (motelo o charapa).", R.drawable.zarapatera, "Ucayali"));
        platoUcayaliList.add(new PlatoEntity(134, "Picadillo de Paiche", 4.0, "El paiche es uno de los pescados " +
                "más celebrados en la gastronomía amazónica. Se puede consumir fresco o seco; además se remoja en " +
                "agua para quitar el exceso de sal. El pescado se sancocha y se deshilacha en trozos. Se sazona " +
                "con pimienta, comino. Además se incorpora la cebolla, el ají dulce (previa mezcla). Su preparación " +
                "y degustación es ideal durante la Semana Santa.", R.drawable.picadillo_de_paiche, "Ucayali"));
        platoUcayaliList.add(new PlatoEntity(135, "Ensalada de Chonta", 3.0, "Es un comida típica de la selva " +
                "peruana y muy recomendada para el clima caluroso. Consta de deshilachar las partes suaves de " +
                "la chonta en rebanadas muy delgadas y ponerlas en agua con limón. Después se aliña con el jugo " +
                "de 2 limones, sal, pimienta y aceite. Se mezcla la chonta con la cebolla y el aliño. Se puede " +
                "acompañar con carne, palta, tomates, al gusto.", R.drawable.ensalada_de_chonta, "Ucayali"));
        platoUcayaliList.add(new PlatoEntity(136, "Tacacho con cecina", 2.5, "Es uno de los platos clásicos de " +
                "toda selva peruana. Cada región tiene su propia preparación. Se sirve como desayuno y en otros " +
                "es el plato principal. Es un plato elaborado con plátano verde frito, y carne de cerdo para " +
                "chicharrón; usualmente se sirve con un trozo de cecina. Los plátanos deben estar asados al carbón. " +
                "Se sirve caliente y lo puedes acompañar de un refresco de camu camu o aguaje.",
                R.drawable.tacacho_con_cecina, "Ucayali"));
        platoUcayaliList.add(new PlatoEntity(137, "Los Juanes", 5.0, "Es uno de los platillos tradicionales de " +
                "todas las regiones de la selva. Al inicio era a base de yuca con carne; en la actualidad se agrega " +
                "arroz y otros ingredientes. Lleva una presa o una porción de gallina guisada, aceitunas, huevo en " +
                "trozos; todo va dentro de un compacto de arroz. Se sirve con cecina o plátanos maduros. Ahora " +
                "existe gran variedad de derivados del plato central. Uno de los más nutritivos es el juane de " +
                "quinua; otro es el juane de paiche  o de gallina (nina juane). Tradicionalmente los juanes eran " +
                "característicos de la festividad de San Juan (de allí el nombre) y se llevaban en paseos " +
                "campestres. ", R.drawable.juane, "Ucayali"));
        platoUcayaliList.add(new PlatoEntity(138, "Patarashca", 4.5, "Es un plato popular de la selva peruana. " +
                "La elaboración varía según las regiones. Se prepara al carbón y se envuelve en hojas de bijao, " +
                "atravesado por una caña de bambú. Se consume especialmente enIquitos (Loreto), Tarapoto " +
                "(San Martín), Pucallpa (Ucayali) y Huallaga. Los pueblos nativos utilizan el hualao (rana " +
                "gigante) y lo cocinan en caña de bambu. En la actualidad la mayoría de regiones amazónicas " +
                "lo preparan con pescados chicos.", R.drawable.patarashca, "Ucayali"));
    }

    private void platosMadreDios(){

        platoMadreDiosList = new ArrayList<>();
        platoMadreDiosList.add(new PlatoEntity(139, "Anticucho de Suri", 3.0, "Es un exquisito platillo exótico " +
                "de la selva, uno de los más solicitados por los visitantes locales y extranjeros por su sabor y " +
                "por su alto contenido proteico. Su preparación es muy sencilla, lleva larva del coleoptero, muy " +
                "grasoso, que se extrae de los árboles de aguaje o palmito, y es frita en su propio aceite.",
                R.drawable.anticucho_suri, "Madre de Dios"));
        platoMadreDiosList.add(new PlatoEntity(140, "Zarapatera", 4.5, "Es una sopa de la selva peruana cuya " +
                "preparación es bastante compleja por los ingredientes que lleva. Esta hecha con la carne de " +
                "tortuga terrestre “el motelo” y cocido en su propio caparazón a fuego lento. Se condimenta con " +
                "ajo, comino y pimienta, también se le agrega plátano rallado, yuca y sacha-culantro, que es una " +
                "especie de hierba aromática, muy similar al culantro o cilantro.",
                R.drawable.zarapatera, "Madre de Dios"));
        platoMadreDiosList.add(new PlatoEntity(141, "Cecina con patacones", 5.0, "Es uno de los platos más pedidos " +
                "en la selva central. Es carne de cerdo o chancho deshidratada con sal o seca. la técnica es muy " +
                "parecida al tratamiento del charqui. Para consumirla se fríe con la misma manteca del porcino. " +
                "Por otro lado, los patacones son plátanos fritos.", R.drawable.cecina_patacones, "Madre de Dios"));
        platoMadreDiosList.add(new PlatoEntity(142, "Sudado de doncella", 2.0, "Es un platillo que se prepara " +
                "usando como base el pescado doncella. Se agrega ajos, pimienta, sal y chicha de jora como parte " +
                "de sus ingredientes principales. Es una comida que se sirve con yucas sancochadas con cebolla, " +
                "tomate, rocoto en rodajas, lechuga, culantro y limón. Se acompaña con arroz blanco. Un plato " +
                "delicioso para comer en pleno frío.", R.drawable.sudado_de_doncella, "Madre de Dios"));
        platoMadreDiosList.add(new PlatoEntity(143, "Ensalada de chonta", 4.5, "La ensalada de chonta, platillo " +
                "clásico de la Amazonía peruana; en especial para las épocas de calor. La chonta es un producto " +
                "obtenido del centro de la palmera, en particular del cocotero. Por tradición se sirve por Semana " +
                "Santa. Se prepara con chontas, cebollas, picante,limones, tomate, sal y pimienta. Para utilizar " +
                "las partes suaves de la chonta debes ponerlas en limón y se pica; se mezcla con los otros " +
                "ingredientes con aceite de oliva. Se sirve acompañado de carne o pescado.",
                R.drawable.ensalada_de_chonta, "Madre de Dios"));
        platoMadreDiosList.add(new PlatoEntity(144, "Inchicapi", 5.0, "Es una de las sopas más populares y " +
                "tradicionales de la selva peruana. Se elabora con maní molido, gallina de corral o chacra, " +
                "culantro, yuca,  maíz o choclo picado o molido, ajo, sal, pimienta y cebolla picada. Se sirve " +
                "acompañado de arroz o plátano.", R.drawable.inchicapi, "Madre de Dios"));
    }

    public List<PlatoEntity> getPlatoAmazonasList() {
        return platoAmazonasList;
    }
    public List<PlatoEntity> getPlatoSanMartinList() { return platoSanMartinList; }
    public List<PlatoEntity> getPlatoLoretoList() {return platoLoretoList; }
    public List<PlatoEntity> getPlatoUcayaliList() { return platoUcayaliList; }
    public List<PlatoEntity> getPlatoMadreDiosList() { return platoMadreDiosList; }

<<<<<<< HEAD
    public void updatePlatoSelvaById(int platoId, PlatoEntity platoEntity)
    {
        int position=-1;
        PlatoEntity plato;

        switch (platoEntity.getProvincia()) {

            case "Amazonas":
                platoList = platoAmazonasList;
                break;
            case "San Martin":
                platoList = platoSanMartinList;
                break;
            case "Loreto":
                platoList = platoLoretoList;
                break;
            case "Ucayali":
                platoList = platoUcayaliList;
                break;
            case "Madre de Dios":
                platoList = platoMadreDiosList;
                break;
        }
        for (int i = 0; i <this.platoList.size() ; i++) {
            plato= platoList.get(i);
            if(plato.getId()==platoId)
=======
    public void updatePlatoAmazonasById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoAmazonasList.size() ; i++) {
            note= platoAmazonasList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoAmazonasList.size())
        {
            this.platoAmazonasList.set(position, plato);
        }
    }

    public void updatePlatoSanMartinById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoSanMartinList.size() ; i++) {
            note= platoSanMartinList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoSanMartinList.size())
        {
            this.platoSanMartinList.set(position, plato);
        }
    }

    public void updatePlatoLoretoById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoLoretoList.size() ; i++) {
            note= platoLoretoList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoLoretoList.size())
        {
            this.platoLoretoList.set(position, plato);
        }
    }

    public void updatePlatoUcayaliById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoUcayaliList.size() ; i++) {
            note= platoUcayaliList.get(i);
            if(note.getId()==platoId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< platoUcayaliList.size())
        {
            this.platoUcayaliList.set(position, plato);
        }
    }

    public void updatePlatoMadreDiosById(int platoId, PlatoEntity plato)
    {
        int position=-1;
        PlatoEntity note;
        for (int i = 0; i <this.platoMadreDiosList.size() ; i++) {
            note= platoMadreDiosList.get(i);
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
        if(position>=0 && position< platoMadreDiosList.size())
        {
            this.platoMadreDiosList.set(position, plato);
>>>>>>> 0944554e40ad5eaec55754c826ade1814889eabb
        }
    }
}
