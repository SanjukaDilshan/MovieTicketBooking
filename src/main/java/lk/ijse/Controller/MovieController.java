package lk.ijse.Controller;

import lk.ijse.DTO.FilmDTO;
import lk.ijse.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "api/movie")
public class MovieController {

    @Autowired
    FilmService filmService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveMovie(@RequestBody FilmDTO filmDTO){
        return filmService.saveMovie(filmDTO);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<FilmDTO> getAllMovies(){return filmService.getAllFilms();}
}
