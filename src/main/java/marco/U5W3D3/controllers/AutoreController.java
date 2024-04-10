package marco.U5W3D3.controllers;

import marco.U5W3D3.entities.Autore;
import marco.U5W3D3.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autori")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Autore save(@RequestBody Autore body) {
        return this.autoreService.save(body);
    }
}
