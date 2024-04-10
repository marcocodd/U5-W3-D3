package marco.U5W3D3.services;

import marco.U5W3D3.repositories.AutoreDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoreService {

    @Autowired
    private AutoreDAO autoreDAO;
}
