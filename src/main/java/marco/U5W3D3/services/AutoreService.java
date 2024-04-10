package marco.U5W3D3.services;

import marco.U5W3D3.entities.Autore;
import marco.U5W3D3.exceptions.NotFoundException;
import marco.U5W3D3.repositories.AutoreDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoreService {

    @Autowired
    private AutoreDAO autoreDAO;


    public Autore save(Autore newAutore) {
        newAutore.setAvatar(" ");
        return autoreDAO.save(newAutore);
    }

    public Autore findById(Long id) {
        return this.autoreDAO.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
    
}
