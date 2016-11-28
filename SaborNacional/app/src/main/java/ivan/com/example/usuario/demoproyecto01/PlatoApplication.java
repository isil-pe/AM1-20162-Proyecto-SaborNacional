package ivan.com.example.usuario.demoproyecto01;

import android.app.Application;

import ivan.com.example.usuario.demoproyecto01.storage.PlatoCostaRepository;
import ivan.com.example.usuario.demoproyecto01.storage.PlatoSelvaRepository;
import ivan.com.example.usuario.demoproyecto01.storage.PlatoSierraRepository;

public class PlatoApplication extends Application {

    private PlatoCostaRepository platoCostaRepository;
    private PlatoSierraRepository platoSierraRepository;
    private PlatoSelvaRepository platoSelvaRepository;

    @Override
    public void onCreate() {
        super.onCreate();
<<<<<<< HEAD

=======
>>>>>>> 0944554e40ad5eaec55754c826ade1814889eabb
        platoCostaRepository = new PlatoCostaRepository();
        platoCostaRepository.mock();

        platoSierraRepository = new PlatoSierraRepository();
        platoSierraRepository.mock();

        platoSelvaRepository = new PlatoSelvaRepository();
        platoSelvaRepository.mock();
    }

    public PlatoCostaRepository getPlatoCostaRepository() {
        return platoCostaRepository;
    }
    public PlatoSierraRepository getPlatoSierraRepository() {
        return platoSierraRepository;
    }
    public PlatoSelvaRepository getPlatoSelvaRepository() {
        return platoSelvaRepository;
    }
}
